=============
ScalaProject
=============

Purpose
=======
This project is a "dummy" Scala project you can use as a starting point for your Scala project. It includes the Scala library and is already integrated with Ant and ScalaTest.

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
  Working on an easy way to allow that . . .

How can I help?
===============
I created this project because I had trouble getting Scala integrated with ScalaTest and Ant. Some of the documentation out there is wrong or out of date. You can contribute back by improving the provided build.xml.
