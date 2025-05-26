package ov1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e SINGLE_SELECTABLE_ONLY = new e("SINGLE_SELECTABLE_ONLY", 0);
    public static final e SINGLE_DESELECTABLE = new e("SINGLE_DESELECTABLE", 1);
    public static final e MULTIPLE_DESELECTABLE = new e("MULTIPLE_DESELECTABLE", 2);
    public static final e NOT_SELECTABLE = new e("NOT_SELECTABLE", 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{SINGLE_SELECTABLE_ONLY, SINGLE_DESELECTABLE, MULTIPLE_DESELECTABLE, NOT_SELECTABLE};
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
