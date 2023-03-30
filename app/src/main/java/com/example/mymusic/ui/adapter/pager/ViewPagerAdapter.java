package com.example.mymusic.ui.adapter.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymusic.ui.main.main.music.FragmentHomeMusic;
import com.example.mymusic.ui.main.main.video.Tab2Fragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private Tab2Fragment tab2Fragment;
    private FragmentHomeMusic fragmentHomeMusic;


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
                if (tab2Fragment == null)
                    tab2Fragment = new Tab2Fragment();
            return new Tab2Fragment();
            default:
                if (fragmentHomeMusic == null)
                    fragmentHomeMusic = new FragmentHomeMusic();
                return new FragmentHomeMusic();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
