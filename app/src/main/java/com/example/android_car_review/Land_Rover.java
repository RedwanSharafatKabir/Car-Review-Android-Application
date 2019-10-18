package com.example.android_car_review;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Land_Rover extends AppCompatActivity implements View.OnClickListener{

    RatingBar Rangeratingbar;
    Button Submitbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landrover);

        Rangeratingbar = (RatingBar)findViewById(R.id.LandRoverratingBar1);

        Submitbutton = (Button)findViewById(R.id.rateLandRoverSubmitID1);
        Submitbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.rateLandRoverSubmitID1){
            String rating = String.valueOf(Rangeratingbar.getRating());
            Toast.makeText(Land_Rover.this, rating, Toast.LENGTH_LONG).show();
        }
    }
}
