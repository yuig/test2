package bc2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    private final boolean isPromoted;
    public static final l ORGANIC = new l("ORGANIC", 0, false);
    public static final l AD = new l("AD", 1, true);
    public static final l PREMIERE = new l("PREMIERE", 2, true);
    public static final l PROMOTED_MAX = new l("PROMOTED_MAX", 3, true);
    public static final l PROMOTED_QUIZ = new l("PROMOTED_QUIZ", 4, true);
    public static final l FULL_WIDTH_PROMOTED = new l("FULL_WIDTH_PROMOTED", 5, true);
    public static final l FULL_WIDTH_ORGANIC = new l("FULL_WIDTH_ORGANIC", 6, false);

    private static final /* synthetic */ l[] $values() {
        return new l[]{ORGANIC, AD, PREMIERE, PROMOTED_MAX, PROMOTED_QUIZ, FULL_WIDTH_PROMOTED, FULL_WIDTH_ORGANIC};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private l(String str, int i13, boolean z13) {
        this.isPromoted = z13;
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

    public final boolean isPromoted() {
        return this.isPromoted;
    }
}
