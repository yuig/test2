package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum nn2 implements a.w {
    STATUS_UNKNOWN(0),
    STATUS_SUCCESS(1),
    STATUS_FAIL(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f8886a;

    nn2(int i13) {
        this.f8886a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f8886a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + nn2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8886a + " name=" + name() + '>';
    }
}
