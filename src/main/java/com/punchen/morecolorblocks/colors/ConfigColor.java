package com.punchen.morecolorblocks.colors;

public enum ConfigColor {
    RED_1(246, 32, 32, "红色1", 1),
    RED_2(248, 76, 76, "红色2", 2),
    RED_3(247, 113, 113, "红色3", 3),
    RED_PURPLE_1(249, 0, 148, "红紫色1", 4),
    RED_PURPLE_2(247, 52, 170, "红紫色2", 5),
    RED_PURPLE_3(250, 90, 186, "红紫色3", 6),
    PURPLE_1(163, 64, 184, "紫色1", 7),
    PURPLE_2(182, 102, 199, "紫色2", 8),
    PURPLE_3(196, 132, 210, "紫色3", 9),
    PURPLE_BLUE_1(108, 64, 185, "紫蓝色1", 10),
    PURPLE_BLUE_2(137, 107, 197, "紫蓝色2", 11),
    PURPLE_BLUE_3(160, 132, 209, "紫蓝色3", 12),
    BLUE_1(7, 113, 222, "蓝色1", 13),
    BLUE_2(57, 141, 231, "蓝色2", 14),
    BLUE_3(95, 164, 232, "蓝色3", 15),
    BLUE_GREEN_1(0, 196, 195, "蓝绿色1", 16),
    BLUE_GREEN_2(51, 207, 206, "蓝绿色2", 17),
    BLUE_GREEN_3(92, 216, 216, "蓝绿色3", 18),
    GREEN_1(0, 218, 108, "绿色1", 19),
    GREEN_2(57, 223, 139, "绿色2", 20),
    GREEN_3(90, 230, 159, "绿色3", 21),
    YELLOW_GREEN_1(123, 212, 34, "黄绿色1", 22),
    YELLOW_GREEN_2(149, 220, 80, "黄绿色2", 23),
    YELLOW_GREEN_3(170, 227, 114, "黄绿色3", 24),
    YELLOW_1(245, 204, 0, "黄色1", 25),
    YELLOW_2(247, 213, 51, "黄色2", 26),
    YELLOW_3(249, 222, 91, "黄色3", 27),
    ORANGE_YELLOW_1(241, 161, 0, "橙黄色1", 28),
    ORANGE_YELLOW_2(243, 180, 51, "橙黄色2", 29),
    ORANGE_YELLOW_3(246, 195, 90, "橙黄色3", 30),
    ORANGE_1(255, 149, 1, "橙色1", 31),
    ORANGE_2(255, 170, 51, "橙色2", 32),
    ORANGE_3(255, 186, 93, "橙色3", 33),
    ORANGE_RED_1(225, 75, 0, "橙红色1", 34),
    ORANGE_RED_2(230, 111, 53, "橙红色2", 35),
    ORANGE_RED_3(235, 139, 91, "橙红色3", 36);

    public final int R;
    public final int G;
    public final int B;
    public final String cn_name;
    public final int id;

    ConfigColor(int r, int g, int b, String cn_name, int id) {
        this.R = r;
        this.G = g;
        this.B = b;
        this.cn_name = cn_name;
        this.id = id;
    }

    public ConfigColor getColorById(int id) {
        for (ConfigColor color : values()) {
            if (color.id == id) {
                return color;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        for (ConfigColor color : ConfigColor.values()) {
            System.out.println(color);
        }
    }
}
