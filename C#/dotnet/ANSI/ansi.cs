/*
 * ANSI-Project: C#
 * 
 * Make quick ANSI formats to beautify terminal output
 * 
 * @see https://github.com/bruneo32/ANSI-Project
 * @see https://en.wikipedia.org/wiki/ANSI_escape_code
 * 
 * @author Bruno Castro
 * @version 1.0
 * @since January 2022
 */

namespace ansi
{
	class ANSI
	{
		public static string ESC = "\u001B";
		public static string CSI = "\u009B";
		public static string DSC = "\u0090";
		public static string OSC = "\u009D";


		/*
		 *  Colors	[quick]
		 */

		// BASIC
		public static string RESET			= ESC+"[0m";

		public static string BOLD			= ESC+"[1m";
		public static string FAINT			= ESC+"[2m";
		public static string ITALIC			= ESC+"[3m";
		public static string UNDER			= ESC+"[4m";
		public static string SBLINK			= ESC+"[5m";
		public static string RBLINK			= ESC+"[6m";
		public static string REVERSE		= ESC+"[7m";
		public static string HIDE			= ESC+"[8m";
		public static string STRIKE			= ESC+"[9m";

		/**
		 * Default font
		 */
		public static string DEF_FONT		= ESC+"[10m";

		/**
		 * Rarely supported font
		 */
		public static string Franktur		= ESC+"[20m";

		public static string BOLD_OFF		= ESC+"[21m";
		public static string HI_OFF			= ESC+"[22m";
		public static string ITALIC_OFF		= ESC+"[23m";
		public static string UNDER_OFF		= ESC+"[24m";
		public static string BLINK_OFF		= ESC+"[25m";
		public static string REVERSE_OFF	= ESC+"[27m";
		public static string REVEAL			= ESC+"[28m";
		public static string STRIKE_OFF		= ESC+"[29m";


		// FOREGROUND
		public static string BLACK			= ESC+"[30m";
		public static string RED			= ESC+"[31m";
		public static string GREEN			= ESC+"[32m";
		public static string YELLOW			= ESC+"[33m";
		public static string BLUE			= ESC+"[34m";
		public static string PURPLE			= ESC+"[35m";
		public static string CYAN			= ESC+"[36m";
		public static string WHITE			= ESC+"[37m";

		public static string DEFAULT		= ESC+"[39m";

		// BACKGROUND
		public static string BK_BLACK		= ESC+"[40m";
		public static string BK_RED			= ESC+"[41m";
		public static string BK_GREEN		= ESC+"[42m";
		public static string BK_YELLOW		= ESC+"[43m";
		public static string BK_BLUE		= ESC+"[44m";
		public static string BK_PURPLE		= ESC+"[45m";
		public static string BK_CYAN		= ESC+"[46m";
		public static string BK_WHITE		= ESC+"[47m";

		public static string BK_DEFAULT		= ESC+"[49m";

		// HIGH INTENSITY
		public static string BLACK_HI		= ESC+"[90m";
		public static string RED_HI			= ESC+"[91m";
		public static string GREEN_HI		= ESC+"[92m";
		public static string YELLOW_HI		= ESC+"[93m";
		public static string BLUE_HI		= ESC+"[94m";
		public static string PURPLE_HI		= ESC+"[95m";
		public static string CYAN_HI		= ESC+"[96m";
		public static string WHITE_HI		= ESC+"[97m";

		// HI BACKGROUND
		public static string BK_BLACK_HI	= ESC+"[100m";
		public static string BK_RED_HI		= ESC+"[101m";
		public static string BK_GREEN_HI	= ESC+"[102m";
		public static string BK_YELLOW_HI	= ESC+"[103m";
		public static string BK_BLUE_HI		= ESC+"[104m";
		public static string BK_PURPLE_HI	= ESC+"[105m";
		public static string BK_CYAN_HI		= ESC+"[106m";
		public static string BK_WHITE_HI	= ESC+"[107m";

		
		/*
		 *  Colors	[bake]
		 */

