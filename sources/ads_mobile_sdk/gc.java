package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum gc implements a.w {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);


    /* renamed from: a, reason: collision with root package name */
    public final int f5504a;

    gc(int i13) {
        this.f5504a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f5504a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + gc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5504a + " name=" + name() + '>';
    }
}
