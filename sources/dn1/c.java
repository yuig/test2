package dn1;

import lb.l0;
import om1.f;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private final f value;
    public static final c TRANSPARENT_GRAY = new c("TRANSPARENT_GRAY", 0, f.TRANSPARENT_GRAY);
    public static final c TRANSPARENT_DARK_GRAY = new c("TRANSPARENT_DARK_GRAY", 1, f.TRANSPARENT_DARK_GRAY);

    private static final /* synthetic */ c[] $values() {
        return new c[]{TRANSPARENT_GRAY, TRANSPARENT_DARK_GRAY};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, f fVar) {
        this.value = fVar;
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
    public final f getValue() {
        return this.value;
    }
}
