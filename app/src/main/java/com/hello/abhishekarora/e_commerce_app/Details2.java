package com.hello.abhishekarora.e_commerce_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Details2 extends AppCompatActivity {

    TextView textView82,textView47,textView48,textView49,textView50,textView65,textView51,textView52,textView53,textView54,textView55,textView56,textView57,textView58,textView59,textView60,textView61,textView62,textView63,textView64,textView66,textView67,textView68,textView69,textView70,textView71,textView72,textView73,textView74,textView75,textView76,textView77,textView78,textView79,textView80,textView81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        textView47=(TextView)findViewById(R.id.TextView47);
        textView48=(TextView)findViewById(R.id.TextView48);
        textView49=(TextView)findViewById(R.id.TextView49);
        textView50=(TextView)findViewById(R.id.TextView50);
        textView51=(TextView)findViewById(R.id.TextView51);
        textView52=(TextView)findViewById(R.id.TextView52);
        textView53=(TextView)findViewById(R.id.TextView53);
        textView54=(TextView)findViewById(R.id.TextView54);
        textView55=(TextView)findViewById(R.id.TextView55);
        textView56=(TextView)findViewById(R.id.TextView56);
        textView57=(TextView)findViewById(R.id.TextView57);
        textView58=(TextView)findViewById(R.id.TextView58);
        textView59=(TextView)findViewById(R.id.TextView59);
        textView60=(TextView)findViewById(R.id.TextView60);
        textView61=(TextView)findViewById(R.id.TextView61);
        textView62=(TextView)findViewById(R.id.TextView62);
        textView63=(TextView)findViewById(R.id.TextView63);
        textView64=(TextView)findViewById(R.id.TextView64);
        textView65=(TextView)findViewById(R.id.TextView65);
        textView66=(TextView)findViewById(R.id.TextView66);
        textView67=(TextView)findViewById(R.id.TextView67);
        textView68=(TextView)findViewById(R.id.TextView68);
        textView69=(TextView)findViewById(R.id.TextView69);
        textView70=(TextView)findViewById(R.id.TextView70);
        textView71=(TextView)findViewById(R.id.TextView71);
        textView72=(TextView)findViewById(R.id.TextView72);
        textView73=(TextView)findViewById(R.id.TextView73);
        textView74=(TextView)findViewById(R.id.TextView74);
        textView75=(TextView)findViewById(R.id.TextView75);
        textView76=(TextView)findViewById(R.id.TextView76);
        textView77=(TextView)findViewById(R.id.TextView77);
        textView78=(TextView)findViewById(R.id.TextView78);
        textView79=(TextView)findViewById(R.id.TextView79);
        textView80=(TextView)findViewById(R.id.TextView80);
        textView81=(TextView)findViewById(R.id.TextView81);
        textView82=(TextView)findViewById(R.id.TextView82);


        switch (getIntent().getStringExtra("object")){

            case "Sony VAIO T Series SVT13134CXS":

                textView49.setText("Sony VAIO T Series");
                textView51.setText("SVT13134CXS ");
                textView82.setText("Notebook type");
                textView54.setText("Gray");
                textView57.setText("13.3 inch");
                textView59.setText("1366 x 768");
                textView61.setText("HD");
                textView63.setText("NO");
                textView65.setText("4 GB");
                textView67.setText("DDR3");
                textView70.setText("500 GB mechanical_hard_drive");
                textView72.setText("3MB");
                textView74.setText("1.9 GHz Intel Core i3");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("Intel® HD Graphics 4000");

                break;

            case "Sony VAIO VGN-NW240F/T":
                textView49.setText("Sony VAIO T Series");
                textView51.setText("VGN-NW240F");
                textView82.setText("Notebook/Laptop");
                textView54.setText("Silver,Black");
                textView57.setText("15.5 inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("NO");
                textView65.setText("4 GB");
                textView67.setText("DDR2");
                textView70.setText("320 GB ");
                textView72.setText("3 MB");
                textView74.setText("2.2 GHz Intel Core 2 Duo");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("GMA 1750 MB");

                break;
            case "Sony VAIO SVF15A16CXB":

                textView49.setText("Sony");
                textView51.setText("SVF15A16CXB");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("15.5-Inch");
                textView59.setText("1920 x 1080");
                textView61.setText("HD");
                textView63.setText("Yes");
                textView65.setText("8 GB ");
                textView67.setText("DDR3L SDRAM");
                textView70.setText("1000 GB Hybrid");
                textView72.setText("4 MB");
                textView74.setText("2 GHz Core i7 3537U");
                textView76.setText("Intel");
                textView79.setText("i7");
                textView81.setText("Intel HD Graphics 4000");

                break;
            case "Sony VAIO Fit 15E SVF15412CXB":
                textView49.setText("SVF15412CXB");
                textView51.setText("Sony VAIO");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("15.5-Inch");
                textView59.setText("1366 x 768");
                textView61.setText("HD");
                textView63.setText("NO");
                textView65.setText("4 GB");
                textView67.setText("DDR3L SDRAM");
                textView70.setText("750 GB mechanical_hard_drive");
                textView72.setText("4 MB");
                textView74.setText("1.7 GHz AMD A8");
                textView76.setText("AMD");
                textView79.setText("A8");
                textView81.setText("AMD Radeon HD 8510G Graphics");

                break;
            case "HP 15-R078TU K5B35PA":
                textView49.setText("HP");
                textView51.setText("R078TU K5B35PA");
                textView82.setText("Notebook");
                textView54.setText("Black");
                textView57.setText("15.6 inches");
                textView59.setText("1366 x 768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4GB");
                textView67.setText("DDR3");
                textView70.setText("1 TB");
                textView72.setText("2 MB");
                textView74.setText("Intel Pentium N3530");
                textView76.setText("Intel");
                textView79.setText("Pentium N3530");
                textView81.setText("Intel HD Graphics");

                break;
            case "HP 15-ac024tx":
                textView49.setText("HP");
                textView51.setText("15-ac024tx");
                textView82.setText("Notebook");
                textView54.setText("Black");
                textView57.setText("15.6 Inches");
                textView59.setText("1366 x 768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR3L-1600 SDRAM");
                textView70.setText("1 TB");
                textView72.setText("3 MB");
                textView74.setText("1.7 GH Intel Core i3-4005U");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("Intel HD Graphics 4400");
                break;
            case "HP 15-af103ax":
                textView49.setText("HP");
                textView51.setText("15-af103ax");
                textView82.setText("Notebook");
                textView54.setText("Black,Silver");
                textView57.setText("15.6 Inches");
                textView59.setText("1366 x 768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR3L-1600 SDRAM");
                textView70.setText("1 TB");
                textView72.setText("2 MB");
                textView74.setText("2.2 GHz AMD Quad-Core A8-7410");
                textView76.setText("AMD");
                textView79.setText("A8");
                textView81.setText("AMD Radeon R5 M330 Graphics");

                break;
            case "HP Pavilion 15-ab220tx":
                textView49.setText("HP pavilion");
                textView51.setText("15-ab220tx");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("15.6-inch");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("8 GB");
                textView67.setText("DDR3");
                textView70.setText("8 GB");
                textView72.setText("2 MB");
                textView74.setText("Intel Core i5");
                textView76.setText("Intel");
                textView79.setText("i5");
                textView81.setText("Nvidia GeForce");

                break;
            case "Dell Inspiron 3555":
                textView49.setText("Dell Inspiron ");
                textView51.setText("3555");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("15.6 Inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR 3");
                textView70.setText("500 GB");
                textView72.setText("2 MB");
                textView74.setText("AMD A6-6310");
                textView76.setText("AMD");
                textView79.setText("A6");
                textView81.setText("Integrated");
                break;
            case "Dell Inspiron 15 3558":
                textView49.setText("Dell");
                textView51.setText("Inspiron 15 3558");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("15.6 Inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDRL3");
                textView70.setText("1 TB");
                textView72.setText("2 MB");
                textView74.setText("Intel Core i3-5005U");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("Intel HD 5500");

                break;

            case "Dell Vostro 3468":
                textView49.setText("Dell");
                textView51.setText("Vostro 3468");
                textView82.setText("Notebook");
                textView54.setText("Black");
                textView57.setText("14-inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR3");
                textView70.setText("1 TB");
                textView72.setText("2 MB");
                textView74.setText("Intel Core i3");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("Intel HD Graphics");
                break;
            case "Dell Inspiron 3567":
                textView49.setText("Dell");
                textView51.setText("Inspiron 3567");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("15.6 Inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR3");
                textView70.setText("1 TB");
                textView72.setText("2 MB");
                textView74.setText("Intel Core i3");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("Intel HD Graphics");
                break;
            case "Acer Switch 10E SW3-016":
                textView49.setText("Acer");
                textView51.setText("Switch 10E SW3-016");
                textView82.setText("Laptop");
                textView54.setText("Shark Gray");
                textView57.setText("10.1 Inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("2 GB");
                textView67.setText("DDR3L");
                textView70.setText("32 GB");
                textView72.setText("2 MB");
                textView74.setText("1.44GHz Intel ");
                textView76.setText("Atom");
                textView79.setText("Atom x5-Z8300 processor");
                textView81.setText("Intel HD Graphics");
                break;
            case "ACER ONE 14 CELERON":
                textView49.setText("ACER");
                textView51.setText("ONE 14 CELERON");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("14 Inches");
                textView59.setText("1366 x 768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR3L");
                textView70.setText("500 GB");
                textView72.setText("2 MB");
                textView74.setText("Intel® Core™ i3-5005U");
                textView76.setText("Intel");
                textView79.setText("i3");
                textView81.setText("Intel® HD 5500");

                break;
            case "Acer Aspire ES1-132":
                textView49.setText("Acer ");
                textView51.setText("Aspire ES1-132");
                textView82.setText("Laptop");
                textView54.setText("Black");
                textView57.setText("11.6 Inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("2 GB");
                textView67.setText("DDR3");
                textView70.setText("500 GB");
                textView72.setText("3 MB");
                textView74.setText("Intel Celeron");
                textView76.setText("Intel");
                textView79.setText("Celeron");
                textView81.setText("Intel HD");
                break;
            case "Acer aspire v5122p":
                textView49.setText("Acer");
                textView51.setText("aspire v5122p");
                textView82.setText("Laptop");
                textView54.setText("Grey");
                textView57.setText("11.6 Inches");
                textView59.setText("1366x768");
                textView61.setText("HD");
                textView63.setText("No");
                textView65.setText("4 GB");
                textView67.setText("DDR3L");
                textView70.setText("500 GB");
                textView72.setText("3 MB");
                textView74.setText("AMD A4-1250");
                textView76.setText("AMD");
                textView79.setText("A4");
                textView81.setText("AMD Radeon HD 8210");
                break;

        }

    }
}
