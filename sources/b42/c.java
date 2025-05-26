package b42;

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
    public static final c EVEN_BLOCK = new c("EVEN_BLOCK", 0);
    public static final c BIG_OFFSET_BLOCK = new c("BIG_OFFSET_BLOCK", 1);
    public static final c SMALL_OFFSET_BLOCK = new c("SMALL_OFFSET_BLOCK", 2);
    public static final c BIG_SINGLE_OFFSET_BLOCK = new c("BIG_SINGLE_OFFSET_BLOCK", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{EVEN_BLOCK, BIG_OFFSET_BLOCK, SMALL_OFFSET_BLOCK, BIG_SINGLE_OFFSET_BLOCK};
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
        if (i13 == 0) {
            return EVEN_BLOCK;
        }
        if (i13 == 1) {
            return BIG_OFFSET_BLOCK;
        }
        if (i13 == 2) {
            return SMALL_OFFSET_BLOCK;
        }
        if (i13 != 3) {
            return null;
        }
        return BIG_SINGLE_OFFSET_BLOCK;
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
        int i13 = b.f21778a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        if (i13 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
