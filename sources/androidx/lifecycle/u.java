package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements x, ao2.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f18691a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f18692b;

    public u(s lifecycle, CoroutineContext coroutineContext) {
        ao2.o1 o1Var;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f18691a = lifecycle;
        this.f18692b = coroutineContext;
        if (((b0) lifecycle).f18588d != r.DESTROYED || (o1Var = (ao2.o1) coroutineContext.get(ao2.g0.f20154b)) == null) {
            return;
        }
        o1Var.cancel((CancellationException) null);
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        s sVar = this.f18691a;
        if (((b0) sVar).f18588d.compareTo(r.DESTROYED) <= 0) {
            sVar.b(this);
            ao2.o1 o1Var = (ao2.o1) this.f18692b.get(ao2.g0.f20154b);
            if (o1Var != null) {
                o1Var.cancel((CancellationException) null);
            }
        }
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f18692b;
    }
}
