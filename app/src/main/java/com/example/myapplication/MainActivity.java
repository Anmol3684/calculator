package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText display;
    String tag = "Week2Project";
    Button sumOP;
    Button timesOP;
    Button divideOP;
    Button minusOP;
    Button equalOP;
    Button deleteOP;
    Button oneOP,twoOP,threeOP,fourOP,fiveOP,sixOP,sevenOP,eightOP,nineOP,zeroOP;
    TextView edt1;
    float mValueOne , mValueTwo ;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"in OnCreate");
        setContentView(R.layout.activity_main);

        timesOP = (Button) findViewById(R.id.timesOP);
        sumOP = (Button) findViewById(R.id.sumOP);
        minusOP = (Button) findViewById(R.id.minusOP);
        divideOP = (Button)findViewById(R.id.divideOP);
        equalOP = (Button)findViewById(R.id.equalOP);
        deleteOP = (Button)findViewById(R.id.deleteOP);
        oneOP = (Button) findViewById(R.id.oneOP);
        twoOP = (Button) findViewById(R.id.twoOP);
        threeOP = (Button) findViewById(R.id.threeOP);
        fourOP = (Button) findViewById(R.id.fourOP);
        fiveOP = (Button) findViewById(R.id.fiveOP);
        sixOP = (Button) findViewById(R.id.sixOP);
        sevenOP = (Button) findViewById(R.id.sevenOP);
        eightOP = (Button) findViewById(R.id.eightOP);
        nineOP = (Button) findViewById(R.id.nineOP);
        zeroOP = (Button) findViewById(R.id.zeroOP);
        edt1 = (TextView) findViewById(R.id.edt1);
        oneOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        twoOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        threeOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        fourOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        fiveOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        sixOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        sevenOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        eightOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        nineOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        zeroOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        sumOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null){
                    edt1.setText("");
                }else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
            }
        });

        minusOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true ;
                edt1.setText(null);
            }
        });

        timesOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true ;
                edt1.setText(null);
            }
        });

        divideOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                mDivision = true ;
                edt1.setText(null);
            }
        });

        equalOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true){
                    edt1.setText(mValueOne + "+" + mValueTwo + "=" + (mValueOne + mValueTwo) +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    edt1.setText(mValueOne + "+" + mValueTwo + "=" + (mValueOne - mValueTwo)+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    edt1.setText(mValueOne + "+" + mValueTwo + "=" + (mValueOne * mValueTwo)+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    edt1.setText(mValueOne + "+" + mValueTwo + "=" + (mValueOne / mValueTwo)+"");
                    mDivision=false;
                }
            }
        });

        deleteOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"in onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"in onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"in onDestroy");
    }

}