name := "HelloAkka"

version := "1.0"

//scalaVersion := "2.12.1"
scalaVersion := "2.10.4"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.2-M1"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.1.1",
  "com.typesafe.akka" %% "akka-remote" % "2.1.1"
)