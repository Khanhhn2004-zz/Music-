package com.example.mymusic.ui.adapter.recycler;

import androidx.annotation.NonNull;

import com.example.mymusic.R;
import com.example.mymusic.databinding.ItemFolderBinding;
import com.example.mymusic.model.Folder;
import com.example.mymusic.ui.base.BaseBindingAdapter;

import java.util.LinkedList;
import java.util.List;

public class FolderAdapter extends BaseBindingAdapter<ItemFolderBinding> {

    List<Folder> listFolder = new LinkedList<>();

    public void setListFolder(List<Folder> listFolder) {
        this.listFolder.clear();
        this.listFolder.addAll(listFolder);
        notifyDataSetChanged();
    }

    @Override
    public int layoutIdItem() {
        return R.layout.item_folder;
    }

    @Override
    public int sizeItem() {
        return listFolder.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BaseBindingAdapter<ItemFolderBinding>.BaseHolder<ItemFolderBinding> holder, int position) {
        holder.binding.tvNameFolder.setText(listFolder.get(position).getNameFolder());
        holder.binding.tvQuannntity.setText(listFolder.get(position).getQuantity());
        holder.binding.tvLocation.setText(listFolder.get(position).getLocation());
    }
}
