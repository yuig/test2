package nm;

/* loaded from: classes.dex */
public final class n extends qm.c0 {

    /* renamed from: a, reason: collision with root package name */
    public i0 f91317a = null;

    @Override // nm.i0
    public final Object c(um.a aVar) {
        i0 i0Var = this.f91317a;
        if (i0Var != null) {
            return i0Var.c(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        i0 i0Var = this.f91317a;
        if (i0Var == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        i0Var.e(cVar, obj);
    }

    @Override // qm.c0
    public final i0 f() {
        i0 i0Var = this.f91317a;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
