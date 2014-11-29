# My second Scala for Android project

This is a "Hello World" implementation using the [android-sdk-plugin](https://github.com/pfn/android-sdk-plugin).

To make it work (on a mac), you need to ...

* install the [android sdk](http://developer.android.com/sdk/installing/index.html?pkg=tools) (at last tool level 19.1)
* install [sbt](http://www.scala-sbt.org) using the installer of you choice (e.g. [macports](https://www.macports.org) or [brew](http://brew.sh))
* create and run an [avd](http://developer.android.com/tools/help/emulator.html) (using a target with API level 21)
* clone this repository
* run `sbt install` (and get a coffee ... (because the first time around a lot of stuff gets downloaded))

... and then go the emulator and you should see the app on the emulator.
