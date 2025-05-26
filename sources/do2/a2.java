package do2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class a2 implements r2, i, eo2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2 f55726a;

    public a2(r2 r2Var) {
        this.f55726a = r2Var;
    }

    @Override // eo2.g0
    public final i a(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        fi.b bVar = u2.f55967a;
        return (((i13 < 0 || i13 >= 2) && i13 != -2) || aVar != co2.a.DROP_OLDEST) ? g2.d(this, coroutineContext, i13, aVar) : this;
    }

    @Override // do2.i
    public final Object collect(j jVar, bl2.c cVar) {
        return this.f55726a.collect(jVar, cVar);
    }

    @Override // do2.r2
    public final Object getValue() {
        return this.f55726a.getValue();
    }
}
