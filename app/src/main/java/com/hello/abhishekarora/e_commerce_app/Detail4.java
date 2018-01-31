package com.hello.abhishekarora.e_commerce_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Detail4 extends AppCompatActivity {

    TextView textView82,textView47,textView48,textView49,textView50,textView65,textView51,textView52,textView53,textView54,textView55,textView56,textView57,textView58,textView59,textView60,textView61,textView62,textView63,textView64,textView66,textView67,textView68,textView69,textView70,textView71,textView72,textView73,textView74,textView75;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail4);

        textView47=(TextView)findViewById(R.id.textView47);
        textView48=(TextView)findViewById(R.id.textView48);
        textView49=(TextView)findViewById(R.id.textView49);
        textView50=(TextView)findViewById(R.id.textView50);
        textView51=(TextView)findViewById(R.id.textView51);
        textView52=(TextView)findViewById(R.id.textView52);
        textView53=(TextView)findViewById(R.id.textView53);
        textView54=(TextView)findViewById(R.id.textView54);
        textView55=(TextView)findViewById(R.id.textView55);
        textView56=(TextView)findViewById(R.id.textView56);
        textView57=(TextView)findViewById(R.id.textView57);
        textView58=(TextView)findViewById(R.id.textView58);
        textView59=(TextView)findViewById(R.id.textView59);
        textView60=(TextView)findViewById(R.id.textView60);
        textView61=(TextView)findViewById(R.id.textView61);
        textView62=(TextView)findViewById(R.id.textView62);
        textView63=(TextView)findViewById(R.id.textView63);
        textView64=(TextView)findViewById(R.id.textView64);
        textView65=(TextView)findViewById(R.id.textView65);
        textView66=(TextView)findViewById(R.id.textView66);
        textView67=(TextView)findViewById(R.id.textView67);
        textView68=(TextView)findViewById(R.id.textView68);
        textView69=(TextView)findViewById(R.id.textView69);
        textView70=(TextView)findViewById(R.id.textView70);
        textView71=(TextView)findViewById(R.id.textView71);
        textView72=(TextView)findViewById(R.id.textView72);
        textView73=(TextView)findViewById(R.id.textView73);
        textView74=(TextView)findViewById(R.id.textView74);
        textView75=(TextView)findViewById(R.id.textView75);
        textView82=(TextView)findViewById(R.id.textView82);

        switch (getIntent().getStringExtra("object")){

            case "HCL AC2V0259":
                textView49.setText("HCL ");
                textView51.setText("AC2V0259");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3");
                textView68.setText("DOS");
                textView71.setText("Intel Atom D2500");
                textView73.setText("1 MB");
                textView75.setText("HDD");

                break;
            case "HCL AC2V0245":
                textView49.setText("HCL");
                textView51.setText("AC2V0245");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3");
                textView68.setText("DOS");
                textView71.setText("Intel Celeron G530");
                textView73.setText("2 MB");
                textView75.setText("HDD");

                break;
            case "HCL AC2F0018":
                textView49.setText("HCL");
                textView51.setText("AC2F0018");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3");
                textView68.setText("DOS");
                textView71.setText("Intel Pentium G640");
                textView73.setText("3 MB");
                textView75.setText("HDD");

                break;
            case "HCL AC2V0268":
                textView49.setText("HCL");
                textView51.setText("AC2V0268");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3");
                textView68.setText("DOS");
                textView71.setText("Intel Celeron G1620");
                textView73.setText("3 MB");
                textView75.setText("HDD");
                break;
            case "LG Chromebase 22CV241-B":
                textView49.setText("LG");
                textView51.setText("Chromebase 22CV241-B");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3L");
                textView68.setText("Chrome OS");
                textView71.setText("Celeron-2955U");
                textView73.setText("3 MB");
                textView75.setText("HDD");

                break;

            case "LG Chromebase 22CV241":
                textView49.setText("LG");
                textView51.setText("Chromebase 22CV241");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3L");
                textView68.setText("Chrome OS");
                textView71.setText("Celeron-2955U");
                textView73.setText("3 MB");
                textView75.setText("HDD");
                break;

            case "LG Chromebase 22CV241 AIO":
                textView49.setText("LG");
                textView51.setText("Chromebase 22CV241");
                textView82.setText("PC");
                textView54.setText("Silver");
                textView57.setText("PS2 Keyboard");
                textView59.setText("USB Mouse");
                textView61.setText("4");
                textView64.setText("2 GB");
                textView66.setText("DDR3L");
                textView68.setText("Chrome OS");
                textView71.setText("Celeron-2955U");
                textView73.setText("3 MB");
                textView75.setText("LED");

                break;

            case "Lenovo A740 DESKTOP":
                textView49.setText("Lenovo");
                textView51.setText("A740");
                textView82.setText("PC");
                textView54.setText("Silver");
                textView57.setText("2.4G wireless metal keyboard");
                textView59.setText("2.4G wireless standard mouse ZTM600");
                textView61.setText("4");
                textView64.setText("8 GB");
                textView66.setText("DDR3L");
                textView68.setText("Windows 10 ");
                textView71.setText("Intel Core i7-5557U Processor");
                textView73.setText("4 MB");
                textView75.setText("Multi-touch");

                break;

            case "Lenovo B40-30 DESKTOP":
                textView49.setText("Lenovo");
                textView51.setText("B40-30");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("2.4G wireless metal keyboard");
                textView59.setText("2.4G wireless standard mouse ZTM600");
                textView61.setText("3");
                textView64.setText("4 GB");
                textView66.setText("DDR3L");
                textView68.setText("Windows 8.1 ");
                textView71.setText("1.9GHz Intel Core i5 4460T");
                textView73.setText("4 MB");
                textView75.setText("Multi-touch");
                break;

            case "Lenovo C40-30 AIO":
                textView49.setText("Lenovo");
                textView51.setText("C40-30 AIO");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("2.4G wireless ");
                textView59.setText("2.4G wireless ");
                textView61.setText("5");
                textView64.setText("4 GB");
                textView66.setText("DDR3L");
                textView68.setText("DOS");
                textView71.setText("5th Gen Intel Core i3");
                textView73.setText("4 MB");
                textView75.setText("Multi-touch");
                break;

            case "Lenovo C40-30 AIO I3":
                textView49.setText("Lenovo");
                textView51.setText("C40-30 AIO I3");
                textView82.setText("PC");
                textView54.setText("Black");
                textView57.setText("2.4G wireless ");
                textView59.setText("2.4G wireless ");
                textView61.setText("5");
                textView64.setText("4 GB");
                textView66.setText("DDR3L");
                textView68.setText("DOS");
                textView71.setText("1.7GHz Intel Core i3 4005U");
                textView73.setText("4 MB");
                textView75.setText("Multi-touch");

                break;

        }


    }

}
