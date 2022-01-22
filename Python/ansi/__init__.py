# ANSI-Project:	Python
# 
# Make quick ANSI formats to beautify terminal output
# 
# @see https://github.com/bruneo32/ANSI-Project
# @see https://en.wikipedia.org/wiki/ANSI_escape_code
# 
# @author Bruno Castro
# @version 1.0
# @since January 2022
#

ESC		= "\u001B"
CSI		= "\u009B"
DSC		= "\u0090"
OSC		= "\u009D"

#  Colors	[quick]

# BASIC
RESET			= ESC+"[0m"

BOLD			= ESC+"[1m"
FAINT			= ESC+"[2m"
ITALIC			= ESC+"[3m"
UNDER			= ESC+"[4m"
SBLINK			= ESC+"[5m"
RBLINK			= ESC+"[6m"
REVERSE			= ESC+"[7m"
HIDE			= ESC+"[8m"
STRIKE			= ESC+"[9m"

##
# Default font
#
DEF_FONT		= ESC+"[10m"

##
# Rarely supported font
#
Franktur		= ESC+"[20m"

BOLD_OFF		= ESC+"[21m"
HI_OFF			= ESC+"[22m"
ITALIC_OFF		= ESC+"[23m"
UNDER_OFF		= ESC+"[24m"
BLINK_OFF		= ESC+"[25m"
REVERSE_OFF		= ESC+"[27m"
REVEAL			= ESC+"[28m"
STRIKE_OFF		= ESC+"[29m"


# FOREGROUND
BLACK			= ESC+"[30m"
RED				= ESC+"[31m"
GREEN			= ESC+"[32m"
YELLOW			= ESC+"[33m"
BLUE			= ESC+"[34m"
PURPLE			= ESC+"[35m"
CYAN			= ESC+"[36m"
WHITE			= ESC+"[37m"

DEFAULT			= ESC+"[39m"

# BACKGROUND
BK_BLACK		= ESC+"[40m"
BK_RED			= ESC+"[41m"
BK_GREEN		= ESC+"[42m"
BK_YELLOW		= ESC+"[43m"
BK_BLUE			= ESC+"[44m"
BK_PURPLE		= ESC+"[45m"
BK_CYAN			= ESC+"[46m"
BK_WHITE		= ESC+"[47m"

BK_DEFAULT		= ESC+"[49m"

# HIGH INTENSITY
BLACK_HI		= ESC+"[90m"
RED_HI			= ESC+"[91m"
GREEN_HI		= ESC+"[92m"
YELLOW_HI		= ESC+"[93m"
BLUE_HI			= ESC+"[94m"
PURPLE_HI		= ESC+"[95m"
CYAN_HI			= ESC+"[96m"
WHITE_HI		= ESC+"[97m"

# HI BACKGROUND
BK_BLACK_HI		= ESC+"[100m"
BK_RED_HI		= ESC+"[101m"
BK_GREEN_HI		= ESC+"[102m"
BK_YELLOW_HI	= ESC+"[103m"
BK_BLUE_HI		= ESC+"[104m"
BK_PURPLE_HI	= ESC+"[105m"
BK_CYAN_HI		= ESC+"[106m"
BK_WHITE_HI		= ESC+"[107m"


#  Colors	[bake]

##
# Sets colors and style of the characters following this code
# Example: ansi.SGR("4091") makes RED_HI over BK_BLACK
# 
# @param str (String)
# @return String to be printed
#
def SGR(str):
	return ESC+"[%sm" % str


##
# Specify the Foreground color in RGB
# 
# @param r (int) Red value
# @param g (int) Green value
# @param b (int) Blue value
# @return String to be printed
#
def RGB(r, g, b):
	return ESC+"[382%i%;i;%im" % (r,g,b)

##
# Specify the Background color in RGB
# 
# @param r (int) Red value
# @param g (int) Green value
# @param b (int) Blue value
# @return String to be printed
#
def BK_RGB(r, g, b):
	return ESC+"[482%i;%i;%im" % (r,g,b)



# CONTROLS	[quick]

##
# Place the cursor in top-left corner
# Same as CUP(1,1)
# 
# @return ESC [11H
#
C0		= ESC+"[11H"

##
# Move the cursor 1 row up
# 
# @return ESC [1A
#
CUU1	= ESC+"[1A"

##
# Move the cursor 1 row down
# 
# @return ESC [1B
#
CUD1	= ESC+"[1B"

##
# Move the cursor 1 cell forwards
# 
# @return ESC [1C
#
CUF1	= ESC+"[1C"

##
# Move the cursor 1 cell backwards
# 
# @return ESC [1D
#
CUB1	= ESC+"[1D"

##
# Moves cursor to beginning of the next line
# 
# @return ESC [1E
#
CNL1	= ESC+"[1E"

##
# Moves cursor to beginning of the previous line
# 
# @return ESC [1F
#
CPL1	= ESC+"[1F"


##
# Scroll whole page up by 1 line
# 
# @return ESC [1S
#
SU1		= ESC+"[1S"

