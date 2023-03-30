package com.example.mymusic.ui.main.main.video;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentTab2Binding;
import com.example.mymusic.ui.adapter.pager.ViewPagerTabAdapter;
import com.example.mymusic.ui.adapter.tab.TabLayoutAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Tab2Fragment extends Fragment {
    FragmentTab2Binding binding;
    private ViewPagerTabAdapter viewPagerTabAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_tab2, null, false);
        return binding.getRoot();
    }

}
