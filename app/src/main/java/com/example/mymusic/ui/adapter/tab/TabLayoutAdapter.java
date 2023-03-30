package com.example.mymusic.ui.adapter.tab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymusic.ui.main.main.music.tab.FragmentTabAlbum;
import com.example.mymusic.ui.main.main.music.tab.FragmentTabFolder;
import com.example.mymusic.ui.main.main.music.tab.FragmentTabSinger;
import com.example.mymusic.ui.main.main.music.tab.FragmentTabSong;
import com.example.mymusic.ui.main.main.video.Tab2Fragment;

public class TabLayoutAdapter extends FragmentStateAdapter {


    private FragmentTabSong fragmentTabSong;
    private FragmentTabSinger fragmentTabSinger;
    private FragmentTabAlbum fragmentTabAlbum;
    private FragmentTabFolder fragmentTabFolder;


    public TabLayoutAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public TabLayoutAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public TabLayoutAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {

            case 1:
                if (fragmentTabSinger == null)
                    fragmentTabSinger = new FragmentTabSinger();
                return new FragmentTabSinger();
            case 2:
                if (fragmentTabAlbum == null)
                    fragmentTabAlbum = new FragmentTabAlbum();
                return new FragmentTabAlbum();
            case 3:
                if (fragmentTabFolder == null)
                    fragmentTabFolder = new FragmentTabFolder();
                return new FragmentTabFolder();
            default:
                if (fragmentTabSong == null)
                    fragmentTabSong = new FragmentTabSong();
                return new FragmentTabSong();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
