package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f55792a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f55793b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f55794c;

    public g(i iVar, Function1 function1) {
        ao2.b0 b0Var = c0.f55742b;
        this.f55792a = iVar;
        this.f55793b = function1;
        this.f55794c = b0Var;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = eo2.j0.f59783a;
        Object collect = this.f55792a.collect(new i1.d0(this, j0Var, jVar, 1), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
