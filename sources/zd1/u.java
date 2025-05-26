package zd1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    private final int index;
    public static final u MOST_RELEVANT = new u("MOST_RELEVANT", 0, 0);
    public static final u LOW_TO_HIGH = new u("LOW_TO_HIGH", 1, 1);
    public static final u HIGH_TO_LOW = new u("HIGH_TO_LOW", 2, 2);

    private static final /* synthetic */ u[] $values() {
        return new u[]{MOST_RELEVANT, LOW_TO_HIGH, HIGH_TO_LOW};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13, int i14) {
        super(str, i13);
        this.index = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }
}
