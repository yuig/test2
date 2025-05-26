package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum ec implements a.w {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5),
    ADSHIELD_3(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f4800a;

    ec(int i13) {
        this.f4800a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f4800a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ec.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4800a + " name=" + name() + '>';
    }
}
