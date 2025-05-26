package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class t0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public a1[] f18140a;

    @Override // androidx.datastore.preferences.protobuf.a1
    public final z0 a(Class cls) {
        for (a1 a1Var : this.f18140a) {
            if (a1Var.b(cls)) {
                return a1Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    public final boolean b(Class cls) {
        for (a1 a1Var : this.f18140a) {
            if (a1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
