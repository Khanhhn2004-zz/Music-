package com.example.mymusic.ui.main.main.music.tab;

import android.os.Bundle;
import android.view.View;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentTabSingerBinding;
import com.example.mymusic.model.Singer;
import com.example.mymusic.ui.adapter.recycler.SingerAdapter;
import com.example.mymusic.ui.base.BaseBindingFragment;

import java.util.LinkedList;
import java.util.List;

public class TabSingerFragment extends BaseBindingFragment<FragmentTabSingerBinding> {
    private final List<Singer> listSinger = new LinkedList<>();


    private SingerAdapter singerAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_tab_singer;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        initAdapter();
        initData();
    }
    public void initAdapter() {
        singerAdapter = new SingerAdapter();
        binding.rclListMusic.setAdapter(singerAdapter);
    }

    public void initData() {
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        listSinger.add(new Singer("A" , "Anh Tu Atus","1 bài hát "));
        singerAdapter.setListSinger(listSinger);

    }
}
