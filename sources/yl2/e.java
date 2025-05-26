package yl2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e Function = new e("Function", 0);
    public static final e SuspendFunction = new e("SuspendFunction", 1);
    public static final e KFunction = new e("KFunction", 2);
    public static final e KSuspendFunction = new e("KSuspendFunction", 3);
    public static final e UNKNOWN = new e("UNKNOWN", 4);

    private static final /* synthetic */ e[] $values() {
        return new e[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private e(String str, int i13) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
