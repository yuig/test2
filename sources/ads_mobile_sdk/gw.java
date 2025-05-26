package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum gw implements a.w {
    SURFACE_UNSPECIFIED(0),
    BUBBLE_MAINPAGE(1),
    BUBBLE_SUBPAGE(2),
    DOWNLOADS_PAGE(3),
    DOWNLOAD_PROMPT(4),
    DOWNLOAD_NOTIFICATION(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f5725a;

    gw(int i13) {
        this.f5725a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f5725a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + gw.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5725a + " name=" + name() + '>';
    }
}
