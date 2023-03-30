package com.example.mymusic.ui.adapter.recycler;

import androidx.annotation.NonNull;

import com.example.mymusic.R;
import com.example.mymusic.databinding.ItemSingerBinding;
import com.example.mymusic.model.Singer;
import com.example.mymusic.ui.base.BaseBindingAdapter;

import java.util.LinkedList;
import java.util.List;

public class SingerAdapter extends BaseBindingAdapter<ItemSingerBinding> {

    List<Singer> listSinger = new LinkedList<>();

    public void setListSinger(List<Singer> listSinger) {
        this.listSinger.clear();
        this.listSinger.addAll(listSinger);
        notifyDataSetChanged();
    }

    @Override
    public int layoutIdItem() {
        return R.layout.item_singer;
    }

    @Override
    public int sizeItem() {
        return listSinger.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BaseBindingAdapter<ItemSingerBinding>.BaseHolder<ItemSingerBinding> holder, int position) {
        holder.binding.tvLetter.setText(listSinger.get(position).getLetter());
        holder.binding.tvSinger.setText(listSinger.get(position).getNameSinger());
        holder.binding.quantity.setText(listSinger.get(position).getQuantity());
    }
}
