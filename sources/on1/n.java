package on1;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n LEFT = new n("LEFT", 0);
    public static final n RIGHT = new n("RIGHT", 1);
    public static final n START = new n("START", 2);
    public static final n END = new n("END", 3);

    private static final /* synthetic */ n[] $values() {
        return new n[]{LEFT, RIGHT, START, END};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @NotNull
    public final List<vn1.b> toGestaltTextAlignment$switchComponent_release() {
        int i13 = m.f96747a[ordinal()];
        if (i13 == 1) {
            return e0.b(vn1.b.START);
        }
        if (i13 == 2) {
            return e0.b(vn1.b.END);
        }
        if (i13 == 3) {
            return e0.b(vn1.b.START);
        }
        if (i13 == 4) {
            return e0.b(vn1.b.END);
        }
        throw new NoWhenBranchMatchedException();
    }
}
