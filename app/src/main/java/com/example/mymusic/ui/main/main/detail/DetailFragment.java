package com.example.mymusic.ui.main.main.detail;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentDetailBinding;
import com.example.mymusic.ui.adapter.tab.TabLayoutAdapter;
import com.example.mymusic.ui.base.BaseBindingFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DetailFragment extends BaseBindingFragment<FragmentDetailBinding> {
    @Override
    public int getLayoutId() {
        return R.layout.fragment_detail;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        setAdapter();
    }
    private void setAdapter() {

        TabLayoutAdapter tabLayoutAdapter = new TabLayoutAdapter(this);
        binding.viewPagerDetail.setAdapter(tabLayoutAdapter);
        binding.tabLayout.setTabRippleColor(null);
        new TabLayoutMediator(binding.tabLayout, binding.viewPagerDetail, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Bài hát");
                        break;
                    case 1:
                        tab.setText("Ca sĩ");
                        break;
                }
            }
        }).attach();
    }
}
