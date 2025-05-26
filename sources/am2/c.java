package am2;

/* loaded from: classes2.dex */
public enum c {
    DECLARATION,
    FAKE_OVERRIDE,
    DELEGATION,
    SYNTHESIZED;

    public boolean isReal() {
        return this != FAKE_OVERRIDE;
    }
}
