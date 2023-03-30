package com.example.mymusic.ui.adapter.recycler;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusic.R;
import com.example.mymusic.databinding.ItemSongBinding;
import com.example.mymusic.model.Song;
import com.example.mymusic.ui.base.BaseBindingAdapter;

import java.util.LinkedList;
import java.util.List;

public class SongAdaptter extends BaseBindingAdapter<ItemSongBinding> {
    List<Song> listSong = new LinkedList<>();

    public void setListSong(List<Song> listSong) {
        this.listSong.clear();
        this.listSong.addAll(listSong);
        notifyDataSetChanged();
    }

    @Override
    public int layoutIdItem() {
        return R.layout.item_song;
    }

    @Override
    public int sizeItem() {
        return listSong.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BaseBindingAdapter<ItemSongBinding>.BaseHolder<ItemSongBinding> holder, int position) {
        holder.binding.tvNameSong.setText(listSong.get(position).getNameSong());
        holder.binding.tvNameSinger.setText(listSong.get(position).getNameSinger());
        holder.binding.tvNameWeb.setText(listSong.get(position).getWeb());
    }
}
