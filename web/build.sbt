import play.{PlayScala, PlayJava}
import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

name := """computer-database-web"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

val axonVersion = "2.4"

val hibernateVersion = "4.3.9.Final"

val springVersion = "4.1.6.RELEASE"


libraryDependencies ++= Seq(
	  "org.sbaresearch" % "computer-database-cqrs" % "1.0-SNAPSHOT",
      "org.axonframework" % "axon" % axonVersion,
	  "org.hibernate" % "hibernate-entitymanager" % hibernateVersion,
      "org.hibernate" % "hibernate-core" % hibernateVersion,
	  "org.springframework" % "spring-context" % springVersion,
      "org.springframework" % "spring-core" % springVersion,
      "org.springframework" % "spring-beans" % springVersion,
      "org.springframework" % "spring-aop" % springVersion,
      "org.springframework" % "spring-tx" % springVersion,
      "org.springframework" % "spring-orm" % springVersion
)

libraryDependencies ++= Seq(
  jdbc,
      javaCore,
      javaJdbc,
      javaJpa,
  javaWs
)

resolvers ++= Seq(
    "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
    "Apache" at "http://repo1.maven.org/maven2/",
    "jBCrypt Repository" at "http://repo1.maven.org/maven2/org/",
    "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots",
    "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
)

doc in Compile <<= target.map(_ / "none")



addCommandAlias("generate-project", ";update-classifiers;gen-idea")

// build using play debian:packageBin
