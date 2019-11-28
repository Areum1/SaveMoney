package com.example.plzsave;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Input extends AppCompatActivity {

    EditText name, price, link, memo;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        name = findViewById(R.id.iname);
        price = findViewById(R.id.iprice);
        link = findViewById(R.id.ilink);
        memo = findViewById(R.id.imemo);

    }
    public void OnClickHandler(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        String str1 = name.getText().toString();
        String str2 = price.getText().toString();
        String str3 = link.getText().toString();
        String str4 = memo.getText().toString();

        builder.setTitle("위시리스트").setMessage("상품명은 "+str1+"\n가격은 "+str2+"\n링크는 "+str3+"\n메모는 "+str4);

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}
