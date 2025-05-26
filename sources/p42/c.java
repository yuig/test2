package p42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c HAIR_PATTERN = new c("HAIR_PATTERN", 0);
    public static final c SKIN_TONE_RANGE = new c("SKIN_TONE_RANGE", 1);
    public static final c BODY_TYPE_RANGE = new c("BODY_TYPE_RANGE", 2);
    public static final c COLOR_PALETTES_CATEGORY = new c("COLOR_PALETTES_CATEGORY", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{HAIR_PATTERN, SKIN_TONE_RANGE, BODY_TYPE_RANGE, COLOR_PALETTES_CATEGORY};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        if (i13 == 1) {
            return HAIR_PATTERN;
        }
        if (i13 == 2) {
            return SKIN_TONE_RANGE;
        }
        if (i13 == 3) {
            return BODY_TYPE_RANGE;
        }
        if (i13 != 4) {
            return null;
        }
        return COLOR_PALETTES_CATEGORY;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = b.f98854a[ordinal()];
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
