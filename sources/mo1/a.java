package mo1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE = new a("NONE", 0);
    public static final a DEFAULT = new a("DEFAULT", 1);
    public static final a FADE = new a("FADE", 2);
    public static final a SLIDE = new a("SLIDE", 3);
    public static final a MODAL = new a("MODAL", 4);
    public static final a MODAL_OUT = new a("MODAL_OUT", 5);
    public static final a GIFTWRAP = new a("GIFTWRAP", 6);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NONE, DEFAULT, FADE, SLIDE, MODAL, MODAL_OUT, GIFTWRAP};
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
