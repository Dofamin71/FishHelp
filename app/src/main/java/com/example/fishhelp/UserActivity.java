package com.example.fishhelp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserActivity extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    EditText signName, signEmail, signLogin, signPassword;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_user);

        signName = findViewById(R.id.nameTextInputEditText);
        signEmail = findViewById(R.id.emailTextInputEditText);
        signLogin = findViewById(R.id.loginTextInputEditText);
        signPassword = findViewById(R.id.passwordTextInputEditText);
        signUp = findViewById(R.id.sign_up);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                String name = signName.getText().toString();
                String email = signEmail.getText().toString();
                String login = signLogin.getText().toString();
                String password = signPassword.getText().toString();

                UserHelper userHelper = new UserHelper(name, email, login, password);

                reference.child(name).setValue(userHelper);
                //reference.setValue("Fuck you!");
            }
        });
    }
}
