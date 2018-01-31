package com.hello.abhishekarora.e_commerce_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity1 extends AppCompatActivity {
    ListView listView;
    String[] cellphones={"SONY-MOBILE","SAMSUNG-MOBILE","MI-MOBILE","BLACKBERRY-MOBILE"};
    String[] laptop={"SONY-LAPTOP","DELL-LAPTOP","HP-LAPTOP","ACER-LAPTOP"};
    String[] pc={"HCL-PC","LG-PC","LENOVO-PC"};
    String[] lcd={"SONY-LCD","SAMSUNG-LCD","TOSHIBA-LCD"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,cellphones);
        ArrayAdapter arrayAdapter1=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,laptop);
        ArrayAdapter arrayAdapter2=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,pc);
        ArrayAdapter arrayAdapter3=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lcd);
        listView=(ListView)findViewById(R.id.ListView2);

        switch (getIntent().getStringExtra("name"))
        {
            case "CELLPHONES":
                listView.setAdapter(arrayAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity1.this,Activity2.class);
                        intent.putExtra("image",cellphones[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "LAPTOPS":
                listView.setAdapter(arrayAdapter1);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity1.this,Activity2.class);
                        intent.putExtra("image",laptop[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "PC":
                listView.setAdapter(arrayAdapter2);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity1.this,Activity2.class);
                        intent.putExtra("image",pc[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "LCD-TV":
                listView.setAdapter(arrayAdapter3);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity1.this,Activity2.class);
                        intent.putExtra("image",lcd[i]);
                        startActivity(intent);
                    }
                });

                break;

        }

        }
}
