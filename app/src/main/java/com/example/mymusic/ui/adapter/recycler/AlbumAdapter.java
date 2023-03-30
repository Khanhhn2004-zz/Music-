package com.example.mymusic.ui.adapter.recycler;

import androidx.annotation.NonNull;

import com.example.mymusic.R;
import com.example.mymusic.databinding.ItemAlbumBinding;
import com.example.mymusic.model.Album;
import com.example.mymusic.ui.base.BaseBindingAdapter;
import com.example.mymusic.ui.base.BaseBindingFragment;

import java.util.LinkedList;
import java.util.List;

public class AlbumAdapter extends BaseBindingAdapter<ItemAlbumBinding> {

    List<Album> listAlbum = new LinkedList<>();

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum.clear();
        this.listAlbum.addAll(listAlbum);
        notifyDataSetChanged();
    }

    @Override
    public int layoutIdItem() {
        return R.layout.item_album;
    }

    @Override
    public int sizeItem() {
        return listAlbum.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BaseBindingAdapter<ItemAlbumBinding>.BaseHolder<ItemAlbumBinding> holder, int position) {
        holder.binding.tvNameAlbum.setText(listAlbum.get(position).getNameAlbum());
        holder.binding.tvNameSinger.setText(listAlbum.get(position).getSinger());
    }
}
