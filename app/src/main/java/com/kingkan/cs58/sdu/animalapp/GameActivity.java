package com.kingkan.cs58.sdu.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    //ประกาศตัวแปล
    Button btn1,btn2,btn3,btn4; //ชอยส์
    ImageView questionImageView; //รูปคำถาม
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer; //เล่นไฟล์เสียง
    int questionCount= 10; //เก็บข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>(); //qID แรนดอมโจทย์
    String answer; //คำตอบ
    int score = 0; //รวมคะแนน
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //เจนเรสทุกอย่างที่ออกแบบไว้
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);//ผูกอีลิเม้นกับตัวแปลบนจาวา

        //วนนับจำนวนข้อคำถาม
        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
            //questionCount จำนวนข้อ


        }
        Collections.shuffle(qID); //qIDกำหนดคำถามแบบสุ่ม
        setQuestion(qID.remove(0)); //เรียกใช้เมดตอด //.remove ไม่ให้คำถามซ้ำ
        //setQuestion แสดงรายละเอียดคำถามในแต่ละข้อ

    }//onCreate

    private void setQuestion(Integer qID) { //กำหนดข้อคำถามและเฉลยในแต่ละข้อ
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("นก");
            choice.add("แมว");
            choice.add("หมู");
            choice.add("แกะ");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("แกะ");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("วัว");
            choice.add("แมว");
            choice.add("สุนัข");
            choice.add("ช้าง");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 4) {
            answer = "สุนัข";
            questionImageView.setImageResource(R.drawable.dog);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("สุนัข");
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("แกะ");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("ม้า");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("ม้า");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("แกะ");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("หมู");
            choice.add("นก");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("ยุง");
            choice.add("แกะ");
            choice.add("หมู");
            choice.add("ช้าง");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("หมู");
            choice.add("วัว");
            choice.add("นก");
            choice.add("แกะ");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);//รูป
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>(); //ใช้ตัวแปลchoice แรนดอมชอยส์
            choice.add("แกะ");
            choice.add("แมว");
            choice.add("สิงโต");
            choice.add("ม้า");//สัตว์ที่จะให้แสดง
            Collections.shuffle(choice);//กำหนดให้แรนดอม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }


    }//end setQuestion
    public void choiceAns(View view) {
        Button button = (Button) view;
        String buttonString = button.getText().toString();
    //เอาข้อความบนปุ่มมาเก็บในตัวแปล buttonString //.toString เอามาทุกข้อความ
        if (buttonString.equals(answer)) {
        score++; //ถ้าตำตอบถูกต้องก็จะบวกคะแนน

    }//end methot choiceAns // choiceAns ตรวจคำตอบ
        if (qID.isEmpty()) {//isEmpty เช็คจำนวนข้อqID ว่าครบมั้ย //หากทำครบทุกข้อแล้วให้แสดงคะแนน
            getNameString =getIntent().getStringExtra("Name");

            dialogboxScore(getNameString); //เมดตอดแสดงคะแนนรวม
        } else { //ถ้ายังทำไม่ครบข้อ ก็ไปเรียกเมดตอดsetQuestion มาทำต่อ
            setQuestion(qID.remove(0));
        }
    }

    private void dialogboxScore(String getNameString) { // Methotสำหรับแสดงคะแนน
        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage(getNameString+"ได้คะแนน " +score+ " คะแนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish(); //ปิดActivity ออกจากแอป
                }
            })
            .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent= getIntent();
                    finish();
                    startActivity(intent);

                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show(); //ต้องshow ให้แสดง





    } //end dialogboxScore methot

    public void playSound(View view) { //playSound เสียง //View view รับค่ามาจาก xml หน้าที่ออกแบบ
        mediaPlayer.start(); //public เพราะต้องเรียกใช้งานภายนอกคลาส สามารถเข้าถึงได้

    }//end playSound methot


}//class
