package com.jovanovic.stefan.sqlitetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class History extends AppCompatActivity {

    String[] array = {"Hello", "World", "!"};
    Button create_file;
    Button my_library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        TextView textView1 = findViewById(R.id.textView);
        textView1.setText(array[0]);

        TextView textView2 = findViewById(R.id.textView4);
        textView2.setText(array[1]);

        TextView textView3 = findViewById(R.id.textView5);
        textView3.setText(array[2]);

        create_file = findViewById(R.id.create_file);
        my_library = findViewById(R.id.my_library);

        create_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this, AddActivity.class);
                startActivity(intent);
            }
        });

        my_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}