package org.tritsch.scala.android.hello

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
}
