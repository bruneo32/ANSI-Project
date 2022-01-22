package ansi;

/**
 * Make quick ANSI formats to beautify terminal output
 * 
 * @see <a target="_blank" href="https://github.com/bruneo32/ANSI-Project">https://github.com/bruneo32/ANSI-Project</a>
 * @see <a target="_blank" href="https://en.wikipedia.org/wiki/ANSI_escape_code">https://en.wikipedia.org/wiki/ANSI_escape_code</a>
 * 
 * @author Bruno Castro
 * @version 1.0
 * @since January 2022
 */
public class ANSI {

	public static String ESC = "\u001B";
	public static String CSI = "\u009B";
	public static String DSC = "\u0090";
	public static String OSC = "\u009D";


	/*
	 *  Colors	[quick]
	 */

	// BASIC
	public static String RESET			= ESC+"[0m";

	public static String BOLD			= ESC+"[1m";
	public static String FAINT			= ESC+"[2m";
	public static String ITALIC			= ESC+"[3m";
	public static String UNDER			= ESC+"[4m";
	public static String SBLINK			= ESC+"[5m";
	public static String RBLINK			= ESC+"[6m";
	public static String REVERSE		= ESC+"[7m";
	public static String HIDE			= ESC+"[8m";
	public static String STRIKE			= ESC+"[9m";

	/**
	 * Default font
	 */
	public static String DEF_FONT		= ESC+"[10m";

	/**
	 * Rarely supported font
	 */
	public static String Franktur		= ESC+"[20m";

	public static String BOLD_OFF		= ESC+"[21m";
	public static String HI_OFF			= ESC+"[22m";
	public static String ITALIC_OFF		= ESC+"[23m";
	public static String UNDER_OFF		= ESC+"[24m";
	public static String BLINK_OFF		= ESC+"[25m";
	public static String REVERSE_OFF	= ESC+"[27m";
	public static String REVEAL			= ESC+"[28m";
	public static String STRIKE_OFF		= ESC+"[29m";


	// FOREGROUND
	public static String BLACK			= ESC+"[30m";
	public static String RED			= ESC+"[31m";
	public static String GREEN			= ESC+"[32m";
	public static String YELLOW			= ESC+"[33m";
	public static String BLUE			= ESC+"[34m";
	public static String PURPLE			= ESC+"[35m";
	public static String CYAN			= ESC+"[36m";
	public static String WHITE			= ESC+"[37m";

	public static String DEFAULT		= ESC+"[39m";

	// BACKGROUND
	public static String BK_BLACK		= ESC+"[40m";
	public static String BK_RED			= ESC+"[41m";
	public static String BK_GREEN		= ESC+"[42m";
	public static String BK_YELLOW		= ESC+"[43m";
	public static String BK_BLUE		= ESC+"[44m";
	public static String BK_PURPLE		= ESC+"[45m";
	public static String BK_CYAN		= ESC+"[46m";
	public static String BK_WHITE		= ESC+"[47m";

	public static String BK_DEFAULT		= ESC+"[49m";

	// HIGH INTENSITY
	public static String BLACK_HI		= ESC+"[90m";
	public static String RED_HI			= ESC+"[91m";
	public static String GREEN_HI		= ESC+"[92m";
	public static String YELLOW_HI		= ESC+"[93m";
	public static String BLUE_HI		= ESC+"[94m";
	public static String PURPLE_HI		= ESC+"[95m";
	public static String CYAN_HI		= ESC+"[96m";
	public static String WHITE_HI		= ESC+"[97m";

	// HI BACKGROUND
	public static String BK_BLACK_HI	= ESC+"[100m";
	public static String BK_RED_HI		= ESC+"[101m";
	public static String BK_GREEN_HI	= ESC+"[102m";
	public static String BK_YELLOW_HI	= ESC+"[103m";
	public static String BK_BLUE_HI		= ESC+"[104m";
	public static String BK_PURPLE_HI	= ESC+"[105m";
	public static String BK_CYAN_HI		= ESC+"[106m";
	public static String BK_WHITE_HI	= ESC+"[107m";


