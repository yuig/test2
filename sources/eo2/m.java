package eo2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class m extends l {
    public m(do2.i iVar, ao2.f0 f0Var, int i13, co2.a aVar, int i14) {
        super((i14 & 4) != 0 ? -3 : i13, (i14 & 2) != 0 ? kotlin.coroutines.j.f80412a : f0Var, (i14 & 8) != 0 ? co2.a.SUSPEND : aVar, iVar);
    }

    @Override // eo2.f
    public final f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new m(i13, coroutineContext, aVar, this.f59794d);
    }

    @Override // eo2.f
    public final do2.i f() {
        return this.f59794d;
    }

    @Override // eo2.l
    public final Object h(do2.j jVar, bl2.c cVar) {
        Object collect = this.f59794d.collect(jVar, cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
