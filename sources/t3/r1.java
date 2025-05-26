package t3;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r1 implements i2.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Choreographer f116179a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f116180b;

    public r1(Choreographer choreographer, p1 p1Var) {
        this.f116179a = choreographer;
        this.f116180b = p1Var;
    }

    @Override // i2.i1
    public final Object d(Function1 function1, bl2.c frame) {
        p1 p1Var = this.f116180b;
        if (p1Var == null) {
            CoroutineContext.Element element = frame.getContext().get(kotlin.coroutines.f.Ho);
            p1Var = element instanceof p1 ? (p1) element : null;
        }
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        q1 q1Var = new q1(oVar, this, function1);
        if (p1Var == null || !Intrinsics.d(p1Var.f116129c, this.f116179a)) {
            this.f116179a.postFrameCallback(q1Var);
            oVar.e(new j1.x0(24, this, q1Var));
        } else {
            synchronized (p1Var.f116131e) {
                try {
                    p1Var.f116133g.add(q1Var);
                    if (!p1Var.f116136j) {
                        p1Var.f116136j = true;
                        p1Var.f116129c.postFrameCallback(p1Var.f116137k);
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            oVar.e(new i2.i(7, p1Var, q1Var));
        }
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.g.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.b(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.c(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.g.d(coroutineContext, this);
    }
}
