package com.example.mymusic.ui.adapter.tab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymusic.ui.main.main.music.tab.TabAlbumFragment;
import com.example.mymusic.ui.main.main.music.tab.TabFolderFragment;
import com.example.mymusic.ui.main.main.music.tab.TabSingerFragment;
import com.example.mymusic.ui.main.main.music.tab.TabSongFragment;

public class TabLayoutAdapter extends FragmentStateAdapter {


    private TabSongFragment tabSongFragment;
    private TabSingerFragment tabSingerFragment;
    private TabAlbumFragment tabAlbumFragment;
    private TabFolderFragment tabFolderFragment;


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
                if (tabSingerFragment == null)
                    tabSingerFragment = new TabSingerFragment();
                return new TabSingerFragment();
            case 2:
                if (tabAlbumFragment == null)
                    tabAlbumFragment = new TabAlbumFragment();
                return new TabAlbumFragment();
            case 3:
                if (tabFolderFragment == null)
                    tabFolderFragment = new TabFolderFragment();
                return tabFolderFragment;
            default:
                if (tabSongFragment == null)
                    tabSongFragment = new TabSongFragment();
                return tabSongFragment;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
