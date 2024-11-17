package com.example.myapplication;


import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    //recyclerview代码
        RecyclerView recyclerView = findViewById(R.id.local_music_rv);
        List<LocalMusicBean> mDatas  =  new ArrayList<>();
        LocalMusicBean music1= new LocalMusicBean(R.drawable.firework,"firework","Katy Perry");
        LocalMusicBean music2= new LocalMusicBean(R.drawable.gnzw,"光年之外","邓紫棋");
        LocalMusicBean music3= new LocalMusicBean(R.drawable.goodbye,"再见","邓紫棋");
        LocalMusicBean music4= new LocalMusicBean(R.drawable.rbl,"日不落","蔡依林");
        LocalMusicBean music5= new LocalMusicBean(R.drawable.roar,"Roar","Katy Perry");
        LocalMusicBean music6= new LocalMusicBean(R.drawable.wg,"white grey","Xceon");
        LocalMusicBean music7= new LocalMusicBean(R.drawable.withoutyou,"without you","Avicii");
        LocalMusicBean music8= new LocalMusicBean(R.drawable.ld,"last dance","500");
        mDatas.add(music1);
        mDatas.add(music2);
        mDatas.add(music3);
        mDatas.add(music4);
        mDatas.add(music5);
        mDatas.add(music6);
        mDatas.add(music7);
        mDatas.add(music8);

        LocalMusicAdapter localMusicAdapter = new LocalMusicAdapter(this,mDatas);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(localMusicAdapter);



    //暂停，播放按钮
        View button1 = findViewById(R.id.button1);
        View button2 = findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MyService.class);
                startService(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MyService.class);
                stopService(intent);
            }
        });






        /*
        mDatas = new ArrayList<>();
//创建适配器
        new LocalMusicAdapter(this,mDatas);
        MusicRv.setAdapter(adapter);
//设置布局管理器格式
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        MusicRv.setLayoutManager(layoutManager);
//加载本地数据源
        loadLocalMusicData();

 */



    }
/*
    private void loadLocalMusicData() {
        //加载本地存储的音乐文件到集合中
        ContentResolver resolver=getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor=resolver.query(uri,null,null,null);
        //遍历
        int id=0;
        while (cursor.moveToNext()) {
            @SuppressLint("Range") String song=cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
            @SuppressLint("Range") String singer=cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
            id++;
            String string = String.valueOf(id);
            @SuppressLint("Range") String path = cursor.getString(cursor.getColumnIndex(MediaStore.Video.Media.DATA));
            LocalMusicBean bean = new LocalMusicBean(song, singer, string, path);

        }
        adapter.notifyDataSetChanged();
    }


    TextView SingerTv,SongTv;
    ImageView PhotoIv;
    RecyclerView MusicRv;

//数据源
    List<LocalMusicBean> mDatas;
    private LocalMusicAdapter adapter;

    private void InitView(){
        SingerTv=findViewById(R.id.singer_name);
        SongTv=findViewById(R.id.song_name);
        PhotoIv=findViewById(R.id.bottom_photo);
        MusicRv=findViewById(R.id.local_music_rv);

    }



*/




}