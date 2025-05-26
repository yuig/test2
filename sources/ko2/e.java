package ko2;

import ao2.f0;
import ao2.h1;
import ho2.x;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class e extends h1 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final e f80326c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f80327d;

    static {
        m mVar = m.f80340c;
        int i13 = x.f69791a;
        if (64 >= i13) {
            i13 = 64;
        }
        f80327d = mVar.m(ue.c.G("kotlinx.coroutines.io.parallelism", i13, 0, 0, 12), null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(kotlin.coroutines.j.f80412a, runnable);
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        f80327d.g(coroutineContext, runnable);
    }

    @Override // ao2.f0
    public final void h(CoroutineContext coroutineContext, Runnable runnable) {
        f80327d.h(coroutineContext, runnable);
    }

    @Override // ao2.f0
    public final f0 m(int i13, String str) {
        return m.f80340c.m(i13, str);
    }

    @Override // ao2.h1
    public final Executor o() {
        return this;
    }

    @Override // ao2.f0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
