package do2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class z1 implements b2, i, eo2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f56022a;

    public z1(f2 f2Var) {
        this.f56022a = f2Var;
    }

    @Override // eo2.g0
    public final i a(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return g2.d(this, coroutineContext, i13, aVar);
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        return this.f56022a.collect(jVar, cVar);
    }
}
