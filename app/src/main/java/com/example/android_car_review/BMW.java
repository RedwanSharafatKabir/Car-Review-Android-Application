package com.example.android_car_review;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class BMW extends AppCompatActivity {

    RatingBar BMWratingbar;
    Button Submitbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmw);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        BMWratingbar = (RatingBar)findViewById(R.id.BMWratingBar1);

        Submitbutton = (Button)findViewById(R.id.rateBMWSubmitID1);
        Submitbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                String rating=String.valueOf(BMWratingbar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
