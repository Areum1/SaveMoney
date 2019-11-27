package com.example.plzsave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    EditText cal_time, cal_mon;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        cal_time = findViewById(R.id.time);
        cal_mon = findViewById(R.id.money);

        cal = findViewById(R.id.btn_cal);

        BtnEvent listener = new BtnEvent();

        cal.setOnClickListener(listener);
    }

    class BtnEvent implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String str1 = cal_time.getText().toString();

            int num1 = Integer.parseInt(str1);
            int hap = num1 * 8350;

            String strh = Integer.toString(hap);

            cal_mon.setText(strh+"원");
        }
    }
}
