package com.example.fishhelp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    static int position;

    public static PageFragment newInstance(int page) {
        position = page;
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root;
        switch (position) {
            case 0:
                root = inflater.inflate(R.layout.fragment1, container, false);
                break;

            case 1:
                root = inflater.inflate(R.layout.fragment2, container, false);
                break;

            case 2:
                root = inflater.inflate(R.layout.fragment3, container, false);
                break;

            case 3:
                root = inflater.inflate(R.layout.fragment4, container, false);
                break;

            default:
                root = inflater.inflate(R.layout.fragment, container, false);
                break;
        }
        return root;
    }
}
