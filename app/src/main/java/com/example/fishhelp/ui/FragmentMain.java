package com.example.fishhelp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.fishhelp.carousel.Carousel;
import com.example.fishhelp.R;
import com.example.fishhelp.user.UserActivity;

public class FragmentMain extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        CardView cardView1 = root.findViewById(R.id.card_view1);
        CardView cardView3 = root.findViewById(R.id.card_view3);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent collection = new Intent(getContext(), Carousel.class);
                startActivity(collection);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent user = new Intent(getContext(), UserActivity.class);
                startActivity(user);
            }
        });
        return root;
    }
}