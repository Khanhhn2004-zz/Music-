package com.example.mymusic.ui.adapter.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymusic.ui.main.main.detail.tab.TabLyricsFragment;
import com.example.mymusic.ui.main.main.detail.tab.TabSongFragment;
import com.example.mymusic.ui.main.main.music.HomeMusicFragment;
import com.example.mymusic.ui.main.main.video.VideoFragment;

public class ViewPageDetaitAdapter extends FragmentStateAdapter {
    private TabSongFragment tabSongFragment;
    private TabLyricsFragment tabLyricsFragment;

    public ViewPageDetaitAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPageDetaitAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPageDetaitAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                if (tabLyricsFragment == null)
                    tabLyricsFragment = new TabLyricsFragment();
                return tabLyricsFragment;
            default:
                if (tabSongFragment == null)
                    tabSongFragment = new TabSongFragment();
                return tabSongFragment;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
