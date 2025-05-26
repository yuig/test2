package k1;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class a2 implements l1, e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a2 f77808a = new a2();

    /* renamed from: b, reason: collision with root package name */
    public static final a2 f77809b = new a2();

    @Override // k1.e2
    public boolean a() {
        return false;
    }

    @Override // k1.e2
    public u2.q b() {
        return u2.n.f120041b;
    }

    @Override // k1.e2
    public long c(long j13, int i13, s2 s2Var) {
        return ((a3.c) s2Var.invoke(new a3.c(j13))).f482a;
    }

    @Override // k1.l1
    public void d(d3.e eVar) {
        ((s3.m0) eVar).a();
    }

    @Override // k1.e2
    public Object e(long j13, m1.m2 m2Var, bl2.c cVar) {
        Object invokeSuspend = ((m1.m2) m2Var.create(new n4.o(j13), cVar)).invokeSuspend(Unit.f80348a);
        return invokeSuspend == cl2.a.COROUTINE_SUSPENDED ? invokeSuspend : Unit.f80348a;
    }
}
