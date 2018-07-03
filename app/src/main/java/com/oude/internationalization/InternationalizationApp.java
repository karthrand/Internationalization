package com.oude.internationalization;
import android.app.Application;
import com.oude.internationalization.utils.LocalManageUtil;
import android.content.Context;
import android.content.res.Configuration;

public class InternationalizationApp extends Application
{
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //保存系统选择语言
        LocalManageUtil.onConfigurationChanged(getApplicationContext());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LocalManageUtil.setApplicationLanguage(this);
    }
}
