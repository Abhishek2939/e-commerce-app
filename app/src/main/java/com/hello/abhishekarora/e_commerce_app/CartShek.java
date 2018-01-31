package com.hello.abhishekarora.e_commerce_app;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CartShek extends AppCompatActivity {


    ListView listView;
    Customvieadapter customvieadapter;
    String[] name={"CELLPHONES","LAPTOPS","PC","LCD-TV"};
    Integer[] image=new Integer[]{R.drawable.cellphone,R.drawable.laptop,R.drawable.pc,R.drawable.lcd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_shek);
        listView=(ListView)findViewById(R.id.ListView);
        customvieadapter=new Customvieadapter(this,name,image);
        listView.setAdapter(customvieadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(CartShek.this,Activity1.class);
                intent.putExtra("name",name[i]);
                startActivity(intent);


            }
        });

    }

}
