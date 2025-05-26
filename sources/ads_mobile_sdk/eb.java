package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum eb implements a.w {
    FUNCTION_UNSPECIFIED(0),
    FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS(1),
    FUNCTION_METHOD_SETIMPLEMENTATIONS(2),
    FUNCTION_CLASS_ADDMETHOD(3),
    FUNCTION_CLASS_REPLACEMETHOD(4);


    /* renamed from: a, reason: collision with root package name */
    public final int f4782a;

    eb(int i13) {
        this.f4782a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f4782a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + eb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4782a + " name=" + name() + '>';
    }
}
