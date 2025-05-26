package t82;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AD = new e("AD", 0);

    @NotNull
    public static final c Companion;

    private static final /* synthetic */ e[] $values() {
        return new e[]{AD};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new c();
    }

    private e(String str, int i13) {
    }

    public static final e findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return AD;
        }
        return null;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        if (d.f116773a[ordinal()] == 1) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
