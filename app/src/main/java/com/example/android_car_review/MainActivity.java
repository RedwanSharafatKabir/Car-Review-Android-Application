package com.example.android_car_review;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    WebView wblink;
    Button loginBut, signupBut, forgotPass;
    EditText username, pass;
    String me = "Redwan Sharafat", sir = "Md. Jueal Mia", passwordstring = "diu2019";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        wblink = findViewById(R.id.wb);
//        wblink.setWebViewClient(new WebViewClient());
//        wblink.loadUrl("https://stackoverflow.com/");
        loginBut = findViewById(R.id.loginID);
        loginBut.setOnClickListener(this);
        signupBut = findViewById(R.id.signUpID);
        signupBut.setOnClickListener(this);
        forgotPass = findViewById(R.id.forgotPassID);
        forgotPass.setOnClickListener(this);

        username = findViewById(R.id.loginusernameID);
        pass = findViewById(R.id.loginpassID);
    }

    @Override
    public void onClick(View v) {

        String usernameobj = username.getText().toString(), passobj = pass.getText().toString();

        if( (pass.getText().toString().equals(passwordstring)) &&
                ((username.getText().toString().equals(me)) || (username.getText().toString().equals(sir))) ) {
            if (v.getId() == R.id.loginID) {
                Intent log = new Intent(MainActivity.this, login.class);
                startActivity(log);
                username.setText("");
                pass.setText("");
            }
        }
        else if(usernameobj.matches("") || passobj.matches("")){
            if (v.getId() == R.id.loginID) {
                Toast t = Toast.makeText(MainActivity.this, "Fill up all required fields", Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER, 0, 0);
                t.show();
            }
        }
        else {
            if (v.getId() == R.id.loginID) {
                Toast t = Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER, 0, 0);
                t.show();
            }
        }

        if(v.getId()==R.id.signUpID){
            Intent sp = new Intent(MainActivity.this, signUp.class);
            startActivity(sp);
            username.setText("");
            pass.setText("");
        }

        if(v.getId()==R.id.forgotPassID){
            Intent fGps = new Intent(MainActivity.this, forGotPass.class);
            startActivity(fGps);
            username.setText("");
            pass.setText("");
        }
    }
}
