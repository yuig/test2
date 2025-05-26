package b1;

/* loaded from: classes2.dex */
public enum l {
    FILL_START(0),
    FILL_CENTER(1),
    FILL_END(2),
    FIT_START(3),
    FIT_CENTER(4),
    FIT_END(5);

    private final int mId;

    l(int i13) {
        this.mId = i13;
    }

    public static l fromId(int i13) {
        for (l lVar : values()) {
            if (lVar.mId == i13) {
                return lVar;
            }
        }
        throw new IllegalArgumentException(a.a.d("Unknown scale type id ", i13));
    }

    public int getId() {
        return this.mId;
    }
}
