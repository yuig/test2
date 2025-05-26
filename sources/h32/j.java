package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    public static final h Companion;
    public static final j ORGANIC = new j("ORGANIC", 0);
    public static final j NOTIFICATION = new j("NOTIFICATION", 1);
    public static final j DEEPLINK = new j("DEEPLINK", 2);
    public static final j INTERNAL = new j("INTERNAL", 3);
    public static final j SPOTLIGHT = new j("SPOTLIGHT", 4);
    public static final j WEB_URL = new j("WEB_URL", 5);

    private static final /* synthetic */ j[] $values() {
        return new j[]{ORGANIC, NOTIFICATION, DEEPLINK, INTERNAL, SPOTLIGHT, WEB_URL};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new h();
    }

    private j(String str, int i13) {
    }

    public static final j findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return ORGANIC;
        }
        if (i13 == 1) {
            return NOTIFICATION;
        }
        if (i13 == 2) {
            return DEEPLINK;
        }
        if (i13 == 3) {
            return INTERNAL;
        }
        if (i13 == 4) {
            return SPOTLIGHT;
        }
        if (i13 != 5) {
            return null;
        }
        return WEB_URL;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (i.f67079a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
