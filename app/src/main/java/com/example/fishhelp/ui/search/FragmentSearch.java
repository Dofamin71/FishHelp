package com.example.fishhelp.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.fishhelp.R;

public class FragmentSearch extends Fragment {

    private ViewModelSearch viewModelSearch;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewModelSearch = ViewModelProviders.of(this).get(ViewModelSearch.class);
        View root = inflater.inflate(R.layout.fragment_search, container, false);
        return root;
    }
}