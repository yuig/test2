package eo2;

import ao2.o1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class j extends f {

    /* renamed from: d, reason: collision with root package name */
    public final do2.i f59781d;

    /* renamed from: e, reason: collision with root package name */
    public final int f59782e;

    public /* synthetic */ j(androidx.slidingpanelayout.widget.c cVar) {
        this(cVar, 5, kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND);
    }

    @Override // eo2.f
    public final String c() {
        return "concurrency=" + this.f59782e;
    }

    @Override // eo2.f
    public final Object d(co2.z zVar, bl2.c cVar) {
        int i13 = mo2.j.f87822a;
        Object collect = this.f59781d.collect(new i((o1) cVar.getContext().get(ao2.g0.f20154b), new mo2.i(this.f59782e, 0), zVar, new o0(zVar)), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }

    @Override // eo2.f
    public final f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new j(this.f59781d, this.f59782e, coroutineContext, i13, aVar);
    }

    @Override // eo2.f
    public final co2.b0 g(ao2.j0 j0Var) {
        e eVar = new e(this, null);
        co2.a aVar = co2.a.SUSPEND;
        ao2.l0 l0Var = ao2.l0.DEFAULT;
        co2.y yVar = new co2.y(ao2.d0.c(j0Var, this.f59758a), lb.l0.b(this.f59759b, aVar, 4));
        l0Var.invoke(eVar, yVar, yVar);
        return yVar;
    }

    public j(do2.i iVar, int i13, CoroutineContext coroutineContext, int i14, co2.a aVar) {
        super(coroutineContext, i14, aVar);
        this.f59781d = iVar;
        this.f59782e = i13;
    }
}