		/**
		 * Sets colors and style of the characters following this code
		 * Example: ANSI.SGR("40;91") makes RED_HI over BK_BLACK
		 * 
		 * @param str
		 * @return string to be printed
		 */
		public static string SGR(string str) {
			return ESC+ $"[{str}m";
		}


		/**
		 * Specify the Foreground color in RGB
		 * 
		 * @param r Red value
		 * @param g Green value
		 * @param b Blue value
		 * @return string to be printed
		 */
		public static string RGB(int r, int g, int b) {
			return ESC+ $"[38;2;{r};{g};{b}m";
		}

		/**
		 * Specify the Background color in RGB
		 * 
		 * @param r Red value
		 * @param g Green value
		 * @param b Blue value
		 * @return string to be printed
		 */
		public static string BK_RGB(int r, int g, int b) {
			return ESC+ $"[48;2;{r};{g};{b}m";
		}



		/*
		 *  CONTROLS	[quick]
		 */

		/**
		 * Place the cursor in top-left corner
		 * Same as CUP(1,1)
		 * 
		 * @return ESC [1;1H
		 */
		public static string C0		= ESC+"[1;1H";

		/**
		 * Move the cursor 1 row up
		 * 
		 * @return ESC [1A
		 */
		public static string CUU1	= ESC+"[1A";

		/**
		 * Move the cursor 1 row down
		 * 
		 * @return ESC [1B
		 */
		public static string CUD1	= ESC+"[1B";

		/**
		 * Move the cursor 1 cell forwards
		 * 
		 * @return ESC [1C
		 */
		public static string CUF1	= ESC+"[1C";

		/**
		 * Move the cursor 1 cell backwards
		 * 
		 * @return ESC [1D
		 */
		public static string CUB1	= ESC+"[1D";

		/**
		 * Moves cursor to beginning of the next line
		 * 
		 * @return ESC [1E
		 */
		public static string CNL1	= ESC+"[1E";

		/**
		 * Moves cursor to beginning of the previous line
		 * 
		 * @return ESC [1F
		 */
		public static string CPL1	= ESC+"[1F";


		/**
		 * Scroll whole page up by 1 line
		 * 
		 * @return ESC [1S
		 */
		public static string SU1	= ESC+"[1S";

		/**
		 * Scroll whole page down by 1 line
		 * 
		 * @return ESC [1T
		 */
		public static string SD1	= ESC+"[1T";

		/**
		 * Clear from cursor to end of screen.
		 * 
		 * @return ESC [0J
		 */
		public static string ED0	= ESC+"[0J";

		/**
		 * Clear from cursor to beginning of the screen
		 * 
		 * @return ESC [1J
		 */
		public static string ED1	= ESC+"[1J";

		/**
		 * Clear entire screen (and moves cursor to upper left on DOS ANSI.SYS)
		 * 
		 * @return ESC [2J
		 */
		public static string ED2	= ESC+"[2J";

		/**
		 * Clear entire screen and delete all lines saved in the scrollback buffer (this feature was added for xterm and is supported by other terminal applications)
		 * 
		 * @return ESC [3J
		 */
		public static string ED3	= ESC+"[3J";
		

		/**
		 * Clear from cursor to the end of the line
		 * 
		 * @return ESC [0K
		 */
		public static string EL0	= ESC+"[0K";

		/**
		 * Clear from cursor to beginning of the line
		 * 
		 * @return ESC [1K
		 */
		public static string EL1	= ESC+"[1K";

		/**
		 * Clear entire line. Cursor position does not change.
		 * 
		 * @return ESC [2K
		 */
		public static string EL2	= ESC+"[2K";
		

		/**
		 * Enable aux serial port usually for local serial printer
		 * 
		 * @return ESC [5i
		 */
		public static string AUX_PORT_ON	= ESC+"[5i";

		/**
		 * Enable aux serial port usually for local serial printer
		 * 
		 * @return ESC [4i
		 */
		public static string AUX_PORT_OFF	= ESC+"[4i";

