lazy val root = project
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalaVersion := "2.13.2",
    libraryDependencies += "org.scalameta" %%% "munit" % "0.7.3" % Test,
    testFrameworks += new TestFramework("munit.Framework")
  )
