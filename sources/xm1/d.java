package xm1;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d HORIZONTAL = new d("HORIZONTAL", 0);
    public static final d VERTICAL = new d("VERTICAL", 1);

    private static final /* synthetic */ d[] $values() {
        return new d[]{HORIZONTAL, VERTICAL};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final cm1.e getOrientation() {
        int i13 = c.f135362a[ordinal()];
        if (i13 == 1) {
            return cm1.e.HORIZONTAL;
        }
        if (i13 == 2) {
            return cm1.e.VERTICAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
