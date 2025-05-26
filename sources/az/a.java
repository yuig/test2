package az;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a UNIMPRESSED = new a("UNIMPRESSED", 0);
    public static final a AWAITING_BITMAP = new a("AWAITING_BITMAP", 1);
    public static final a AWAITING_1PX_VISIBLE = new a("AWAITING_1PX_VISIBLE", 2);
    public static final a IMPRESSION_IN_PROGRESS = new a("IMPRESSION_IN_PROGRESS", 3);
    public static final a IMPRESSION_ENDED = new a("IMPRESSION_ENDED", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{UNIMPRESSED, AWAITING_BITMAP, AWAITING_1PX_VISIBLE, IMPRESSION_IN_PROGRESS, IMPRESSION_ENDED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
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
}
