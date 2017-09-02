scalaVersion := "2.12.3"

sbtPlugin := true

// adding this here instead of project/ because we want to provide this to users.
addSbtPlugin("org.duhemm" % "sbt-errors-summary" % "0.6.0")