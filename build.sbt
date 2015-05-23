name := """play-scala"""

version := "1.1-SNAPSHOT"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")
scalacOptions += "-target:jvm-1.8" 

lazy val root = (project in file(".")) .enablePlugins(PlayScala, DockerPlugin)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

dockerBaseImage := "java:8u45"
maintainer := "nil"
dockerExposedPorts in Docker := Seq(9000, 9000)
