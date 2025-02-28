package com.example.LiftMate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.LiftMate.CalenderPageActivity;
import com.example.LiftMate.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChestWorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout);
    }

    public void navigateToCalendarPage (View view){
        Intent intent = new Intent (this, CalenderPageActivity.class);
        startActivity(intent);
    }

}
