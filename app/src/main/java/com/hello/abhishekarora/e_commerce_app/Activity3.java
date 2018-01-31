package com.hello.abhishekarora.e_commerce_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    TextView textView2,textView4,textView5,textView6;
    ImageButton imageButton;
    ImageView imageView2,imageView3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        textView2=(TextView)findViewById(R.id.textView2);
        textView4=(TextView)findViewById(R.id.textView4);
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);

        imageButton=(ImageButton)findViewById(R.id.imageButton);

        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ADDED TO CART",Toast.LENGTH_SHORT);
                Intent intent=new Intent(Activity3.this, Cart.class);
                intent.putExtra("object",getIntent().getStringExtra("object"));
                intent.putExtra("price",textView5.getText().toString());
                startActivity(intent);

            }
        });

        textView2.setText(getIntent().getStringExtra("object"));

        switch (getIntent().getStringExtra("object")){

            case "SONY XPERIA L1":
                imageButton.setImageResource(R.drawable.xperial1);
                textView5.setText("Rs7999");

                textView6.setText("4.7");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "SONY XPERIA XA1":
                imageButton.setImageResource(R.drawable.xperiaxa1);
                textView5.setText("Rs19990");
                textView6.setText("3.7");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "SONY XPERIA X":
                imageButton.setImageResource(R.drawable.xperiax);
                textView5.setText("Rs45482");
                textView6.setText("5.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;

            case "SONY XPERIA XZ":
                imageButton.setImageResource(R.drawable.xperiaxz);
                textView5.setText("Rs38990");
                textView6.setText("4.3");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "SAMSUNG GALAXY J7 PRIME":
                imageButton.setImageResource(R.drawable.j7);
                textView5.setText("Rs14690");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "SAMSUNG GALAXY On8":
                imageButton.setImageResource(R.drawable.on8);
                textView5.setText("Rs12090");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "SAMSUNG GALAXY On7 Pro":
                imageButton.setImageResource(R.drawable.on7);
                textView5.setText("Rs8990");
                textView6.setText("3.8");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "SAMSUNG GALAXY On5":
                imageButton.setImageResource(R.drawable.on5);
                textView5.setText("Rs6990");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "REDMI NOTE4":
                imageButton.setImageResource(R.drawable.redmi1);
                textView5.setText("Rs10999");
                textView6.setText("4.3");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "REDMI 3s Prime":
                imageButton.setImageResource(R.drawable.redmi2);
                textView5.setText("Rs8999");
                textView6.setText("4.3");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "REDMI 4":
                imageButton.setImageResource(R.drawable.redmi3);
                textView5.setText("Rs6998");
                textView6.setText("4.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "MI MAX 2":
                imageButton.setImageResource(R.drawable.redmi4);
                textView5.setText("16999");
                textView6.setText("4.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "BlackBerry Z10":
                imageButton.setImageResource(R.drawable.bb1);
                textView5.setText("Rs6479");
                textView6.setText("3.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "BlackBerry Z30":
                imageButton.setImageResource(R.drawable.bb2);
                textView5.setText("Rs14990");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "BlackBerry Q10":
                imageButton.setImageResource(R.drawable.bb3);
                textView5.setText("Rs7889");
                textView6.setText("3.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "BlackBerry Q5":
                imageButton.setImageResource(R.drawable.bb4);
                textView5.setText("Rs6480");
                textView6.setText("4.1");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "Sony VAIO T Series SVT13134CXS":
                imageButton.setImageResource(R.drawable.sonylap1);
                textView5.setText("Rs65550");
                textView6.setText("3.00");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;

            case "Sony VAIO VGN-NW240F/T":
                imageButton.setImageResource(R.drawable.sonylap2);
                textView5.setText("Rs80500");
                textView6.setText("3.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;
            case "Sony VAIO SVF15A16CXB":
                imageButton.setImageResource(R.drawable.sonylap3);
                textView5.setText("Rs45999");
                textView6.setText("3");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Sony VAIO Fit 15E SVF15412CXB":
                imageButton.setImageResource(R.drawable.sonylap4);
                textView5.setText("Rs55566");
                textView6.setText("5.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HP 15-R078TU K5B35PA":
                imageButton.setImageResource(R.drawable.hp1);
                textView5.setText("Rs23290");
                textView6.setText("3.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HP 15-ac024tx":
                imageButton.setImageResource(R.drawable.hp2);
                textView5.setText("Rs34600");
                textView6.setText("4.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HP 15-af103ax":
                imageButton.setImageResource(R.drawable.hp3);
                textView5.setText("Rs28990");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HP Pavilion 15-ab220tx":
                imageButton.setImageResource(R.drawable.hp4);
                textView5.setText("Rs50800");
                textView6.setText("4.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Dell Inspiron 3555":
                imageButton.setImageResource(R.drawable.dell1);
                textView5.setText("Rs23900");
                textView6.setText("3.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Dell Inspiron 15 3558":
                imageButton.setImageResource(R.drawable.dell2);
                textView5.setText("Rs29950");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Dell Vostro 3468":
                imageButton.setImageResource(R.drawable.dell3);
                textView5.setText("Rs34990");
                textView6.setText("3.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Dell Inspiron 3567":
                imageButton.setImageResource(R.drawable.dell4);
                textView5.setText("Rs58790");
                textView6.setText("5.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Acer Switch 10E SW3-016":
                imageButton.setImageResource(R.drawable.acer1);
                textView5.setText("Rs12990");
                textView6.setText("4.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "ACER ONE 14 CELERON":
                imageButton.setImageResource(R.drawable.acer2);
                textView5.setText("Rs16990");
                textView6.setText("2.5");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Acer Aspire ES1-132":
                imageButton.setImageResource(R.drawable.acer3);
                textView5.setText("Rs16399");
                textView6.setText("3.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Acer aspire v5122p":
                imageButton.setImageResource(R.drawable.acer4);
                textView5.setText("Rs19100");
                textView6.setText("3.6");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Details2.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HCL AC2V0259":
                imageButton.setImageResource(R.drawable.pc1);
                textView5.setText("Rs19090");
                textView6.setText("5.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HCL AC2V0245":
                imageButton.setImageResource(R.drawable.pc1);
                textView5.setText("RS21500");
                textView6.setText("5.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HCL AC2F0018":
                imageButton.setImageResource(R.drawable.pc3);
                textView5.setText("Rs23100");
                textView6.setText("5.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "HCL AC2V0268":
                imageButton.setImageResource(R.drawable.pc4);
                textView5.setText("Rs23500");
                textView6.setText("4.9");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "LG Chromebase 22CV241-B":
                imageButton.setImageResource(R.drawable.pc5);
                textView5.setText("Rs30990");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "LG Chromebase 22CV241":
                imageButton.setImageResource(R.drawable.pc6);
                textView5.setText("Rs21505");
                textView6.setText("4.0");

                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });
                break;

            case "LG Chromebase 22CV241 AIO":
                imageButton.setImageResource(R.drawable.pc7);
                textView5.setText("Rs29710");
                textView6.setText("3.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Lenovo A740 DESKTOP":
                imageButton.setImageResource(R.drawable.pc8);
                textView5.setText("Rs113400");
                textView6.setText("4.1");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Lenovo B40-30 DESKTOP":
                imageButton.setImageResource(R.drawable.pc9);
                textView5.setText("Rs57770");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Lenovo C40-30 AIO":
                imageButton.setImageResource(R.drawable.pc10);
                textView5.setText("Rs52400");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Lenovo C40-30 AIO I3":
                imageButton.setImageResource(R.drawable.pc8);
                textView5.setText("Rs38490");
                textView6.setText("3.9");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail4.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Sony Bravia KLV-32W562D":
                imageButton.setImageResource(R.drawable.lcd1);
                textView5.setText("Rs32689");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Sony Bravia KLV-40R352D":
                imageButton.setImageResource(R.drawable.lcd2);
                textView5.setText("Rs39999");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Sony Bravia KLV-32R302D":
                imageButton.setImageResource(R.drawable.lcd3);
                textView5.setText("Rs23500");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Sony Bravia KLV-40W562D":
                imageButton.setImageResource(R.drawable.lcd4);
                textView5.setText("Rs23589");
                textView6.setText("4.3");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Samsung 40K5570":
                imageButton.setImageResource(R.drawable.lcd5);
                textView5.setText("Rs47077");
                textView6.setText("3.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "Samsung 48J5300":
                imageButton.setImageResource(R.drawable.lcd6);
                textView5.setText("Rs65389");
                textView6.setText("4.2");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Samsung 5 Series 48J5100":
                imageButton.setImageResource(R.drawable.lcd65);
                textView5.setText("Rs47990");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "Samsung 43K5300":
                imageButton.setImageResource(R.drawable.lcd7);
                textView5.setText("Rs51352");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "LCD-PA200-24":
                imageButton.setImageResource(R.drawable.lcd71);
                textView5.setText("Rs13490");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "LCD-PB2-24":
                imageButton.setImageResource(R.drawable.lcd72);
                textView5.setText("Rs15990");
                textView6.setText("3.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;
            case "LCD-PB21-24":
                imageButton.setImageResource(R.drawable.lcd8);
                textView5.setText("Rs16990");
                textView6.setText("4.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;

            case "LCD-PA200-32":
                imageButton.setImageResource(R.drawable.lcd9);
                textView5.setText("Rs21990");
                textView6.setText("3.0");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(Activity3.this, Detail3.class);
                        intent.putExtra("object",getIntent().getStringExtra("object"));
                        startActivity(intent);
                    }
                });

                break;


        }

    }
}
