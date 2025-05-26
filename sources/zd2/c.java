package zd2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int glType;
    public static final c VERTEX_SHADER = new c("VERTEX_SHADER", 0, 35633);
    public static final c FRAGMENT_SHADER = new c("FRAGMENT_SHADER", 1, 35632);

    private static final /* synthetic */ c[] $values() {
        return new c[]{VERTEX_SHADER, FRAGMENT_SHADER};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14) {
        this.glType = i14;
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

    public final int getGlType() {
        return this.glType;
    }
}
