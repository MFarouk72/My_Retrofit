package com.example.myretrofit.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myretrofit.R;
import com.example.myretrofit.pojo.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {
    private List<PostModel> postList = new ArrayList<>();

    @NonNull
    @Override
    public PostsAdapter.PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.PostViewHolder holder, int position) {
    holder.TVtitle.setText(postList.get(position).getTitle());
        holder.TVid.setText(postList.get(position).getUserId()+"");
        holder.TVbody.setText(postList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
    public void setPostList(List<PostModel> postList){
        this.postList=postList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView TVtitle,TVid,TVbody;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            TVtitle = itemView.findViewById(R.id.TV_title);
            TVid = itemView.findViewById(R.id.TV_id);
            TVbody = itemView.findViewById(R.id.TV_body);
        }
    }
}
