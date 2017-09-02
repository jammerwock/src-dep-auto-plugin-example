package com.tkroman.example.sbtplugin

import com.github.ghik.silencer.silent

// fails to compile because no `rpintln` method,
// but doesn't fail due to "`xs` is unused", 
// so both silencer & errors summary plugins + runtime lib dep
// are visible.
// Also, outputs in a nicer way thanks to errors summary
@silent
object ErrA {
  def main(xs: Array[String]): Unit = {
  	rpintln(0)
  }
}
