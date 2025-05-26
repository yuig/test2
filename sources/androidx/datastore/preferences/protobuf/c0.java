package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class c0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f18036a = new c0();

    @Override // androidx.datastore.preferences.protobuf.a1
    public final z0 a(Class cls) {
        if (!g0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (z0) g0.e(cls.asSubclass(g0.class)).d(f0.BUILD_MESSAGE_INFO);
        } catch (Exception e13) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e13);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final boolean b(Class cls) {
        return g0.class.isAssignableFrom(cls);
    }
}
