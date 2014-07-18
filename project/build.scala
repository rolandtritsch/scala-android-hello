package org.tritsch.scala.android.hello.build

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
