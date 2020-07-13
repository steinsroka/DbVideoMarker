package com.example.dbvideomarker.view;

import com.example.dbvideomarker.database.entitiy.Video;

public interface OnItemClickListener {
    void clickItem(Video video);

    void clickLongItem(Video video);
}
