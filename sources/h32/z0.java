package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;

    @NotNull
    public static final x0 Companion;
    public static final z0 ACTIVE = new z0("ACTIVE", 0);
    public static final z0 BACKGROUND = new z0("BACKGROUND", 1);
    public static final z0 INACTIVE = new z0("INACTIVE", 2);
    public static final z0 ACTIVE_OFFLINE = new z0("ACTIVE_OFFLINE", 3);
    public static final z0 BACKGROUND_OFFLINE = new z0("BACKGROUND_OFFLINE", 4);
    public static final z0 INACTIVE_OFFLINE = new z0("INACTIVE_OFFLINE", 5);
    public static final z0 OTHER = new z0("OTHER", 6);

    private static final /* synthetic */ z0[] $values() {
        return new z0[]{ACTIVE, BACKGROUND, INACTIVE, ACTIVE_OFFLINE, BACKGROUND_OFFLINE, INACTIVE_OFFLINE, OTHER};
    }

    static {
        z0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new x0();
    }

    private z0(String str, int i13) {
    }

    public static final z0 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return ACTIVE;
        }
        if (i13 == 1) {
            return BACKGROUND;
        }
        if (i13 == 2) {
            return INACTIVE;
        }
        if (i13 == 3) {
            return ACTIVE_OFFLINE;
        }
        if (i13 == 4) {
            return BACKGROUND_OFFLINE;
        }
        if (i13 == 5) {
            return INACTIVE_OFFLINE;
        }
        if (i13 != 100) {
            return null;
        }
        return OTHER;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (y0.f67429a[ordinal()]) {
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
                return 100;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
