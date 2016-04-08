package com.example.leonardo.exame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    private Button mButtonContinue;
    private EditText mEdittextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        mButtonContinue = (Button) findViewById(R.id.button_continue);
        mButtonContinue.setOnClickListener(mOnClickListener);
        mEdittextName = (EditText) findViewById(R.id.edittext_name);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEdittextName.getText().toString().trim().equals("")) {
                String errorValidation = "Campo vazio, preencha antes de continuar";
                mEdittextName.setError(errorValidation);
            } else {
                Intent i = new Intent(FormActivity.this, CalcActivity.class);
                String parameters = "Olá " + mEdittextName.getText().toString();
                i.putExtra("name", parameters);
                startActivity(i);
            }
        }
    };
}
