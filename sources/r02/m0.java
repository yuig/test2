package r02;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 Default = new m0("Default", 0);
    public static final m0 Loading = new m0("Loading", 1);
    public static final m0 Success = new m0("Success", 2);
    public static final m0 Error = new m0("Error", 3);

    private static final /* synthetic */ m0[] $values() {
        return new m0[]{Default, Loading, Success, Error};
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
