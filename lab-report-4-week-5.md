# Research on the `find` command

## Option 1: -d

d (stands for depth) searches each directory's contents before the actual directory itself. This is useful because it allows you to search the contents of a folder in reverse.

Example 1 (at /technical): 
```
find ./ -d -name "*.txt"
```
![example1](3-1.png)
You can see the find command searched the deepest (last) directories in the parent directory, in this case techinical, before the directories at the highest level.

Example 2 (at /technical/911report)
```
find ./ -d -name "*.txt"
```
![example2](3-2.png)
Here the find command performed the same as above, it searches through the file that come last first, and works its way up to the first files.

Example 3 (at /technical/government)
```
find ./ -d -name "*.txt"
```
![example3](3-3.png)
You can see the command searched the directories contents before anything else once again.

---
## Option 2: -empty

The empty option searches for any empty directories. This option is useful for determining empty folders that can be deleted.

Example 1 (at ./technical)
```
find ./ -empty
```
![example4](3-4.png)
Empty finds nothing because there are no directories in technical or any subdirectories that are empty.

Example 2 (at ./technical WITH 1 ADDED EMPTY DIRECTORY)
```
find ./ -empty
```
![example5](3-5.png)
When an empty subdirectory is created, the find command identifies it and prints the path of that file.

Example 2 (at ./technical/plos WITH 1 ADDED EMPTY DIRECTORY)
```
find ./ -empty
```
![example6](3-6.png)
The find command does not find anything because there are no empty directories within the current directory.

---
## Option 3: -maxdepth

Max depth searches directories up to the specified depth. This is useful for searching some directories and not others.

Example 1 (at ./technical)
```
find ./ -maxdepth 0 -name ".txt"
```
![example7](3-7.png)
The find command finds nothing because it is only searching the current directory, not its contents. A maxdepth of 1 would return an identical result in this case, because the technical directory does not have any .txt files in it.

Example 2 (at ./technical)
```
find ./ -maxdepth 2 -name ".txt"
```
![example8](3-8.png)
The command returns .txt files at a depth of 2, which means any .txt files that are in the first level of any of technical's subdirectories.

Example 3 (at ./technical/government)
```
find ./ -maxdepth 1 -name ".txt"
```
![example8](3-9.png)
Even though the government directory has .txt files in it, they are all at a depth of 2 or greater, which means the find command once again returns nothing.