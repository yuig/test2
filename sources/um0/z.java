package um0;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z Normal = new z("Normal", 0);
    public static final z Organize = new z("Organize", 1);
    public static final z OrganizeSelectAll = new z("OrganizeSelectAll", 2);

    private static final /* synthetic */ z[] $values() {
        return new z[]{Normal, Organize, OrganizeSelectAll};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private z(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final boolean isSelectAll() {
        return this == OrganizeSelectAll;
    }

    @NotNull
    public final z toggle() {
        int i13 = y.f122781a[ordinal()];
        if (i13 == 1) {
            return Normal;
        }
        if (i13 == 2) {
            return OrganizeSelectAll;
        }
        if (i13 == 3) {
            return Organize;
        }
        throw new NoWhenBranchMatchedException();
    }
}
