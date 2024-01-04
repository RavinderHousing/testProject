package com.awesomeproject;

import android.app.Activity;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.LifecycleState;
import java.util.Arrays;

public class SingletonReactInstanceManager {
    private static ReactInstanceManager reactInstanceManager;
    private SingletonReactInstanceManager () { }
    public static ReactInstanceManager getReactInstanceManager (Activity activity) {
        if (reactInstanceManager == null) {
            reactInstanceManager = ReactInstanceManager.builder()
                    .setApplication(activity.getApplication())
                    .setCurrentActivity(activity)
                    .setJSBundleFile("assets://index.common.bundle")
                    .addPackages(Arrays.<ReactPackage>asList (new MainReactPackage()))
                    .setUseDeveloperSupport(BuildConfig.DEBUG)
                    .setInitialLifecycleState(LifecycleState.RESUMED)
                    .build();
        }
        return reactInstanceManager;
    }
}