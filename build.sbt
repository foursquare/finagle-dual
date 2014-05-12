name := "finagle-dual"

organization := "com.foursquare"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies := Seq(
  "com.twitter" %% "finagle-core" % "6.8.1",
  "com.twitter" %% "finagle-http" % "6.8.1",
  "io.netty" % "netty" % "3.8.1.Final",
  "org.scalaj" %% "scalaj-collection" % "1.5",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test"
)

com.twitter.scrooge.ScroogeSBT.newSettings

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.9.0" % "test",
  "com.twitter" %% "scrooge-core" % "3.14.1" % "test",
  "com.twitter" %% "finagle-thrift" % "6.8.1" % "test"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

