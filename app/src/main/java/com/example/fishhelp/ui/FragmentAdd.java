package com.example.fishhelp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.fishhelp.LureClass;
import com.example.fishhelp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FragmentAdd extends Fragment {

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    EditText signBrand, signModel, signColor, signPrice;
    Button add;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_add, container, false);

        signBrand = root.findViewById(R.id.brandAddInputEditText);
        signModel = root.findViewById(R.id.modelAddInputEditText);
        signColor = root.findViewById(R.id.colorAddInputEditText);
        signPrice = root.findViewById(R.id.priceAddInputEditText);
        add = root.findViewById(R.id.addButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("lures");
                String brand = signBrand.getText().toString();
                String model = signModel.getText().toString();
                String color = signColor.getText().toString();
                String price = signPrice.getText().toString();
                LureClass lure = new LureClass(brand, model, color, price);
                if (!brand.equals("")&&!model.equals("")) reference.child(brand).child(model).setValue(lure);
            }
        });
        return root;
    }
}