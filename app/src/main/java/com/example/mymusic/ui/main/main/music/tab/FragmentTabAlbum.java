package com.example.mymusic.ui.main.main.music.tab;

import android.os.Bundle;
import android.view.View;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentTabAlbumBinding;
import com.example.mymusic.model.Album;
import com.example.mymusic.model.Album;
import com.example.mymusic.ui.adapter.recycler.AlbumAdapter;
import com.example.mymusic.ui.adapter.recycler.AlbumAdapter;
import com.example.mymusic.ui.base.BaseBindingFragment;

import java.util.LinkedList;
import java.util.List;

public class FragmentTabAlbum extends BaseBindingFragment<FragmentTabAlbumBinding> {

    private final List<Album> listAlbum = new LinkedList<>();

    private AlbumAdapter albumAdapter;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_tab_album;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        initAdapter();
        initData();
    }

    public void initAdapter() {
        albumAdapter = new AlbumAdapter();
        binding.rclListAlbum.setAdapter(albumAdapter);
    }

    public void initData() {
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        listAlbum.add(new Album("Anh Tu Atus","1 bài hát "));
        albumAdapter.setListAlbum(listAlbum);

    }
}