		/**
		 * Reports the cursor position (CPR) by transmitting ESC[n;mR, where n is the row and m is the column.
		 * 
		 * @return ESC [6n
		 */
		public static string DSR	= ESC+"[6n";

		/**
		 * Saves the cursor position/state in SCO console mode
		 * In vertical split screen mode, instead used to set (as CSI n ; n s) or reset left and right margins.
		 * 
		 * @return ESC [s
		 */
		public static string SCP	= ESC+"[s";

		/**
		 * Restores the cursor position/state in SCO console mode.
		 * 
		 * @return ESC [u
		 */
		public static string RCP	= ESC+"[u";



		/*
		 *  CONTROLS	[bake]
		 */
		
		/**
		 * Moves the cursor n (default 1) cells up
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CUU(int n) {
			return ESC+ $"[{n}A";
		}

		/**
		 * Moves the cursor n (default 1) cells down
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CUD(int n) {
			return ESC+ $"[{n}B";
		}

		/**
		 * Moves the cursor n (default 1) cells forwards
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CUF(int n) {
			return ESC+ $"[{n}C";
		}

		/**
		 * Moves the cursor n (default 1) cells backwards
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CUB(int n) {
			return ESC+ $"[{n}D";
		}

		/**
		 * Moves cursor to beginning of the line n (default 1) lines down.
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CNL(int n) {
			return ESC+ $"[{n}E";
		}

		/**
		 * Moves cursor to beginning of the line n (default 1) lines up.
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CPL(int n) {
			return ESC+ $"[{n}F";
		}

		/**
		 * Moves the cursor to column n (default 1)
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string CHA(int n) {
			return ESC+ $"[{n}G";
		}

		/**
		 * Moves the cursor to [row, column]. The values are 1-based.
		 * 
		 * @param row
		 * @param col
		 * @return string to be printed
		 */
		public static string CUP(int row, int col) {
			return ESC+ $"[{row};{col}H";
		}

		/**
		 * Clears part of the screen.
		 * If n is 0 (or missing), clear from cursor to end of screen.
		 * If n is 1, clear from cursor to beginning of the screen.
		 * If n is 2, clear entire screen (and moves cursor to upper left on DOS ANSI.SYS).
		 * If n is 3, clear entire screen and delete all lines saved in the scrollback buffer (this feature was added for xterm and is supported by other terminal applications).
		 *
		 * @param n
		 * @return string to be printed
		 */
		public static string ED(int n) {
			return ESC+ $"[{n}J";
		}

		/**
		 * Erases part of the line
		 * If n is 0 (or missing), clear from cursor to the end of the line
		 * If n is 1, clear from cursor to beginning of the line
		 * If n is 2, clear entire line. Cursor position does not change.
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string EL(int n) {
			return ESC+ $"[{n}K";
		}

		/**
		 * Scroll whole page up by n (default 1) lines. New lines are added at the bottom. (not ANSI.SYS)
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string SU(int n) {
			return ESC+ $"[{n}S";
		}

		/**
		 * Scroll whole page down by n (default 1) lines. New lines are added at the top. (not ANSI.SYS)
		 * 
		 * @param n
		 * @return string to be printed
		 */
		public static string SD(int n) {
			return ESC+ $"[{n}T";
		}

		/**
		 * Same as CUP, but counts as a format effector function (like CR or LF) rather than an editor function (like CUD or CNL)
		 * This can lead to different handling in certain terminal modes
		 * 
		 * @param row
		 * @param col
		 * @return string to be printed
		 */
		public static string HVP(int row, int col) {
			return ESC+ $"[{row};{col}f";
		}



		/*
		 * CUSTOM
		 */
		
		/**
		 * Returns a custom ANSI ESCAPE SEQUENCE
		 * 
		 * @param str
		 * @return ESC + "[" + str
		 */
		public static string custom(string str) {
			return ESC+ $"[{str}";
		}
	}
}
