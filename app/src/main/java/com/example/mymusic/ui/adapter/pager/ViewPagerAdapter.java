package com.example.mymusic.ui.adapter.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymusic.ui.main.main.music.HomeMusicFragment;
import com.example.mymusic.ui.main.main.video.VideoFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private VideoFragment videoFragment;
    private HomeMusicFragment homeMusicFragment;


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                if (videoFragment == null)
                    videoFragment = new VideoFragment();
            return videoFragment;
            default:
                if (homeMusicFragment == null)
                    homeMusicFragment = new HomeMusicFragment();
                return homeMusicFragment;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
