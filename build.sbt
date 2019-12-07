
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

inThisBuild {
  Seq(
    scalaVersion := "2.13.1",
    javacOptions in (Compile, compile) ++= Seq(
      "-source",
      "1.8",
      "-target",
      "1.8"
    ),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.0"),
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
  )
}
lazy val root = (project in file("."))
  .settings(
    name := "Advent of Code",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.0.0",
      "co.fs2" %% "fs2-core" % "2.1.0",
      "org.typelevel" %% "cats-effect" % "2.0.0",
      "io.higherkindness" %% "droste-core" % "0.8.0"
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
