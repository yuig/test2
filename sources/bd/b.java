package bd;

import co2.m;
import co2.q;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final q f22682a;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f22683b;

    public b(m wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f22682a = wrapped;
    }

    @Override // co2.b0
    public final Object a(bl2.c cVar) {
        Object a13 = this.f22682a.a(cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return a13;
    }

    @Override // co2.c0
    public final void b(Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f22682a.b(handler);
    }

    @Override // co2.b0
    public final void cancel(CancellationException cancellationException) {
        this.f22682a.cancel(cancellationException);
    }

    @Override // co2.c0
    public final Object g(Object obj) {
        return this.f22682a.g(obj);
    }

    @Override // co2.b0
    public final co2.e iterator() {
        return this.f22682a.iterator();
    }

    @Override // co2.b0
    public final lo2.d k() {
        return this.f22682a.k();
    }

    @Override // co2.b0
    public final lo2.d l() {
        return this.f22682a.l();
    }

    @Override // co2.b0
    public final Object m() {
        return this.f22682a.m();
    }

    @Override // co2.c0
    public final Object o(Object obj, bl2.c cVar) {
        return this.f22682a.o(obj, cVar);
    }

    @Override // co2.b0
    public final Object p(bl2.c cVar) {
        return this.f22682a.p(cVar);
    }

    @Override // co2.c0
    public final boolean r(Throwable th3) {
        Function1 function1;
        boolean r13 = this.f22682a.r(th3);
        if (r13 && (function1 = this.f22683b) != null) {
            function1.invoke(th3);
        }
        this.f22683b = null;
        return r13;
    }

    @Override // co2.c0
    public final boolean s() {
        return this.f22682a.s();
    }
}
