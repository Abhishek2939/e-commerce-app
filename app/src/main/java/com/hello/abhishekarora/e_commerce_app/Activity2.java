package com.hello.abhishekarora.e_commerce_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity2 extends AppCompatActivity {

    String[] sony={"SONY XPERIA L1","SONY XPERIA XA1","SONY XPERIA X","SONY XPERIA XZ"};
    String[] samsung={"SAMSUNG GALAXY J7 PRIME","SAMSUNG GALAXY On8","SAMSUNG GALAXY On7 Pro",
            "SAMSUNG GALAXY On5"};
    String[] MI={"REDMI NOTE4","REDMI 3s Prime","REDMI 4","MI MAX 2"};
    String[] Blackberry={"BlackBerry Z10","BlackBerry Z30","BlackBerry Q10","BlackBerry Q5"};
    String[] laptopsony={"Sony VAIO T Series SVT13134CXS","Sony VAIO VGN-NW240F/T","Sony VAIO SVF15A16CXB","Sony VAIO Fit 15E SVF15412CXB"};
    String[] laptophp={"HP 15-R078TU K5B35PA","HP 15-ac024tx","HP 15-af103ax","HP Pavilion 15-ab220tx"};
    String[] laptopdell={"Dell Inspiron 3555","Dell Inspiron 15 3558","Dell Vostro 3468","Dell Inspiron 3567"};
    String[] laptopacer={"Acer Switch 10E SW3-016","ACER ONE 14 CELERON","Acer Aspire ES1-132","Acer aspire v5122p"};
    String[] pchcl={"HCL AC2V0259","HCL AC2V0245","HCL AC2F0018","HCL AC2V0268"};
    String[] pclg={"LG Chromebase 22CV241-B","LG Chromebase 22CV241","LG Chromebase 22CV241 AIO"};
    String[] pclenovo={"Lenovo A740 DESKTOP","Lenovo B40-30 DESKTOP","Lenovo C40-30 AIO","Lenovo C40-30 AIO I3"};
    String[] lcdsony={"Sony Bravia KLV-32W562D","Sony Bravia KLV-40R352D","Sony Bravia KLV-32R302D","Sony Bravia KLV-40W562D"};
    String[] lcdsamsung={"Samsung 40K5570","Samsung 48J5300","Samsung 5 Series 48J5100","Samsung 43K5300"};
    String[] lcdtoshiba={"LCD-PA200-24","LCD-PB2-24","LCD-PB21-24","LCD-PA200-32"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        listView=(ListView)findViewById(R.id.ListView3);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,sony);
        ArrayAdapter arrayAdapter1=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,samsung);
        ArrayAdapter arrayAdapter2=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,MI);
        ArrayAdapter arrayAdapter3=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,Blackberry);
        ArrayAdapter arrayAdapter4=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,laptopsony);
        ArrayAdapter arrayAdapter5=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,laptophp);
        ArrayAdapter arrayAdapter6=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,laptopdell);
        ArrayAdapter arrayAdapter7=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,laptopacer);
        ArrayAdapter arrayAdapter8=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,pchcl);
        ArrayAdapter arrayAdapter9=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,pclenovo);
        ArrayAdapter arrayAdapter10=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,pclg);
        ArrayAdapter arrayAdapter11=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lcdsony);
        ArrayAdapter arrayAdapter12=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lcdsamsung);
        ArrayAdapter arrayAdapter13=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,lcdtoshiba);

        switch (getIntent().getStringExtra("image")){

            case "SONY-MOBILE":
                listView.setAdapter(arrayAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",sony[i]);
                        startActivity(intent);
                    }
                });
                break;

            case "SAMSUNG-MOBILE":
                listView.setAdapter(arrayAdapter1);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",samsung[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "MI-MOBILE":
                listView.setAdapter(arrayAdapter2);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",MI[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "BLACKBERRY-MOBILE":
                listView.setAdapter(arrayAdapter3);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",Blackberry[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "SONY-LAPTOP":
                listView.setAdapter(arrayAdapter4);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",laptopsony[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "DELL-LAPTOP":
                listView.setAdapter(arrayAdapter6);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",laptopdell[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "HP-LAPTOP":
                listView.setAdapter(arrayAdapter5);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",laptophp[i]);
                        startActivity(intent);
                    }
                });
                break;

            case "ACER-LAPTOP":
                listView.setAdapter(arrayAdapter7);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",laptopacer[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "HCL-PC":
                listView.setAdapter(arrayAdapter8);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",pchcl[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "LG-PC":
                listView.setAdapter(arrayAdapter9);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",pclg[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "LENOVO-PC":
                listView.setAdapter(arrayAdapter10);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",pclenovo[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "SONY-LCD":
                listView.setAdapter(arrayAdapter11);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",lcdsony[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "SAMSUNG-LCD":
                listView.setAdapter(arrayAdapter12);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",lcdsamsung[i]);
                        startActivity(intent);
                    }
                });

                break;

            case "TOSHIBA-LCD":
                listView.setAdapter(arrayAdapter13);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent=new Intent(Activity2.this,Activity3.class);
                        intent.putExtra("object",lcdtoshiba[i]);
                        startActivity(intent);
                    }
                });

                break;


        }


    }
}
