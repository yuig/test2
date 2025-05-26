package aq;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e UNIFIED_PIN = new e("UNIFIED_PIN", 0);
    public static final e SCHEDULED_PIN = new e("SCHEDULED_PIN", 1);
    public static final e STANDARD_PIN = new e("STANDARD_PIN", 2);

    private static final /* synthetic */ e[] $values() {
        return new e[]{UNIFIED_PIN, SCHEDULED_PIN, STANDARD_PIN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private e(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
