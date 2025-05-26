package nm1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EMPTY = new a("EMPTY", 0);
    public static final a SINGLE_ICON_BUTTON = new a("SINGLE_ICON_BUTTON", 1);
    public static final a DOUBLE_ICON_BUTTON = new a("DOUBLE_ICON_BUTTON", 2);
    public static final a TEXT_BUTTON = new a("TEXT_BUTTON", 3);
    public static final a AVATAR = new a("AVATAR", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{EMPTY, SINGLE_ICON_BUTTON, DOUBLE_ICON_BUTTON, TEXT_BUTTON, AVATAR};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
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
