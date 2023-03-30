package com.example.mymusic.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public abstract class BaseBindingFragment<B extends ViewDataBinding> extends BaseFragment {
    public B binding;
    public Toast toast;

    public abstract int getLayoutId();

    protected abstract void onCreatedView(View view, Bundle savedInstanceState);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onCreatedView(view, savedInstanceState);
    }

    public void showToast(String content) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(getContext(), content, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void addFragment(Fragment fragment, int view) {
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (fragment.isAdded()) {
            fragmentTransaction.show(fragment);
        } else {
            fragmentTransaction.add(view, fragment, null);
        }
        fragmentTransaction.commit();
    }
}