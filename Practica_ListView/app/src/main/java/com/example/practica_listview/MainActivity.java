package com.example.practica_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ListView listView;

    private String nombres[] = {"Samuel","Valentina", "Santiago", "Fernando", "Gabriela", "Patricia", "Alejo", "Pablo", "Ezequiel"};
    private String edades[] = {"18","25","30","26","17","35","40","19","36"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        listView = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.listview_item_agustin, nombres);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("La edad de " + listView.getItemAtPosition(i) + " es " + edades[i] + " años");
            }
        });
    }
}
