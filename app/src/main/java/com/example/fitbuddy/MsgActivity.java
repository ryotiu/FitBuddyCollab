package com.example.fitbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitbuddy.Adapter.MsgAdapter;
import com.example.fitbuddy.Model.ChatClass;
import com.example.fitbuddy.Model.UserClass;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MsgActivity extends AppCompatActivity {

    CircleImageView profile_img;
    TextView username;

    FirebaseUser firebaseUser;
    DatabaseReference reference;

    ImageButton send_btn;
    EditText send_txt;

    MsgAdapter MessageAdapter;
    List<ChatClass> Chat;

    RecyclerView recyclerView;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        recyclerView = findViewById(R.id.ChatList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        profile_img = findViewById(R.id.profile_image);
        username = findViewById(R.id.username);
        send_btn = findViewById(R.id.btn_send);
        send_txt = findViewById(R.id.text_send);

        intent = getIntent();
        final String userid = intent.getStringExtra("userid");
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = send_txt.getText().toString();
                if(!message.equals("")){
                    sendMessage(firebaseUser.getUid(), userid, message);
                }
                else{
                    Toast.makeText(MsgActivity.this, "Can't send empty Message!", Toast.LENGTH_SHORT).show();
                }
                send_txt.setText("");
            }
        });


        reference = FirebaseDatabase.getInstance().getReference("Users").child(userid);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserClass userInfo = snapshot.getValue(UserClass.class);
                username.setText(userInfo.getUsername());
                if(userInfo.getImageURL().equals("default")){
                    profile_img.setImageResource(R.mipmap.ic_launcher);
                }
                else{
                    Glide.with(MsgActivity.this).load(userInfo.getImageURL()).into(profile_img);
                }
                readMessage(firebaseUser.getUid(), userid, userInfo.getImageURL());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void sendMessage(String sender, String receiver, String message){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

        HashMap<String, Object> messageHashMap = new HashMap<>();
        messageHashMap.put("sender", sender);
        messageHashMap.put("receiver", receiver);
        messageHashMap.put("message", message);

        ref.child("Chats").push().setValue(messageHashMap);
    }

    private void readMessage(final String myID, final String userID, String imageURL){
        Chat = new ArrayList<>();
        reference = FirebaseDatabase.getInstance().getReference("Chats");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Log.e("MsgActivity", "HERE!!!");
                Chat.clear();
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    ChatClass chat = dataSnapshot.getValue(ChatClass.class);
                    if(chat.getReceiver().equals(myID) && chat.getSender().equals(userID) ||
                            chat.getReceiver().equals(userID) && chat.getSender().equals(myID)){
                        Chat.add(chat);
                    }
                    MessageAdapter = new MsgAdapter(MsgActivity.this, Chat, imageURL);
                    recyclerView.setAdapter(MessageAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}