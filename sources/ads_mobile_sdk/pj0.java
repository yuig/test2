package ads_mobile_sdk;

import a.od;

/* loaded from: classes2.dex */
public final class pj0 implements a.he {

    /* renamed from: a, reason: collision with root package name */
    public static final pj0 f9714a = new pj0();

    @Override // a.he
    public final boolean a(Class cls) {
        return sj0.class.isAssignableFrom(cls);
    }

    @Override // a.he
    public final od b(Class cls) {
        if (!sj0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (od) sj0.a(cls.asSubclass(sj0.class)).c();
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e13);
        }
    }
}
