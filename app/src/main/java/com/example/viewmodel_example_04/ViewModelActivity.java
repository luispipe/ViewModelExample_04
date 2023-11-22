package com.example.viewmodel_example_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewModelActivity extends AppCompatActivity {

    Button incrementViewModel;
    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);
        incrementViewModel=findViewById(R.id.buttonIncrementViewModel);
        count=findViewById(R.id.textViewViewModel);

        ViewModel vm= new ViewModelProvider(this).get(ViewModel.class);

        incrementViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vm.increment(Integer.parseInt(count.getText().toString()));
            }
        });

        Observer<Integer> obj_observer=new Observer<Integer>() {
            @Override
            public void onChanged(Integer result) {
                count.setText(result+"");
            }
        };

        vm.getResult().observe(this,obj_observer);

    }
}