package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Layout;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ViewFlipper;

import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

    ViewFlipper viewFlipper;
    ViewPager viewPager;
    mypageadapter mypageadapter;
    TabLayout tablayot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        int imgarray []={R.drawable.sports,R.drawable.heal,R.drawable.science,R.drawable.enter,R.drawable.tech};
        viewFlipper=(ViewFlipper)findViewById(R.id.flipper);

        for (int i=0;i<imgarray.length;i++)
            showimage(imgarray[i]);

        viewPager=(ViewPager) findViewById(R.id.fragmentcontainerviewtag);
        tablayot=(TabLayout) findViewById(R.id.included);

        mypageadapter=new mypageadapter(getSupportFragmentManager(),tablayot.getTabCount());
        viewPager.setAdapter(mypageadapter);

        tablayot.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5) {


                    mypageadapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayot));
    }
    public void showimage(int img) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);




    }

}