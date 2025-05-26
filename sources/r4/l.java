package r4;

import com.google.common.util.concurrent.c0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f106127a;

    /* renamed from: b, reason: collision with root package name */
    public final k f106128b = new k(this);

    public l(i iVar) {
        this.f106127a = new WeakReference(iVar);
    }

    public final boolean a(Throwable th3) {
        return this.f106128b.k(th3);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        i iVar = (i) this.f106127a.get();
        boolean cancel = this.f106128b.cancel(z13);
        if (cancel && iVar != null) {
            iVar.f106122a = null;
            iVar.f106123b = null;
            iVar.f106124c.j(null);
        }
        return cancel;
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        this.f106128b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f106128b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f106128b.f106119a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f106128b.isDone();
    }

    public final String toString() {
        return this.f106128b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return this.f106128b.get(j13, timeUnit);
    }
}
