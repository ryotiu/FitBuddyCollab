package com.example.fitbuddy.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fitbuddy.MsgActivity;
import com.example.fitbuddy.Model.UserClass;
import com.example.fitbuddy.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context mContext;
    private List<UserClass> mUsers;

    public UserAdapter(Context mContext, List<UserClass> mUsers){
        this.mUsers = mUsers;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.user_item, parent, false);
        return new UserAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        UserClass userInfo = mUsers.get(position);
        holder.username.setText(userInfo.getUsername());
        if(userInfo.getImageURL().equals("default")){
            holder.profile_Image.setImageResource(R.mipmap.ic_launcher);
        }
        else{
            Glide.with(mContext).load(userInfo.getImageURL()).into(holder.profile_Image);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MsgActivity.class);
                intent.putExtra("userid", userInfo.getUserID());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView username;
        public ImageView profile_Image;

        public ViewHolder(View itemView){
            super(itemView);
            username = itemView.findViewById(R.id.username);
            profile_Image = itemView.findViewById(R.id.profile_image);
        }
    }

}
