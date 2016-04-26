package com.nicerdata.mytoolbar;

import android.support.v7.app.AppCompatActivity;

import com.jaeger.library.StatusBarUtil;

public class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        // ToolbarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.HFColorPrimary));
        ToolbarUtil.setColor(this, getResources().getColor(R.color.HFColorPrimary));
    }

}
