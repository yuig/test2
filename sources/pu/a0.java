package pu;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 CCT = new a0("CCT", 0);
    public static final a0 IAB = new a0("IAB", 1);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{CCT, IAB};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private a0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
