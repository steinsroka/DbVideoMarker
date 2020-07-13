package com.example.dbvideomarker.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbvideomarker.R;
import com.example.dbvideomarker.database.entitiy.Video;
import com.example.dbvideomarker.view.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder>  {

    private List<Video> videoList;
    private OnItemClickListener onItemClickListener;

    public VideoAdapter(OnItemClickListener onItemClickListener) {
        videoList = new ArrayList<>();
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_main_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.video = videoList.get(position);
        holder.vName.setText(videoList.get(position).vName);
        holder.vTag.setText(videoList.get(position).vName);
        holder.vDur.setText(videoList.get(position).vDur);

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.clickItem(holder.video);
            }
        });

        holder.view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                onItemClickListener.clickLongItem(holder.video);
                return false;
            }
        });
    }

    public void setValues(List<Video> values) {
        videoList = values;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private TextView vName;
        private TextView vTag;
        private TextView vDur;
        private Video video;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            vName = view.findViewById(R.id.vName);
            vTag = view.findViewById(R.id.vTag);
            vDur = view.findViewById(R.id.vDur);
        }
    }

}
