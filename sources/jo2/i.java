package jo2;

import ao2.f0;
import ao2.o;
import ao2.r0;
import ao2.x0;
import java.util.concurrent.TimeUnit;
import kh2.j;
import kotlin.coroutines.CoroutineContext;
import uj2.a0;

/* loaded from: classes2.dex */
public final class i extends f0 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f77237d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f77238c;

    public i(a0 a0Var) {
        this.f77238c = a0Var;
    }

    @Override // ao2.r0
    public final x0 a(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        final xj2.c c13 = this.f77238c.c(runnable, j13, TimeUnit.MILLISECONDS);
        return new x0() { // from class: jo2.h
            @Override // ao2.x0
            public final void dispose() {
                xj2.c.this.dispose();
            }
        };
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).f77238c == this.f77238c;
    }

    @Override // ao2.r0
    public final void f(long j13, o oVar) {
        j.A(oVar, this.f77238c.c(new qg2.f(5, oVar, this), j13, TimeUnit.MILLISECONDS));
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        this.f77238c.b(runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f77238c);
    }

    @Override // ao2.f0
    public final String toString() {
        return this.f77238c.toString();
    }
}
