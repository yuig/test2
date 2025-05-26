package xd2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c OK = new c("OK", 0);
    public static final c BAD_SURFACE = new c("BAD_SURFACE", 1);
    public static final c CONTEXT_LOST = new c("CONTEXT_LOST", 2);
    public static final c OTHER_ERROR = new c("OTHER_ERROR", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{OK, BAD_SURFACE, CONTEXT_LOST, OTHER_ERROR};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13) {
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
}
