package lm0;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;

    @NotNull
    public static final a1 Companion;
    private final int value;
    public static final c1 AllPins = new c1("AllPins", 0, -1);
    public static final c1 FavoritePins = new c1("FavoritePins", 1, 6);
    public static final c1 PinsWithNotes = new c1("PinsWithNotes", 2, 5);

    private static final /* synthetic */ c1[] $values() {
        return new c1[]{AllPins, FavoritePins, PinsWithNotes};
    }

    static {
        c1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a1();
    }

    private c1(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }

    @NotNull
    public final h32.u0 elementType() {
        int i13 = b1.f83847a[ordinal()];
        if (i13 == 1) {
            return h32.u0.ALL_PINS_FILTER;
        }
        if (i13 == 2) {
            return h32.u0.FAVORITE_PINS_FILTER;
        }
        if (i13 == 3) {
            return h32.u0.PINS_WITH_NOTES_FILTER;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getValue() {
        return this.value;
    }
}
