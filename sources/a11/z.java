package a11;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z Unknown = new z("Unknown", 0);
    public static final z Yes = new z("Yes", 1);
    public static final z No = new z("No", 2);

    private static final /* synthetic */ z[] $values() {
        return new z[]{Unknown, Yes, No};
    }

    static {
        z[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
}
