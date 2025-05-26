package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    public static final n Companion;
    public static final p UNKNOWN = new p("UNKNOWN", 0);
    public static final p ANDROID_MOBILE = new p("ANDROID_MOBILE", 1);
    public static final p ANDROID_TABLET = new p("ANDROID_TABLET", 2);
    public static final p ANDROID_LITE = new p("ANDROID_LITE", 3);
    public static final p IPHONE_SHUFFLES = new p("IPHONE_SHUFFLES", 4);
    public static final p IPAD_SHUFFLES = new p("IPAD_SHUFFLES", 5);
    public static final p ANDROID_MOBILE_SHUFFLES = new p("ANDROID_MOBILE_SHUFFLES", 6);
    public static final p ANDROID_TABLET_SHUFFLES = new p("ANDROID_TABLET_SHUFFLES", 7);
    public static final p API_JAVA_SDK = new p("API_JAVA_SDK", 8);
    public static final p IPHONE_FITCHECK = new p("IPHONE_FITCHECK", 9);
    public static final p IPAD_FITCHECK = new p("IPAD_FITCHECK", 10);
    public static final p ANDROID_MOBILE_FITCHECK = new p("ANDROID_MOBILE_FITCHECK", 11);
    public static final p ANDROID_TABLET_FITCHECK = new p("ANDROID_TABLET_FITCHECK", 12);

    private static final /* synthetic */ p[] $values() {
        return new p[]{UNKNOWN, ANDROID_MOBILE, ANDROID_TABLET, ANDROID_LITE, IPHONE_SHUFFLES, IPAD_SHUFFLES, ANDROID_MOBILE_SHUFFLES, ANDROID_TABLET_SHUFFLES, API_JAVA_SDK, IPHONE_FITCHECK, IPAD_FITCHECK, ANDROID_MOBILE_FITCHECK, ANDROID_TABLET_FITCHECK};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new n();
    }

    private p(String str, int i13) {
    }

    public static final p findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return UNKNOWN;
        }
        if (i13 == 10) {
            return ANDROID_LITE;
        }
        if (i13 == 3) {
            return ANDROID_MOBILE;
        }
        if (i13 == 4) {
            return ANDROID_TABLET;
        }
        switch (i13) {
            case 13:
                return IPHONE_SHUFFLES;
            case 14:
                return IPAD_SHUFFLES;
            case 15:
                return ANDROID_MOBILE_SHUFFLES;
            case 16:
                return ANDROID_TABLET_SHUFFLES;
            case 17:
                return API_JAVA_SDK;
            case 18:
                return IPHONE_FITCHECK;
            case 19:
                return IPAD_FITCHECK;
            case 20:
                return ANDROID_MOBILE_FITCHECK;
            case 21:
                return ANDROID_TABLET_FITCHECK;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (o.f67168a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 10;
            case 5:
                return 13;
            case 6:
                return 14;
            case 7:
                return 15;
            case 8:
                return 16;
            case 9:
                return 17;
            case 10:
                return 18;
            case 11:
                return 19;
            case 12:
                return 20;
            case 13:
                return 21;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
