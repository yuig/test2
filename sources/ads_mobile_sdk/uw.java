package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum uw implements a.w {
    SAFE_OR_OTHER(0),
    MALWARE(1),
    PHISHING(2),
    UNWANTED(3),
    BILLING(4);


    /* renamed from: a, reason: collision with root package name */
    public final int f12241a;

    uw(int i13) {
        this.f12241a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f12241a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + uw.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12241a + " name=" + name() + '>';
    }
}
