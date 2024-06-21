package com.jags.pbm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jags.pbm.Adapter.ViewPagerAAdapter;

public class Product extends AppCompatActivity {
    ViewPager mViewPager;
    Button orderbtn;
    ViewPagerAAdapter mViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        orderbtn = findViewById(R.id.order);



    }
}