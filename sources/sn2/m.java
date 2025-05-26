package sn2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;

    @NotNull
    private final String presentation;
    public static final m IN = new m("IN", 0, "in");
    public static final m OUT = new m("OUT", 1, "out");
    public static final m INV = new m("INV", 2, "");

    private static final /* synthetic */ m[] $values() {
        return new m[]{IN, OUT, INV};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private m(String str, int i13, String str2) {
        this.presentation = str2;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.presentation;
    }
}
