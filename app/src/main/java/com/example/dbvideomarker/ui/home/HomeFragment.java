package com.example.dbvideomarker.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbvideomarker.R;
import com.example.dbvideomarker.adapter.VideoAdapter;
import com.example.dbvideomarker.database.AppDatabase;
import com.example.dbvideomarker.database.entitiy.Video;
import com.example.dbvideomarker.presenter.MainPresenterImp;
import com.example.dbvideomarker.view.MainView;
import com.example.dbvideomarker.view.OnItemClickListener;

import java.util.List;

public class HomeFragment extends Fragment implements MainView, OnItemClickListener {

    private HomeViewModel homeViewModel;
    private MainPresenterImp presenterImp;
    private VideoAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.rv_Home);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new VideoAdapter(this);
        recyclerView.setAdapter(adapter);

        AppDatabase db = AppDatabase.getDatabase(getActivity().getApplication());
        presenterImp = new MainPresenterImp(this, db.videoModel());

        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void setPersons(List<Video> video) {
        adapter.setValues(video);
    }


    @Override
    public void clickItem(Video video) {

    }

    @Override
    public void clickLongItem(Video video) {

    }
}