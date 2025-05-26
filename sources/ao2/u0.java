package ao2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class u0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f20213a;

    public u0(f0 f0Var) {
        this.f20213a = f0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.coroutines.j jVar = kotlin.coroutines.j.f80412a;
        f0 f0Var = this.f20213a;
        if (f0Var.k(jVar)) {
            f0Var.g(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f20213a.toString();
    }
}
