package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum kx implements a.w {
    TYPE_UNKNOWN(0),
    TYPE_CREATIVE(1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7558a;

    kx(int i13) {
        this.f7558a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f7558a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + kx.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7558a + " name=" + name() + '>';
    }
}
