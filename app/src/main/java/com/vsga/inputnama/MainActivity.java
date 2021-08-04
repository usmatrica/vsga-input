package com.vsga.inputnama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSave = findViewById(R.id.btnSave);
        EditText etName = findViewById(R.id.etName);

        RelativeLayout rlGreetings = findViewById(R.id.rlGreetings);
        RelativeLayout rlName = findViewById(R.id.rlName);

        TextView tvName = findViewById(R.id.tvName);

        btnSave.setOnClickListener(v -> {
            tvName.setText(String.format("Hai, %s", etName.getText().toString().trim()));
            rlGreetings.setVisibility(View.GONE);
            rlName.setVisibility(View.VISIBLE);
        });
    }
}