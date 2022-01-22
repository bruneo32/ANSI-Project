# The ANSI-Project for *Python*
Make quick ANSI formats to beautify terminal output

***WebPage: [bruneo32.github.io/ANSI-Project](https://bruneo32.github.io/ANSI-Project)***


# Installation
1. Download [ansi.py.zip](https://github.com/bruneo32/ANSI-Project/blob/main/Python/ansi.py.zip) and extract it into the Python folder *(for example: `C:\Python39\`)*
2. Import it in your Python Script:
```py
import ansi
```

# Documentation
Check out the [**documentation** of the ANSI-Project for ***Python***](https://github.com/bruneo32/ANSI-Project/blob/main/Python/ansi/doxygen/html/index.html)

# Quick Example
```py
import ansi

print("Normal "+
	ansi.BOLD+		"BOLD "+		ansi.RESET+
	ansi.ITALIC+	"italic "+		ansi.RESET+
	ansi.UNDER+		"UnderLine"+	ansi.RESET+" "+
	ansi.HIDE+		"Hide "+		ansi.RESET+
	ansi.STRIKE+	"Strike"+		ansi.RESET+
	"\n\n")


for i in range(int(256/4)):
	print(ansi.BK_RGB(i*4, i*4, i*4) + " ", end="")
print(ansi.RESET)

for i in range(int(256/4)):
	print(ansi.BK_RGB(i*4, 0, 0) + " ", end="")
print(ansi.RESET)

for i in range(int(256/4)):
	print(ansi.BK_RGB(0, i*4, 0) + " ", end="")
print(ansi.RESET)

for i in range(int(256/4)):
	print(ansi.BK_RGB(0, 0, i*4) + " ", end="")


print(ansi.RESET) # Always reset at end
```
