package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textview);
        EditText editText = findViewById(R.id.edit_text);
        Button buttom_main = findViewById(R.id.button);
        Switch switch_main = findViewById(R.id.switch1);
        CheckBox checkBox = findViewById(R.id.checkBox);
    }

}