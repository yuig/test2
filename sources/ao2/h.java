package ao2;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f20158d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f20159e;

    public h(CoroutineContext coroutineContext, Thread thread, f1 f1Var) {
        super(coroutineContext, true, true);
        this.f20158d = thread;
        this.f20159e = f1Var;
    }

    @Override // ao2.a2
    public final void t(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f20158d;
        if (Intrinsics.d(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
