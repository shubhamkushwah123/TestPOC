*****************************************************************************
*********************Author : Shubham Singh Kushwah**************************
*****************************************************************************

# Bliffoscope Instructions

1) Application is packaged into a zip file named BliffoscopeExercise.zip.

2) When the zip file is extracted. there will be 4 items.

	 A) Bliffoscope Problem --> It contains the problem definition and space objects files to be submitted.

	 B) BliffoscopeAnalyser --> It contains the source code of the application.

	 C) Output.jpg --> This file is the snapshot of the output screen after running the application.

	 D) README.txt --> This file contains instructions about the structure & running the application.


3) Instructions run and test the output of the jar file.

#Pre-requisite
	A) Maven 3.3.9
	B) Java 8

Note : Please execute the below commands from the location, where source is present. i.e. BliffoscopeAnalyser

# To clean the existing build code.
	=> mvn clean

# To compile source code
	=> mvn compile

# To run Junit test cases
	=> mvn test

# To package the code into jar
	=> mvn package

# TO run the application
	=> cd target

	=> java -jar BliffoscopeAnalyser-1.0.jar 

*******************************************************************************
******************************Thank You****************************************
*******************************************************************************
