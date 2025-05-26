package b1;

/* loaded from: classes2.dex */
public enum k {
    PERFORMANCE(0),
    COMPATIBLE(1);

    private final int mId;

    k(int i13) {
        this.mId = i13;
    }

    public static k fromId(int i13) {
        for (k kVar : values()) {
            if (kVar.mId == i13) {
                return kVar;
            }
        }
        throw new IllegalArgumentException(a.a.d("Unknown implementation mode id ", i13));
    }

    public int getId() {
        return this.mId;
    }
}
