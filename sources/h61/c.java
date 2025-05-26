package h61;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FOOD = new c("FOOD", 0);
    public static final c SKIN_TONE = new c("SKIN_TONE", 1);
    public static final c HAIR_PATTERN = new c("HAIR_PATTERN", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{FOOD, SKIN_TONE, HAIR_PATTERN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13) {
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

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i13 = b.f67816a[ordinal()];
        if (i13 == 1) {
            return "food";
        }
        if (i13 == 2) {
            return "skin_tone";
        }
        if (i13 == 3) {
            return "hair_pattern";
        }
        throw new NoWhenBranchMatchedException();
    }
}
