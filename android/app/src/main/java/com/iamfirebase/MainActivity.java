package com.mlz.discovery;

import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;

import com.facebook.react.ReactActivity;
import android.util.Log;

import com.mlz.discovery.CustomizeInAppMessage;

public class MainActivity extends ReactActivity {

  @Override
  public void onResume() {
      super.onResume();
      Log.e("MESSAGE", "activity started");
      CustomizeInAppMessage custom = new CustomizeInAppMessage(); 
      FirebaseInAppMessaging.getInstance().setMessageDisplayComponent(custom);
      Log.e("MESSAGE", "CustomizeInAppMessage registered");
  }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "IAMFirebase";
  }
}
