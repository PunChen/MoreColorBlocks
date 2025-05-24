package com.punchen.morecolorblocks.utils;

import com.punchen.morecolorblocks.colors.ConfigColor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {
    public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MOD_ID);
    public static int toHexColor(int r, int g, int b) {
        return (r << 16) | (g << 8) | b;
    }
    public static int toHexColor(ConfigColor color) {
        return (color.R << 16) | (color.G << 8) | color.B;
    }
}
