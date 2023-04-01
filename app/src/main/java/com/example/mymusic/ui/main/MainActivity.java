package com.example.mymusic.ui.main;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.mymusic.R;
import com.example.mymusic.databinding.ActivityMainBinding;
import com.example.mymusic.ui.adapter.pager.ViewPagerAdapter;
import com.example.mymusic.ui.adapter.tab.TabLayoutAdapter;
import com.example.mymusic.ui.base.BaseBindingActivity;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding> {

    public NavHostFragment navHostFragment;
    public NavController navController;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void setupView(Bundle savedInstanceState) {
        navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();


        initViewpagerAdapter();
    }

    private void initViewpagerAdapter() {
        viewPagerAdapter = new ViewPagerAdapter(this);
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                if (id == R.id.action_music) {
                    binding.viewPager.setCurrentItem(0);
                } else if (id == R.id.action_music_video) {
                    binding.viewPager.setCurrentItem(1);
                }
                return true;
            }
        });
        binding.viewPager.setUserInputEnabled(false);
    }

    @Override
    public void setupData() {

    }
}
