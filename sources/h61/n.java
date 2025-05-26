package h61;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class n {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;

    @NotNull
    public static final l Companion;
    public static final n EXPLORE = new n("EXPLORE", 0);
    public static final n SHOP = new n("SHOP", 1);
    public static final n PROFILES = new n("PROFILES", 2);

    private static final /* synthetic */ n[] $values() {
        return new n[]{EXPLORE, SHOP, PROFILES};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new l();
    }

    private n(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i13 = m.f67819a[ordinal()];
        if (i13 == 1) {
            return "explore";
        }
        if (i13 == 2) {
            return "shop";
        }
        if (i13 == 3) {
            return "profiles";
        }
        throw new NoWhenBranchMatchedException();
    }
}
