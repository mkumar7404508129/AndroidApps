package com.example.cricketchellange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText edtNum;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.txtResult);
        textView.setVisibility(View.GONE);

        edtNum=findViewById(R.id.edtNum);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNumber;
                sNumber=edtNum.getText().toString().trim();
                int num=Integer.parseInt(sNumber);
                Double result;
                result= num/3 +4.0;
                String text;
                text="Approximate Temperature IS"+ result.toString()+"*C";

                textView.setText(text);
                textView.setVisibility(View.VISIBLE);
            }
        });
    }
}