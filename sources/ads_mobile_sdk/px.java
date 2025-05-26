package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum px implements a.w {
    AD_RESOURCE_UNKNOWN(0),
    AD_RESOURCE_CREATIVE(1),
    AD_RESOURCE_POST_CLICK(2),
    AD_RESOURCE_AUTO_CLICK_DESTINATION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f9850a;

    px(int i13) {
        this.f9850a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f9850a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + px.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9850a + " name=" + name() + '>';
    }
}
