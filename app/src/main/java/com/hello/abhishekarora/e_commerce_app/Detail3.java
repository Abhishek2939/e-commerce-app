package com.hello.abhishekarora.e_commerce_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Detail3 extends AppCompatActivity {
TextView textView99,textView82,textView83,textView84,textView85,textView86,textView87,textView88,textView89,textView90,textView91,textView92,textView93,textView95,textView96,textView97,textView98;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        textView82=(TextView)findViewById(R.id.TextView82);
        textView83=(TextView)findViewById(R.id.TextView83);
        textView84=(TextView)findViewById(R.id.TextView84);
        textView85=(TextView)findViewById(R.id.TextView85);
        textView86=(TextView)findViewById(R.id.TextView86);
        textView87=(TextView)findViewById(R.id.TextView87);
        textView88=(TextView)findViewById(R.id.TextView88);
        textView89=(TextView)findViewById(R.id.TextView89);
        textView90=(TextView)findViewById(R.id.TextView90);
        textView91=(TextView)findViewById(R.id.TextView91);
        textView92=(TextView)findViewById(R.id.TextView92);
        textView93=(TextView)findViewById(R.id.TextView93);
        textView95=(TextView)findViewById(R.id.TextView95);
        textView96=(TextView)findViewById(R.id.TextView96);
        textView97=(TextView)findViewById(R.id.TextView97);
        textView98=(TextView)findViewById(R.id.TextView98);
        textView99=(TextView)findViewById(R.id.TextView99);


        switch (getIntent().getStringExtra("object")){


            case "Sony Bravia KLV-32W562D":
                textView83.setText("KLV-32W562D");
                textView85.setText("2");
                textView87.setText("2");
                textView89.setText("1920 x 1080p");
                textView91.setText("Black");
                textView93.setText("30 Watts");
                textView96.setText("32 Inches");
                textView98.setText("6 Kg");

                break;

            case "Sony Bravia KLV-40R352D":
                textView83.setText("KLV-40R352D");
                textView85.setText("2");
                textView87.setText("1");
                textView89.setText("1920 x 1080 ");
                textView91.setText("Black");
                textView93.setText("10 watts");
                textView96.setText("40 inches");
                textView98.setText("6 Kg");

                break;

            case "Sony Bravia KLV-32R302D":
                textView83.setText("KLV-32R302D");
                textView85.setText("1");
                textView87.setText("1");
                textView89.setText("1366 x 768");
                textView91.setText("Black");
                textView93.setText("10 Watts");
                textView96.setText("80 cm");
                textView98.setText("5 Kg");

                break;

            case "Sony Bravia KLV-40W562D":
                textView83.setText("KLV-40W562D");
                textView85.setText("2");
                textView87.setText("1");
                textView89.setText("1920 x 1080");
                textView91.setText("Black");
                textView93.setText("30 Watts");
                textView96.setText("101.6 cm");
                textView98.setText("8.4 Kg");
                break;

            case "Samsung 40K5570":
                textView83.setText("Samsung 40K5570");
                textView85.setText("3");
                textView87.setText("2");
                textView89.setText("1920 x 1080");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("40 inches");
                textView98.setText("6.5 Kg");

                break;
            case "Samsung 48J5300":
                textView83.setText("J5300");
                textView85.setText("2");
                textView87.setText("2");
                textView89.setText("1920 x 1080");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("48 inches");
                textView98.setText("6.1 kg");
                break;
            case "Samsung 5 Series 48J5100":
                textView83.setText("J5100");
                textView85.setText("2");
                textView87.setText("1");
                textView89.setText("1920 x 1080");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("48 Inches");
                textView98.setText("10.9 Kg");
            break;

            case "Samsung 43K5300":
                textView83.setText("K5300");
                textView85.setText("2");
                textView87.setText("2");
                textView89.setText("1920 x 1080");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("43 Inches");
                textView98.setText("10.5 Kg");

                break;

            case "LCD-PA200-24":
                textView83.setText("LCD-PA200-24");
                textView85.setText("1");
                textView87.setText("1");
                textView89.setText("1366x768");
                textView91.setText("Black");
                textView93.setText("10 Watts");
                textView96.setText("24 Inches");
                textView98.setText("4.3 Kg");
                break;

            case "LCD-PB2-24":
                textView83.setText("LCD-PB2-24");
                textView85.setText("1");
                textView87.setText("1");
                textView89.setText("1366x768");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("24 Inches");
                textView98.setText("5.2 Kg");

                break;
            case "LCD-PB21-24":
                textView83.setText("LCD-PB21-24");
                textView85.setText("1");
                textView87.setText("1");
                textView89.setText("1366x768");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("24 Inches");
                textView98.setText("5.2 Kg");
                break;

            case "LCD-PA200-32":
                textView83.setText("LCD-PA200-32");
                textView85.setText("1");
                textView87.setText("1");
                textView89.setText("1366x768");
                textView91.setText("Black");
                textView93.setText("20 Watts");
                textView96.setText("32 Inches");
                textView98.setText("7.7 Kg");
                break;


        }

    }
}
