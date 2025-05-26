package ha;

/* loaded from: classes3.dex */
public enum c {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    c(long j13) {
        this.mValue = j13;
    }

    public static c fromValue(long j13) {
        c[] values = values();
        for (int i13 = 0; i13 < values.length; i13++) {
            if (values[i13].getValue() == j13) {
                return values[i13];
            }
        }
        throw new IllegalArgumentException(a.a.g("Unsupported FileSection Type ", j13));
    }

    public long getValue() {
        return this.mValue;
    }
}
