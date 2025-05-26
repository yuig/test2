package ot1;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final n Companion;
    private final int nalUnitId;
    public static final o NonIdrWithoutPartitioning = new o("NonIdrWithoutPartitioning", 0, 1);
    public static final o PartitionA = new o("PartitionA", 1, 2);
    public static final o PartitionB = new o("PartitionB", 2, 3);
    public static final o PartitionC = new o("PartitionC", 3, 4);
    public static final o Idr = new o("Idr", 4, 5);
    public static final o Sei = new o("Sei", 5, 6);
    public static final o Sps = new o("Sps", 6, 7);
    public static final o Pps = new o("Pps", 7, 8);
    public static final o AccessUnitDelimiter = new o("AccessUnitDelimiter", 8, 9);
    public static final o EndOfSequence = new o("EndOfSequence", 9, 10);
    public static final o EndOfStream = new o("EndOfStream", 10, 11);
    public static final o FillerData = new o("FillerData", 11, 12);
    public static final o SeiExtension = new o("SeiExtension", 12, 13);
    public static final o Prefix = new o("Prefix", 13, 14);
    public static final o SubsetSps = new o("SubsetSps", 14, 15);
    public static final o DepthParameterSet = new o("DepthParameterSet", 15, 16);
    public static final o AuxPictureWithoutPartitioning = new o("AuxPictureWithoutPartitioning", 16, 19);
    public static final o SliceExtension = new o("SliceExtension", 17, 20);
    public static final o DepthExtensionOrTexture = new o("DepthExtensionOrTexture", 18, 21);

    private static final /* synthetic */ o[] $values() {
        return new o[]{NonIdrWithoutPartitioning, PartitionA, PartitionB, PartitionC, Idr, Sei, Sps, Pps, AccessUnitDelimiter, EndOfSequence, EndOfStream, FillerData, SeiExtension, Prefix, SubsetSps, DepthParameterSet, AuxPictureWithoutPartitioning, SliceExtension, DepthExtensionOrTexture};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new n();
    }

    private o(String str, int i13, int i14) {
        this.nalUnitId = i14;
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

    public final int getNalUnitId() {
        return this.nalUnitId;
    }
}
