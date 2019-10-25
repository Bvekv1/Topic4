package com.topic.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {

    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        display = findViewById(R.id.display);

        Bundle bibek = getIntent().getExtras();
        if(bibek!=null){
            String message = bibek.getString("capital");
            display.setText(message);


        }
        else {
            Toast.makeText(this, "No data found", Toast.LENGTH_SHORT).show();
        }



    }
}
