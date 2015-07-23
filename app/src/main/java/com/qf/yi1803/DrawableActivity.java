package com.qf.yi1803;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Administrator on 2015/7/15.
 */
public class DrawableActivity extends FragmentActivity{

    private ListView lv;
    private DrawerLayout draw;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.drawable);
        draw = ((DrawerLayout) findViewById(R.id.drawer_layout));
        lv = ((ListView) findViewById(R.id.left_drawer));

    }


    }

