package com.hello.abhishekarora.e_commerce_app;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by HIMANSHU ARORA on 01-08-2017.
 */

public class Customvieadapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final Integer[] image ;

    public Customvieadapter(Activity context, String[] name, Integer[] image){
    super(context,R.layout.customlayout1,name);
        this.context = context;
        this.name = name;
        this.image = image;

    }
    public View getView(int position, View convertview, ViewGroup parent){

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View rowiew= layoutInflater.inflate(R.layout.customlayout1,null,true);
        TextView textView=(TextView)rowiew.findViewById(R.id.textView);
        ImageView imageView=(ImageView)rowiew.findViewById(R.id.imageView);
        textView.setText(name[position]);
        imageView.setImageResource(image[position]);
        return rowiew;
    }
}
