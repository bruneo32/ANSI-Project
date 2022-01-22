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
