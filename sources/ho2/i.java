package ho2;

import a.cb;
import ao2.f0;
import ao2.m0;
import ao2.o0;
import ao2.r0;
import ao2.x0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class i extends f0 implements r0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f69762i = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f69763c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f69764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69765e;

    /* renamed from: f, reason: collision with root package name */
    public final String f69766f;

    /* renamed from: g, reason: collision with root package name */
    public final m f69767g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f69768h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(f0 f0Var, int i13, String str) {
        r0 r0Var = f0Var instanceof r0 ? (r0) f0Var : null;
        this.f69763c = r0Var == null ? o0.f20186a : r0Var;
        this.f69764d = f0Var;
        this.f69765e = i13;
        this.f69766f = str;
        this.f69767g = new m();
        this.f69768h = new Object();
    }

    @Override // ao2.r0
    public final x0 a(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f69763c.a(j13, runnable, coroutineContext);
    }

    @Override // ao2.r0
    public final void f(long j13, ao2.o oVar) {
        this.f69763c.f(j13, oVar);
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable o13;
        this.f69767g.a(runnable);
        if (f69762i.get(this) >= this.f69765e || !w() || (o13 = o()) == null) {
            return;
        }
        this.f69764d.g(this, new lb.x(17, this, o13));
    }

    @Override // ao2.f0
    public final void h(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable o13;
        this.f69767g.a(runnable);
        if (f69762i.get(this) >= this.f69765e || !w() || (o13 = o()) == null) {
            return;
        }
        this.f69764d.h(this, new lb.x(17, this, o13));
    }

    @Override // ao2.f0
    public final f0 m(int i13, String str) {
        m0.m(i13);
        return i13 >= this.f69765e ? str != null ? new r(this, str) : this : super.m(i13, str);
    }

    public final Runnable o() {
        while (true) {
            Runnable runnable = (Runnable) this.f69767g.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f69768h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69762i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f69767g.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // ao2.f0
    public final String toString() {
        String str = this.f69766f;
        if (str != null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f69764d);
        sb3.append(".limitedParallelism(");
        return cb.l(sb3, this.f69765e, ')');
    }

    public final boolean w() {
        synchronized (this.f69768h) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69762i;
            if (atomicIntegerFieldUpdater.get(this) >= this.f69765e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
