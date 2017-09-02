package com.tkroman.example.sbtplugin


// fails to compile because no @silent annotation,
// but `xs` is unused, so both silencer & errors summary plugins
// are visible
object ErrB {
  def main(xs: Array[String]): Unit = {
  	println(0)
  }
}
