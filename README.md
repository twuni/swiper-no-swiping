# Swiper No Swiping

This app allows the Google Now swipe gesture (from the system Home button) to be disabled.

## Requirements

 * [Android SDK](http://developer.android.com/sdk/index.html)
 * [Apache Ant](http://ant.apache.org/)

## Building via ADT

Import the project into ADT. Then, run it as an Android application. It's that simple!

## Building via command-line

Use the Android SDK manager to install API level 19. Then, run `android update project -p .` to generate the necessary files. If this does not work for you, then the `android` command may not be on your *PATH*. Instead, try using the full path: `/path/to/android-sdk/tools/android update project -p .` (replacing this with the correct SDK path on your system).

Then, you can build the app simply by running `ant clean debug`. Afterwards, you can install the app by running `adb install -r bin/SwiperNoSwiping-debug.apk`, or by running `ant debug install`.

To build *and* install the app to a connected device in one step, run `ant clean debug install`.

## License

This app is public domain. Do anything you want with it.
