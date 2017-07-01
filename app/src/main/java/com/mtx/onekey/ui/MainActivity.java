package com.mtx.onekey.ui;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.mtx.onekey.R;

public class MainActivity extends BaseActivity {

    private ViewPager mViewPager;
    private MyViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewpager_main);
        mAdapter = new MyViewPagerAdapter();
        mViewPager.setAdapter(mAdapter);
    }

    private class MyViewPagerAdapter extends PagerAdapter {


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return false;
        }
    }
}
