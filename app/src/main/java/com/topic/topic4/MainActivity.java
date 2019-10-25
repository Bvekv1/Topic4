package com.topic.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView show;
    public static final String countries[] = {"Nepal",
            "India",
            "China"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);


        ArrayAdapter  countriesAdapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            countries
        );
        show.setAdapter(countriesAdapter);



    }
}
