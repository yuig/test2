package nt;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SIGN_UP_INVISIBLE = new a("SIGN_UP_INVISIBLE", 0);
    public static final a SIGN_UP_COLLAPSE = new a("SIGN_UP_COLLAPSE", 1);
    public static final a SIGN_UP_EXPAND = new a("SIGN_UP_EXPAND", 2);
    public static final a SIGN_UP_SUCCESS = new a("SIGN_UP_SUCCESS", 3);
    public static final a BROWSER = new a("BROWSER", 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{SIGN_UP_INVISIBLE, SIGN_UP_COLLAPSE, SIGN_UP_EXPAND, SIGN_UP_SUCCESS, BROWSER};
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
