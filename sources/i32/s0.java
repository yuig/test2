package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;

    @NotNull
    public static final q0 Companion;
    public static final s0 MULTI_PLATFORM_BANNER = new s0("MULTI_PLATFORM_BANNER", 0);
    public static final s0 MULTI_PLATFORM_TOOLTIP = new s0("MULTI_PLATFORM_TOOLTIP", 1);
    public static final s0 MULTI_PLATFORM_SEARCHDELIGHT = new s0("MULTI_PLATFORM_SEARCHDELIGHT", 2);
    public static final s0 MULTI_PLATFORM_MODAL = new s0("MULTI_PLATFORM_MODAL", 3);

    private static final /* synthetic */ s0[] $values() {
        return new s0[]{MULTI_PLATFORM_BANNER, MULTI_PLATFORM_TOOLTIP, MULTI_PLATFORM_SEARCHDELIGHT, MULTI_PLATFORM_MODAL};
    }

    static {
        s0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new q0();
    }

    private s0(String str, int i13) {
    }

    public static final s0 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return MULTI_PLATFORM_BANNER;
        }
        if (i13 == 2) {
            return MULTI_PLATFORM_TOOLTIP;
        }
        if (i13 == 3) {
            return MULTI_PLATFORM_SEARCHDELIGHT;
        }
        if (i13 != 4) {
            return null;
        }
        return MULTI_PLATFORM_MODAL;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = r0.f71491a[ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    i14 = 4;
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i14;
    }
}
