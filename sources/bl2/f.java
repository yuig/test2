package bl2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.r;

/* loaded from: classes4.dex */
public final class f implements c, dl2.e {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final e f23483b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f23484c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final c f23485a;
    private volatile Object result;

    public f(cl2.a aVar, c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23485a = delegate;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        cl2.a aVar = cl2.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23484c;
            cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return cl2.a.COROUTINE_SUSPENDED;
        }
        if (obj == cl2.a.RESUMED) {
            return cl2.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof r) {
            throw ((r) obj).f135224a;
        }
        return obj;
    }

    @Override // dl2.e
    public final dl2.e getCallerFrame() {
        c cVar = this.f23485a;
        if (cVar instanceof dl2.e) {
            return (dl2.e) cVar;
        }
        return null;
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f23485a.getContext();
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            cl2.a aVar = cl2.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23484c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23484c;
            cl2.a aVar3 = cl2.a.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f23485a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f23485a;
    }
}
