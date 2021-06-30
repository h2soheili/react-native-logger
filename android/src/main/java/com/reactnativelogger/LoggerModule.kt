package com.reactnativelogger

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

class LoggerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {


  override fun initialize() {
    super.initialize()
    Logger.addLogAdapter(AndroidLogAdapter())
  }

  override fun getName(): String {
    return "Logger"
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Int, b: Int, promise: Promise) {

    promise.resolve(a * b)

  }

  @ReactMethod
  fun logErrorNative(error: String, label: String, promise: Promise) {
    Logger.d("$label :$error")
    promise.resolve(true)
  }
}
