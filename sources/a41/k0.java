package a41;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;

    @NotNull
    public static final j0 Companion;
    public static final k0 Collapsed = new k0("Collapsed", 0);
    public static final k0 Expanded = new k0("Expanded", 1);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{Collapsed, Expanded};
    }

    static {
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new j0();
    }

    private k0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
