package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum kv implements a.w {
    SOURCE_UNSPECIFIED(0),
    CLIENT_GENERATION(1);


    /* renamed from: a, reason: collision with root package name */
    public final int f7539a;

    kv(int i13) {
        this.f7539a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f7539a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + kv.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7539a + " name=" + name() + '>';
    }
}
