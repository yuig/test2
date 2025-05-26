package u1;

import j1.q0;
import k1.e0;
import k1.q1;
import kotlin.jvm.functions.Function1;
import o1.l;
import rl2.u;
import z3.g;
import z3.j;
import z3.t;
import z3.w;
import z3.x;

/* loaded from: classes2.dex */
public final class e extends e0 {
    public boolean H;
    public Function1 I;

    /* renamed from: J, reason: collision with root package name */
    public final q0 f119988J;

    public e(boolean z13, l lVar, q1 q1Var, boolean z14, g gVar, Function1 function1) {
        super(lVar, q1Var, z14, null, gVar, new e.e(function1, z13, 1));
        this.H = z13;
        this.I = function1;
        this.f119988J = new q0(this, 7);
    }

    @Override // k1.j
    public final void P0(j jVar) {
        a4.a aVar = this.H ? a4.a.On : a4.a.Off;
        u[] uVarArr = w.f140760a;
        x xVar = t.C;
        u uVar = w.f140760a[22];
        xVar.getClass();
        jVar.e(xVar, aVar);
    }
}
