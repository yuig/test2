package eo2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class l extends f {

    /* renamed from: d, reason: collision with root package name */
    public final do2.i f59794d;

    public l(int i13, CoroutineContext coroutineContext, co2.a aVar, do2.i iVar) {
        super(coroutineContext, i13, aVar);
        this.f59794d = iVar;
    }

    @Override // eo2.f, do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        if (this.f59759b == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext coroutineContext = this.f59758a;
            CoroutineContext plus = !ao2.d0.b(coroutineContext) ? context.plus(coroutineContext) : ao2.d0.a(context, coroutineContext, false);
            if (Intrinsics.d(plus, context)) {
                Object h10 = h(jVar, cVar);
                return h10 == cl2.a.COROUTINE_SUSPENDED ? h10 : Unit.f80348a;
            }
            bl2.d dVar = kotlin.coroutines.f.Ho;
            if (Intrinsics.d(plus.get(dVar), context.get(dVar))) {
                CoroutineContext context2 = cVar.getContext();
                if (!(jVar instanceof o0) && !(jVar instanceof i0)) {
                    jVar = new fd.q(jVar, context2);
                }
                Object l13 = kg.n.l(plus, jVar, ho2.y.b(plus), new k(this, null), cVar);
                return l13 == cl2.a.COROUTINE_SUSPENDED ? l13 : Unit.f80348a;
            }
        }
        Object collect = super.collect(jVar, cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }

    @Override // eo2.f
    public final Object d(co2.z zVar, bl2.c cVar) {
        Object h10 = h(new o0(zVar), cVar);
        return h10 == cl2.a.COROUTINE_SUSPENDED ? h10 : Unit.f80348a;
    }

    public abstract Object h(do2.j jVar, bl2.c cVar);

    @Override // eo2.f
    public final String toString() {
        return this.f59794d + " -> " + super.toString();
    }
}
