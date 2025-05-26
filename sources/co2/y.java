package co2;

import ao2.a2;
import java.util.concurrent.CancellationException;
import kh2.j1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;

/* loaded from: classes2.dex */
public final class y extends ao2.a implements z, q {

    /* renamed from: d, reason: collision with root package name */
    public final q f28359d;

    public y(CoroutineContext coroutineContext, m mVar) {
        super(coroutineContext, true, true);
        this.f28359d = mVar;
    }

    @Override // co2.b0
    public final Object a(bl2.c cVar) {
        Object a13 = this.f28359d.a(cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return a13;
    }

    @Override // co2.c0
    public final void b(Function1 function1) {
        this.f28359d.b(function1);
    }

    @Override // ao2.a2, ao2.o1
    public final /* synthetic */ void cancel() {
        throw null;
    }

    @Override // ao2.a2, ao2.o1
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // ao2.a2, ao2.o1
    public final /* synthetic */ boolean cancel(Throwable th3) {
        throw null;
    }

    @Override // ao2.a
    public final void e0(boolean z13, Throwable th3) {
        if (this.f28359d.r(th3) || z13) {
            return;
        }
        j1.l0(this.f20108c, th3);
    }

    @Override // ao2.a
    public final void f0(Object obj) {
        this.f28359d.r(null);
    }

    @Override // co2.c0
    public final Object g(Object obj) {
        return this.f28359d.g(obj);
    }

    @Override // ao2.a, ao2.a2, ao2.o1
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // co2.b0
    public final e iterator() {
        return this.f28359d.iterator();
    }

    @Override // co2.b0
    public final lo2.d k() {
        return this.f28359d.k();
    }

    @Override // co2.b0
    public final lo2.d l() {
        return this.f28359d.l();
    }

    @Override // co2.b0
    public final Object m() {
        return this.f28359d.m();
    }

    @Override // co2.c0
    public final Object o(Object obj, bl2.c cVar) {
        return this.f28359d.o(obj, cVar);
    }

    @Override // co2.b0
    public final Object p(bl2.c cVar) {
        return this.f28359d.p(cVar);
    }

    @Override // co2.c0
    public final boolean r(Throwable th3) {
        return this.f28359d.r(th3);
    }

    @Override // co2.c0
    public final boolean s() {
        return this.f28359d.s();
    }

    @Override // ao2.a2
    public final void y(CancellationException cancellationException) {
        CancellationException b03 = a2.b0(this, cancellationException);
        this.f28359d.cancel(b03);
        w(b03);
    }
}
