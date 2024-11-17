package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
/*
public class LocalMusicAdapter extends RecyclerView.Adapter<LocalMusicAdapter.LocalMusicViewHolder> {
    Context context;
    List<LocalMusicBean>mDatas;

    public LocalMusicAdapter(Context context, List<LocalMusicBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @NonNull
    @Override
    public LocalMusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_localmusic,parent,false);
        LocalMusicViewHolder holder = new LocalMusicViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LocalMusicViewHolder holder, int position) {
        LocalMusicBean musicBean = mDatas.get(position);
        holder.songTv.setText(musicBean.getSong());
        holder.singerTv.setText(musicBean.getSinger());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class LocalMusicViewHolder extends RecyclerView.ViewHolder {
        TextView songTv,singerTv;
        public LocalMusicViewHolder(@NonNull View itemView) {
            super(itemView);

            songTv= itemView.findViewById(R.id.item_music_name);
            singerTv= itemView.findViewById(R.id.item_singer_name);

        }
    }

}
*/

/*第二次
public class LocalMusicAdapter extends RecyclerView.Adapter<LocalMusicAdapter.LocalMusicViewHolder> {
    Context context;

    List<LocalMusicBean>mDatas;

    public LocalMusicAdapter( List<LocalMusicBean> mDatas) {
        this.mDatas = mDatas;
    }


    @NonNull
    @Override
    public LocalMusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_localmusic,parent,false);
        LocalMusicViewHolder holder = new LocalMusicViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull LocalMusicViewHolder holder, int position) {
        LocalMusicBean musicBean = mDatas.get(position);
        holder.head.setImageResource(musicBean.getId());
        holder.songTv.setText(musicBean.getSong());
        holder.singerTv.setText(musicBean.getSinger());

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class LocalMusicViewHolder extends RecyclerView.ViewHolder {
        TextView songTv,singerTv;
        ImageView head;

        public LocalMusicViewHolder(View itemView) {
            super(itemView);

            this.songTv = itemView.findViewById(R.id.item_music_name);
            this.singerTv = itemView.findViewById(R.id.item_singer_name);
            this.head = itemView.findViewById(R.id.item_button_photo);
        }
    }

}

 */
public class LocalMusicAdapter extends RecyclerView.Adapter<LocalMusicAdapter.LocalMusicViewHolder> {
    private Context context;
    private List<LocalMusicBean> mDatas;

    public LocalMusicAdapter(Context context, List<LocalMusicBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @NonNull
    @Override
    public LocalMusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_localmusic, parent, false);
        return new LocalMusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocalMusicViewHolder holder, int position) {
        LocalMusicBean musicBean = mDatas.get(position);
        // 确保这里使用的是正确的资源 ID，或者更改逻辑以使用正确的图片加载方法
        // holder.head.setImageResource(musicBean.getSomeDrawableResourceId());
        holder.head.setImageResource(musicBean.getId());
        holder.songTv.setText(musicBean.getSong());
        holder.singerTv.setText(musicBean.getSinger());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class LocalMusicViewHolder extends RecyclerView.ViewHolder {
        TextView songTv, singerTv;
        ImageView head;

        public LocalMusicViewHolder(View itemView) {
            super(itemView);
            songTv = itemView.findViewById(R.id.item_music_name);
            singerTv = itemView.findViewById(R.id.item_singer_name);
            head = itemView.findViewById(R.id.item_button_photo);
        }
    }
}


