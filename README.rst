=============
ScalaProject
=============

Purpose
=======
This project is a "dummy" Scala project you can use as a starting point for your Scala project. It includes the Scala library and is already integrated with Ant and ScalaTest.
**NOTE: I have switched to simple-build-tool as of August 2010. If you use this project you are advised to make sure the Scala and ScalaTest jars are the latest, or update the Ant file to use Ivy.See https://github.com/ymasory/sbt-prototype for my new prototype project, using sbt and Ensime.**

Getting started
===============

You **do** need Ant and Java 5+ installed and available at the command line. You do **not** need Scala or ScalaTest. They are already provided and configured.

From the command line:

   | ``cd ScalaProject  #get into the ScalaProject directory``
   | ``ant build        #compile Scala project and tests``
   | ``ant test         #run unit tests``
   | ``ant run          #run Scala project``
   | ``ant doc          #generate ScalaDocs``

Now fill in your own code and tests!

Next steps
==========
* *How can I change the name/entry point of my project?*
  You can change the name of MyProgram.scala to whatever you want. The name of the file doesn't matter. If you want to change the name of your entry point object from MyProgram to something else, you need to change the ``entrypoint.name`` property in the ``build.xml`` file from ``com.example.MyProgram`` to something else.

* *How can I add more test files?*
  So long as your tests are in the package ``com.example`` (like the provided example test suite) they will run. If you want to change the location of your tests to some other package you need to change the ``test.package`` property in the ``build.xml`` file.

* *Compiling is so slow! How can I speed things up?*
  Try replacing the ``scalac`` tags in the ``build.xml`` file with ``fsc`` ones. But be warned, ``fsc`` fails on some computers. It's also buggy. But hey, I still try to use it when I can.

How can I help?
===============
I created this project because I had trouble getting Scala integrated with ScalaTest and Ant. Some of the documentation out there is wrong or out of date. You can contribute back by improving the provided build.xml.
