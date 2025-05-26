package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    private final int colorPrimariesId;
    public static final d Bt709 = new d("Bt709", 0, 1);
    public static final d Unspecified = new d("Unspecified", 1, 2);
    public static final d Bt470M = new d("Bt470M", 2, 4);
    public static final d Bt470B = new d("Bt470B", 3, 5);
    public static final d Bt601 = new d("Bt601", 4, 6);
    public static final d Smpte240M = new d("Smpte240M", 5, 7);
    public static final d GenericFilm = new d("GenericFilm", 6, 8);
    public static final d Bt2020 = new d("Bt2020", 7, 9);
    public static final d Smpte428 = new d("Smpte428", 8, 10);
    public static final d Smpte431 = new d("Smpte431", 9, 11);
    public static final d Smpte432 = new d("Smpte432", 10, 12);
    public static final d Ebu3213 = new d("Ebu3213", 11, 22);

    private static final /* synthetic */ d[] $values() {
        return new d[]{Bt709, Unspecified, Bt470M, Bt470B, Bt601, Smpte240M, GenericFilm, Bt2020, Smpte428, Smpte431, Smpte432, Ebu3213};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new c();
    }

    private d(String str, int i13, int i14) {
        this.colorPrimariesId = i14;
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

    public final int getColorPrimariesId() {
        return this.colorPrimariesId;
    }
}
