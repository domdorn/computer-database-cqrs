// Comment to get more information during initialization
logLevel := Level.Warn

resolvers += "Maven repository" at "http://mvnrepository.com/artifact/"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % Option(System.getProperty("play.version")).getOrElse("2.4.0-M3"))
