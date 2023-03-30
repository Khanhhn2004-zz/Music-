package com.example.mymusic.ui.main.main.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentHomeMusicBinding;
import com.example.mymusic.ui.adapter.tab.TabLayoutAdapter;
import com.example.mymusic.ui.base.BaseBindingFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentHomeMusic extends BaseBindingFragment<FragmentHomeMusicBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home_music;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        setAdapter();
    }
    private void setAdapter() {

        TabLayoutAdapter tabLayoutAdapter = new TabLayoutAdapter(this);
        binding.viewPager.setAdapter(tabLayoutAdapter);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Bài hát");
                        break;
                    case 1:
                        tab.setText("Ca sĩ");
                        break;
                    case 2:
                        tab.setText("Album");
                        break;
                    case 3:
                        tab.setText("Thư mục");
                        break;
                }
            }
        }).attach();
    }
}
