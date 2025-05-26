package hs1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    private final int debugColor;
    public static final x MEMORY = new x("MEMORY", 0, -16711936);
    public static final x DISK = new x("DISK", 1, -16776961);
    public static final x NETWORK = new x("NETWORK", 2, -65536);

    private static final /* synthetic */ x[] $values() {
        return new x[]{MEMORY, DISK, NETWORK};
    }

    static {
        x[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private x(String str, int i13, int i14) {
        this.debugColor = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public final int getDebugColor() {
        return this.debugColor;
    }
}
