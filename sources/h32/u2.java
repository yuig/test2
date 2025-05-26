package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u2[] $VALUES;

    @NotNull
    public static final s2 Companion;
    public static final u2 DESKTOP = new u2("DESKTOP", 0);
    public static final u2 MOBILE = new u2("MOBILE", 1);
    public static final u2 DEVELOPERS = new u2("DEVELOPERS", 2);
    public static final u2 STERLING = new u2("STERLING", 3);
    public static final u2 ANALYTICS = new u2("ANALYTICS", 4);
    public static final u2 EVAL = new u2("EVAL", 5);
    public static final u2 BUSINESS = new u2("BUSINESS", 6);
    public static final u2 TRENDS = new u2("TRENDS", 7);
    public static final u2 TRENDS_INTERNAL = new u2("TRENDS_INTERNAL", 8);
    public static final u2 PINTEGRATIONS = new u2("PINTEGRATIONS", 9);
    public static final u2 PINTERGRATION = new u2("PINTERGRATION", 10);
    public static final u2 CREATORS = new u2("CREATORS", 11);
    public static final u2 NEWSROOM = new u2("NEWSROOM", 12);
    public static final u2 ABOUT = new u2("ABOUT", 13);
    public static final u2 CHAIN_HUB_INTERNAL = new u2("CHAIN_HUB_INTERNAL", 14);
    public static final u2 BASECAMP_INTERNAL = new u2("BASECAMP_INTERNAL", 15);
    public static final u2 PINNACLE_INTERNAL = new u2("PINNACLE_INTERNAL", 16);

    private static final /* synthetic */ u2[] $values() {
        return new u2[]{DESKTOP, MOBILE, DEVELOPERS, STERLING, ANALYTICS, EVAL, BUSINESS, TRENDS, TRENDS_INTERNAL, PINTEGRATIONS, PINTERGRATION, CREATORS, NEWSROOM, ABOUT, CHAIN_HUB_INTERNAL, BASECAMP_INTERNAL, PINNACLE_INTERNAL};
    }

    static {
        u2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new s2();
    }

    private u2(String str, int i13) {
    }

    public static final u2 findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return DESKTOP;
            case 1:
                return MOBILE;
            case 2:
                return DEVELOPERS;
            case 3:
                return STERLING;
            case 4:
                return ANALYTICS;
            case 5:
                return EVAL;
            case 6:
                return BUSINESS;
            case 7:
                return TRENDS;
            case 8:
                return TRENDS_INTERNAL;
            case 9:
                return PINTEGRATIONS;
            case 10:
                return PINTERGRATION;
            case 11:
                return CREATORS;
            case 12:
            default:
                return null;
            case 13:
                return NEWSROOM;
            case 14:
                return ABOUT;
            case 15:
                return CHAIN_HUB_INTERNAL;
            case 16:
                return BASECAMP_INTERNAL;
            case 17:
                return PINNACLE_INTERNAL;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (t2.f67258a[ordinal()]) {
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
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
