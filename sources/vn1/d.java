package vn1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final int frequency;
    public static final d NONE = new d("NONE", 0, 0);
    public static final d NORMAL = new d("NORMAL", 1, 1);
    public static final d FULL = new d("FULL", 2, 2);
    public static final d NORMAL_FAST = new d("NORMAL_FAST", 3, 3);
    public static final d FULL_FAST = new d("FULL_FAST", 4, 4);

    private static final /* synthetic */ d[] $values() {
        return new d[]{NONE, NORMAL, FULL, NORMAL_FAST, FULL_FAST};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, int i14) {
        this.frequency = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int getFrequency$text_release() {
        return this.frequency;
    }
}
