package tk0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    private final int position;
    public static final c MOVE_TO = new c("MOVE_TO", 0, 0);
    public static final c SECTION = new c("SECTION", 1, 1);
    public static final c DELETE = new c("DELETE", 2, 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{MOVE_TO, SECTION, DELETE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
    }

    private c(String str, int i13, int i14) {
        this.position = i14;
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

    public final int getPosition() {
        return this.position;
    }
}
