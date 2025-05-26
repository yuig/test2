package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum qy implements a.w {
    EVENT_URL(1),
    LANDING_PAGE(2),
    LANDING_REFERRER(3),
    CLIENT_REDIRECT(4),
    SERVER_REDIRECT(5),
    RECENT_NAVIGATION(6),
    REFERRER(7);


    /* renamed from: a, reason: collision with root package name */
    public final int f10317a;

    qy(int i13) {
        this.f10317a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f10317a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + qy.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f10317a + " name=" + name() + '>';
    }
}
