package a8;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pk.x0;

/* loaded from: classes3.dex */
public abstract class p0 {

    /* renamed from: a */
    public static final Pattern f1445a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b */
    public static final Pattern f1446b = Pattern.compile("^([a-z])=$");

    /* renamed from: c */
    public static final Pattern f1447c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: d */
    public static final Pattern f1448d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static void a(n0 n0Var, a aVar) {
        try {
            ((x0) n0Var.f1404d).e(aVar.a());
        } catch (IllegalArgumentException | IllegalStateException e13) {
            throw ParserException.b(null, e13);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static o0 b(String str) {
        char c13;
        char c14;
        n0 n0Var = new n0();
        String str2 = j0.f1378h;
        if (!str.contains(str2)) {
            str2 = j0.f1377g;
        }
        int i13 = d7.n0.f53866a;
        char c15 = 65535;
        String[] split = str.split(str2, -1);
        int length = split.length;
        a aVar = null;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < length) {
            String str3 = split[i14];
            if (!"".equals(str3)) {
                Matcher matcher = f1445a.matcher(str3);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    String group2 = matcher.group(2);
                    group2.getClass();
                    switch (group.hashCode()) {
                        case 97:
                            if (group.equals("a")) {
                                c13 = 11;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                            if (group.equals("b")) {
                                c13 = '\b';
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                            if (group.equals("c")) {
                                c13 = 7;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 100:
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE /* 103 */:
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE /* 108 */:
                        case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                        case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL /* 113 */:
                        case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                        default:
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                            if (group.equals("e")) {
                                c13 = 5;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                            if (group.equals("i")) {
                                c13 = 3;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER /* 107 */:
                            if (group.equals("k")) {
                                c13 = '\n';
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL /* 109 */:
                            if (group.equals("m")) {
                                c13 = '\f';
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                            if (group.equals("o")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                            if (group.equals("p")) {
                                c13 = 6;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER /* 114 */:
                            if (group.equals("r")) {
                                c13 = '\r';
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                            if (group.equals("s")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW /* 116 */:
                            if (group.equals("t")) {
                                c13 = '\t';
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN /* 117 */:
                            if (group.equals("u")) {
                                c13 = 4;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL /* 118 */:
                            if (group.equals("v")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN /* 122 */:
                            if (group.equals("z")) {
                                c13 = 14;
                                break;
                            }
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            c14 = 65535;
                            if (!"0".equals(group2)) {
                                throw ParserException.b("SDP version " + group2 + " is not supported.", null);
                            }
                            continue;
                            i14++;
                            c15 = c14;
                        case 1:
                            c14 = 65535;
                            n0Var.f1405e = group2;
                            continue;
                            i14++;
                            c15 = c14;
                        case 2:
                            c14 = 65535;
                            n0Var.f1401a = group2;
                            continue;
                            i14++;
                            c15 = c14;
                        case 3:
                            c14 = 65535;
                            if (!z13) {
                                if (aVar == null) {
                                    n0Var.f1409i = group2;
                                    continue;
                                } else {
                                    aVar.f1278f = group2;
                                }
                            }
                            i14++;
                            c15 = c14;
                        case 4:
                            c14 = 65535;
                            n0Var.f1412l = Uri.parse(group2);
                            continue;
                            i14++;
                            c15 = c14;
                        case 5:
                            c14 = 65535;
                            n0Var.f1410j = group2;
                            continue;
                            i14++;
                            c15 = c14;
                        case 6:
                            c14 = 65535;
                            n0Var.f1411k = group2;
                            continue;
                            i14++;
                            c15 = c14;
                        case 7:
                            c14 = 65535;
                            if (!z13) {
                                if (aVar == null) {
                                    n0Var.f1407g = group2;
                                    continue;
                                } else {
                                    aVar.f1279g = group2;
                                }
                            }
                            i14++;
                            c15 = c14;
                        case '\b':
                            if (!z13) {
                                c14 = 65535;
                                String[] split2 = group2.split(":\\s?", -1);
                                bf.b.i(split2.length == 2);
                                int parseInt = Integer.parseInt(split2[1]);
                                if (aVar == null) {
                                    n0Var.f1402b = parseInt * 1000;
                                    continue;
                                } else {
                                    aVar.f1276d = parseInt * 1000;
                                }
                                i14++;
                                c15 = c14;
                            }
                            break;
                        case '\t':
                            n0Var.f1406f = group2;
                            break;
                        case '\n':
                            if (!z13) {
                                if (aVar != null) {
                                    aVar.f1280h = group2;
                                    break;
                                } else {
                                    n0Var.f1408h = group2;
                                    break;
                                }
                            }
                            break;
                        case 11:
                            if (!z13) {
                                Matcher matcher2 = f1447c.matcher(group2);
                                if (!matcher2.matches()) {
                                    throw ParserException.b("Malformed Attribute line: " + str3, null);
                                }
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                String group4 = matcher2.group(2);
                                String str4 = group4 != null ? group4 : "";
                                if (aVar != null) {
                                    ((HashMap) aVar.f1281i).put(group3, str4);
                                    break;
                                } else {
                                    ((HashMap) n0Var.f1403c).put(group3, str4);
                                    break;
                                }
                            }
                            break;
                        case '\f':
                            if (aVar != null) {
                                a(n0Var, aVar);
                            }
                            Matcher matcher3 = f1448d.matcher(group2);
                            if (!matcher3.matches()) {
                                throw ParserException.b("Malformed SDP media description line: ".concat(group2), null);
                            }
                            String group5 = matcher3.group(1);
                            group5.getClass();
                            String group6 = matcher3.group(2);
                            group6.getClass();
                            String group7 = matcher3.group(3);
                            group7.getClass();
                            String group8 = matcher3.group(4);
                            group8.getClass();
                            try {
                                aVar = new a(group5, Integer.parseInt(group6), group7, Integer.parseInt(group8));
                            } catch (NumberFormatException e13) {
                                d7.u.h("SDPParser", "Malformed SDP media description line: ".concat(group2), e13);
                                aVar = null;
                            }
                            if (aVar != null) {
                                z13 = false;
                                break;
                            } else {
                                z13 = true;
                                break;
                            }
                    }
                    c14 = 65535;
                    i14++;
                    c15 = c14;
                } else {
                    Matcher matcher4 = f1446b.matcher(str3);
                    if (!matcher4.matches() || !Objects.equals(matcher4.group(1), "i")) {
                        throw ParserException.b("Malformed SDP line: " + str3, null);
                    }
                }
            }
            c14 = c15;
            i14++;
            c15 = c14;
        }
        if (aVar != null) {
            a(n0Var, aVar);
        }
        try {
            return new o0(n0Var);
        } catch (IllegalArgumentException | IllegalStateException e14) {
            throw ParserException.b(null, e14);
        }
    }
}
