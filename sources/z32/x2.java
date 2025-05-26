package z32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x2 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ x2[] $VALUES;

    @NotNull
    public static final v2 Companion;
    public static final x2 TITLE_FIRST = new x2("TITLE_FIRST", 0);
    public static final x2 SUBTITLE_FIRST = new x2("SUBTITLE_FIRST", 1);

    private static final /* synthetic */ x2[] $values() {
        return new x2[]{TITLE_FIRST, SUBTITLE_FIRST};
    }

    static {
        x2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new v2();
    }

    private x2(String str, int i13) {
    }

    public static final x2 findByValue(int i13) {
        Companion.getClass();
        return v2.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = w2.f140838a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
