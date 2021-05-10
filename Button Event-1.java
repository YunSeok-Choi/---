package com.example.a2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById((R.id.naver));
        b2 = (Button)findViewById(R.id.call);
        b3 = (Button)findViewById(R.id.galley);
        b4 = (Button)findViewById(R.id.b4);

        b1.setBackgroundColor(Color.GREEN);
        b2.setBackgroundColor(Color.BLUE);
        b3.setBackgroundColor(Color.GRAY);
        b4.setBackgroundColor(Color.RED);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(n);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010123456789"));
                startActivity(n);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(n);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
