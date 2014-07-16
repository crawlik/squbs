scalaVersion in ThisBuild := "2.10.4"

version in ThisBuild := "0.5.0-SNAPSHOT"

organization in ThisBuild := "org.squbs"

publishArtifact := false

lazy val unicomplex = project

lazy val zkcluster = project dependsOn unicomplex

lazy val testkit = project dependsOn unicomplex

instrumentSettings