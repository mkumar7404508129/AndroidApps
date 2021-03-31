package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

     EditText edt;
     Button btn;
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt=findViewById(R.id.edt);
        btn=findViewById(R.id.btn);
        textView=findViewById(R.id.textView);

        textView.setVisibility(View.GONE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strId=edt.getText().toString().trim();
                String dob=strId.substring(0,6);
                Date date=new Date();
                SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
                String dateOfBirth=dateFormat.format()

                int gndr=Integer.parseInt(Character.toString(strId.charAt(6)));
                String gender;
                if(gndr>=5){
                    gender=getString(R.string.mel);
                }
                else {
                    gender=getString(R.string.fmel);
                }
                int nsnalti=Integer.parseInt(Character.toString(strId.charAt(10)));
                String nationalty;

                if(nsnalti==0){

                    nationalty=getString(R.string.sCiti);
                }
                else{
                    nationalty=getString(R.string.pResident);
                }

                String text=getString(R.string.dob)+dob+getString(R.string.newline)+
                        getString(R.string.gender)+gender+getString(R.string.newline)+
                        getString(R.string.nationality)+nationalty;
                textView.setText(text);

                textView.setVisibility(View.VISIBLE);

            }
        });
    }
}