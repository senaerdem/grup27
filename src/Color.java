public class Color {
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[0;30m";
    public static final String MAGENTA = "\033[35;49m";
    public static final String RED = "\033[38;5;9m";
    public static final String GREEN = "\033[38;5;10m";
    public static final String YELLOW = "\033[38;5;11m";
    public static final String BLUE = "\033[38;5;12m";
    public static final String NAVY = "\033[38;5;17m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[38;5;14m";
    public static final String WHITE = "\033[0;37m";
    public static final String ORANGE = "\033[38;5;208m";
    public static final String ROSE = "\033[38;5;52m";
    public static final String NEON = "\033[38;5;51m";
    public static final String PINK = "\033[38;5;162m";


    public static void setColor(String color) {
        System.out.print(color);
    }

    public static void resetColor() {
        System.out.print(RESET);
    }
}
