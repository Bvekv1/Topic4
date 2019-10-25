package com.topic.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView show;
    public static final String countries[] = {"Nepal", "Kathmadu",
            "India", "New Delhi",
            "China", "Beijing"};
 private Map<String,String> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);

        result = new HashMap<>();
        for (int i = 0; i<countries.length;i+=2){
            result.put(countries[i], countries[i+1]);

        }


        ArrayAdapter  countriesAdapter = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            new ArrayList<String>(result.keySet())

        );
        show.setAdapter(countriesAdapter);

        show.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = parent.getItemAtPosition(position).toString();
                String capital = result.get(country);
                //Toast.makeText(MainActivity.this, "Capital of"+country+ "is :"+capital, Toast.LENGTH_SHORT).show();
                Intent bibek = new Intent(MainActivity.this ,CapitalActivity.class);
                bibek.putExtra("capital" , capital);
                startActivity(bibek);


            }
        });



    }
}