	/*
	 *  Colors	[bake]
	 */

	/**
	 * Sets colors and style of the characters following this code
	 * Example: ANSI.SGR("40;91") makes RED_HI over BK_BLACK
	 * 
	 * @param str
	 * @return String to be printed
	 */
	public static String SGR(String str) {
		return String.format(ESC+"[%sm", str);
	}


	/**
	 * Specify the Foreground color in RGB
	 * 
	 * @param r Red value
	 * @param g Green value
	 * @param b Blue value
	 * @return String to be printed
	 */
	public static String RGB(int r, int g, int b) {
		return String.format(ESC+"[38;2;%d;%d;%dm", r,g,b);
	}

	/**
	 * Specify the Background color in RGB
	 * 
	 * @param r Red value
	 * @param g Green value
	 * @param b Blue value
	 * @return String to be printed
	 */
	public static String BK_RGB(int r, int g, int b) {
		return String.format(ESC+"[48;2;%d;%d;%dm", r,g,b);
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
	public static String C0		= ESC+"[1;1H";

	/**
	 * Move the cursor 1 row up
	 * 
	 * @return ESC [1A
	 */
	public static String CUU1	= ESC+"[1A";

	/**
	 * Move the cursor 1 row down
	 * 
	 * @return ESC [1B
	 */
	public static String CUD1	= ESC+"[1B";

	/**
	 * Move the cursor 1 cell forwards
	 * 
	 * @return ESC [1C
	 */
	public static String CUF1	= ESC+"[1C";

	/**
	 * Move the cursor 1 cell backwards
	 * 
	 * @return ESC [1D
	 */
	public static String CUB1	= ESC+"[1D";

	/**
	 * Moves cursor to beginning of the next line
	 * 
	 * @return ESC [1E
	 */
	public static String CNL1	= ESC+"[1E";

	/**
	 * Moves cursor to beginning of the previous line
	 * 
	 * @return ESC [1F
	 */
	public static String CPL1	= ESC+"[1F";


	/**
	 * Scroll whole page up by 1 line
	 * 
	 * @return ESC [1S
	 */
	public static String SU1	= ESC+"[1S";

	/**
	 * Scroll whole page down by 1 line
	 * 
	 * @return ESC [1T
	 */
	public static String SD1	= ESC+"[1T";

	/**
	 * Clear from cursor to end of screen.
	 * 
	 * @return ESC [0J
	 */
	public static String ED0	= ESC+"[0J";

	/**
	 * Clear from cursor to beginning of the screen
	 * 
	 * @return ESC [1J
	 */
	public static String ED1	= ESC+"[1J";

	/**
	 * Clear entire screen (and moves cursor to upper left on DOS ANSI.SYS)
	 * 
	 * @return ESC [2J
	 */
	public static String ED2	= ESC+"[2J";

	/**
	 * Clear entire screen and delete all lines saved in the scrollback buffer (this feature was added for xterm and is supported by other terminal applications)
	 * 
	 * @return ESC [3J
	 */
	public static String ED3	= ESC+"[3J";


	/**
	 * Clear from cursor to the end of the line
	 * 
	 * @return ESC [0K
	 */
	public static String EL0	= ESC+"[0K";

	/**
	 * Clear from cursor to beginning of the line
	 * 
	 * @return ESC [1K
	 */
	public static String EL1	= ESC+"[1K";

	/**
	 * Clear entire line. Cursor position does not change.
	 * 
	 * @return ESC [2K
	 */
	public static String EL2	= ESC+"[2K";


	/**
	 * Enable aux serial port usually for local serial printer
	 * 
	 * @return ESC [5i
	 */
	public static String AUX_PORT_ON	= ESC+"[5i";

	/**
	 * Enable aux serial port usually for local serial printer
	 * 
	 * @return ESC [4i
	 */
	public static String AUX_PORT_OFF	= ESC+"[4i";

	/**
	 * Reports the cursor position (CPR) by transmitting ESC[n;mR, where n is the row and m is the column.
	 * 
	 * @return ESC [6n
	 */
	public static String DSR	= ESC+"[6n";

	/**
	 * Saves the cursor position/state in SCO console mode
	 * In vertical split screen mode, instead used to set (as CSI n ; n s) or reset left and right margins.
	 * 
	 * @return ESC [s
	 */
	public static String SCP	= ESC+"[s";

	/**
	 * Restores the cursor position/state in SCO console mode.
	 * 
	 * @return ESC [u
	 */
	public static String RCP	= ESC+"[u";


	/*
	 *  CONTROLS	[bake]
	 */

	/**
	 * Moves the cursor n (default 1) cells up
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CUU(int n) {
		return String.format(ESC+"[%dA", n);
	}

	/**
	 * Moves the cursor n (default 1) cells down
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CUD(int n) {
		return String.format(ESC+"[%dB", n);
	}

	/**
	 * Moves the cursor n (default 1) cells forwards
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CUF(int n) {
		return String.format(ESC+"[%dC", n);
	}

	/**
	 * Moves the cursor n (default 1) cells backwards
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CUB(int n) {
		return String.format(ESC+"[%dD", n);
	}

	/**
	 * Moves cursor to beginning of the line n (default 1) lines down.
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CNL(int n) {
		return String.format(ESC+"[%dE", n);
	}

	/**
	 * Moves cursor to beginning of the line n (default 1) lines up.
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CPL(int n) {
		return String.format(ESC+"[%dF", n);
	}

	/**
	 * Moves the cursor to column n (default 1)
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String CHA(int n) {
		return String.format(ESC+"[%dG", n);
	}

	/**
	 * Moves the cursor to [row, column]. The values are 1-based.
	 * 
	 * @param row
	 * @param col
	 * @return String to be printed
	 */
	public static String CUP(int row, int col) {
		return String.format(ESC+"[%d;%dH", row,col);
	}

	/**
	 * Clears part of the screen.
	 * If n is 0 (or missing), clear from cursor to end of screen.
	 * If n is 1, clear from cursor to beginning of the screen.
	 * If n is 2, clear entire screen (and moves cursor to upper left on DOS ANSI.SYS).
	 * If n is 3, clear entire screen and delete all lines saved in the scrollback buffer (this feature was added for xterm and is supported by other terminal applications).
	 *
	 * @param n
	 * @return String to be printed
	 */
	public static String ED(int n) {
		return String.format(ESC+"[%dJ", n);
	}

	/**
	 * Erases part of the line
	 * If n is 0 (or missing), clear from cursor to the end of the line
	 * If n is 1, clear from cursor to beginning of the line
	 * If n is 2, clear entire line. Cursor position does not change.
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String EL(int n) {
		return String.format(ESC+"[%dK", n);
	}

	/**
	 * Scroll whole page up by n (default 1) lines. New lines are added at the bottom. (not ANSI.SYS)
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String SU(int n) {
		return String.format(ESC+"[%dS", n);
	}

	/**
	 * Scroll whole page down by n (default 1) lines. New lines are added at the top. (not ANSI.SYS)
	 * 
	 * @param n
	 * @return String to be printed
	 */
	public static String SD(int n) {
		return String.format(ESC+"[%dT", n);
	}

	/**
	 * Same as CUP, but counts as a format effector function (like CR or LF) rather than an editor function (like CUD or CNL)
	 * This can lead to different handling in certain terminal modes
	 * 
	 * @param row
	 * @param col
	 * @return String to be printed
	 */
	public static String HVP(int row, int col) {
		return String.format(ESC+"[%d;%df", row,col);
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
	public static String custom(String str) {
		return String.format(ESC+"[%s", str);
	}

}
