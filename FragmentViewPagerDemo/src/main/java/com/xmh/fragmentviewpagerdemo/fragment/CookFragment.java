package com.xmh.fragmentviewpagerdemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xmh.fragmentviewpagerdemo.R;
import com.xmh.fragmentviewpagerdemo.base.LazyLoadFragment;

/**
 * Created by mengh on 2015/10/28 028.
 */
public class CookFragment extends LazyLoadFragment{

    private View mRootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_cook, null);
        //TODO find view by id
        return mRootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    protected void lazyLoad() {
        //load data here
    }
}
