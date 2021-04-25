package com.midz.papersolution4407.Q7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.midz.papersolution4407.R;

public class Question7 extends AppCompatActivity {
    private EditText edtFiName, edtLatName, edtEmail,edtPassword, edtEmail2, edtPassword2;
    private MaterialButton btnCreateAccount, btnLogin;
    private String fiName,laName,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        edtFiName = findViewById(R.id.edtFirstName);
        edtLatName = findViewById(R.id.edtLastName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtEmail2 = findViewById(R.id.edtEmail2);
        edtPassword2 = findViewById(R.id.edtPassword2);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginAccount();

            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();

            }
        });
    }

    private void loginAccount()  {
        if (edtEmail2.getText().toString().equals(email) && edtPassword2.getText().toString().equals(password)){
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Email or Password doesn't match!", Toast.LENGTH_SHORT).show();
        }
    }

    private void createAccount() {
        fiName = edtFiName.getText().toString();
        laName = edtLatName.getText().toString();
        email = edtEmail.getText().toString();
        password = edtPassword.getText().toString();
        Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();
    }

}