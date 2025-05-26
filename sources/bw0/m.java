package bw0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m SUCCEEDED = new m("SUCCEEDED", 0);
    public static final m AWAIT_AND_SUCCEEDED = new m("AWAIT_AND_SUCCEEDED", 1);
    public static final m AWAIT_AND_INCOMPLETE = new m("AWAIT_AND_INCOMPLETE", 2);
    public static final m AWAIT_AND_TIMED_OUT = new m("AWAIT_AND_TIMED_OUT", 3);
    public static final m AWAIT_AND_UNKNOWN_ERROR = new m("AWAIT_AND_UNKNOWN_ERROR", 4);
    public static final m INCOMPLETE = new m("INCOMPLETE", 5);

    private static final /* synthetic */ m[] $values() {
        return new m[]{SUCCEEDED, AWAIT_AND_SUCCEEDED, AWAIT_AND_INCOMPLETE, AWAIT_AND_TIMED_OUT, AWAIT_AND_UNKNOWN_ERROR, INCOMPLETE};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private m(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
