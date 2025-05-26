package g0;

import com.google.common.util.concurrent.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f63188a;

    /* renamed from: b, reason: collision with root package name */
    public r4.i f63189b;

    public d(c0 c0Var) {
        c0Var.getClass();
        this.f63188a = c0Var;
    }

    public static d a(c0 c0Var) {
        return c0Var instanceof d ? (d) c0Var : new d(c0Var);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z13) {
        return this.f63188a.cancel(z13);
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        this.f63188a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f63188a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f63188a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f63188a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j13, TimeUnit timeUnit) {
        return this.f63188a.get(j13, timeUnit);
    }

    public d() {
        this.f63188a = com.bumptech.glide.d.L(new gc.c(this, 17));
    }
}
