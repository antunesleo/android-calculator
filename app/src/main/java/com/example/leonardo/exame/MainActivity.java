package com.example.leonardo.exame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButtonEnter;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonEnter = (Button) findViewById(R.id.button_enter);
        mButtonEnter.setOnClickListener(mButtonEnterOnClickListener);
        mImageView = (ImageView) findViewById(R.id.imageview_app_logo);
        mImageView.setOnClickListener(mImageViewOnClickListener);

    }

    private View.OnClickListener mButtonEnterOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, FormActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener mImageViewOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_SHORT).show();
        }
    };
}
