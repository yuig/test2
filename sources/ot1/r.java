package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final q Companion;
    private final int transferCharacteristicsId;
    public static final r Bt709 = new r("Bt709", 0, 1);
    public static final r Unspecified = new r("Unspecified", 1, 2);
    public static final r Gamma22 = new r("Gamma22", 2, 4);
    public static final r Gamma28 = new r("Gamma28", 3, 5);
    public static final r Bt601 = new r("Bt601", 4, 6);
    public static final r Smpte240M = new r("Smpte240M", 5, 7);
    public static final r Linear = new r("Linear", 6, 8);
    public static final r Log100to1 = new r("Log100to1", 7, 9);
    public static final r Log100sqrt10to1 = new r("Log100sqrt10to1", 8, 10);
    public static final r Iec61966V2dot4 = new r("Iec61966V2dot4", 9, 11);
    public static final r Bt1361 = new r("Bt1361", 10, 12);
    public static final r Iec61966V2dot1 = new r("Iec61966V2dot1", 11, 13);
    public static final r Bt2020TenBit = new r("Bt2020TenBit", 12, 14);
    public static final r Bt2020TwelveBit = new r("Bt2020TwelveBit", 13, 15);
    public static final r Smpte2084 = new r("Smpte2084", 14, 16);
    public static final r Smpte428 = new r("Smpte428", 15, 17);
    public static final r AribB67 = new r("AribB67", 16, 18);

    private static final /* synthetic */ r[] $values() {
        return new r[]{Bt709, Unspecified, Gamma22, Gamma28, Bt601, Smpte240M, Linear, Log100to1, Log100sqrt10to1, Iec61966V2dot4, Bt1361, Iec61966V2dot1, Bt2020TenBit, Bt2020TwelveBit, Smpte2084, Smpte428, AribB67};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new q();
    }

    private r(String str, int i13, int i14) {
        this.transferCharacteristicsId = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public final int getTransferCharacteristicsId() {
        return this.transferCharacteristicsId;
    }
}
