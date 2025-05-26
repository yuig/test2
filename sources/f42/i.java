package f42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final g Companion;
    public static final i LENS = new i("LENS", 0);
    public static final i CLOSEUP = new i("CLOSEUP", 1);
    public static final i SEARCH = new i("SEARCH", 2);
    public static final i DEEP_LINKING = new i("DEEP_LINKING", 3);
    public static final i ANDROID_DOWNLOAD_COMPLETE_TOAST = new i("ANDROID_DOWNLOAD_COMPLETE_TOAST", 4);
    public static final i HOME_FEED_EDUCATION_BANNER = new i("HOME_FEED_EDUCATION_BANNER", 5);
    public static final i PRODUCT_TAGGING = new i("PRODUCT_TAGGING", 6);

    private static final /* synthetic */ i[] $values() {
        return new i[]{LENS, CLOSEUP, SEARCH, DEEP_LINKING, ANDROID_DOWNLOAD_COMPLETE_TOAST, HOME_FEED_EDUCATION_BANNER, PRODUCT_TAGGING};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new g();
    }

    private i(String str, int i13) {
    }

    public static final i findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return LENS;
            case 1:
                return CLOSEUP;
            case 2:
                return SEARCH;
            case 3:
                return DEEP_LINKING;
            case 4:
                return ANDROID_DOWNLOAD_COMPLETE_TOAST;
            case 5:
                return HOME_FEED_EDUCATION_BANNER;
            case 6:
                return PRODUCT_TAGGING;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (h.f61075a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
