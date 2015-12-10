package com.xmh.fragmentviewpagerdemo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.xmh.fragmentviewpagerdemo.fragment.CookFragment;
import com.xmh.fragmentviewpagerdemo.adapter.FragmentsAdapter;
import com.xmh.fragmentviewpagerdemo.fragment.MainFragment;
import com.xmh.fragmentviewpagerdemo.fragment.MeFragment;
import com.xmh.fragmentviewpagerdemo.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    /*fragment pages start*/
    private ViewPager vpPages;
    private List<Fragment> mFragmentList;
    private MainFragment mMainFragment;
    private CookFragment mCookFragment;
    private MeFragment mMeFragment;
    FragmentsAdapter mFragmentsAdapter;
    /*fragment pages start*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        vpPages= (ViewPager) findViewById(R.id.vp_pages);
        mFragmentList=new ArrayList<>();
        mMainFragment=new MainFragment();
        mCookFragment=new CookFragment();
        mMeFragment=new MeFragment();
        mFragmentList.add(mMainFragment);
        mFragmentList.add(mCookFragment);
        mFragmentList.add(mMeFragment);
        mFragmentsAdapter=new FragmentsAdapter(getSupportFragmentManager());
        mFragmentsAdapter.setList(mFragmentList);
        vpPages.setAdapter(mFragmentsAdapter);
        //设置缓存的fragment数，使fragment在切换时不被销毁
        vpPages.setOffscreenPageLimit(2);
    }
}
