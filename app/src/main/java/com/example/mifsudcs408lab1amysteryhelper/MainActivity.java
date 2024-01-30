package com.example.mifsudcs408lab1amysteryhelper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mifsudcs408lab1amysteryhelper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Button button = findViewById(R.id.button);
        TextView textview = findViewById(R.id.outputText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] array = getResources().getStringArray(R.array.outputs);
                String randomStr = array[new Random().nextInt(array.length)];
                textview.setText(randomStr);
            }
        });
    }
}
