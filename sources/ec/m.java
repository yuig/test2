package ec;

/* loaded from: classes3.dex */
public enum m {
    STAR(1),
    POLYGON(2);

    private final int value;

    m(int i13) {
        this.value = i13;
    }

    public static m forValue(int i13) {
        for (m mVar : values()) {
            if (mVar.value == i13) {
                return mVar;
            }
        }
        return null;
    }
}
