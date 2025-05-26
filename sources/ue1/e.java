package ue1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e implements p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final e MORE_IDEAS_CARD = new e("MORE_IDEAS_CARD", 0);
    public static final e MORE_IDEAS_LIST_ITEM = new e("MORE_IDEAS_LIST_ITEM", 1);

    private static final /* synthetic */ e[] $values() {
        return new e[]{MORE_IDEAS_CARD, MORE_IDEAS_LIST_ITEM};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
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
