package z42;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final j Companion;
    public static final l EVERYONE = new l("EVERYONE", 0);
    public static final l NONE = new l("NONE", 1);
    public static final l FOLLOWEES = new l("FOLLOWEES", 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{EVERYONE, NONE, FOLLOWEES};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new j();
    }

    private l(String str, int i13) {
    }

    public static final l findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return EVERYONE;
        }
        if (i13 == 1) {
            return NONE;
        }
        if (i13 != 2) {
            return null;
        }
        return FOLLOWEES;
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

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = k.f140851a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
