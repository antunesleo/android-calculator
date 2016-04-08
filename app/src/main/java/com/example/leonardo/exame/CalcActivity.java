package com.example.leonardo.exame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {
    private TextView mTextviewNameIncoming;
    private EditText mEditTextResult;
    private Button mButtonZero;
    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Button mButtonSeven;
    private Button mButtonEight;
    private Button mButtonNine;
    private Button mButtonAdiction;
    private Button mButtonSubtraction;
    private Button mButtonDivision;
    private Button mButtonMultiplication;
    private Button mButtonEqual;
    private Button mButtonPreviousScreen;

    private int mSaveNumber;
    private String mOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        String name = this.getIntent().getStringExtra("name");
        mTextviewNameIncoming = (TextView) findViewById(R.id.textview_name_incoming);
        mTextviewNameIncoming.setText(name);
        mEditTextResult = (EditText) findViewById(R.id.edittext_result);

        mButtonZero = (Button) findViewById(R.id.button_zero);
        mButtonZero.setOnClickListener(mButtonZeroOnClickListener);
        mButtonOne = (Button) findViewById(R.id.button_one);
        mButtonOne.setOnClickListener(mButtonOneOnClickListener);
        mButtonTwo = (Button) findViewById(R.id.button_two);
        mButtonTwo.setOnClickListener(mButtonTwoOnClickListener);
        mButtonThree = (Button) findViewById(R.id.button_three);
        mButtonThree.setOnClickListener(mButtonThreeOnClickListener);
        mButtonFour = (Button) findViewById(R.id.button_four);
        mButtonFour.setOnClickListener(mButtonFourOnClickListener);
        mButtonFive = (Button) findViewById(R.id.button_five);
        mButtonFive.setOnClickListener(mButtonFiveOnClickListener);
        mButtonSix = (Button) findViewById(R.id.button_six);
        mButtonSix.setOnClickListener(mButtonSixOnClickListener);
        mButtonSeven = (Button) findViewById(R.id.button_seven);
        mButtonSeven.setOnClickListener(mButtonSevenOnClickListener);
        mButtonEight = (Button) findViewById(R.id.button_eight);
        mButtonEight.setOnClickListener(mButtonEightOnClickListener);
        mButtonNine = (Button) findViewById(R.id.button_nine);
        mButtonNine.setOnClickListener(mButtonNineOnClickListener);
        mButtonAdiction = (Button) findViewById(R.id.button_adiction);
        mButtonAdiction.setOnClickListener(mButtonAdictionOnClickListener);
        mButtonSubtraction = (Button) findViewById(R.id.button_subtraction);
        mButtonSubtraction.setOnClickListener(mButtonSubtractionOnClickListener);
        mButtonMultiplication = (Button) findViewById(R.id.button_multiplication);
        mButtonMultiplication.setOnClickListener(mButtonMultiplicationOnClickListener);
        mButtonDivision = (Button) findViewById(R.id.button_divison);
        mButtonDivision.setOnClickListener(mButtonDivisionOnClickListener);
        mButtonEqual = (Button) findViewById(R.id.button_equal);
        mButtonEqual.setOnClickListener(mButtonEqualOnClickListener);
        mButtonPreviousScreen = (Button) findViewById(R.id.button_previous_screen);
        mButtonPreviousScreen.setOnClickListener(mButtonPreviousScreenOnClickListener);
    }

    public View.OnClickListener mButtonZeroOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("0");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "0");
            }
        }
    };
    public View.OnClickListener mButtonOneOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("1");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "1");
            }
        }
    };
    public View.OnClickListener mButtonTwoOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("2");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "2");
            }
        }
    };
    public View.OnClickListener mButtonThreeOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("3");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "3");
            }
        }
    };
    public View.OnClickListener mButtonFourOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("4");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "4");
            }
        }
    };
    public View.OnClickListener mButtonFiveOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("5");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "5");
            }
        }
    };
    public View.OnClickListener mButtonSixOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("6");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "6");
            }
        }
    };
    public View.OnClickListener mButtonSevenOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("7");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "7");
            }
        }
    };
    public View.OnClickListener mButtonEightOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("8");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "8");
            }
        }
    };
    public View.OnClickListener mButtonNineOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mEditTextResult.getText().toString().trim().equals("")) {
                mEditTextResult.setText("9");
            } else {
                int currentNumber = Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(currentNumber + "9");
            }
        }
    };
    public View.OnClickListener mButtonAdictionOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mSaveNumber = Integer.parseInt(mEditTextResult.getText().toString());
            mEditTextResult.setText("");
            mOperation = "a";
        }
    };
    public View.OnClickListener mButtonSubtractionOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mSaveNumber = Integer.parseInt(mEditTextResult.getText().toString());
            mEditTextResult.setText("");
            mOperation = "s";
        }
    };
    public View.OnClickListener mButtonDivisionOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mSaveNumber = Integer.parseInt(mEditTextResult.getText().toString());
            mEditTextResult.setText("");
            mOperation = "d";
        }
    };
    public View.OnClickListener mButtonMultiplicationOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mSaveNumber = Integer.parseInt(mEditTextResult.getText().toString());
            mEditTextResult.setText("");
            mOperation = "m";
        }
    };
    public View.OnClickListener mButtonEqualOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mOperation.equals("a")) {
                int result = mSaveNumber + Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(String.valueOf(result));
            } else if (mOperation.equals("m")) {
                int result = mSaveNumber * Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(String.valueOf(result));
            } else if (mOperation.equals("d")) {
                if (mEditTextResult.getText().toString().equals("0")) {
                    Toast.makeText(getApplicationContext(), R.string.cant_divide_for_zero, Toast.LENGTH_SHORT).show();
                } else {
                    int result = mSaveNumber / Integer.parseInt(mEditTextResult.getText().toString());
                    mEditTextResult.setText(String.valueOf(result));
                }
            } else if (mOperation.equals("s")) {
                int result = mSaveNumber - Integer.parseInt(mEditTextResult.getText().toString());
                mEditTextResult.setText(String.valueOf(result));
            } else {
                //nothing here
            }
        }
    };

    public View.OnClickListener mButtonPreviousScreenOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
