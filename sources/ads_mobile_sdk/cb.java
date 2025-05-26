package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum cb implements a.w {
    FALLBACK_NONE(0),
    FALLBACK_TIMEOUT(1);


    /* renamed from: a, reason: collision with root package name */
    public final int f3844a;

    cb(int i13) {
        this.f3844a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f3844a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + cb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3844a + " name=" + name() + '>';
    }
}
