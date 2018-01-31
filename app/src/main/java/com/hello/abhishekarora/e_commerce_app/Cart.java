package com.hello.abhishekarora.e_commerce_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Cart extends AppCompatActivity {
TextView textView1,textView2;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        textView1=(TextView)findViewById(R.id.tv1);
        textView2=(TextView)findViewById(R.id.tv2);
button=(Button)findViewById(R.id.button2);
//     if(textView1.getText()=="")
//         i=0;
//        else
//            i=1;
//
//        for(i=0;i<3;i++)
//        {
//            if(i==0)
//            {
//            textView1.setText(getIntent().getStringExtra("object"));
//            textView2.setText(getIntent().getStringExtra("price"));
//                Intent intent= new Intent(Cart.this,CartShek.class);
//                startActivity(intent);
////            }
//            if(i==1)
//            {
                textView1.setText(getIntent().getStringExtra("object"));
                textView2.setText(getIntent().getStringExtra("price"));
                Toast.makeText(getApplicationContext(),"Total :"+textView2.getText().toString(),Toast.LENGTH_SHORT).show();
                }

        }




