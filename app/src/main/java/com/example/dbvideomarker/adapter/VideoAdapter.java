package com.example.dbvideomarker.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dbvideomarker.R;
import com.example.dbvideomarker.database.entitiy.Video;
import com.example.dbvideomarker.view.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adpater<VideoAdapter.ViewHolder>  {

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

    
}
