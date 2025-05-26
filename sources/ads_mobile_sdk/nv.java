package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum nv implements a.w {
    UNKNOWN(0),
    UNAVAILABLE(1),
    NOT_MANAGED(2),
    ENTERPRISE_MANAGED(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f9001a;

    nv(int i13) {
        this.f9001a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f9001a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + nv.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9001a + " name=" + name() + '>';
    }
}
