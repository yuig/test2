package eo;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int value;
    public static final a TOP_LEFT = new a("TOP_LEFT", 0, 0);
    public static final a TOP_RIGHT = new a("TOP_RIGHT", 1, 1);
    public static final a BOTTOM_RIGHT = new a("BOTTOM_RIGHT", 2, 2);
    public static final a BOTTOM_LEFT = new a("BOTTOM_LEFT", 3, 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
