package net.quikkly.core;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class Skin {
    public static final int IMAGE_FIT_DEFAULT = 0;
    public static final int IMAGE_FIT_MEET = 2;
    public static final int IMAGE_FIT_SLICE = 3;
    public static final int IMAGE_FIT_STRETCH = 1;
    public static final int JOIN_DEFAULT = -1;
    public static final int JOIN_DIAGONAL_LEFT = 8;
    public static final int JOIN_DIAGONAL_RIGHT = 4;
    public static final int JOIN_HORIZONTAL = 1;
    public static final int JOIN_NONE = 0;
    public static final int JOIN_VERTICAL = 2;
    public String borderColor = "#000000";
    public String backgroundColor = "#dddddd";
    public String maskColor = "#ffffff";
    public String overlayColor = "#000000";
    public String[] dataColors = new String[0];
    public String imageUrl = "";
    public int imageFit = 0;
    public String logoUrl = "";
    public int logoFit = 0;
    public int join = -1;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Skin skin = (Skin) obj;
        if (this.imageFit != skin.imageFit || this.logoFit != skin.logoFit || this.join != skin.join) {
            return false;
        }
        String str = this.borderColor;
        if (str == null ? skin.borderColor != null : !str.equals(skin.borderColor)) {
            return false;
        }
        String str2 = this.backgroundColor;
        if (str2 == null ? skin.backgroundColor != null : !str2.equals(skin.backgroundColor)) {
            return false;
        }
        String str3 = this.maskColor;
        if (str3 == null ? skin.maskColor != null : !str3.equals(skin.maskColor)) {
            return false;
        }
        String str4 = this.overlayColor;
        if (str4 == null ? skin.overlayColor != null : !str4.equals(skin.overlayColor)) {
            return false;
        }
        if (!Arrays.equals(this.dataColors, skin.dataColors)) {
            return false;
        }
        String str5 = this.imageUrl;
        if (str5 == null ? skin.imageUrl != null : !str5.equals(skin.imageUrl)) {
            return false;
        }
        String str6 = this.logoUrl;
        String str7 = skin.logoUrl;
        return str6 != null ? str6.equals(str7) : str7 == null;
    }

    public int hashCode() {
        String str = this.borderColor;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.maskColor;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.overlayColor;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String[] strArr = this.dataColors;
        int hashCode5 = (hashCode4 + (strArr != null ? strArr.hashCode() : 0)) * 31;
        String str5 = this.imageUrl;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.imageFit) * 31;
        String str6 = this.logoUrl;
        return ((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.logoFit) * 31) + this.join;
    }
}
