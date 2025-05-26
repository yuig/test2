package ads_mobile_sdk;

/* loaded from: classes2.dex */
public enum dw implements a.w {
    ACTION_UNSPECIFIED(0),
    PROCEED(1),
    DISCARD(2),
    KEEP(3),
    CLOSE(4),
    CANCEL(5),
    DISMISS(6),
    BACK(7),
    OPEN_SUBPAGE(8),
    PROCEED_DEEP_SCAN(9),
    OPEN_LEARN_MORE_LINK(10);


    /* renamed from: a, reason: collision with root package name */
    public final int f4476a;

    dw(int i13) {
        this.f4476a = i13;
    }

    @Override // a.w
    public final int a() {
        return this.f4476a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + dw.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4476a + " name=" + name() + '>';
    }
}
