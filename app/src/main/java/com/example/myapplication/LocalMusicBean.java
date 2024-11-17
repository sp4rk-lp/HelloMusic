package com.example.myapplication;

public class LocalMusicBean {
    private int headId;
    private String song;
    private String singer;


    public LocalMusicBean() {
    }

    public LocalMusicBean(int headId, String song, String singer) {
        this.headId = headId;
        this.song = song;
        this.singer = singer;

    }

    public int getId() {
        return headId;
    }

    public void setId(int headId) {
        this.headId = headId;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

}

