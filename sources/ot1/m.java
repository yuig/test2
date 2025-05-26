package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;

    @NotNull
    public static final l Companion;
    private final int matrixCoefficientsId;
    public static final m GBR = new m("GBR", 0, 0);
    public static final m Bt709 = new m("Bt709", 1, 1);
    public static final m Unspecified = new m("Unspecified", 2, 2);
    public static final m Fcc47 = new m("Fcc47", 3, 4);
    public static final m Bt601LineCount625 = new m("Bt601LineCount625", 4, 5);
    public static final m Bt601LineCount525 = new m("Bt601LineCount525", 5, 6);
    public static final m Smpte240M = new m("Smpte240M", 6, 7);
    public static final m YCgCo = new m("YCgCo", 7, 8);
    public static final m Bt2020NonConstantLuminance = new m("Bt2020NonConstantLuminance", 8, 9);
    public static final m Bt2020ConstantLuminance = new m("Bt2020ConstantLuminance", 9, 10);
    public static final m Smpte2085 = new m("Smpte2085", 10, 11);
    public static final m ChromaDerivedNonConstantLuminance = new m("ChromaDerivedNonConstantLuminance", 11, 12);
    public static final m ChromaDerivedConstantLuminance = new m("ChromaDerivedConstantLuminance", 12, 13);
    public static final m Bt2100 = new m("Bt2100", 13, 14);

    private static final /* synthetic */ m[] $values() {
        return new m[]{GBR, Bt709, Unspecified, Fcc47, Bt601LineCount625, Bt601LineCount525, Smpte240M, YCgCo, Bt2020NonConstantLuminance, Bt2020ConstantLuminance, Smpte2085, ChromaDerivedNonConstantLuminance, ChromaDerivedConstantLuminance, Bt2100};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new l();
    }

    private m(String str, int i13, int i14) {
        this.matrixCoefficientsId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final int getMatrixCoefficientsId() {
        return this.matrixCoefficientsId;
    }
}
