package org.tritsch.scala.android.hello.build

// @todo - add ensime
// @todo - add tests
// @todo - add timestamp
// @todo - add documentation

// @todo - add scaloid - hello world
// @todo - add marcoid - hello world

// @todo - add bluetooth

// ---

// @todo - read scalaonandroid
// @todo - read/watch latest BLE on android stuff
// @todo - ???

import sbt._
import sbt.Keys._
import android.Keys._

object Build extends android.AutoBuild {
  lazy val mySettings = super.settings ++ android.Plugin.androidBuild ++ Seq(
    name := "HelloWorldApp",
    version := "0.1",
    scalaVersion := "2.10.4",

    platformTarget in Android := "android-19"
  )

  lazy val root = Project(
    id = "HelloWorldId",
    base = file(".")
  ).settings(
    mySettings:_*
  )
}
