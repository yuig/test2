package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum kc implements a.w {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3),
    FALLBACK_SIGNALS(4);


    /* renamed from: a, reason: collision with root package name */
    public final int f7216a;

    kc(int i13) {
        this.f7216a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f7216a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + kc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7216a + " name=" + name() + '>';
    }
}
