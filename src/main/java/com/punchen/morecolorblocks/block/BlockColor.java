package com.punchen.morecolorblocks.block;

public enum BlockColor {
    RED_1(246, 32, 32),
    RED_2(248, 76, 76),
    RED_3(247, 113, 113),
    RED_PURPLE_1(249, 0, 148),
    RED_PURPLE_2(247, 52, 170),
    RED_PURPLE_3(250, 90, 186),
    PURPLE_1(163, 64, 184),
    PURPLE_2(182, 102, 199),
    PURPLE_3(196, 132, 210),
    PURPLE_BLUE_1(108, 64, 185),
    PURPLE_BLUE_2(137, 107, 197),
    PURPLE_BLUE_3(160, 132, 209),
    BLUE_1(7, 13, 222),
    BLUE_2(57, 141, 231),
    BLUE_3(95, 164, 232),
    BLUE_GREEN_1(0, 196, 195),
    BLUE_GREEN_2(51, 207, 206),
    BLUE_GREEN_3(92, 216, 216),
    GREEN_1(0, 218, 108),
    GREEN_2(57, 223, 139),
    GREEN_3(90, 230, 159),
    YELLOW_GREEN_1(123, 212, 34),
    YELLOW_GREEN_2(149, 220, 80),
    YELLOW_GREEN_3(170, 227, 114),
    YELLOW_1(245, 204, 0),
    YELLOW_2(247, 213, 51),
    YELLOW_3(249, 222, 91),
    ORANGE_YELLOW_1(241, 161, 0),
    ORANGE_YELLOW_2(243, 180, 51),
    ORANGE_YELLOW_3(246, 195, 90),
    ORANGE_1(255, 149, 1),
    ORANGE_2(255, 170, 51),
    ORANGE_3(255, 186, 93),
    ORANGE_RED_1(225, 75, 0),
    ORANGE_RED_2(230, 111, 53),
    ORANGE_RED_3(235, 139, 91);

    public final int R;
    public final int G;
    public final int B;

    BlockColor(int r, int g, int b) {
        this.R = r;
        this.G = g;
        this.B = b;
    }

    public static void main(String[] args) {
        for (BlockColor color : BlockColor.values()) {
            System.out.println(color);
        }
    }
}
