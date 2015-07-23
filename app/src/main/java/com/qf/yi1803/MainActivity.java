package com.qf.yi1803;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import adapter.AdapterWel;
import fragment.FragmentWel;


public class MainActivity extends FragmentActivity{

    private ViewPager pager;
    private Button btn;
    private List<Fragment> fragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = ((ViewPager) findViewById(R.id.pager));
        btn = ((Button) ((Button) findViewById(R.id.btn)));
        fragmentList=new ArrayList<Fragment>();
        for (int i = 0; i < 3; i++) {
            FragmentWel pageFrg=new FragmentWel();
            Bundle bundle=new Bundle();
            pageFrg.setArguments(bundle);
            bundle.putInt("POS", i);
            pageFrg.setArguments(bundle);
            fragmentList.add(pageFrg);
        }
        //创建适配器对象
        AdapterWel adapter=new AdapterWel(getSupportFragmentManager(),fragmentList);
        pager.setAdapter(adapter);


    }


}
