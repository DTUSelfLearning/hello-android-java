package com.example.selflearning.hello_android_java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.selflearning.hello_android_java.customview.FirstCanvas;

public class MainActivity extends AppCompatActivity {
    private Button btnQuay;
    private FirstCanvas firstCanvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnQuay = findViewById(R.id.btnQuay);
        firstCanvas = findViewById(R.id.first);

        btnQuay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstCanvas.quay();
            }
        });
    }
}
