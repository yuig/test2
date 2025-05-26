package t1;

import k1.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import q3.x;
import s3.a0;
import s3.j2;
import s3.q1;
import u2.p;

/* loaded from: classes.dex */
public final class k extends p implements a, a0, j2 {

    /* renamed from: p, reason: collision with root package name */
    public static final bk.f f115760p = new bk.f();

    /* renamed from: n, reason: collision with root package name */
    public f f115761n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f115762o;

    public static final a3.d M0(k kVar, x xVar, Function0 function0) {
        a3.d dVar;
        if (!kVar.f120054m || !kVar.f115762o) {
            return null;
        }
        q1 T0 = com.bumptech.glide.c.T0(kVar);
        if (!xVar.h()) {
            xVar = null;
        }
        if (xVar == null || (dVar = (a3.d) function0.invoke()) == null) {
            return null;
        }
        return androidx.compose.foundation.relocation.a.a(T0, xVar, dVar);
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // s3.a0
    public final void N(q1 q1Var) {
        this.f115762o = true;
    }

    @Override // t1.a
    public final Object j(q1 q1Var, Function0 function0, bl2.c cVar) {
        Object O = dl2.b.O(new j(this, q1Var, function0, new q(this, q1Var, function0, 3), null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    @Override // s3.j2
    public final Object l() {
        return f115760p;
    }
}
