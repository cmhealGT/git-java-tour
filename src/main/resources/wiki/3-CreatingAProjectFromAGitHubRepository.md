# Creating a Project from GitHub

**1. Arrange Access to Repository through GitHub**

We are going to load and work on a public repository that I created in my GitHub account.
    `https://github.com/cmhealGT/java-primes.git`

I've registered you as a collaborator and assigned you a task.

There's a couple of ways to work on this project.

**(Other alternative) Forking the project**

This way is a little less direct, but may be preferable in some situations. Log into your GitHub account, go to `java-primes` repository and select **Fork**.  This will create a link between this repository and your own account.

**2. Make sure that the directory with the git.exe is in your PATH variable**

You can edit the path variable in Windows through **Windows Control Panel>System>Advanced System Settings>Environmental Variables**.  Then go to the pane with **System variables** and make sure that "C:\Program Files\Git\bin" is added to the list (the path variable contains a list of locations separated by semicolons -- and no spaces).  The IDE has automatic GitHub integration, but it needs to know where to look for the git executable.

If you have the IDE open, you will have to restart the IDE.

(Note: There's way to specify the location of the git executable within IntelliJ through the Project Settings menu, too.  Adjusting the PATH can be a little confusing, so you could do it this way as an alternative.)

**3. Create a New Project from a GitHub Repository**

For your new project, go to **File>New>Project From Version Control>GitHub**.  IntelliJ may prompt you for your GitHub username and password.

IntelliJ will automatically give you a list of all of your repositories.  You may have to manually add the following repository:
    `https://github.com/cmhealGT/java-primes.git`

Push **Clone**.   You may have to open up some new Tool Windows (Go to **View>Tool Windows>Project Window** load the panel with source code.)

**4. Enable GitHub Issues for Tasks**
We have to do a little setup here, because IntelliJ can use a number of different components to organize tasks.

  1. From the top toolbar, go to **Tools>Tasks & Contexts>Configure Servers..**
  2. Click the green "+" to add a server configuration, select **GitHub**.
  3. Add a username
     `cmhealGT`
  4. Add the repository name (in practice, this could be any repository you have access to)
     `java-primes`
  5. Push the **Create API token** button.  You may be requested to provide your GitHub login credentials.
  6. Push the **Test** button.  If you have a problem, see me directly and we'll try to work it out.
  7. Press **OK** and you're done.

