package c42;

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
    public static final i UNKNOWN = new i("UNKNOWN", 0);
    public static final i TAP_AUTH = new i("TAP_AUTH", 1);
    public static final i TAP_UNAUTH = new i("TAP_UNAUTH", 2);
    public static final i SWIPE = new i("SWIPE", 3);
    public static final i LINK = new i("LINK", 4);
    public static final i NOTIFICATION = new i("NOTIFICATION", 5);
    public static final i HOMEFEED = new i("HOMEFEED", 6);
    public static final i UNAUTH_PLP = new i("UNAUTH_PLP", 7);
    public static final i TOOLTIP = new i("TOOLTIP", 8);
    public static final i SEARCH_LANDING_PAGE = new i("SEARCH_LANDING_PAGE", 9);

    private static final /* synthetic */ i[] $values() {
        return new i[]{UNKNOWN, TAP_AUTH, TAP_UNAUTH, SWIPE, LINK, NOTIFICATION, HOMEFEED, UNAUTH_PLP, TOOLTIP, SEARCH_LANDING_PAGE};
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
                return UNKNOWN;
            case 1:
                return TAP_AUTH;
            case 2:
                return TAP_UNAUTH;
            case 3:
                return SWIPE;
            case 4:
                return LINK;
            case 5:
                return NOTIFICATION;
            case 6:
                return HOMEFEED;
            case 7:
                return UNAUTH_PLP;
            case 8:
                return TOOLTIP;
            case 9:
                return SEARCH_LANDING_PAGE;
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
        switch (h.f25767a[ordinal()]) {
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
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
