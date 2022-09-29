# Installing VSC
To install vscode, go to the [website](https://code.visualstudio.com) here and download it for your system, following the instructions.
It should look something like this.
![example1](1-1.png)

# Remote connecting
If you are using windows, first install OpenSSH. Other platforms have this feature built in.
Press control or command and \` to bring up the console in VS Code.
Ensure you have set up an account with UCSD CSE department so you can ssh into your server.
Type or paste `ssh cs15lfa22XX@ieng6.ucsd.edu` into the console, replacing XX with your two unique characters.

Then enter your password for your UCSD account.

Once successfully logged in, it should look something like this.
![example2](1-2.png)

# Commands
You are now connected to the server, and inside the server's computer.
Try some commands in the server, like `ls` or `pwd` or `cd perl5`
![example6](1-6.png)

# Moving files with `scp`
To move files from one computer to another, use `scp <file> <destination>`. I created a file called WhereAmI.java for this example. We can copy it to a remote destination using the `scp` command, and spcifying the remote host server as the destination.
![example3](1-3.png)

# Setting an SSH key
In order to more efficiently log into remote servers, we can define SSH keys to bypass entering passwords multiple times on approved devices.
Run `ssh-keygen` to generate a public/private key pair.
Copy the public key from the client `.ssh` folder to a new `.ssh` folder that you create in your server.

You can now log into ssh from your client device without having to enter the password for each session.

# Running multiple commands in one line
You can put a `;` between different commands in the terminal to run them back to back.
![example4](1-4.png)

# Optimizing remote running
You can run remote commands without fully logging your client computer into your server. This is done by using the following sytax:
`ssh <username>@<server-address> "COMMAND YOU WANT TO RUN"`
Place the command within the quotes after the ssh command to run it in your server, then immediately log out.
![example5](1-5.png)