package com.example.mymusic.ui.main.main.music.tab;

import android.os.Bundle;
import android.view.View;

import com.example.mymusic.R;
import com.example.mymusic.databinding.FragmentTabFolderBinding;
import com.example.mymusic.model.Folder;
import com.example.mymusic.ui.adapter.recycler.FolderAdapter;
import com.example.mymusic.ui.base.BaseBindingFragment;

import java.util.LinkedList;
import java.util.List;

public class TabFolderFragment extends BaseBindingFragment<FragmentTabFolderBinding> {

    private final List<Folder> listFolder = new LinkedList<>();

    private FolderAdapter folderAdapter;
   
    @Override
    public int getLayoutId() {
        return R.layout.fragment_tab_folder;
    }

    @Override
    protected void onCreatedView(View view, Bundle savedInstanceState) {
        initAdapter();
        initData();
    }
    public void initAdapter() {
        folderAdapter = new FolderAdapter();
        binding.rclListFoler.setAdapter(folderAdapter);
    }

    public void initData() {
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        listFolder.add(new Folder("A" , "Anh Tu Atus","1 bài hát "));
        folderAdapter.setListFolder(listFolder);

    }
}
