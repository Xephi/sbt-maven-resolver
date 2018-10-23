import sbt._
import sbt.Keys._

object Dependencies {
  resolvers += "bintray-sbt-maven-releases" at "https://dl.bintray.com/sbt/maven-releases/"
  val utilVersion = "1.1.3"
  val librarymanagementVersion = "1.2.2"
  lazy val utilTesting = "org.scala-sbt" %% "util-testing" % utilVersion
  val libraryManagement = Seq(
    "org.scala-sbt" %% "librarymanagement-core" % librarymanagementVersion % "compile,test",
    "org.scala-sbt" %% "librarymanagement-ivy" % librarymanagementVersion % "compile,test"
  )
  val libraryManagementTest = Seq(
    "org.scala-sbt" %% "librarymanagement-core" % librarymanagementVersion % "test" classifier("Tests"),
    "org.scala-sbt" %% "librarymanagement-ivy" % librarymanagementVersion % "test" classifier("Tests"),
  )
  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.5" % "test"

  // Maven related dependency craziness
  val mvnVersion = "3.3.9"
  val aetherVersion = "1.1.0"

  val mvnAether = "org.apache.maven" % "maven-aether-provider" % mvnVersion
  val aether = "org.eclipse.aether" % "aether" % aetherVersion
  val aetherImpl = "org.eclipse.aether" % "aether-impl" % aetherVersion
  val aetherUtil = "org.eclipse.aether" % "aether-util" % aetherVersion
  val aetherTransportFile = "org.eclipse.aether" % "aether-transport-file" % aetherVersion
  val aetherTransportWagon = "org.eclipse.aether" % "aether-transport-wagon" % aetherVersion
  val aetherTransportHttp = "org.eclipse.aether" % "aether-transport-http" % aetherVersion
  val aetherConnectorBasic = "org.eclipse.aether" % "aether-connector-basic" % aetherVersion
  val sisuPlexus = ("org.eclipse.sisu" % "org.eclipse.sisu.plexus" % "0.3.3").exclude("javax.enterprise", "cdi-api").exclude("com.google.code.findbugs", "jsr305")
  val guice = "com.google.inject" % "guice" % "4.2.1"
  val guava = "com.google.guava" % "guava" % "26.0-jre"
  val javaxInject = "javax.inject" % "javax.inject" % "1"

  def aetherLibs =
    Seq(
      guava,
      javaxInject,
      sisuPlexus,
      aetherImpl,
      aetherConnectorBasic,
      mvnAether)
}
