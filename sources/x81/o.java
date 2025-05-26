package x81;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o TRY_ON = new o("TRY_ON", 0);
    public static final o GALLERY_PHOTOS = new o("GALLERY_PHOTOS", 1);
    public static final o GALLERY_DIRECTORIES = new o("GALLERY_DIRECTORIES", 2);
    public static final o NONE = new o("NONE", 3);

    private static final /* synthetic */ o[] $values() {
        return new o[]{TRY_ON, GALLERY_PHOTOS, GALLERY_DIRECTORIES, NONE};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private o(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
