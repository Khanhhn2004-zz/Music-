package com.example.mymusic.ui.main.main.music.tab;

import android.os.Bundle;
import android.view.View;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentTabSongBinding;
import com.example.mymusic.model.Song;
import com.example.mymusic.ui.adapter.recycler.SongAdaptter;
import com.example.mymusic.ui.base.BaseBindingFragment;

import java.util.LinkedList;
import java.util.List;

public class TabSongFragment extends BaseBindingFragment<FragmentTabSongBinding> {

    private final List<Song> listMusic = new LinkedList<>();


    private SongAdaptter songAdaptter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_tab_song;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        initAdapter();
        initData();
    }
    public void initAdapter() {
        songAdaptter = new SongAdaptter();
        binding.rclListMusic.setAdapter(songAdaptter);
    }

    public void initData() {
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        listMusic.add(new Song("Watting for you" , "8/3/2023 10:00  CH ","100KB"));
        songAdaptter.setListSong(listMusic);

    }
}
