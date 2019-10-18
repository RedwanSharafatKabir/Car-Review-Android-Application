package com.example.android_car_review;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class login extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button logout;
    Spinner spin;
    String[] car = {"    Cars", "    BMW", "    Audi", "    Land_Rover"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        logout = findViewById(R.id.logoutID);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt = new Intent(login.this, MainActivity.class);
                login.this.startActivity(intt);
            }
        });

        spin = findViewById(R.id.carSpinnerID);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,car);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    @Override
//    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
        if(car[position]=="    BMW") {
            Intent intent1 = new Intent(login.this, BMW.class);
            login.this.startActivity(intent1);
        }
        if(car[position]=="    Audi") {
            Intent intent2 = new Intent(login.this, Audi.class);
            login.this.startActivity(intent2);
        }
        if(car[position]=="    Land_Rover") {
            Intent intent3 = new Intent(login.this, Land_Rover.class);
            login.this.startActivity(intent3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parentView) {

    }
}
