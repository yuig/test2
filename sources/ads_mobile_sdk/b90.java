package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum b90 implements a.w {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_PHONE(1),
    DEVICE_TYPE_TABLET(2),
    DEVICE_TYPE_WATCH(3),
    DEVICE_TYPE_AUTO(4),
    DEVICE_TYPE_TV(5),
    DEVICE_TYPE_PC(6);


    /* renamed from: a, reason: collision with root package name */
    public final int f2782a;

    b90(int i13) {
        this.f2782a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f2782a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + b90.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2782a + " name=" + name() + '>';
    }
}