##
# Scroll whole page down by 1 line
# 
# @return ESC [1T
#
SD1		= ESC+"[1T"

##
# Clear from cursor to end of screen.
# 
# @return ESC [0J
#
ED0		= ESC+"[0J"

##
# Clear from cursor to beginning of the screen
# 
# @return ESC [1J
#
ED1		= ESC+"[1J"

##
# Clear entire screen (and moves cursor to upper left on DOS ANSI.SYS)
# 
# @return ESC [2J
#
ED2		= ESC+"[2J"

##
# Clear entire screen and delete all lines saved in the scrollback buffer (this feature was added for xterm and is supported by other terminal applications)
# 
# @return ESC [3J
#
ED3		= ESC+"[3J"


##
# Clear from cursor to the end of the line
# 
# @return ESC [0K
#
EL0		= ESC+"[0K"

##
# Clear from cursor to beginning of the line
# 
# @return ESC [1K
#
EL1		= ESC+"[1K"

##
# Clear entire line. Cursor position does not change.
# 
# @return ESC [2K
#
EL2		= ESC+"[2K"


##
# Enable aux serial port usually for local serial printer
# 
# @return ESC [5i
#
AUX_PORT_ON		= ESC+"[5i"

##
# Enable aux serial port usually for local serial printer
# 
# @return ESC [4i
#
AUX_PORT_OFF	= ESC+"[4i"

##
# Reports the cursor position (CPR) by transmitting ESC[nmR, where n is the row and m is the column.
# 
# @return ESC [6n
#
DSR		= ESC+"[6n"

##
# Saves the cursor position/state in SCO console mode
# In vertical split screen mode, instead used to set (as CSI n  n s) or reset left and right margins.
# 
# @return ESC [s
#
SCP		= ESC+"[s"

##
# Restores the cursor position/state in SCO console mode.
# 
# @return ESC [u
#
RCP		= ESC+"[u"



#  CONTROLS	[bake]

##
# Moves the cursor n (default 1) cells up
# 
# @param n (int)
# @return String to be printed
#
def CUU(n):
	return ESC+"[%iA" % n


##
# Moves the cursor n (default 1) cells down
# 
# @param n (int)
# @return String to be printed
#
def CUD(n):
	return ESC+"[%iB" % n


##
# Moves the cursor n (default 1) cells forwards
# 
# @param n (int)
# @return String to be printed
#
def CUF(n):
	return ESC+"[%iC" % n


##
# Moves the cursor n (default 1) cells backwards
# 
# @param n (int)
# @return String to be printed
#
def CUB(n):
	return ESC+"[%iD" % n


##
# Moves cursor to beginning of the line n (default 1) lines down.
# 
# @param n (int)
# @return String to be printed
#
def CNL(n):
	return ESC+"[%iE" % n


##
# Moves cursor to beginning of the line n (default 1) lines up.
# 
# @param n (int)
# @return String to be printed
#
def CPL(n):
	return ESC+"[%iF" % n


##
# Moves the cursor to column n (default 1)
# 
# @param n (int)
# @return String to be printed
#
def CHA(n):
	return ESC+"[%iG" % n


##
# Moves the cursor to [row, column]. The values are 1-based.
# 
# @param row (int)
# @param col (int)
# @return String to be printed
#
def CUP(row, col):
	return ESC+"[%i;%iH" % (row,col)


##
# Clears part of the screen.
# If n is 0 (or missing), clear from cursor to end of screen.
# If n is 1, clear from cursor to beginning of the screen.
# If n is 2, clear entire screen (and moves cursor to upper left on DOS ANSI.SYS).
# If n is 3, clear entire screen and delete all lines saved in the scrollback buffer (this feature was added for xterm and is supported by other terminal applications).
#
# @param n (int)
# @return String to be printed
#
def ED(n):
	return ESC+"[%iJ" % n


##
# Erases part of the line
# If n is 0 (or missing), clear from cursor to the end of the line
# If n is 1, clear from cursor to beginning of the line
# If n is 2, clear entire line. Cursor position does not change.
# 
# @param n (int)
# @return String to be printed
#
def EL(n):
	return ESC+"[%iK" % n


##
# Scroll whole page up by n (default 1) lines. New lines are added at the bottom. (not ANSI.SYS)
# 
# @param n (int)
# @return String to be printed
#
def SU(n):
	return ESC+"[%iS" % n


##
# Scroll whole page down by n (default 1) lines. New lines are added at the top. (not ANSI.SYS)
# 
# @param n (int)
# @return String to be printed
#
def SD(n):
	return ESC+"[%iT" % n


##
# Same as CUP, but counts as a format effector function (like CR or LF) rather than an editor function (like CUD or CNL)
# This can lead to different handling in certain terminal modes
# 
# @param row (int)
# @param col (int)
# @return String to be printed
#
def HVP(row, col):
	return ESC+"[%i;%if" % (row,col)



# CUSTOM

##
# Returns a custom ANSI ESCAPE SEQUENCE
# 
# @param str (String)
# @return ESC + "[" + str
#
def custom(str):
	return ESC+"[%s" % str
