seq(webSettings :_*)

name := "AkkaWebTemplate"

version := "1.0.2"

scalaVersion := "2.10.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.10" % "2.1.2",
  "com.typesafe.akka" % "akka-kernel_2.10" % "2.1.2",
  "com.typesafe.akka" % "akka-slf4j_2.10" % "2.1.2",
  "javax.ws.rs" % "jsr311-api" % "1.1.1",
  "com.sun.jersey" % "jersey-server" % "1.17",
  "com.sun.jersey" % "jersey-core" % "1.17",
  "com.sun.jersey" % "jersey-servlet" % "1.17",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.9.v20130131" % "container" artifacts (Artifact("jetty-webapp", "jar", "jar")),
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)
