name := "lab3"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.1",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.1",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
