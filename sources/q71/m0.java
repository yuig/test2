package q71;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 SM = new m0("SM", 0);
    public static final m0 MD = new m0("MD", 1);
    public static final m0 LG = new m0("LG", 2);
    public static final m0 THREE_FOURTH = new m0("THREE_FOURTH", 3);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{SM, MD, LG, THREE_FOURTH};
    }

    static {
        m0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private m0(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
