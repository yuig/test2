package eo2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class o0 implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final co2.c0 f59808a;

    public o0(co2.c0 c0Var) {
        this.f59808a = c0Var;
    }

    @Override // do2.j
    public final Object emit(Object obj, bl2.c cVar) {
        Object o13 = this.f59808a.o(obj, cVar);
        return o13 == cl2.a.COROUTINE_SUSPENDED ? o13 : Unit.f80348a;
    }
}
