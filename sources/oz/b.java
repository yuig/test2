package oz;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Essential = new b("Essential", 0);
    public static final b Analytics = new b("Analytics", 1);
    public static final b Personalisation = new b("Personalisation", 2);
    public static final b Marketing = new b("Marketing", 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Essential, Analytics, Personalisation, Marketing};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
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
