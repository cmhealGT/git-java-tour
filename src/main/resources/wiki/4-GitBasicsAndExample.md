# Git Basics and Example

## Take a short introduction to Git from Codecademy
Link: https://www.codecademy.com/courses/learn-git

## Submitting Changes to a File with Git
In general, we want to link tasks, changelists https://www.jetbrains.com/idea/help/changelist.html, and branches when we want to implement changes in our code.  The easiest way to do this within IntelliJ is to start a task which will automatically create a branch to solve that problem.  The new branch that we create is a version of the code that is marked as independent of the master branch (or build code).  That way we have a separate place where we can play with code and save code in an interim basis.  When we're done with our changes, we'll merge our changes with the master branch (and then remove the interim branch).
  1. Go to **Tools>Tasks & Contexts>Open Task..**
  2. Select Issue #4, **Add name to Git Basics Markdown List**
  3. Select all defaults, but make sure to create a new branch.
  4. Add name and date to the file named **5-GitExampleSignUpSheet.md**.
  5. Merge changes with `master`.  Go to **VCS>Git>Pull..** and select **origin/master**.  Select **Merge** to compare files line-by-line.
  6. Commit and push changes to the remote branch (i.e., to GitHub) by right-clicking the file, selecting **Git>Commit File..**. Inside this dialog, make sure that you select the small arrow next to the **Commit** button and select **Commit and Push**.
  7. Make a pull request to merge your branch with the master. Go to **VCS>Git>Create Pull Request**.
  8. Close the active task. Go to **Tools>Tasks & Context>Close Active Task..**

There may be times where you wish to only commit files, but commonly only one of us will be working on a branch at a time.  In that case, it's probably best to commit and push all of your changes.

