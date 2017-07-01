package com.mtx.onekey.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mtx.onekey.R;

/**
 * 首页密码列表
 * Created by lishaoming on 2017/6/30.
 */
public class PasswordListFragment extends Fragment {
    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_password_list, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mListView = (ListView) view.findViewById(R.id.listview_password);

    }


    @Override
    public void onResume() {
        super.onResume();
    }

}
