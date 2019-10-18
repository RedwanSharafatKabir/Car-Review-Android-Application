package com.example.android_car_review;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class signUp extends AppCompatActivity implements View.OnClickListener{

    Button signinbut;
    EditText email, pas, confirmpass, usernm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        signinbut = findViewById(R.id.signinID);
        signinbut.setOnClickListener(this);

        email = findViewById(R.id.emailID);
        usernm = findViewById(R.id.signupusernameID);
        pas = findViewById(R.id.signuppassID);
        confirmpass = findViewById(R.id.signupConfirmpassID);
    }

    @Override
    public void onClick(View v) {

        String emailobj = email.getText().toString(), usernmobj = usernm.getText().toString();
        String pasobj = pas.getText().toString(), confirmpasobj = confirmpass.getText().toString();

        if( emailobj.matches("") || usernmobj.matches("") || pasobj.matches("") || confirmpasobj.matches("")) {
            Toast t = Toast.makeText(signUp.this, "Fill up all required fields", Toast.LENGTH_LONG);
            t.setGravity(Gravity.CENTER, 0, 0);
            t.show();
        }
        else {
            if (v.getId() == R.id.signinID) {
                if(pasobj.matches(confirmpasobj)) {
                    Intent log = new Intent(signUp.this, login.class);
                    startActivity(log);
                    email.setText("");
                    usernm.setText("");
                    pas.setText("");
                    confirmpass.setText("");
                }
                else {
                    Toast t = Toast.makeText(signUp.this, "Password is not matched", Toast.LENGTH_LONG);
                    t.setGravity(Gravity.CENTER, 0, 0);
                    t.show();
                }
            }
        }
    }
}
