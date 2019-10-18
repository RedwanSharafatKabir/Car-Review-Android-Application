package com.example.android_car_review;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Audi extends AppCompatActivity {

    RatingBar Audiratingbar;
    Button Submitbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audi);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        Audiratingbar = (RatingBar)findViewById(R.id.AudiratingBar1);

        Submitbutton = (Button)findViewById(R.id.rateAudiSubmitID1);
        Submitbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                String rating=String.valueOf(Audiratingbar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
