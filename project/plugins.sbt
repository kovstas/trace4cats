addSbtPlugin("com.lucidchart"            % "sbt-scalafmt"        % "1.16")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"        % "0.1.13")
addSbtPlugin("com.typesafe.sbt"          % "sbt-native-packager" % "1.7.4")
addSbtPlugin("org.foundweekends"         % "sbt-bintray"         % "0.5.6")
addSbtPlugin("ch.epfl.scala"             % "sbt-release-early"   % "2.1.1+10-c6ef3f60")
addSbtPlugin("com.thesamet"              % "sbt-protoc"          % "0.99.34")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.8"
