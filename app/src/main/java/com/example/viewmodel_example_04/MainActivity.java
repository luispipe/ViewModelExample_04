package com.example.viewmodel_example_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button normal, viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        normal=findViewById(R.id.buttonNormal);
        viewModel=findViewById(R.id.buttonViewModel);

        Intent normalView= new Intent(getApplicationContext(),
                NormalActivity.class);

        Intent viewModelView= new Intent(getApplicationContext(),
                ViewModelActivity.class);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(normalView);
            }
        });

        viewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(viewModelView);
            }
        });

    }
}