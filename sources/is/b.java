package is;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final b DL_COLLECTION_EXPERIMENT = new b("DL_COLLECTION_EXPERIMENT", 0, 0);
    public static final b DL_COLLECTION_CONTROL = new b("DL_COLLECTION_CONTROL", 1, 1);
    public static final b DL_COLLECTION_NO_ICON = new b("DL_COLLECTION_NO_ICON", 2, 2);
    public static final b DL_COLLECTION_ICON = new b("DL_COLLECTION_ICON", 3, 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{DL_COLLECTION_EXPERIMENT, DL_COLLECTION_CONTROL, DL_COLLECTION_NO_ICON, DL_COLLECTION_ICON};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
