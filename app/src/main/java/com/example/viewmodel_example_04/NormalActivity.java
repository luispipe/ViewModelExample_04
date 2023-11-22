package com.example.viewmodel_example_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NormalActivity extends AppCompatActivity {

    Button increment;
    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        increment=findViewById(R.id.buttonIncrementNormal);
        count=findViewById(R.id.textViewNormal);
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int i= Integer.parseInt(count.getText().toString());
              i++;
              count.setText(""+i);
            }
        });


    }
}