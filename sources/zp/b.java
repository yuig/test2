package zp;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b VisibleToYouAndOthers = new b("VisibleToYouAndOthers", 0);
    public static final b VisibleToOnlyOthers = new b("VisibleToOnlyOthers", 1);
    public static final b Hidden = new b("Hidden", 2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{VisibleToYouAndOthers, VisibleToOnlyOthers, Hidden};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
