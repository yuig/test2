package ko2;

import ao2.h1;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public abstract class i extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public final d f80330c;

    public i(long j13, String str, int i13, int i14) {
        this.f80330c = new d(j13, str, i13, i14);
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        d.d(this.f80330c, runnable, false, 6);
    }

    @Override // ao2.f0
    public final void h(CoroutineContext coroutineContext, Runnable runnable) {
        d.d(this.f80330c, runnable, true, 2);
    }

    @Override // ao2.h1
    public final Executor o() {
        return this.f80330c;
    }
}
