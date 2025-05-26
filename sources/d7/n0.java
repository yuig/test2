package d7;

import a.cb;
import a7.o0;
import a7.v0;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pk.c1;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a */
    public static final int f53866a;

    /* renamed from: b */
    public static final String f53867b;

    /* renamed from: c */
    public static final byte[] f53868c;

    /* renamed from: d */
    public static final long[] f53869d;

    /* renamed from: e */
    public static final Pattern f53870e;

    /* renamed from: f */
    public static final Pattern f53871f;

    /* renamed from: g */
    public static final Pattern f53872g;

    /* renamed from: h */
    public static final Pattern f53873h;

    /* renamed from: i */
    public static HashMap f53874i;

    /* renamed from: j */
    public static final String[] f53875j;

    /* renamed from: k */
    public static final String[] f53876k;

    /* renamed from: l */
    public static final int[] f53877l;

    /* renamed from: m */
    public static final int[] f53878m;

    /* renamed from: n */
    public static final int[] f53879n;

    static {
        int i13 = Build.VERSION.SDK_INT;
        f53866a = i13;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f53867b = str + ", " + Build.MODEL + ", " + str2 + ", " + i13;
        f53868c = new byte[0];
        f53869d = new long[0];
        f53870e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f53871f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f53872g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f53873h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f53875j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f53876k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f53877l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f53878m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f53879n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER, 98, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, 72, 79, 70, 65, 84, 83, 90, 93, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER, RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE, RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM, RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP, RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER, RecyclerViewTypes.VIEW_TYPE_TODAY_ARTICLE_BOARD_SECTION_HEADER, RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE, RecyclerViewTypes.VIEW_TYPE_USER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM, RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM, RecyclerViewTypes.VIEW_TYPE_STELA_IN_FLASHLIGHT_ONE_COLUMN, RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_LEGO_EMPTY_STATE_MESSAGE, RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP, RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_TOPIC_TILE, RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY, 201, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER, RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION, RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER, RecyclerViewTypes.VIEW_TYPE_CONVERSATION_GIF_REACTION, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_RELATED_ARTICLES_HEADER, 255, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER, RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM, RecyclerViewTypes.VIEW_TYPE_BUBBLE_STACKED_COLLAGE_DISPLAY_CARD_REP, RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER, RecyclerViewTypes.VIEW_TYPE_PROFILE_BOARDLESS_PINS_HEADER, RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_LIST_ITEM, RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP, RecyclerViewTypes.VIEW_TYPE_BUBBLE_STYLE_REP, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_GRID_REP, RecyclerViewTypes.VIEW_TYPE_ICON_AND_TEXT_INLINE_BUBBLE, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR, RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE, RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS, RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL, RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY, RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE, RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, 97, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_VIDEO, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_BUBBLE_DEFAULT_REP, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_REP, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING, RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM, RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO, RecyclerViewTypes.VIEW_TYPE_STORY_GROUP_MY_PINS, RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT, RecyclerViewTypes.VIEW_TYPE_BOARD_MORE_IDEAS_UPSELL_CARD, RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER, 200, RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE, RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER, RecyclerViewTypes.VIEW_TYPE_GO_TO_HOME_FEED_FOOTER, RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, 96, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, RecyclerViewTypes.VIEW_TYPE_SIMPLE_IMAGE_CELL, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID, RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN, RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT, 160, RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD, RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD, RecyclerViewTypes.VIEW_TYPE_BUBBLE_NAVIGATION_REP, RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD, RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD, RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY, RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM_TINTED, RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL, RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN, RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE, RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER, RecyclerViewTypes.VIEW_TYPE_OVERSCROLL_SEARCH_CELL, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER, RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE, RecyclerViewTypes.VIEW_TYPE_STORY_SELECT_OR_REORDER_PINS, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL, 250, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION, RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM};
    }

    public static int A(String str) {
        String[] split;
        int length;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z13 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            return z13 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String B(int i13) {
        if (i13 == 0) {
            return "NO";
        }
        if (i13 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i13 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i13 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i13 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String C(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long D(long j13, float f13) {
        return f13 == 1.0f ? j13 : Math.round(j13 * f13);
    }

    public static long E(long j13) {
        return j13 == -9223372036854775807L ? System.currentTimeMillis() : j13 + SystemClock.elapsedRealtime();
    }

    public static int F(int i13) {
        if (i13 == 8) {
            return 3;
        }
        if (i13 == 16) {
            return 2;
        }
        if (i13 != 24) {
            return i13 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int G(int i13, int i14) {
        return u(i13) * i14;
    }

    public static long H(long j13, float f13) {
        return f13 == 1.0f ? j13 : Math.round(j13 / f13);
    }

    public static String I(StringBuilder sb3, Formatter formatter, long j13) {
        if (j13 == -9223372036854775807L) {
            j13 = 0;
        }
        String str = j13 < 0 ? "-" : "";
        long abs = (Math.abs(j13) + 500) / 1000;
        long j14 = abs % 60;
        long j15 = (abs / 60) % 60;
        long j16 = abs / 3600;
        sb3.setLength(0);
        return j16 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j16), Long.valueOf(j15), Long.valueOf(j14)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j15), Long.valueOf(j14)).toString();
    }

    public static String[] J() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f53866a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{C(configuration.locale)};
        for (int i13 = 0; i13 < split.length; i13++) {
            split[i13] = Z(split[i13]);
        }
        return split;
    }

    public static String K(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e13) {
            u.d("Util", "Failed to read system property ".concat(str), e13);
            return null;
        }
    }

    public static String L(int i13) {
        switch (i13) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i13 >= 10000 ? a.a.e("custom (", i13, ")") : "?";
        }
    }

    public static String M(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        return a.a.p(cb.o("Pinterest/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") AndroidXMedia3/1.6.1");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean N(a7.v0 r3) {
        /*
            int r0 = r3.L()
            r1 = 1
            if (r0 != r1) goto L13
            r2 = 2
            boolean r2 = r3.r(r2)
            if (r2 == 0) goto L13
            r3.b()
        L11:
            r0 = r1
            goto L21
        L13:
            r2 = 4
            if (r0 != r2) goto L20
            boolean r0 = r3.r(r2)
            if (r0 == 0) goto L20
            r3.k()
            goto L11
        L20:
            r0 = 0
        L21:
            boolean r2 = r3.r(r1)
            if (r2 == 0) goto L2b
            r3.play()
            goto L2c
        L2b:
            r1 = r0
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.n0.N(a7.v0):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static int O(Uri uri, String str) {
        int i13;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && (com.bumptech.glide.c.z("rtsp", scheme) || com.bumptech.glide.c.z("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String q13 = com.bumptech.glide.c.q1(lastPathSegment.substring(lastIndexOf + 1));
            q13.getClass();
            switch (q13.hashCode()) {
                case 104579:
                    if (q13.equals("ism")) {
                        break;
                    }
                    break;
                case 108321:
                    if (q13.equals("mpd")) {
                        break;
                    }
                    break;
                case 3242057:
                    if (q13.equals("isml")) {
                        break;
                    }
                    break;
                case 3299913:
                    if (q13.equals("m3u8")) {
                        break;
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                */
            /*
                Method dump skipped, instructions count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.n0.O(android.net.Uri, java.lang.String):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean P(d7.d0 r3, d7.d0 r4, java.util.zip.Inflater r5) {
            /*
                int r0 = r3.a()
                r1 = 0
                if (r0 > 0) goto L8
                return r1
            L8:
                byte[] r0 = r4.f53806a
                int r0 = r0.length
                int r2 = r3.a()
                if (r0 >= r2) goto L1a
                int r0 = r3.a()
                int r0 = r0 * 2
                r4.b(r0)
            L1a:
                if (r5 != 0) goto L21
                java.util.zip.Inflater r5 = new java.util.zip.Inflater
                r5.<init>()
            L21:
                byte[] r0 = r3.f53806a
                int r2 = r3.f53807b
                int r3 = r3.a()
                r5.setInput(r0, r2, r3)
                r3 = r1
            L2d:
                byte[] r0 = r4.f53806a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                int r2 = r2 - r3
                int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                int r3 = r3 + r0
                boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                if (r0 == 0) goto L46
                r4.J(r3)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                r5.reset()
                r3 = 1
                return r3
            L44:
                r3 = move-exception
                goto L63
            L46:
                boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                if (r0 != 0) goto L5f
                boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                if (r0 == 0) goto L53
                goto L5f
            L53:
                byte[] r0 = r4.f53806a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                if (r3 != r2) goto L2d
                int r0 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                int r0 = r0 * 2
                r4.b(r0)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
                goto L2d
            L5f:
                r5.reset()
                return r1
            L63:
                r5.reset()
                throw r3
            L67:
                r5.reset()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.n0.P(d7.d0, d7.d0, java.util.zip.Inflater):boolean");
        }

        public static void Q(int i13) {
            Integer.toString(i13, 36);
        }

        public static boolean R(int i13) {
            return i13 == 3 || i13 == 2 || i13 == 268435456 || i13 == 21 || i13 == 1342177280 || i13 == 22 || i13 == 1610612736 || i13 == 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            if (com.bumptech.glide.c.z(r2, "rmx3231") == false) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean S(android.content.Context r2) {
            /*
                int r0 = d7.n0.f53866a
                r1 = 29
                if (r0 < r1) goto L35
                android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
                int r2 = r2.targetSdkVersion
                if (r2 < r1) goto L35
                r2 = 30
                if (r0 != r2) goto L24
                java.lang.String r2 = android.os.Build.MODEL
                java.lang.String r1 = "moto g(20)"
                boolean r1 = com.bumptech.glide.c.z(r2, r1)
                if (r1 != 0) goto L35
                java.lang.String r1 = "rmx3231"
                boolean r2 = com.bumptech.glide.c.z(r2, r1)
                if (r2 != 0) goto L35
            L24:
                r2 = 34
                if (r0 != r2) goto L33
                java.lang.String r2 = android.os.Build.MODEL
                java.lang.String r0 = "sm-x200"
                boolean r2 = com.bumptech.glide.c.z(r2, r0)
                if (r2 == 0) goto L33
                goto L35
            L33:
                r2 = 0
                goto L36
            L35:
                r2 = 1
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d7.n0.S(android.content.Context):boolean");
        }

        public static boolean T(int i13) {
            return i13 == 10 || i13 == 13;
        }

        public static boolean U(Context context) {
            UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        }

        public static String V(Context context, String str) {
            InputStream inputStream = null;
            try {
                inputStream = context.getAssets().open(str);
                return q(qk.e.b(inputStream));
            } finally {
                g(inputStream);
            }
        }

        public static String W(String str) {
            int i13 = 0;
            while (true) {
                String[] strArr = f53876k;
                if (i13 >= strArr.length) {
                    return str;
                }
                if (str.startsWith(strArr[i13])) {
                    return strArr[i13 + 1] + str.substring(strArr[i13].length());
                }
                i13 += 2;
            }
        }

        public static long X(long j13) {
            return (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? j13 : j13 * 1000;
        }

        public static ScheduledExecutorService Y(final String str) {
            return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: d7.m0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return new Thread(runnable, str);
                }
            });
        }

        public static String Z(String str) {
            if (str == null) {
                return null;
            }
            String replace = str.replace('_', '-');
            if (!replace.isEmpty() && !replace.equals("und")) {
                str = replace;
            }
            String q13 = com.bumptech.glide.c.q1(str);
            String str2 = q13.split("-", 2)[0];
            if (f53874i == null) {
                String[] iSOLanguages = Locale.getISOLanguages();
                int length = iSOLanguages.length;
                String[] strArr = f53875j;
                HashMap hashMap = new HashMap(length + strArr.length);
                for (String str3 : iSOLanguages) {
                    try {
                        String iSO3Language = new Locale(str3).getISO3Language();
                        if (!TextUtils.isEmpty(iSO3Language)) {
                            hashMap.put(iSO3Language, str3);
                        }
                    } catch (MissingResourceException unused) {
                    }
                }
                for (int i13 = 0; i13 < strArr.length; i13 += 2) {
                    hashMap.put(strArr[i13], strArr[i13 + 1]);
                }
                f53874i = hashMap;
            }
            String str4 = (String) f53874i.get(str2);
            if (str4 != null) {
                StringBuilder i14 = n60.o.i(str4);
                i14.append(q13.substring(str2.length()));
                q13 = i14.toString();
                str2 = str4;
            }
            return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? W(q13) : q13;
        }

        public static int a(long[] jArr, long j13, boolean z13) {
            int i13;
            int binarySearch = Arrays.binarySearch(jArr, j13);
            if (binarySearch < 0) {
                return ~binarySearch;
            }
            while (true) {
                i13 = binarySearch + 1;
                if (i13 >= jArr.length || jArr[i13] != j13) {
                    break;
                }
                binarySearch = i13;
            }
            return z13 ? binarySearch : i13;
        }

        public static Object[] a0(int i13, Object[] objArr) {
            bf.b.i(i13 <= objArr.length);
            return Arrays.copyOf(objArr, i13);
        }

        public static int b(l0.k kVar, long j13) {
            int i13 = kVar.f81235b - 1;
            int i14 = 0;
            while (i14 <= i13) {
                int i15 = (i14 + i13) >>> 1;
                if (kVar.m(i15) < j13) {
                    i14 = i15 + 1;
                } else {
                    i13 = i15 - 1;
                }
            }
            int i16 = i13 + 1;
            if (i16 < kVar.f81235b && kVar.m(i16) == j13) {
                return i16;
            }
            if (i13 == -1) {
                return 0;
            }
            return i13;
        }

        public static long b0(String str) {
            Matcher matcher = f53870e.matcher(str);
            if (!matcher.matches()) {
                throw ParserException.a("Invalid date/time format: " + str, null);
            }
            int i13 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i13 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i13 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i13 != 0 ? timeInMillis - (i13 * 60000) : timeInMillis;
        }

        public static int c(c1 c1Var, Long l13, boolean z13) {
            int i13;
            int binarySearch = Collections.binarySearch(c1Var, l13);
            if (binarySearch < 0) {
                i13 = -(binarySearch + 2);
            } else {
                while (true) {
                    int i14 = binarySearch - 1;
                    if (i14 < 0 || ((Comparable) c1Var.get(i14)).compareTo(l13) != 0) {
                        break;
                    }
                    binarySearch = i14;
                }
                i13 = binarySearch;
            }
            return z13 ? Math.max(0, i13) : i13;
        }

        public static void c0(Handler handler, Runnable runnable) {
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }

        public static int d(int[] iArr, int i13, boolean z13, boolean z14) {
            int i14;
            int i15;
            int binarySearch = Arrays.binarySearch(iArr, i13);
            if (binarySearch < 0) {
                i15 = -(binarySearch + 2);
            } else {
                while (true) {
                    i14 = binarySearch - 1;
                    if (i14 < 0 || iArr[i14] != i13) {
                        break;
                    }
                    binarySearch = i14;
                }
                i15 = z13 ? binarySearch : i14;
            }
            return z14 ? Math.max(0, i15) : i15;
        }

        public static void d0(int i13, int i14, List list) {
            if (i13 < 0 || i14 > list.size() || i13 > i14) {
                throw new IllegalArgumentException();
            }
            if (i13 != i14) {
                list.subList(i13, i14).clear();
            }
        }

        public static int e(long[] jArr, long j13, boolean z13) {
            int i13;
            int binarySearch = Arrays.binarySearch(jArr, j13);
            if (binarySearch < 0) {
                i13 = -(binarySearch + 2);
            } else {
                while (true) {
                    int i14 = binarySearch - 1;
                    if (i14 < 0 || jArr[i14] != j13) {
                        break;
                    }
                    binarySearch = i14;
                }
                i13 = binarySearch;
            }
            return z13 ? Math.max(0, i13) : i13;
        }

        public static long e0(int i13, long j13) {
            return g0(j13, 1000000L, i13, RoundingMode.DOWN);
        }

        public static int f(int i13, int i14) {
            return ((i13 + i14) - 1) / i14;
        }

        public static void f0(long[] jArr, long j13) {
            RoundingMode roundingMode = RoundingMode.DOWN;
            int i13 = 0;
            if (j13 >= 1000000 && j13 % 1000000 == 0) {
                long q13 = ue.c.q(j13, 1000000L, RoundingMode.UNNECESSARY);
                while (i13 < jArr.length) {
                    jArr[i13] = ue.c.q(jArr[i13], q13, roundingMode);
                    i13++;
                }
                return;
            }
            if (j13 < 1000000 && 1000000 % j13 == 0) {
                long q14 = ue.c.q(1000000L, j13, RoundingMode.UNNECESSARY);
                while (i13 < jArr.length) {
                    jArr[i13] = ue.c.E(jArr[i13], q14);
                    i13++;
                }
                return;
            }
            for (int i14 = 0; i14 < jArr.length; i14++) {
                long j14 = jArr[i14];
                if (j14 != 0) {
                    if (j13 >= j14 && j13 % j14 == 0) {
                        jArr[i14] = ue.c.q(1000000L, ue.c.q(j13, j14, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (j13 >= j14 || j14 % j13 != 0) {
                        jArr[i14] = h0(j14, 1000000L, j13, roundingMode);
                    } else {
                        jArr[i14] = ue.c.E(1000000L, ue.c.q(j14, j13, RoundingMode.UNNECESSARY));
                    }
                }
            }
        }

        public static void g(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }

        public static long g0(long j13, long j14, long j15, RoundingMode roundingMode) {
            if (j13 == 0 || j14 == 0) {
                return 0L;
            }
            return (j15 < j14 || j15 % j14 != 0) ? (j15 >= j14 || j14 % j15 != 0) ? (j15 < j13 || j15 % j13 != 0) ? (j15 >= j13 || j13 % j15 != 0) ? h0(j13, j14, j15, roundingMode) : ue.c.E(j14, ue.c.q(j13, j15, RoundingMode.UNNECESSARY)) : ue.c.q(j14, ue.c.q(j15, j13, RoundingMode.UNNECESSARY), roundingMode) : ue.c.E(j13, ue.c.q(j14, j15, RoundingMode.UNNECESSARY)) : ue.c.q(j13, ue.c.q(j15, j14, RoundingMode.UNNECESSARY), roundingMode);
        }

        public static float h(float f13, float f14, float f15) {
            return Math.max(f14, Math.min(f13, f15));
        }

        public static long h0(long j13, long j14, long j15, RoundingMode roundingMode) {
            long E = ue.c.E(j13, j14);
            if (E != Long.MAX_VALUE && E != Long.MIN_VALUE) {
                return ue.c.q(E, j15, roundingMode);
            }
            long r13 = ue.c.r(Math.abs(j14), Math.abs(j15));
            RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
            long q13 = ue.c.q(j14, r13, roundingMode2);
            long q14 = ue.c.q(j15, r13, roundingMode2);
            long r14 = ue.c.r(Math.abs(j13), Math.abs(q14));
            long q15 = ue.c.q(j13, r14, roundingMode2);
            long q16 = ue.c.q(q14, r14, roundingMode2);
            long E2 = ue.c.E(q15, q13);
            if (E2 != Long.MAX_VALUE && E2 != Long.MIN_VALUE) {
                return ue.c.q(E2, q16, roundingMode);
            }
            double d2 = q15 * (q13 / q16);
            if (d2 > 9.223372036854776E18d) {
                return Long.MAX_VALUE;
            }
            if (d2 < -9.223372036854776E18d) {
                return Long.MIN_VALUE;
            }
            return rk.c.e(d2, roundingMode);
        }

        public static int i(int i13, int i14, int i15) {
            return Math.max(i14, Math.min(i13, i15));
        }

        public static boolean i0(v0 v0Var, boolean z13) {
            if (v0Var == null || !v0Var.z() || v0Var.L() == 1 || v0Var.L() == 4) {
                return true;
            }
            return z13 && v0Var.u() != 0;
        }

        public static long j(long j13, long j14, long j15) {
            return Math.max(j14, Math.min(j13, j15));
        }

        public static void j0(Throwable th3) {
            throw th3;
        }

        public static boolean k(SparseArray sparseArray, int i13) {
            return sparseArray.indexOfKey(i13) >= 0;
        }

        public static String[] k0(String str, String str2) {
            return str.split(str2, -1);
        }

        public static boolean l(Object[] objArr, Object obj) {
            for (Object obj2 : objArr) {
                if (Objects.equals(obj2, obj)) {
                    return true;
                }
            }
            return false;
        }

        public static String[] l0(String str) {
            return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
        }

        public static int m(int i13, int i14, int i15, byte[] bArr) {
            while (i13 < i14) {
                i15 = f53877l[((i15 >>> 24) ^ (bArr[i13] & 255)) & 255] ^ (i15 << 8);
                i13++;
            }
            return i15;
        }

        public static boolean m0(SQLiteDatabase sQLiteDatabase, String str) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
        }

        public static Handler n(Handler.Callback callback) {
            Looper myLooper = Looper.myLooper();
            bf.b.w(myLooper);
            return new Handler(myLooper, callback);
        }

        public static String n0(byte[] bArr) {
            StringBuilder sb3 = new StringBuilder(bArr.length * 2);
            for (int i13 = 0; i13 < bArr.length; i13++) {
                sb3.append(Character.forDigit((bArr[i13] >> 4) & 15, 16));
                sb3.append(Character.forDigit(bArr[i13] & 15, 16));
            }
            return sb3.toString();
        }

        public static Handler o(z7.e eVar) {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = Looper.getMainLooper();
            }
            return new Handler(myLooper, eVar);
        }

        public static long o0(long j13) {
            return (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? j13 : j13 / 1000;
        }

        public static String p(String str, Object... objArr) {
            return String.format(Locale.US, str, objArr);
        }

        public static String q(byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }

        public static int r(int i13) {
            if (i13 == 20) {
                return 30;
            }
            if (i13 == 22) {
                return 31;
            }
            if (i13 == 30) {
                return 34;
            }
            switch (i13) {
                case 2:
                case 3:
                    return 3;
                case 4:
                case 5:
                case 6:
                    return 21;
                case 7:
                case 8:
                    return 23;
                case 9:
                case 10:
                case 11:
                case 12:
                    return 28;
                default:
                    switch (i13) {
                        case 14:
                            return 25;
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            return 28;
                        default:
                            return Integer.MAX_VALUE;
                    }
            }
        }

        public static AudioFormat s(int i13, int i14, int i15) {
            return new AudioFormat.Builder().setSampleRate(i13).setChannelMask(i14).setEncoding(i15).build();
        }

        public static int t(int i13) {
            int i14 = f53866a;
            if (i13 == 10) {
                return i14 >= 32 ? 737532 : 6396;
            }
            if (i13 == 12) {
                return 743676;
            }
            if (i13 == 24) {
                return i14 >= 32 ? 67108860 : 0;
            }
            switch (i13) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR;
                case 5:
                    return RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER;
                case 6:
                    return RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
                default:
                    return 0;
            }
        }

        public static int u(int i13) {
            if (i13 != 2) {
                if (i13 == 3) {
                    return 1;
                }
                if (i13 != 4) {
                    if (i13 != 21) {
                        if (i13 != 22) {
                            if (i13 != 268435456) {
                                if (i13 != 1342177280) {
                                    if (i13 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 2;
        }

        public static byte[] v(String str) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = i13 * 2;
                bArr[i13] = (byte) (Character.digit(str.charAt(i14 + 1), 16) + (Character.digit(str.charAt(i14), 16) << 4));
            }
            return bArr;
        }

        public static int w(int i13, String str) {
            int i14 = 0;
            for (String str2 : l0(str)) {
                if (i13 == o0.j(o0.f(str2))) {
                    i14++;
                }
            }
            return i14;
        }

        public static String x(int i13, String str) {
            String[] l03 = l0(str);
            if (l03.length == 0) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (String str2 : l03) {
                if (i13 == o0.j(o0.f(str2))) {
                    if (sb3.length() > 0) {
                        sb3.append(",");
                    }
                    sb3.append(str2);
                }
            }
            if (sb3.length() > 0) {
                return sb3.toString();
            }
            return null;
        }

        public static String y(Context context) {
            TelephonyManager telephonyManager;
            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty(networkCountryIso)) {
                    return com.bumptech.glide.c.r1(networkCountryIso);
                }
            }
            return com.bumptech.glide.c.r1(Locale.getDefault().getCountry());
        }

        public static int z(int i13) {
            if (i13 == 2 || i13 == 4) {
                return 6005;
            }
            if (i13 == 10) {
                return 6004;
            }
            if (i13 == 7) {
                return 6005;
            }
            if (i13 == 8) {
                return 6003;
            }
            switch (i13) {
                case 15:
                    return 6003;
                case 16:
                case 18:
                    return 6005;
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                    return 6004;
                default:
                    switch (i13) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            return 6002;
                        default:
                            return 6006;
                    }
            }
        }
    }
