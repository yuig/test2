package fm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int visibility;
    public static final c VISIBLE = new c("VISIBLE", 0, 0);
    public static final c GONE = new c("GONE", 1, 8);
    public static final c INVISIBLE = new c("INVISIBLE", 2, 4);

    private static final /* synthetic */ c[] $values() {
        return new c[]{VISIBLE, GONE, INVISIBLE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, int i14) {
        this.visibility = i14;
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

    public final int getVisibility() {
        return this.visibility;
    }
}
