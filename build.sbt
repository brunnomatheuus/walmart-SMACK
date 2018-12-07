name := """ProjetoUnidade3"""
organization := "com.bruno"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.7"

libraryDependencies += guice

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.18"

libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.5.18"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"


