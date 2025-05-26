package d7;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f53823a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f53824b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f53825c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f53826d;

    static {
        HashMap hashMap = new HashMap();
        f53826d = hashMap;
        a.c.o(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        g.v(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        a.c.o(-983041, hashMap, "azure", -657956, "beige");
        a.c.o(-6972, hashMap, "bisque", -16777216, "black");
        a.c.o(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        a.c.o(-7722014, hashMap, "blueviolet", -5952982, "brown");
        a.c.o(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        a.c.o(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        a.c.o(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        a.c.o(-1828, hashMap, "cornsilk", -2354116, "crimson");
        g.v(hashMap, "cyan", -16711681, -16777077, "darkblue");
        a.c.o(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        g.v(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        g.v(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        a.c.o(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        a.c.o(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        a.c.o(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        a.c.o(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        g.v(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        a.c.o(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        g.v(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        a.c.o(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        g.v(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        a.c.o(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        a.c.o(-16744448, hashMap, "green", -5374161, "greenyellow");
        g.v(hashMap, "grey", -8355712, -983056, "honeydew");
        a.c.o(-38476, hashMap, "hotpink", -3318692, "indianred");
        a.c.o(-11861886, hashMap, "indigo", -16, "ivory");
        a.c.o(-989556, hashMap, "khaki", -1644806, "lavender");
        a.c.o(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        a.c.o(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        a.c.o(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        a.c.o(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        a.c.o(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        g.v(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        a.c.o(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        a.c.o(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        a.c.o(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        a.c.o(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        a.c.o(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        a.c.o(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        a.c.o(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        a.c.o(-6943, hashMap, "mistyrose", -6987, "moccasin");
        a.c.o(-8531, hashMap, "navajowhite", -16777088, "navy");
        a.c.o(-133658, hashMap, "oldlace", -8355840, "olive");
        a.c.o(-9728477, hashMap, "olivedrab", -23296, "orange");
        a.c.o(-47872, hashMap, "orangered", -2461482, "orchid");
        a.c.o(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        a.c.o(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        a.c.o(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        a.c.o(-3308225, hashMap, "peru", -16181, "pink");
        a.c.o(-2252579, hashMap, "plum", -5185306, "powderblue");
        a.c.o(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        a.c.o(-65536, hashMap, "red", -4419697, "rosybrown");
        a.c.o(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        a.c.o(-360334, hashMap, "salmon", -744352, "sandybrown");
        a.c.o(-13726889, hashMap, "seagreen", -2578, "seashell");
        a.c.o(-6270419, hashMap, "sienna", -4144960, "silver");
        a.c.o(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        g.v(hashMap, "snow", -1286, -16711809, "springgreen");
        a.c.o(-12156236, hashMap, "steelblue", -2968436, "tan");
        a.c.o(-16744320, hashMap, "teal", -2572328, "thistle");
        a.c.o(-40121, hashMap, "tomato", 0, "transparent");
        a.c.o(-12525360, hashMap, "turquoise", -1146130, "violet");
        a.c.o(-663885, hashMap, "wheat", -1, "white");
        a.c.o(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z13) {
        int parseInt;
        bf.b.i(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z13 ? f53825c : f53824b).matcher(replace);
            if (matcher.matches()) {
                if (z13) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f53823a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) f53826d.get(com.bumptech.glide.c.q1(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
