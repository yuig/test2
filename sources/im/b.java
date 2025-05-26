package im;

/* loaded from: classes3.dex */
public enum b implements yl.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int number_;

    b(int i13) {
        this.number_ = i13;
    }

    @Override // yl.c
    public int getNumber() {
        return this.number_;
    }
}
