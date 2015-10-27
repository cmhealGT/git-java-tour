Introduction to some key points in IntelliJ.

# Running a Project in IntelliJ IDEA
## Run IntelliJ
1. If this is the first project you've created, you'll see a getting started wizard.  Select **Create New Project**.  (If you don't see this wizard, you can get to the same point by selection **File>New>Project..**).
2. In the New Project window, select **Java** on the left.  Next to the **Project SDK** field, select **New**.  In this area, select **JDK**.  The program requires us to locate the JDK we installed in the previous Wiki page.  This should be in the location "C:\Program Files\Java\jdk1.8.0_65" or something similar (depends on the build of Java that you installed.
3. Once the Project SDK is properly set up (the project SDK should say something like "1.8 (java version '1.8.0_65'), press **Next** at the bottom of the dialog.
4. Select, **Create project from template** and **Command Line App**.  This will create class with a runnable main() -- as opposed to more abstract classes. Choose **Next**.
5. Name this project, "HelloWorld" and leave all other defaults.

## Add some code
Add the following code to your main function.  
     `System.out.println("Hello World!"); ` 

## Build your code
In the **Build** menu, select **Make**.  I don't completely understand the differences between **Make** and **Compile**, but either one should suit our purposes. (Alternatively, you can set the compiler to make automatically upon any save and/or run.  For the size of code we are creating, this isn't a bad idea.  In large codes (like EcoStream or Operations), this would take a prohibitive amount of time.  To turn this on, goto **File>Settings..** and then **Build, Execution, Deployment > Compiler**. Check the box next to **Make project automatically**).

## Run your code in the IDE 
Click the Play icon in the IDE or select **Run>Run "Main"**.  You should see output in the console at the bottom panel of your workspace.

