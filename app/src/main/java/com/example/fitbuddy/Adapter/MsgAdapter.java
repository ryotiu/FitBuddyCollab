package com.example.fitbuddy.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitbuddy.Model.ChatClass;
import com.example.fitbuddy.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {

    public static final int msg_type_L = 0;
    public static final int msg_type_R = 1;
    private Context mContext;
    private List<ChatClass> mChat;
    private String imgURL;

    FirebaseUser firebaseUser;

    public MsgAdapter(Context mContext, List<ChatClass> mChat, String imgURL){
            this.mChat = mChat;
            this.mContext = mContext;
            this.imgURL = imgURL;
    }

    @NonNull
    @Override
    public MsgAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType == msg_type_R) {
            view = LayoutInflater.from(mContext).inflate(R.layout.chat_item_r, parent, false);
        }
        else{
            view = LayoutInflater.from(mContext).inflate(R.layout.chat_item_l, parent, false);
        }
        return new MsgAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MsgAdapter.ViewHolder holder, int position) {
        ChatClass chat = mChat.get(position);
        holder.show_msg.setText(chat.getMessage());
        if(imgURL.equals("default")){
            holder.profile_Image.setImageResource(R.mipmap.ic_launcher);
        }
        else{
            Glide.with(mContext).load(imgURL).into(holder.profile_Image);
        }
    }

    @Override
    public int getItemCount() {
            return mChat.size();
            }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView show_msg;
        public ImageView profile_Image;

        public ViewHolder(View itemView){
            super(itemView);
            show_msg = itemView.findViewById(R.id.show_Message);
            profile_Image = itemView.findViewById(R.id.profile_image);
        }
    }

    @Override
    public int getItemViewType(int position) {
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if(mChat.get(position).getSender().equals(firebaseUser.getUid())){
            return msg_type_R;
        }
        else{
            return msg_type_L;
        }
    }
}
