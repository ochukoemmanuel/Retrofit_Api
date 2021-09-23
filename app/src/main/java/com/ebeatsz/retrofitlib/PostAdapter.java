package com.ebeatsz.retrofitlib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    List<Post> postList;
    Context context;

    public PostAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new PostViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull PostAdapter.PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.userId.setText("userId: " + post.getUserId());
        holder.id.setText("id: " + post.getId());
        holder.title.setText("title: " + post.getTitle());
        holder.body.setText("body: " + post.getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        TextView title, id, userId, body;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            userId = itemView.findViewById(R.id.user_id_tv);
            id = itemView.findViewById(R.id.id_tv);
            title = itemView.findViewById(R.id.title_tv);
            body = itemView.findViewById(R.id.body_tv);
        }
    }
}
