package b22;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final k Companion;

    @NotNull
    private static final l[] staticValues;
    public static final l WIDE = new l("WIDE", 0);
    public static final l DEFAULT = new l("DEFAULT", 1);
    public static final l COMPACT = new l("COMPACT", 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{WIDE, DEFAULT, COMPACT};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new k();
        staticValues = values();
    }

    private l(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
