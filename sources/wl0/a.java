package wl0;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import y60.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int displayTextResId;
    public static final a Join = new a("Join", 0, e.join);
    public static final a Cancel = new a("Cancel", 1, e.cancel);

    private static final /* synthetic */ a[] $values() {
        return new a[]{Join, Cancel};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14) {
        this.displayTextResId = i14;
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

    public final int getDisplayTextResId() {
        return this.displayTextResId;
    }
}
