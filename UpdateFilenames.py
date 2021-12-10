# to update leetcode question numbering.
import os

def updateFilename(path:str, name:str,padding:int):
    newTitle = ""
    newContent = ""
    with open(path+name, 'r') as f:
        content = f.read().split("\n")
        for i,line in enumerate(content):
            if line.startswith("public class"):
                title = line.split(" ")[2].split("_")
                numbering = str(int(title[0].split("Prob")[1]))
                if len(numbering) < padding:
                    numbering = "0" * (padding - len(numbering)) + numbering
                title[0] = "Prob" + numbering 
                newTitle = "_".join(title)
                content[i] = definition.format(newTitle)
                break
        newContent = '\n'.join(content)
    newTitle += ".java"
    os.remove(path+name)
    with open(path + newTitle,'w+') as f:
        f.write(newContent)


rootDir = "./Leetcode"
definition = "public class {} {{"
zero_padding = 4
for filename in os.listdir(rootDir): 
    if filename.startswith("Prob"):
        updateFilename(f"{rootDir}/",filename, zero_padding)

