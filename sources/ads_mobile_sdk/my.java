package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum my implements a.w {
    UNDEFINED(0),
    BROWSER_INITIATED(1),
    RENDERER_INITIATED_WITHOUT_USER_GESTURE(2),
    RENDERER_INITIATED_WITH_USER_GESTURE(3),
    COPY_PASTE_USER_INITIATED(4),
    NOTIFICATION_INITIATED(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f8423a;

    my(int i13) {
        this.f8423a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f8423a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + my.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8423a + " name=" + name() + '>';
    }
}
