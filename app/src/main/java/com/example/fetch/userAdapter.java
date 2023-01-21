package com.example.fetch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter <userAdapter.ViewHolder>{
    List<UserList> userLists;
    Context context;

    public userAdapter(List<UserList> userLists, Context context) {
        this.userLists = userLists;
        this.context = context;
    }

    @NonNull
    @Override
    public userAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.show_data, parent, false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull userAdapter.ViewHolder holder, int position) {
      UserList list = userLists.get(position);

      holder.userId.setText(list.userId);
        holder.userName.setText(list.userName);
        holder.userEmail.setText(list.userEmail);
        holder.userPassword.setText(list.userPassword);
        holder.userPhone.setText(list.userPhone);


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class  ViewHolder extends  RecyclerView.ViewHolder{
            TextView userId, userName, userEmail, userPassword, userPhone;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userId  = itemView.findViewById(R.id.userId);
            userName  = itemView.findViewById(R.id.userName);
            userEmail  = itemView.findViewById(R.id.userEmail);
            userPassword  = itemView.findViewById(R.id.userPassword);
            userPhone  = itemView.findViewById(R.id.userPhone);


        }
    }
}
