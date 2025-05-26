package ao2;

/* loaded from: classes2.dex */
public final class w extends a2 implements v {
    public w(o1 o1Var) {
        super(true);
        N(o1Var);
    }

    @Override // ao2.p0
    public final Object await(bl2.c cVar) {
        Object v13 = v(cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return v13;
    }

    public final boolean e0(Throwable th3) {
        return Q(new z(false, th3));
    }

    @Override // ao2.p0
    public final lo2.d getOnAwait() {
        x1 x1Var = x1.f20232a;
        dl2.b.y(3, x1Var);
        y1 y1Var = y1.f20240a;
        dl2.b.y(3, y1Var);
        return new lo2.e(this, x1Var, y1Var);
    }
}
