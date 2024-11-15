package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.MediaStore;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    MediaPlayer mediaPlayer;
    public MyService() {

    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        mediaPlayer=MediaPlayer.create(this,R.raw.firework);
        mediaPlayer.start();

        Log.d("MusicService","开始播放");

        return  super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy(){

        Log.d("MusicService","停止播放");
        mediaPlayer.stop();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}