package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum gx implements a.w {
    UNSPECIFIED(0),
    PHISHY_CLICK_EVENT(1),
    PHISHY_KEY_EVENT(2),
    PHISHY_PASTE_EVENT(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f5734a;

    gx(int i13) {
        this.f5734a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f5734a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + gx.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5734a + " name=" + name() + '>';
    }
}
