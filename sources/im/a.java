package im;

/* loaded from: classes3.dex */
public enum a implements yl.c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    a(int i13) {
        this.number_ = i13;
    }

    @Override // yl.c
    public int getNumber() {
        return this.number_;
    }
}
