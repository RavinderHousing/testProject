package com.awesomeproject;


import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.common.LifecycleState;
import com.facebook.soloader.SoLoader;
import android.widget.Button;
import android.view.View;

public class MainActivity extends ReactActivity implements DefaultHardwareBackBtnHandler {

    private ReactInstanceManager mReactInstanceManager;

    @Override
    protected String getMainComponentName() {
        return "AppA";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoLoader.init(this, false);

        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.appA.bundle")
                .setJSMainModulePath("index")
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
//                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();

        mReactInstanceManager.createReactContextInBackground();

        setContentView(R.layout.activity_main);

        Button reactButton = findViewById(R.id.reactButton);
        reactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadReactComponent();
            }
        });
    }

    private void loadReactComponent() {
        ReactRootView rootView = new ReactRootView(MainActivity.this);
        rootView.startReactApplication(mReactInstanceManager, "AppA", null);
        setContentView(rootView);
    }
}
