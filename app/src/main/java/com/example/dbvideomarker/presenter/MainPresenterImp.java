package com.example.dbvideomarker.presenter;

import com.example.dbvideomarker.database.dao.VideoDao;
import com.example.dbvideomarker.view.MainView;

public class MainPresenterImp implements MainPresenter {

    private final MainView view;
    private final VideoDao videoDao;

    public MainPresenterImp(MainView view, VideoDao videoDao) {
        this.view = view;
        this.videoDao = videoDao;
    }
}
