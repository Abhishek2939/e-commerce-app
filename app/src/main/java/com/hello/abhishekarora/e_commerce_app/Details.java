package com.hello.abhishekarora.e_commerce_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Details extends AppCompatActivity {
TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView43,textView8,textView9,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31,textView32,textView33,textView34,textView35,textView36,textView37,textView38,textView39,textView40,textView41,textView42,textView44,textView45,textView46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textView1=(TextView)findViewById(R.id.TextView1);
        textView2=(TextView)findViewById(R.id.TextView2);
        textView3=(TextView)findViewById(R.id.TextView3);
        textView4=(TextView)findViewById(R.id.TextView4);
        textView5=(TextView)findViewById(R.id.TextView5);
        textView6=(TextView)findViewById(R.id.TextView6);
        textView7=(TextView)findViewById(R.id.TextView7);
        textView8=(TextView)findViewById(R.id.TextView8);
        textView9=(TextView)findViewById(R.id.TextView9);
        textView11=(TextView)findViewById(R.id.TextView11);
        textView12=(TextView)findViewById(R.id.TextView12);
        textView13=(TextView)findViewById(R.id.TextView13);
        textView14=(TextView)findViewById(R.id.TextView14);
        textView15=(TextView)findViewById(R.id.TextView15);
        textView16=(TextView)findViewById(R.id.TextView16);
        textView17=(TextView)findViewById(R.id.TextView17);
        textView18=(TextView)findViewById(R.id.TextView18);
        textView19=(TextView)findViewById(R.id.TextView19);
        textView20=(TextView)findViewById(R.id.TextView20);
        textView21=(TextView)findViewById(R.id.TextView21);
        textView22=(TextView)findViewById(R.id.TextView22);
        textView23=(TextView)findViewById(R.id.TextView23);
        textView24=(TextView)findViewById(R.id.TextView24);
        textView25=(TextView)findViewById(R.id.TextView25);
        textView26=(TextView)findViewById(R.id.TextView26);
        textView27=(TextView)findViewById(R.id.TextView27);
        textView28=(TextView)findViewById(R.id.TextView28);
        textView29=(TextView)findViewById(R.id.TextView29);
        textView30=(TextView)findViewById(R.id.TextView30);
        textView31=(TextView)findViewById(R.id.TextView31);
        textView32=(TextView)findViewById(R.id.TextView32);
        textView33=(TextView)findViewById(R.id.TextView33);
        textView34=(TextView)findViewById(R.id.TextView34);
        textView35=(TextView)findViewById(R.id.TextView35);
        textView36=(TextView)findViewById(R.id.TextView36);
        textView37=(TextView)findViewById(R.id.TextView37);
        textView38=(TextView)findViewById(R.id.TextView38);
        textView39=(TextView)findViewById(R.id.TextView39);
        textView40=(TextView)findViewById(R.id.TextView40);
        textView41=(TextView)findViewById(R.id.TextView41);
        textView42=(TextView)findViewById(R.id.TextView42);
        textView43=(TextView)findViewById(R.id.TextView43);
        textView44=(TextView)findViewById(R.id.TextView44);
        textView45=(TextView)findViewById(R.id.TextView45);
        textView46=(TextView)findViewById(R.id.TextView46);

        switch (getIntent().getStringExtra("object")) {

            case "SONY XPERIA L1":
                textView3.setText("G3311");
                textView5.setText("Sony Xperia L1");
                textView7.setText("Black, White, Pink");
                textView9.setText("Dual Sim");
                textView13.setText("5.5 inches ");
                textView15.setText("720 x 1280 pixels");
                textView17.setText("IPS LCD capacitive touchscreen, 16M colors\n");
                textView19.setText("Multitouch up to 4 fingers");
                textView22.setText("16 GB");
                textView24.setText("2 GB");
                textView26.setText("256 GB");
                textView28.setText("MicroSD");
                textView31.setText("13 MP, f/2.2, autofocus, LED flash, check quality");
                textView33.setText("5 MP, f/2.2, 24 mm, 1080p");
                textView35.setText("Yes");
                textView37.setText("1080p@30fps");
                textView40.setText("Android 7.0 (Nougat)");
                textView42.setText("Quad-core Cortex-A53");
                textView44.setText("Quad-core");
                textView46.setText("1.45 GHz ");

                break;
            case "SONY XPERIA XA1":

                textView3.setText("G3116");
                textView5.setText("Xperia XA1");
                textView7.setText("Black");
                textView9.setText("Dual Sim");
                textView13.setText("5 inch");
                textView15.setText("1280 x 720 pixels");
                textView17.setText("HD");
                textView19.setText("Image Enhance Technology, Corning Gorilla Glass");
                textView22.setText("32 GB");
                textView24.setText("3 GB");
                textView26.setText("256 GB");
                textView28.setText("MicroSD");
                textView31.setText("23MP");
                textView33.setText("8MP");
                textView35.setText("Yes");
                textView40.setText("Android Nougat 7");
                textView42.setText("MediaTek Helio P20 64-bit");
                textView44.setText("Octa Core");
                textView46.setText("2.3 GHz");
                textView37.setText("1280 x 720");


                break;
            case "SONY XPERIA X":

                textView3.setText("F5122");
                textView5.setText("Xperia X");
                textView7.setText("Lime Gold,Black,Pink");
                textView9.setText("Dual Sim");
                textView13.setText("5 inch");
                textView15.setText("1920 x 1080 pixels");
                textView17.setText("Full HD");
                textView19.setText("Curved Glass Edges, BRAVIA, TRILUMINOS Display for Mobile,");
                textView22.setText("64 GB");
                textView24.setText("3 GB");
                textView26.setText("200 GB");
                textView28.setText("MicroSD");
                textView31.setText("23MP");
                textView33.setText("13MP");
                textView35.setText("Yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Marshmallow 6.1");
                textView42.setText("Qualcomm Snapdragon 650 64-bit");
                textView44.setText("Hexa Core");
                textView46.setText("1.8 MHz");



                break;

            case "SONY XPERIA XZ":

                textView3.setText("G8142");
                textView5.setText("Xperia XZ Premium");
                textView7.setText("Deepsea Black");
                textView9.setText("Dual Sim");
                textView13.setText("5.5 inch");
                textView15.setText("3840 x 2160 Pixels");
                textView17.setText("FULL HD");
                textView19.setText("Corning Gorilla Glass, HDR Display, Triluminos Display for Mobile.");
                textView22.setText("64 GB");
                textView24.setText("4 GB");
                textView26.setText("256 GB");
                textView28.setText("microSDXC");
                textView31.setText("19MP");
                textView33.setText("13MP");
                textView35.setText("Yes");
                textView37.setText("3840 x 2160");
                textView40.setText("Android Nougat 7.0");
                textView42.setText("Qualcomm Snapdragon 835 64-bit");
                textView44.setText("Octa Core");
                textView46.setText("2.45 GHz");


                break;
            case "SAMSUNG GALAXY J7 PRIME":

                textView3.setText("SM-G610FZDDINS/SM-G610FZDOINS");
                textView5.setText("Galaxy J7 Prime");
                textView7.setText("Gold,Black,pink");
                textView9.setText("Dual Sim");
                textView13.setText("5.5 inch");
                textView15.setText("1920 x 1080 Pixels");
                textView17.setText("Full HD");
                textView19.setText("Display Type TFT");
                textView22.setText("32 GB");
                textView24.setText("3 GB");
                textView26.setText("256 GB");
                textView28.setText("microSD");
                textView31.setText("13MP");
                textView33.setText("8MP");
                textView35.setText("Yes");
                textView37.setText("1920 x 1080 pixel");
                textView40.setText("Android Marshmallow 6");
                textView42.setText("Exynos 7870");
                textView44.setText("Octa Core");
                textView46.setText("1.6 GHz");


                break;
            case "SAMSUNG GALAXY On8":

                textView3.setText("J710FZDGINS");
                textView5.setText("Galaxy On8");
                textView7.setText("Gold,Black,Silver");
                textView9.setText("Dual Sim");
                textView13.setText("5.5 inch");
                textView15.setText("1920 x 1080");
                textView17.setText("Full HD");
                textView19.setText("Display Type Super Amoled");
                textView22.setText("16 GB");
                textView24.setText("3 GB");
                textView26.setText("128 GB");
                textView28.setText("MicroSD");
                textView31.setText("13MP");
                textView33.setText("5MP");
                textView35.setText("YES");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Marshmallow 6");
                textView42.setText("S5E7580 (Exynos 7580)");
                textView44.setText("Octa Core");
                textView46.setText("1.6 GHz");


                break;
            case "SAMSUNG GALAXY On7 Pro":

                textView3.setText("SM-J320FZDGINS");
                textView5.setText("Galaxy J3 Pro");
                textView7.setText("Gold,Silver");
                textView9.setText("Dual Sim");
                textView13.setText("5 inch");
                textView15.setText("1280 x 720 Pixels");
                textView17.setText("HD");
                textView19.setText("Super AMOLED");
                textView22.setText("16GB");
                textView24.setText("2GB");
                textView26.setText("128GB");
                textView28.setText("MicroSD");
                textView31.setText("8MP");
                textView33.setText("5MP");
                textView35.setText("Yes");
                textView37.setText("1280 x 720");
                textView40.setText("Android Lollipop 5.1");
                textView42.setText("Spreadtrum");
                textView44.setText("Quad Core");
                textView46.setText("1.5 GHz");


                break;
            case "SAMSUNG GALAXY On5":

                textView3.setText("SM-G550FZKDINS");
                textView5.setText("Galaxy On5");
                textView7.setText("Black,Gold");
                textView9.setText("Dual Sim");
                textView13.setText("5 inch");
                textView15.setText("1280 x 720 Pixels");
                textView17.setText("HD");
                textView19.setText("Display Type TFT, Display Colors 16M");
                textView22.setText("8GB");
                textView24.setText("1.5GB");
                textView26.setText("128GB");
                textView28.setText("MicroSD");
                textView31.setText("8MP");
                textView33.setText("5MP");
                textView35.setText("YES");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Marshmallow 6.0.1");
                textView42.setText("Exynos 3475");
                textView44.setText("Quad Core");
                textView46.setText("1.3 GHz");


                break;
            case "REDMI NOTE4":

                textView3.setText("MZB5254IN ");
                textView5.setText("Redmi Note 4");
                textView7.setText("Black,Gold");
                textView9.setText("Dual Sim");
                textView13.setText("5.5 inch");
                textView15.setText("1920 x 1080 pixels");
                textView17.setText("Full HD");
                textView19.setText("Contrast Ratio: 1000:1, 2.5D Glass, 72% NTSC color Gamut, Night Display, Reading Mode");
                textView22.setText("64GB");
                textView24.setText("4GB");
                textView26.setText("128GB");
                textView28.setText("microSD");
                textView31.setText("13MP");
                textView33.setText("5MP");
                textView35.setText("Yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Marshmallow 6.0.1");
                textView42.setText("Qualcomm Snapdragon 625 64-bit");
                textView44.setText("Octa Core");
                textView46.setText("2 GHz");


                break;
            case "REDMI 3s Prime":

                textView3.setText("MZB4915IN");
                textView5.setText("Redmi 3S Prime");
                textView7.setText("Dark Grey");
                textView9.setText("Dual Sim");
                textView13.setText("5 inch");
                textView15.setText("1280 x 720 Pixels");
                textView17.setText("HD");
                textView19.setText("IPS Display");
                textView22.setText("32GB");
                textView24.setText("3GB");
                textView26.setText("128GB");
                textView28.setText("MicroSD");
                textView31.setText("13MP");
                textView33.setText("5MP");
                textView35.setText("yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Marshmallow 6.0.1");
                textView42.setText("Qualcomm Snapdragon 625 64-bit");
                textView44.setText("Octa Core");
                textView46.setText("1.4 GHz");


                break;
            case "REDMI 4":

                textView3.setText("MZB5252IN ");
                textView5.setText("Redmi Note 4");
                textView7.setText("Gold,Black");
                textView9.setText("Dual Sim");
                textView13.setText("5.5 inch");
                textView15.setText("1920 x 1080 pixels");
                textView17.setText("Full HD");
                textView19.setText("Contrast Ratio: 1000:1, 2.5D Glass, 72% NTSC color Gamut.");
                textView22.setText("64GB");
                textView24.setText("4GB");
                textView26.setText("128GB");
                textView28.setText("MicroSD");
                textView31.setText("13MP");
                textView33.setText("5MP");
                textView35.setText("yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Marshmallow 6.0.1");
                textView42.setText("Qualcomm Snapdragon 625 64-bit");
                textView44.setText("Octa Core");
                textView46.setText("2.0 GHz");



                break;
            case "MI MAX 2":

                textView3.setText("MDI4O");
                textView5.setText("MI MAX 2");
                textView7.setText("Black");
                textView9.setText("Dual Sim");
                textView13.setText("6.44 inch");
                textView15.setText("1920 x 1080 pixels");
                textView17.setText("Full HD");
                textView19.setText("Contrast Ratio: 1000:1");
                textView22.setText("64GB");
                textView24.setText("4GB");
                textView26.setText("128GB");
                textView28.setText("MicroSD");
                textView31.setText("13MP");
                textView33.setText("5MP");
                textView35.setText("yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Android Nougat 7.1.1");
                textView42.setText("Qualcomm Snapdragon 625 Octa Core 2 Ghz");
                textView44.setText("Octa Core");
                textView46.setText("2.0 GHz");


                break;
            case "BlackBerry Z10":

                textView3.setText("R072");
                textView5.setText("z10");
                textView7.setText("Pure White,Black");
                textView9.setText("Single Sim");
                textView13.setText("4.2 inch");
                textView15.setText("1280 x 768 Pixels");
                textView17.setText("HD");
                textView19.setText("Gesture Support");
                textView22.setText("16GB");
                textView24.setText("2GB");
                textView26.setText("64GB");
                textView28.setText("MicroSD");
                textView31.setText("8MP");
                textView33.setText("2MP");
                textView35.setText("yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Blackberry 10");
                textView42.setText("Snapdragon");
                textView44.setText("Dual Core");
                textView46.setText("1.5 GHz");


                break;
            case "BlackBerry Z30":

                textView3.setText("STA100-2");
                textView5.setText("Z30");
                textView7.setText("Black");
                textView9.setText("Single Sim");
                textView13.setText("5 inch");
                textView15.setText("1280 x 720 Pixels");
                textView17.setText("HD");
                textView19.setText("Adjustable Screen Brightness, Zoom In or Zoom Out");
                textView22.setText("16GB");
                textView24.setText("2GB");
                textView26.setText("64GB");
                textView28.setText("MicroSD");
                textView31.setText("8MP");
                textView33.setText("2MP");
                textView35.setText("yes");
                textView37.setText("1920 x 1080");
                textView40.setText("Blackberry 10.2");
                textView42.setText("Qualcomm MSM8960T Pro");
                textView44.setText("Dual Core");
                textView46.setText("1.7Ghz");


                break;
            case "BlackBerry Q10":

                textView3.setText("SQN100-3");
                textView5.setText("Q10");
                textView7.setText("Black,white");
                textView9.setText("Single Sim");
                textView13.setText("3.1 inch");
                textView15.setText("720 x 720 Pixels");
                textView17.setText("Super AMOLED");
                textView19.setText("Multi-touch");
                textView22.setText("16GB");
                textView24.setText("2GB");
                textView26.setText("32GB");
                textView28.setText("MicroSD");
                textView31.setText("8MP");
                textView33.setText("2MP");
                textView35.setText("yes");
                textView37.setText("1080 x 1920");
                textView40.setText("Blackberry 10");
                textView42.setText("Qualcomm Snapdragon S4");
                textView44.setText("Dual Core");
                textView46.setText("1.5Ghz");


                break;
            case "BlackBerry Q5":

                textView3.setText("SQN100-2");
                textView5.setText("Q5");
                textView7.setText("Black,white");
                textView9.setText("Single Sim");
                textView13.setText("3.1 inch");
                textView15.setText("720 x 720 Pixels");
                textView17.setText("TFT LCD");
                textView19.setText("Multi-touch,, Intuitive Gesture Navigation.");
                textView22.setText("8GB");
                textView24.setText("2GB");
                textView26.setText("32GB");
                textView28.setText("MicroSD");
                textView31.setText("5MP");
                textView33.setText("2MP");
                textView35.setText("yes");
                textView37.setText("1080 x 1920");
                textView40.setText("Blackberry 10.1");
                textView42.setText("Qualcomm Snapdragon S4");
                textView44.setText("Dual Core");
                textView46.setText("1.2Ghz");


                break;
        }


        }
}
