package do1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c SECONDARY = new c("SECONDARY", 0, yl1.d.SECONDARY);
    public static final c TERTIARY = new c("TERTIARY", 1, yl1.d.TERTIARY);

    @NotNull
    private final yl1.d value;

    private static final /* synthetic */ c[] $values() {
        return new c[]{SECONDARY, TERTIARY};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, yl1.d dVar) {
        this.value = dVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @NotNull
    public final yl1.d getValue() {
        return this.value;
    }
}
