package com.example.mock;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final EditText name = (EditText) findViewById(R.id.insertName);
        final RadioButton male = (RadioButton) findViewById(R.id.rM);
        final RadioButton female = (RadioButton) findViewById(R.id.rF);
        final RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        final TextView message = (TextView) findViewById(R.id.msg);
        final Button a2toa1 = (Button) findViewById(R.id.btn_2to1);
        final Button a2toa3 = (Button) findViewById(R.id.btn_2to3);
        final Button submit = (Button) findViewById(R.id.submit);
        final RadioGroup group2 = (RadioGroup) findViewById(R.id.radiogroup2);
        final RadioButton student = (RadioButton) findViewById(R.id.stdbutton);
        final RadioButton instructer = (RadioButton) findViewById(R.id.inst1);
        final RadioButton date = (RadioButton) findViewById(R.id.datebutton);



        a2toa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent always has the activities inside
                Intent s2tos1= new Intent(Activity2.this,MainActivity.class);
                startActivity(s2tos1);
            }
        });
        a2toa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2tos3 = new Intent(Activity2.this,MainActivity.class);
                startActivity(s2tos3);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name!=null && birth!=null){
                    if (male.isChecked()){
                        message.setText("Hello Mr."+name.getText()+" you are "+(2021-Integer.parseInt(birth.getText().toString())) + " years old");
                    }


                        if(female.isChecked()){
                            message.setText("Hello Ms."+name.getText()+" you are "+(2021-Integer.parseInt(birth.getText().toString())));

                    }
                        if(instructer.isChecked()){
                            message.setText(("hi prof" + name.getText()));
                        }
                        if(student.isChecked()){
                            message.setText("hi student " + name.getText());
                        }
                        else {
                            Toast.makeText(Activity2.this,"Please enter all info",Toast.LENGTH_LONG).show();
                        }


                }
            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { new DatePickerDialog(Activity2.this, d,
                    c.get(Calendar.YEAR), c.get(Calendar.MONTH),
                    c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    Calendar c = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year,
                              int monthOfYear, int dayOfMonth) {
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, monthOfYear);
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            onDateSet().setText("Your reservation is "+
                    fmtDate.format(c.getTime()));
        }
    };

            }



    }
}