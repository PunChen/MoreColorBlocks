package com.punchen.morecolorblocks.colors;

public enum ConfigColor {
    RED_1(246, 32, 32, "红色1", 1, true),
    RED_2(248, 76, 76, "红色2", 2, true),
    RED_3(247, 113, 113, "红色3", 3, true),
    RED_PURPLE_1(249, 0, 148, "红紫色1", 4, false),
    RED_PURPLE_2(247, 52, 170, "红紫色2", 5, false),
    RED_PURPLE_3(250, 90, 186, "红紫色3", 6, false),
    PURPLE_1(163, 64, 184, "紫色1", 7, true),
    PURPLE_2(182, 102, 199, "紫色2", 8, true),
    PURPLE_3(196, 132, 210, "紫色3", 9, true),
    PURPLE_BLUE_1(108, 64, 185, "紫蓝色1", 10, false),
    PURPLE_BLUE_2(137, 107, 197, "紫蓝色2", 11, false),
    PURPLE_BLUE_3(160, 132, 209, "紫蓝色3", 12, false),
    BLUE_1(7, 113, 222, "蓝色1", 13, true),
    BLUE_2(57, 141, 231, "蓝色2", 14, true),
    BLUE_3(95, 164, 232, "蓝色3", 15, true),
    BLUE_GREEN_1(0, 196, 195, "蓝绿色1", 16, false),
    BLUE_GREEN_2(51, 207, 206, "蓝绿色2", 17, false),
    BLUE_GREEN_3(92, 216, 216, "蓝绿色3", 18, false),
    GREEN_1(0, 218, 108, "绿色1", 19, true),
    GREEN_2(57, 223, 139, "绿色2", 20, true),
    GREEN_3(90, 230, 159, "绿色3", 21, true),
    YELLOW_GREEN_1(123, 212, 34, "黄绿色1", 22, false),
    YELLOW_GREEN_2(149, 220, 80, "黄绿色2", 23, false),
    YELLOW_GREEN_3(170, 227, 114, "黄绿色3", 24, false),
    YELLOW_1(245, 204, 0, "黄色1", 25, true),
    YELLOW_2(247, 213, 51, "黄色2", 26, true),
    YELLOW_3(249, 222, 91, "黄色3", 27, true),
    ORANGE_YELLOW_1(241, 161, 0, "橙黄色1", 28, false),
    ORANGE_YELLOW_2(243, 180, 51, "橙黄色2", 29, false),
    ORANGE_YELLOW_3(246, 195, 90, "橙黄色3", 30, false),
    ORANGE_1(255, 149, 1, "橙色1", 31, true),
    ORANGE_2(255, 170, 51, "橙色2", 32, true),
    ORANGE_3(255, 186, 93, "橙色3", 33, true),
    ORANGE_RED_1(225, 75, 0, "橙红色1", 34, false),
    ORANGE_RED_2(230, 111, 53, "橙红色2", 35, false),
    ORANGE_RED_3(235, 139, 91, "橙红色3", 36, false);

    public final int R;
    public final int G;
    public final int B;
    public final String cn_name;
    public final int id;
    public final boolean single;

    ConfigColor(int r, int g, int b, String cn_name, int id, boolean single) {
        this.R = r;
        this.G = g;
        this.B = b;
        this.cn_name = cn_name;
        this.id = id;
        this.single = single;
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
