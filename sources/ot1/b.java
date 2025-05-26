package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int aspectRatioIdc;
    public static final b Unspecified = new b("Unspecified", 0, 0);
    public static final b Square = new b("Square", 1, 1);
    public static final b Ar12x11 = new b("Ar12x11", 2, 2);
    public static final b Ar10x11 = new b("Ar10x11", 3, 3);
    public static final b Ar16x11 = new b("Ar16x11", 4, 4);
    public static final b Ar40x33 = new b("Ar40x33", 5, 5);
    public static final b Ar24x11 = new b("Ar24x11", 6, 6);
    public static final b Ar20x11 = new b("Ar20x11", 7, 7);
    public static final b Ar32x11 = new b("Ar32x11", 8, 8);
    public static final b Ar80x33 = new b("Ar80x33", 9, 9);
    public static final b Ar18x11 = new b("Ar18x11", 10, 10);
    public static final b Ar15x11 = new b("Ar15x11", 11, 11);
    public static final b Ar64x33 = new b("Ar64x33", 12, 12);
    public static final b Ar160x99 = new b("Ar160x99", 13, 13);
    public static final b Ar4x3 = new b("Ar4x3", 14, 14);
    public static final b Ar3x2 = new b("Ar3x2", 15, 15);
    public static final b Ar2x1 = new b("Ar2x1", 16, 16);
    public static final b ExtendedSar = new b("ExtendedSar", 17, 255);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Unspecified, Square, Ar12x11, Ar10x11, Ar16x11, Ar40x33, Ar24x11, Ar20x11, Ar32x11, Ar80x33, Ar18x11, Ar15x11, Ar64x33, Ar160x99, Ar4x3, Ar3x2, Ar2x1, ExtendedSar};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, int i14) {
        this.aspectRatioIdc = i14;
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

    public final int getAspectRatioIdc() {
        return this.aspectRatioIdc;
    }
}
