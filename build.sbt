import Dependencies._

lazy val mavenResolverPluginProj = (project in file(".")).
  settings(
    name := "sbt-maven-resolver",
    libraryDependencies ++= aetherLibs ++ Seq(utilTesting % Test, scalatest) ++ libraryManagement ++ libraryManagementTest
  ).enablePlugins(SbtPlugin)
