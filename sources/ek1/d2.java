package ek1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d2[] $VALUES;
    public static final d2 Is1PxVisible = new d2("Is1PxVisible", 0);
    public static final d2 NotVisible = new d2("NotVisible", 1);

    private static final /* synthetic */ d2[] $values() {
        return new d2[]{Is1PxVisible, NotVisible};
    }

    static {
        d2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private d2(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) $VALUES.clone();
    }
}
