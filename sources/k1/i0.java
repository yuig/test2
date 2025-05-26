package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m1.l3;
import m1.n3;

/* loaded from: classes2.dex */
public final class i0 extends j {
    public String H;
    public Function0 I;

    /* renamed from: J, reason: collision with root package name */
    public Function0 f77879J;

    @Override // k1.j
    public final void P0(z3.j jVar) {
        if (this.I != null) {
            String str = this.H;
            j1.q0 q0Var = new j1.q0(this, 3);
            rl2.u[] uVarArr = z3.w.f140760a;
            jVar.e(z3.i.f140676c, new z3.a(str, q0Var));
        }
    }

    @Override // k1.j
    public final Object Q0(n3.w wVar, bl2.c cVar) {
        boolean z13 = this.f77894t;
        h0 h0Var = (!z13 || this.f77879J == null) ? null : new h0(this, 0);
        h0 h0Var2 = (!z13 || this.I == null) ? null : new h0(this, 1);
        d0 d0Var = new d0(this, null, 1);
        h0 h0Var3 = new h0(this, 2);
        m1.v0 v0Var = n3.f85477a;
        Object O = dl2.b.O(new l3(wVar, null, h0Var2, h0Var, h0Var3, d0Var), cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (O != aVar) {
            O = Unit.f80348a;
        }
        return O == aVar ? O : Unit.f80348a;
    }
}
