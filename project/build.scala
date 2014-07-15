package org.tritsch.scala.android.hello.build

import sbt._
import sbt.Keys._
import android.Keys._

object Build extends android.AutoBuild {
  lazy val mySettings = super.settings ++ android.Plugin.androidBuild ++ Seq(
    name := "HelloWorld",
    version := "0.1",
    scalaVersion := "2.11.1",

    platformTarget in Android := "android-19"
  )

  lazy val root = Project(
    id = "HelloWorld",
    base = file(".")
  ).settings(
    mySettings:_*
  )
}
