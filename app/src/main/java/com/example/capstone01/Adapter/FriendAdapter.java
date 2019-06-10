package com.example.capstone01.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.capstone01.R;
import com.example.capstone01.item.Friend;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {

    private Context context;
    private List<Friend> list;


    public FriendAdapter(Context context, List<Friend> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_friend, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Friend friend = list.get(i);


        viewHolder.textTitle.setText(friend.getTitle());
        viewHolder.textEmail.setText(friend.getEmail());
        viewHolder.textName.setText(friend.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textTitle, textEmail, textName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.friend_title);
            textEmail = itemView.findViewById(R.id.friend_email);
            textName = itemView.findViewById(R.id.friend_name);
        }
    }
}