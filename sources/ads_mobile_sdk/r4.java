package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum r4 implements a.w {
    ADSHIELD_VERSION_UNSPECIFIED(0),
    ADSHIELD_VERSION_1(1),
    ADSHIELD_VERSION_2(2),
    ADSHIELD_VERSION_3(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f10493a;

    r4(int i13) {
        this.f10493a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f10493a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + r4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10493a + " name=" + name() + '>';
    }
}
