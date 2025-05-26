package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum rv implements a.w {
    UNKNOWN_USER_POPULATION(0),
    SAFE_BROWSING(1),
    EXTENDED_REPORTING(2),
    ENHANCED_PROTECTION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f10812a;

    rv(int i13) {
        this.f10812a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f10812a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + rv.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10812a + " name=" + name() + '>';
    }
}
