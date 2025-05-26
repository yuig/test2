package oy;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d1 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d1[] $VALUES;

    @NotNull
    private final String value;
    public static final d1 USER = new d1("USER", 0, "user");
    public static final d1 PROCESS = new d1("PROCESS", 1, "process");

    private static final /* synthetic */ d1[] $values() {
        return new d1[]{USER, PROCESS};
    }

    static {
        d1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private d1(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
