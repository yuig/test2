package zo;

import b22.l;
import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import m60.y;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c SINGLE = new c("SINGLE", 0);
    public static final c DEFAULT = new c("DEFAULT", 1);
    public static final c DENSE = new c("DENSE", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{SINGLE, DEFAULT, DENSE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
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

    @NotNull
    public final y toGridRepStyle() {
        int i13 = b.f142321a[ordinal()];
        if (i13 == 1) {
            return y.WIDE;
        }
        if (i13 == 2) {
            return y.REGULAR;
        }
        if (i13 == 3) {
            return y.COMPACT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final l toPinsViewType() {
        int i13 = b.f142321a[ordinal()];
        if (i13 == 1) {
            return l.WIDE;
        }
        if (i13 == 2) {
            return l.DEFAULT;
        }
        if (i13 == 3) {
            return l.COMPACT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
