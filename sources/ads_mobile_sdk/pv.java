package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum pv implements a.w {
    UNSPECIFIED(0),
    TAILORED_WARNING_CT_BASE(1),
    TAILORED_WARNING_CT(2),
    TAILORED_WARNING_CT_ACCOUNT_INFO(3),
    TAILORED_WARNING_SUSPICIOUS_BASE(4),
    TAILORED_WARNING_SUSPICIOUS(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f9829a;

    pv(int i13) {
        this.f9829a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f9829a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + pv.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9829a + " name=" + name() + '>';
    }
}
