package ylesanded;

public class Four {
    private static final int line_length = 46;

    private static final char
        black_symbol = '¤',
        blue_symbol = '=',
        white_symbol = '-';

    private static final String
        black_color = "\u001B[30m",
        blue_color = "\u001B[34m",
        white_color = "\u001B[37m",
        reset_color = "\u001B[0m";

    private static void printBlock(final char symbol, final String color) {
        System.out.println(
            color +
            (String.valueOf(symbol).repeat(line_length) + "\r\n").repeat(3) +
            (String.valueOf(symbol)).repeat(line_length) +
            reset_color
        );
    }

    public static void main(String[] args) {
        printBlock(black_symbol, black_color);
        printBlock(blue_symbol, blue_color);
        printBlock(white_symbol, white_color);
    }
}