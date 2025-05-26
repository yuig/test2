package eo2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: e, reason: collision with root package name */
    public final kl2.l f59819e;

    public r(kl2.l lVar, do2.i iVar, CoroutineContext coroutineContext, int i13, co2.a aVar) {
        super(i13, coroutineContext, aVar, iVar);
        this.f59819e = lVar;
    }

    @Override // eo2.f
    public final f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new r(this.f59819e, this.f59794d, coroutineContext, i13, aVar);
    }

    @Override // eo2.l
    public final Object h(do2.j jVar, bl2.c cVar) {
        Object O = dl2.b.O(new q(this, jVar, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }
}
