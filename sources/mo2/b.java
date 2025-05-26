package mo2;

import ao2.f0;
import ao2.m;
import ao2.o;
import ao2.v2;
import ho2.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kl2.l;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class b implements m, v2 {

    /* renamed from: a, reason: collision with root package name */
    public final o f87808a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f87809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f87810c;

    public b(c cVar, o oVar, Object obj) {
        this.f87810c = cVar;
        this.f87808a = oVar;
        this.f87809b = obj;
    }

    @Override // ao2.v2
    public final void a(v vVar, int i13) {
        this.f87808a.a(vVar, i13);
    }

    @Override // ao2.m
    public final boolean cancel(Throwable th3) {
        return this.f87808a.cancel(th3);
    }

    @Override // ao2.m
    public final void e(Function1 function1) {
        this.f87808a.e(function1);
    }

    @Override // ao2.m
    public final fi.b f(Throwable th3) {
        return this.f87808a.f(th3);
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f87808a.f20185e;
    }

    @Override // ao2.m
    public final void h(Object obj, Function1 function1) {
        this.f87808a.h((Unit) obj, function1);
    }

    @Override // ao2.m
    public final void i(f0 f0Var, Unit unit) {
        this.f87808a.i(f0Var, unit);
    }

    @Override // ao2.m
    public final boolean isActive() {
        return this.f87808a.isActive();
    }

    @Override // ao2.m
    public final boolean isCompleted() {
        return this.f87808a.isCompleted();
    }

    @Override // ao2.m
    public final fi.b j(Object obj, l lVar) {
        c cVar = this.f87810c;
        co2.c cVar2 = new co2.c(2, cVar, this);
        fi.b F = this.f87808a.F((Unit) obj, cVar2);
        if (F != null) {
            c.f87811h.set(cVar, this.f87809b);
        }
        return F;
    }

    @Override // ao2.m
    public final void n(Object obj, l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f87811h;
        Object obj2 = this.f87809b;
        c cVar = this.f87810c;
        atomicReferenceFieldUpdater.set(cVar, obj2);
        yq.k kVar = new yq.k(8, cVar, this);
        this.f87808a.h((Unit) obj, kVar);
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        this.f87808a.resumeWith(obj);
    }

    @Override // ao2.m
    public final void x(Object obj) {
        this.f87808a.x(obj);
    }
}
