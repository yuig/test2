package x31;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q Toggleable = new q("Toggleable", 0);

    private static final /* synthetic */ q[] $values() {
        return new q[]{Toggleable};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private q(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
