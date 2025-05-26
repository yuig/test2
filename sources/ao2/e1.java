package ao2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class e1 extends f1 implements r0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20137g = AtomicReferenceFieldUpdater.newUpdater(e1.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20138h = AtomicReferenceFieldUpdater.newUpdater(e1.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20139i = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // ao2.f1
    public final long K() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Runnable runnable;
        c1 c1Var;
        if (L()) {
            return 0L;
        }
        P();
        loop0: while (true) {
            atomicReferenceFieldUpdater = f20137g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof ho2.o)) {
                if (obj != g1.f20156b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            ho2.o oVar = (ho2.o) obj;
            Object f13 = oVar.f();
            if (f13 != ho2.o.f69777g) {
                runnable = (Runnable) f13;
                break;
            }
            ho2.o e13 = oVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e13) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        kotlin.collections.v vVar = this.f20149e;
        if (((vVar == null || vVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof ho2.o)) {
                if (obj2 != g1.f20156b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((ho2.o) obj2).d()) {
                return 0L;
            }
        }
        d1 d1Var = (d1) f20138h.get(this);
        if (d1Var != null) {
            synchronized (d1Var) {
                c1[] c1VarArr = d1Var.f69797a;
                c1Var = c1VarArr != null ? c1VarArr[0] : null;
            }
            if (c1Var != null) {
                return ql2.s.b(c1Var.f20129a - System.nanoTime(), 0L);
            }
        }
        return Long.MAX_VALUE;
    }

    public void O(Runnable runnable) {
        P();
        if (!Q(runnable)) {
            n0.f20177j.O(runnable);
            return;
        }
        Thread z13 = z();
        if (Thread.currentThread() != z13) {
            LockSupport.unpark(z13);
        }
    }

    public final void P() {
        c1 c1Var;
        d1 d1Var = (d1) f20138h.get(this);
        if (d1Var == null || ho2.z.f69796b.get(d1Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (d1Var) {
                c1[] c1VarArr = d1Var.f69797a;
                c1Var = null;
                c1 c1Var2 = c1VarArr != null ? c1VarArr[0] : null;
                if (c1Var2 != null) {
                    if (nanoTime - c1Var2.f20129a >= 0 && Q(c1Var2)) {
                        c1Var = d1Var.b(0);
                    }
                }
            }
        } while (c1Var != null);
    }

    public final boolean Q(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20137g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f20139i.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof ho2.o)) {
                if (obj == g1.f20156b) {
                    return false;
                }
                ho2.o oVar = new ho2.o(8, true);
                oVar.a((Runnable) obj);
                oVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            ho2.o oVar2 = (ho2.o) obj;
            int a13 = oVar2.a(runnable);
            if (a13 == 0) {
                return true;
            }
            if (a13 == 1) {
                ho2.o e13 = oVar2.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e13) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a13 == 2) {
                return false;
            }
        }
    }

    public final boolean S() {
        kotlin.collections.v vVar = this.f20149e;
        if (!(vVar != null ? vVar.isEmpty() : true)) {
            return false;
        }
        d1 d1Var = (d1) f20138h.get(this);
        if (d1Var != null && ho2.z.f69796b.get(d1Var) != 0) {
            return false;
        }
        Object obj = f20137g.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof ho2.o ? ((ho2.o) obj).d() : obj == g1.f20156b;
    }

    public final void U() {
        f20137g.set(this, null);
        f20138h.set(this, null);
    }

    public final void W(long j13, c1 c1Var) {
        int c13;
        Thread z13;
        boolean z14 = f20139i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20138h;
        if (z14) {
            c13 = 1;
        } else {
            d1 d1Var = (d1) atomicReferenceFieldUpdater.get(this);
            if (d1Var == null) {
                d1 d1Var2 = new d1();
                d1Var2.f20133c = j13;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, d1Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.f(obj);
                d1Var = (d1) obj;
            }
            c13 = c1Var.c(j13, d1Var, this);
        }
        if (c13 != 0) {
            if (c13 == 1) {
                M(j13, c1Var);
                return;
            } else {
                if (c13 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        d1 d1Var3 = (d1) atomicReferenceFieldUpdater.get(this);
        if (d1Var3 != null) {
            synchronized (d1Var3) {
                c1[] c1VarArr = d1Var3.f69797a;
                r4 = c1VarArr != null ? c1VarArr[0] : null;
            }
        }
        if (r4 != c1Var || Thread.currentThread() == (z13 = z())) {
            return;
        }
        LockSupport.unpark(z13);
    }

    @Override // ao2.r0
    public x0 a(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        return kotlin.jvm.internal.r.Z(j13, runnable, coroutineContext);
    }

    @Override // ao2.r0
    public final void f(long j13, o oVar) {
        fi.b bVar = g1.f20155a;
        long j14 = j13 > 0 ? j13 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j13 : 0L;
        if (j14 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a1 a1Var = new a1(this, j14 + nanoTime, oVar);
            W(nanoTime, a1Var);
            lb.l0.E0(oVar, new k(a1Var, 1));
        }
    }

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        O(runnable);
    }

    @Override // ao2.f1
    public void shutdown() {
        c1 b13;
        ThreadLocal threadLocal = o2.f20188a;
        o2.f20188a.set(null);
        f20139i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20137g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof ho2.o)) {
                    if (obj != g1.f20156b) {
                        ho2.o oVar = new ho2.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((ho2.o) obj).b();
                break;
            }
            fi.b bVar = g1.f20156b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (K() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d1 d1Var = (d1) f20138h.get(this);
            if (d1Var == null) {
                return;
            }
            synchronized (d1Var) {
                b13 = ho2.z.f69796b.get(d1Var) > 0 ? d1Var.b(0) : null;
            }
            if (b13 == null) {
                return;
            } else {
                M(nanoTime, b13);
            }
        }
    }
}
