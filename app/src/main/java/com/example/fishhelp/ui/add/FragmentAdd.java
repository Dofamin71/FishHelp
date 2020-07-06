package com.example.fishhelp.ui.add;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.fishhelp.R;

public class FragmentAdd extends Fragment {

    private ViewModelAdd viewModelAdd;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewModelAdd = ViewModelProviders.of(this).get(ViewModelAdd.class);
        View root = inflater.inflate(R.layout.fragment_add, container, false);
        return root;
    }
}