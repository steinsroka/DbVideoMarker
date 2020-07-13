package com.example.dbvideomarker.database.entitiy;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "video")
public class Video {

    @PrimaryKey(autoGenerate = true)
    public long vid;
    public String vName;
    public String vPath;
    public String vTag;
    public String vDur;
    public String vSize;
    public String vMime;
    public String vAdded;
    public String vUri;

    public Video() {
        this.vName = "";
        this.vPath = "";
        this.vTag = "";
        this.vDur = "";
        this.vSize = "";
        this.vMime = "";
        this.vAdded = "";
        this.vUri = "";
    }

    public Video(String vName, String vPath, String vTag, String vDur, String vSize, String vMime, String vAdded, String vUri) {
        this.vName = vName;
        this.vPath = vPath;
        this.vTag = vTag;
        this.vDur = vDur;
        this.vSize = vSize;
        this.vMime = vMime;
        this.vAdded = vAdded;
        this.vUri = vUri;
    }
}

