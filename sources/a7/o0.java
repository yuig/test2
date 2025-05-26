package a7;

import android.text.TextUtils;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a */
    public static final ArrayList f1156a = new ArrayList();

    /* renamed from: b */
    public static final Pattern f1157b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        q5.u h10;
        int a13;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (h10 = h(str2)) != null && (a13 = h10.a()) != 0 && a13 != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : d7.n0.l0(str)) {
            String f13 = f(str2);
            if (f13 != null && m(f13)) {
                return f13;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] l03 = d7.n0.l0(str);
        StringBuilder sb3 = new StringBuilder();
        for (String str3 : l03) {
            if (str2.equals(f(str3))) {
                if (sb3.length() > 0) {
                    sb3.append(",");
                }
                sb3.append(str3);
            }
        }
        if (sb3.length() > 0) {
            return sb3.toString();
        }
        return null;
    }

    public static void d() {
        ArrayList arrayList = f1156a;
        if (arrayList.size() <= 0) {
            return;
        }
        ep.b.A(arrayList.get(0));
        throw null;
    }

    public static int e(String str, String str2) {
        q5.u h10;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (h10 = h(str2)) == null) {
                    return 0;
                }
                return h10.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String f(String str) {
        q5.u h10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String q13 = com.bumptech.glide.c.q1(str.trim());
        if (q13.startsWith("avc1") || q13.startsWith("avc3")) {
            return "video/avc";
        }
        if (q13.startsWith("hev1") || q13.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (q13.startsWith("dvav") || q13.startsWith("dva1") || q13.startsWith("dvhe") || q13.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (q13.startsWith("av01")) {
            return "video/av01";
        }
        if (q13.startsWith("vp9") || q13.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (q13.startsWith("vp8") || q13.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (q13.startsWith("mp4a")) {
            if (q13.startsWith("mp4a.") && (h10 = h(q13)) != null) {
                str2 = g(h10.f102514a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (q13.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (q13.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (q13.startsWith("ac-3") || q13.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (q13.startsWith("ec-3") || q13.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (q13.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (q13.startsWith("ac-4") || q13.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (q13.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (q13.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (q13.startsWith("dtsh") || q13.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (q13.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (q13.startsWith("opus")) {
            return "audio/opus";
        }
        if (q13.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (q13.startsWith("flac")) {
            return "audio/flac";
        }
        if (q13.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (q13.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (q13.contains("cea708")) {
            return "application/cea-708";
        }
        if (q13.contains("eia608") || q13.contains("cea608")) {
            return "application/cea-608";
        }
        d();
        return null;
    }

    public static String g(int i13) {
        if (i13 == 32) {
            return "video/mp4v-es";
        }
        if (i13 == 33) {
            return "video/avc";
        }
        if (i13 == 35) {
            return "video/hevc";
        }
        if (i13 == 64) {
            return "audio/mp4a-latm";
        }
        if (i13 == 163) {
            return "video/wvc1";
        }
        if (i13 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i13 == 221) {
            return "audio/vorbis";
        }
        if (i13 == 165) {
            return "audio/ac3";
        }
        if (i13 == 166) {
            return "audio/eac3";
        }
        switch (i13) {
            case 96:
            case 97:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
            case 100:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                return "video/mpeg2";
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                return "audio/mp4a-latm";
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
            case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                return "audio/mpeg";
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                return "video/mpeg";
            case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                return "image/jpeg";
            default:
                switch (i13) {
                    case RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT /* 169 */:
                    case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE /* 172 */:
                        return "audio/vnd.dts";
                    case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE /* 170 */:
                    case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO /* 171 */:
                        return "audio/vnd.dts.hd";
                    case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO /* 173 */:
                        return "audio/opus";
                    case RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static q5.u h(String str) {
        Matcher matcher = f1157b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new q5.u(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int j(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m(str)) {
            return 1;
        }
        if (q(str)) {
            return 2;
        }
        if (p(str)) {
            return 3;
        }
        if (o(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        k();
        return -1;
    }

    public static void k() {
        ArrayList arrayList = f1156a;
        if (arrayList.size() <= 0) {
            return;
        }
        ep.b.A(arrayList.get(0));
        throw null;
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : d7.n0.l0(str)) {
            String f13 = f(str2);
            if (f13 != null && q(f13)) {
                return f13;
            }
        }
        return null;
    }

    public static boolean m(String str) {
        return "audio".equals(i(str));
    }

    public static boolean n(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean o(String str) {
        return "image".equals(i(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean p(String str) {
        return "text".equals(i(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean q(String str) {
        return "video".equals(i(str));
    }

    public static String r(String str) {
        String q13;
        if (str == null) {
            return null;
        }
        q13 = com.bumptech.glide.c.q1(str);
        q13.getClass();
        switch (q13) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return q13;
        }
    }
}
