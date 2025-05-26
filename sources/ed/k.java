package ed;

import do2.f0;
import kotlin.Unit;
import kotlin.jvm.internal.j0;
import pc.o0;
import pc.v;

/* loaded from: classes3.dex */
public final class k implements do2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ do2.i f58484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f58485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f58486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f58487d;

    public k(f0 f0Var, o0 o0Var, v vVar, j0 j0Var) {
        this.f58484a = f0Var;
        this.f58485b = o0Var;
        this.f58486c = vVar;
        this.f58487d = j0Var;
    }

    @Override // do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        Object collect = this.f58484a.collect(new k1.j0(jVar, this.f58485b, this.f58486c, this.f58487d, 2), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }
}
