package ho2;

import ao2.f0;
import ao2.o0;
import ao2.r0;
import ao2.x0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class r extends f0 implements r0 {

    /* renamed from: c */
    public final /* synthetic */ r0 f69783c;

    /* renamed from: d */
    public final f0 f69784d;

    /* renamed from: e */
    public final String f69785e;

    /* JADX WARN: Multi-variable type inference failed */
    public r(f0 f0Var, String str) {
        r0 r0Var = f0Var instanceof r0 ? (r0) f0Var : null;
        this.f69783c = r0Var == null ? o0.f20186a : r0Var;
        this.f69784d = f0Var;
        this.f69785e = str;
    }

    @Override // ao2.r0
    public final x0 a(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f69783c.a(j13, runnable, coroutineContext);
    }

    @Override // ao2.r0
    public final void f(long j13, ao2.o oVar) {
        this.f69783c.f(j13, oVar);
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        this.f69784d.g(coroutineContext, runnable);
    }

    @Override // ao2.f0
    public final void h(CoroutineContext coroutineContext, Runnable runnable) {
        this.f69784d.h(coroutineContext, runnable);
    }

    @Override // ao2.f0
    public final boolean k(CoroutineContext coroutineContext) {
        return this.f69784d.k(coroutineContext);
    }

    @Override // ao2.f0
    public final String toString() {
        return this.f69785e;
    }
}
