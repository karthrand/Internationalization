package com.oude.internationalization;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import com.oude.internationalization.utils.LocalManageUtil;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalManageUtil.setLocal(newBase));
    }
}
