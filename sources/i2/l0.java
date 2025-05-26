package i2;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f71154a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final Choreographer f71155b;

    static {
        ko2.f fVar = ao2.v0.f20219a;
        f71155b = (Choreographer) kotlin.jvm.internal.j.H(((bo2.e) ho2.q.f69782a).f23612f, new j0(2, null));
    }

    @Override // i2.i1
    public final Object d(Function1 function1, bl2.c frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        k0 k0Var = new k0(oVar, function1);
        f71155b.postFrameCallback(k0Var);
        oVar.e(new q0.e(k0Var, 22));
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
