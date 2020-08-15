scalaVersion := "2.13.3"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  //"-Xfatal-warnings",
  "-feature",
  "-language:_",
)

name := "futures"

version := "1.0"

organization := "com.goticks"

libraryDependencies ++= {
  val akkaVersion = "2.6.8"
  Seq(
    "com.typesafe.akka"       %%  "akka-actor"                     % akkaVersion,
    "com.typesafe.akka"       %%  "akka-slf4j"                     % akkaVersion,
    "com.typesafe.akka"       %%  "akka-testkit"                   % akkaVersion   % "test",
    "org.scalatest"           %% "scalatest"                       % "3.1.0"       % "test",
    "com.github.nscala-time"  %%  "nscala-time"                    % "2.24.0"
  )
}
