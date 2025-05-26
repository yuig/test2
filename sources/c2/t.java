package c2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class t implements m1.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final s f25223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f25224b;

    public t(w wVar) {
        this.f25224b = wVar;
        this.f25223a = new s(wVar, 0);
    }

    @Override // m1.b1
    public final Object a(k1.v1 v1Var, m1.x0 x0Var, bl2.c cVar) {
        Object b13 = this.f25224b.b(v1Var, new r(this, x0Var, null, 0), cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }
}
