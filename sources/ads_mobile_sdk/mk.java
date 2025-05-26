package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum mk implements a.w {
    UNKNOWN(0),
    COLLECTED_BIDDING_SIGNAL(1);


    /* renamed from: a, reason: collision with root package name */
    public final int f8262a;

    mk(int i13) {
        this.f8262a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f8262a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + mk.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8262a + " name=" + name() + '>';
    }
}
