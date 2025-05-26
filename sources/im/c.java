package im;

/* loaded from: classes3.dex */
public enum c implements yl.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    c(int i13) {
        this.number_ = i13;
    }

    @Override // yl.c
    public int getNumber() {
        return this.number_;
    }
}
