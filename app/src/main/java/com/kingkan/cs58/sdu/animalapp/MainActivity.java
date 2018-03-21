package com.kingkan.cs58.sdu.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText  nameEditText;
    Button  startButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText=findViewById(R.id.edtName);
        startButton=findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString=nameEditText.getText().toString().trim(); //ข้อความมาเก็บในตัวแปร string
                //เช็คค่าว่าในตัวแปร
                if (nameString.length()==0) {
                    ; //ถ้า nameString เป้น่ค่าว่าง
                    Toast.makeText(getApplicationContext(), "กรุณากรอกชื่อ", Toast.LENGTH_SHORT).show();

                }else{
                        Intent startIntent =new Intent(MainActivity.this, GameActivity.class);
                        startIntent.putExtra("Name",nameString);
                        startActivity(startIntent);
                    }
                }

        });




        //ผูกตัวแปร

    }//end onCreate
}//end class
