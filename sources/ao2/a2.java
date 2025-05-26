package ao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public class a2 implements o1, u, j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20111a = AtomicReferenceFieldUpdater.newUpdater(a2.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20112b = AtomicReferenceFieldUpdater.newUpdater(a2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public a2(boolean z13) {
        this._state$volatile = z13 ? b2.f20122g : b2.f20121f;
    }

    public static Throwable G(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f20242a;
        }
        return null;
    }

    public static t T(ho2.l lVar) {
        while (lVar.g()) {
            ho2.l d2 = lVar.d();
            if (d2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ho2.l.f69771b;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (ho2.l) obj;
                    if (!lVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = d2;
            }
        }
        while (true) {
            lVar = lVar.f();
            if (!lVar.g()) {
                if (lVar instanceof t) {
                    return (t) lVar;
                }
                if (lVar instanceof f2) {
                    return null;
                }
            }
        }
    }

    public static String a0(Object obj) {
        if (!(obj instanceof u1)) {
            return obj instanceof l1 ? ((l1) obj).isActive() ? "Active" : "New" : obj instanceof z ? "Cancelled" : "Completed";
        }
        u1 u1Var = (u1) obj;
        return u1Var.d() ? "Cancelling" : u1.f20214b.get(u1Var) != 0 ? "Completing" : "Active";
    }

    public static CancellationException b0(a2 a2Var, Throwable th3) {
        a2Var.getClass();
        CancellationException cancellationException = th3 instanceof CancellationException ? (CancellationException) th3 : null;
        return cancellationException == null ? new JobCancellationException(a2Var.A(), th3, a2Var) : cancellationException;
    }

    public String A() {
        return "Job was cancelled";
    }

    public boolean B(Throwable th3) {
        if (th3 instanceof CancellationException) {
            return true;
        }
        return w(th3) && I();
    }

    public final void C(l1 l1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20112b;
        s sVar = (s) atomicReferenceFieldUpdater.get(this);
        if (sVar != null) {
            sVar.dispose();
            atomicReferenceFieldUpdater.set(this, h2.f20160a);
        }
        CompletionHandlerException completionHandlerException = null;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th3 = zVar != null ? zVar.f20242a : null;
        if (l1Var instanceof r1) {
            try {
                ((r1) l1Var).j(th3);
                return;
            } catch (Throwable th4) {
                M(new CompletionHandlerException("Exception in completion handler " + l1Var + " for " + this, th4));
                return;
            }
        }
        f2 b13 = l1Var.b();
        if (b13 != null) {
            b13.c(new ho2.j(1), 1);
            Object obj2 = ho2.l.f69770a.get(b13);
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (ho2.l lVar = (ho2.l) obj2; !Intrinsics.d(lVar, b13); lVar = lVar.f()) {
                if (lVar instanceof r1) {
                    try {
                        ((r1) lVar).j(th3);
                    } catch (Throwable th5) {
                        if (completionHandlerException != null) {
                            xk2.f.a(completionHandlerException, th5);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lVar + " for " + this, th5);
                            Unit unit = Unit.f80348a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                M(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable D(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        a2 a2Var = (a2) ((j2) obj);
        Object obj2 = f20111a.get(a2Var);
        if (obj2 instanceof u1) {
            cancellationException = ((u1) obj2).c();
        } else if (obj2 instanceof z) {
            cancellationException = ((z) obj2).f20242a;
        } else {
            if (obj2 instanceof l1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new JobCancellationException("Parent job is ".concat(a0(obj2)), cancellationException, a2Var);
        }
        return cancellationException2;
    }

    public final Object E(u1 u1Var, Object obj) {
        Throwable H;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th3 = zVar != null ? zVar.f20242a : null;
        synchronized (u1Var) {
            u1Var.d();
            ArrayList<Throwable> e13 = u1Var.e(th3);
            H = H(u1Var, e13);
            if (H != null && e13.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e13.size()));
                for (Throwable th4 : e13) {
                    if (th4 != H && th4 != H && !(th4 instanceof CancellationException) && newSetFromMap.add(th4)) {
                        xk2.f.a(H, th4);
                    }
                }
            }
        }
        if (H != null && H != th3) {
            obj = new z(false, H);
        }
        if (H != null && (z(H) || L(H))) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            z.f20241b.compareAndSet((z) obj, 0, 1);
        }
        V(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20111a;
        Object m1Var = obj instanceof l1 ? new m1((l1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, u1Var, m1Var) && atomicReferenceFieldUpdater.get(this) == u1Var) {
        }
        C(u1Var, obj);
        return obj;
    }

    public final Object F() {
        Object obj = f20111a.get(this);
        if (!(!(obj instanceof l1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (obj instanceof z) {
            throw ((z) obj).f20242a;
        }
        return b2.b(obj);
    }

    public final Throwable H(u1 u1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (u1Var.d()) {
                return new JobCancellationException(A(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th3 = (Throwable) obj;
        if (th3 != null) {
            return th3;
        }
        Throwable th4 = (Throwable) arrayList.get(0);
        if (th4 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th5 = (Throwable) next;
                if (th5 != th4 && (th5 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th6 = (Throwable) obj2;
            if (th6 != null) {
                return th6;
            }
        }
        return th4;
    }

    public boolean I() {
        return true;
    }

    public boolean J() {
        return this instanceof w;
    }

    public final f2 K(l1 l1Var) {
        f2 b13 = l1Var.b();
        if (b13 != null) {
            return b13;
        }
        if (l1Var instanceof z0) {
            return new f2();
        }
        if (l1Var instanceof r1) {
            Y((r1) l1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l1Var).toString());
    }

    public boolean L(Throwable th3) {
        return false;
    }

    public void M(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void N(o1 o1Var) {
        h2 h2Var = h2.f20160a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20112b;
        if (o1Var == null) {
            atomicReferenceFieldUpdater.set(this, h2Var);
            return;
        }
        o1Var.start();
        s attachChild = o1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, h2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ao2.x0 O(boolean r6, ao2.r1 r7) {
        /*
            r5 = this;
            r7.f20198d = r5
        L2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ao2.a2.f20111a
            java.lang.Object r1 = r0.get(r5)
            boolean r2 = r1 instanceof ao2.z0
            if (r2 == 0) goto L25
            r2 = r1
            ao2.z0 r2 = (ao2.z0) r2
            boolean r3 = r2.f20243a
            if (r3 == 0) goto L21
        L13:
            boolean r2 = r0.compareAndSet(r5, r1, r7)
            if (r2 == 0) goto L1a
            goto L69
        L1a:
            java.lang.Object r2 = r0.get(r5)
            if (r2 == r1) goto L13
            goto L2
        L21:
            r5.X(r2)
            goto L2
        L25:
            boolean r2 = r1 instanceof ao2.l1
            ao2.h2 r3 = ao2.h2.f20160a
            r4 = 0
            if (r2 == 0) goto L6a
            r0 = r1
            ao2.l1 r0 = (ao2.l1) r0
            ao2.f2 r2 = r0.b()
            if (r2 != 0) goto L40
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            kotlin.jvm.internal.Intrinsics.g(r1, r0)
            ao2.r1 r1 = (ao2.r1) r1
            r5.Y(r1)
            goto L2
        L40:
            boolean r1 = r7.i()
            if (r1 == 0) goto L62
            boolean r1 = r0 instanceof ao2.u1
            if (r1 == 0) goto L4d
            ao2.u1 r0 = (ao2.u1) r0
            goto L4e
        L4d:
            r0 = r4
        L4e:
            if (r0 == 0) goto L54
            java.lang.Throwable r4 = r0.c()
        L54:
            if (r4 != 0) goto L5c
            r0 = 5
            boolean r0 = r2.c(r7, r0)
            goto L67
        L5c:
            if (r6 == 0) goto L61
            r7.j(r4)
        L61:
            return r3
        L62:
            r0 = 1
            boolean r0 = r2.c(r7, r0)
        L67:
            if (r0 == 0) goto L2
        L69:
            return r7
        L6a:
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r0.get(r5)
            boolean r0 = r6 instanceof ao2.z
            if (r0 == 0) goto L77
            ao2.z r6 = (ao2.z) r6
            goto L78
        L77:
            r6 = r4
        L78:
            if (r6 == 0) goto L7c
            java.lang.Throwable r4 = r6.f20242a
        L7c:
            r7.j(r4)
        L7f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ao2.a2.O(boolean, ao2.r1):ao2.x0");
    }

    public boolean P() {
        return this instanceof h;
    }

    public final boolean Q(Object obj) {
        Object c03;
        do {
            c03 = c0(f20111a.get(this), obj);
            if (c03 == b2.f20116a) {
                return false;
            }
            if (c03 == b2.f20117b) {
                return true;
            }
        } while (c03 == b2.f20118c);
        t(c03);
        return true;
    }

    public final Object R(Object obj) {
        Object c03;
        do {
            c03 = c0(f20111a.get(this), obj);
            if (c03 == b2.f20116a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, G(obj));
            }
        } while (c03 == b2.f20118c);
        return c03;
    }

    public String S() {
        return getClass().getSimpleName();
    }

    public final void U(f2 f2Var, Throwable th3) {
        f2Var.getClass();
        f2Var.c(new ho2.j(4), 4);
        Object obj = ho2.l.f69770a.get(f2Var);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (ho2.l lVar = (ho2.l) obj; !Intrinsics.d(lVar, f2Var); lVar = lVar.f()) {
            if ((lVar instanceof r1) && ((r1) lVar).i()) {
                try {
                    ((r1) lVar).j(th3);
                } catch (Throwable th4) {
                    if (completionHandlerException != null) {
                        xk2.f.a(completionHandlerException, th4);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lVar + " for " + this, th4);
                        Unit unit = Unit.f80348a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            M(completionHandlerException);
        }
        z(th3);
    }

    public void V(Object obj) {
    }

    public void W() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ao2.k1] */
    public final void X(z0 z0Var) {
        f2 f2Var = new f2();
        if (!z0Var.f20243a) {
            f2Var = new k1(f2Var);
        }
        a.c.w(f20111a, this, z0Var, f2Var);
    }

    public final void Y(r1 r1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f2 f2Var = new f2();
        r1Var.getClass();
        ho2.l.f69771b.set(f2Var, r1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ho2.l.f69770a;
        atomicReferenceFieldUpdater2.set(f2Var, r1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(r1Var) == r1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(r1Var, r1Var, f2Var)) {
                    if (atomicReferenceFieldUpdater2.get(r1Var) != r1Var) {
                        break;
                    }
                }
                f2Var.e(r1Var);
                break loop0;
            }
            break;
        }
        ho2.l f13 = r1Var.f();
        do {
            atomicReferenceFieldUpdater = f20111a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, r1Var, f13)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == r1Var);
    }

    public final int Z(Object obj) {
        boolean z13 = obj instanceof z0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20111a;
        if (z13) {
            if (((z0) obj).f20243a) {
                return 0;
            }
            z0 z0Var = b2.f20122g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            W();
            return 1;
        }
        if (!(obj instanceof k1)) {
            return 0;
        }
        f2 b13 = ((k1) obj).b();
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b13)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        W();
        return 1;
    }

    @Override // ao2.o1
    public final s attachChild(u uVar) {
        t tVar = new t(uVar);
        tVar.f20198d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20111a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z0) {
                z0 z0Var = (z0) obj;
                if (z0Var.f20243a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                X(z0Var);
            } else {
                boolean z13 = obj instanceof l1;
                h2 h2Var = h2.f20160a;
                if (!z13) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    z zVar = obj2 instanceof z ? (z) obj2 : null;
                    tVar.j(zVar != null ? zVar.f20242a : null);
                    return h2Var;
                }
                f2 b13 = ((l1) obj).b();
                if (b13 == null) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Y((r1) obj);
                } else if (!b13.c(tVar, 7)) {
                    boolean c13 = b13.c(tVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof u1) {
                        r4 = ((u1) obj3).c();
                    } else {
                        z zVar2 = obj3 instanceof z ? (z) obj3 : null;
                        if (zVar2 != null) {
                            r4 = zVar2.f20242a;
                        }
                    }
                    tVar.j(r4);
                    if (c13) {
                        break loop0;
                    }
                    return h2Var;
                }
            }
        }
        return tVar;
    }

    public final Object c0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof l1)) {
            return b2.f20116a;
        }
        if (((obj instanceof z0) || (obj instanceof r1)) && !(obj instanceof t) && !(obj2 instanceof z)) {
            l1 l1Var = (l1) obj;
            fi.b bVar = b2.f20116a;
            Object m1Var = obj2 instanceof l1 ? new m1((l1) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f20111a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, m1Var)) {
                    V(obj2);
                    C(l1Var, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l1Var);
            return b2.f20118c;
        }
        l1 l1Var2 = (l1) obj;
        f2 K = K(l1Var2);
        if (K == null) {
            return b2.f20118c;
        }
        u1 u1Var = l1Var2 instanceof u1 ? (u1) l1Var2 : null;
        if (u1Var == null) {
            u1Var = new u1(K, null);
        }
        synchronized (u1Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u1.f20214b;
                if (atomicIntegerFieldUpdater.get(u1Var) != 0) {
                    return b2.f20116a;
                }
                atomicIntegerFieldUpdater.set(u1Var, 1);
                if (u1Var != l1Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20111a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, l1Var2, u1Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != l1Var2) {
                            return b2.f20118c;
                        }
                    }
                }
                boolean d2 = u1Var.d();
                z zVar = obj2 instanceof z ? (z) obj2 : null;
                if (zVar != null) {
                    u1Var.a(zVar.f20242a);
                }
                Throwable c13 = d2 ^ true ? u1Var.c() : null;
                Unit unit = Unit.f80348a;
                if (c13 != null) {
                    U(K, c13);
                }
                t T = T(K);
                if (T != null && d0(u1Var, T, obj2)) {
                    return b2.f20117b;
                }
                K.c(new ho2.j(2), 2);
                t T2 = T(K);
                return (T2 == null || !d0(u1Var, T2, obj2)) ? E(u1Var, obj2) : b2.f20117b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ao2.o1
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean d0(u1 u1Var, t tVar, Object obj) {
        while (m0.R(tVar.f20206e, false, new t1(this, u1Var, tVar, obj)) == h2.f20160a) {
            tVar = T(tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.g.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.b(this, hVar);
    }

    @Override // ao2.o1
    public final CancellationException getCancellationException() {
        Object obj = f20111a.get(this);
        if (!(obj instanceof u1)) {
            if (!(obj instanceof l1)) {
                return obj instanceof z ? b0(this, ((z) obj).f20242a) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable c13 = ((u1) obj).c();
        if (c13 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c13 instanceof CancellationException ? (CancellationException) c13 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = A();
        }
        return new JobCancellationException(concat, c13, this);
    }

    @Override // ao2.o1
    public final Sequence getChildren() {
        return yn2.q.b(new w1(null, this));
    }

    public Object getCompleted() {
        return F();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f20111a.get(this);
        if (!(obj instanceof l1)) {
            return G(obj);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.h getKey() {
        return g0.f20154b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ao2.o1
    public final lo2.c getOnJoin() {
        z1 z1Var = z1.f20244a;
        dl2.b.y(3, z1Var);
        return new a8.q((v) this, z1Var);
    }

    @Override // ao2.o1
    public final o1 getParent() {
        s sVar = (s) f20112b.get(this);
        if (sVar != null) {
            return sVar.getParent();
        }
        return null;
    }

    @Override // ao2.o1
    public final x0 invokeOnCompletion(boolean z13, boolean z14, Function1 function1) {
        return O(z14, z13 ? new n1(function1) : new y0(function1, 1));
    }

    @Override // ao2.o1
    public boolean isActive() {
        Object obj = f20111a.get(this);
        return (obj instanceof l1) && ((l1) obj).isActive();
    }

    @Override // ao2.o1
    public final boolean isCancelled() {
        Object obj = f20111a.get(this);
        return (obj instanceof z) || ((obj instanceof u1) && ((u1) obj).d());
    }

    @Override // ao2.o1
    public final boolean isCompleted() {
        return !(f20111a.get(this) instanceof l1);
    }

    @Override // ao2.o1
    public final Object join(bl2.c frame) {
        Object obj;
        do {
            obj = f20111a.get(this);
            if (!(obj instanceof l1)) {
                m0.t(frame.getContext());
                return Unit.f80348a;
            }
        } while (Z(obj) < 0);
        o oVar = new o(1, cl2.h.b(frame));
        oVar.v();
        lb.l0.E0(oVar, new k(m0.R(this, true, new y0(oVar, 2)), 1));
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (u13 != aVar) {
            u13 = Unit.f80348a;
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.c(this, hVar);
    }

    @Override // ao2.o1
    public final o1 plus(o1 o1Var) {
        return o1Var;
    }

    @Override // ao2.o1
    public final boolean start() {
        int Z;
        do {
            Z = Z(f20111a.get(this));
            if (Z == 0) {
                return false;
            }
        } while (Z != 1);
        return true;
    }

    public void t(Object obj) {
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(S() + '{' + a0(f20111a.get(this)) + '}');
        sb3.append('@');
        sb3.append(m0.y(this));
        return sb3.toString();
    }

    public void u(Object obj) {
        t(obj);
    }

    public final Object v(bl2.c frame) {
        Object obj;
        do {
            obj = f20111a.get(this);
            if (!(obj instanceof l1)) {
                if (obj instanceof z) {
                    throw ((z) obj).f20242a;
                }
                return b2.b(obj);
            }
        } while (Z(obj) < 0);
        s1 s1Var = new s1(cl2.h.b(frame), this);
        s1Var.v();
        lb.l0.E0(s1Var, new k(m0.R(this, true, new r(s1Var, 1)), 1));
        Object u13 = s1Var.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public final boolean w(Object obj) {
        fi.b bVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = b2.f20116a;
        if (J()) {
            do {
                Object obj3 = f20111a.get(this);
                if (obj3 instanceof l1) {
                    if (obj3 instanceof u1) {
                        u1 u1Var = (u1) obj3;
                        u1Var.getClass();
                        if (u1.f20214b.get(u1Var) != 0) {
                        }
                    }
                    obj2 = c0(obj3, new z(false, D(obj)));
                }
                obj2 = b2.f20116a;
                break;
            } while (obj2 == b2.f20118c);
            if (obj2 == b2.f20117b) {
                return true;
            }
        }
        if (obj2 == b2.f20116a) {
            Throwable th3 = null;
            loop1: while (true) {
                Object obj4 = f20111a.get(this);
                if (!(obj4 instanceof u1)) {
                    if (!(obj4 instanceof l1)) {
                        bVar = b2.f20119d;
                        break;
                    }
                    if (th3 == null) {
                        th3 = D(obj);
                    }
                    l1 l1Var = (l1) obj4;
                    if (l1Var.isActive()) {
                        f2 K = K(l1Var);
                        if (K == null) {
                            continue;
                        } else {
                            u1 u1Var2 = new u1(K, th3);
                            do {
                                atomicReferenceFieldUpdater = f20111a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l1Var, u1Var2)) {
                                    U(K, th3);
                                    bVar = b2.f20116a;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l1Var);
                        }
                    } else {
                        Object c03 = c0(obj4, new z(false, th3));
                        if (c03 == b2.f20116a) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (c03 != b2.f20118c) {
                            obj2 = c03;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        try {
                            if (u1.f20216d.get((u1) obj4) == b2.f20120e) {
                                bVar = b2.f20119d;
                            } else {
                                boolean d2 = ((u1) obj4).d();
                                if (th3 == null) {
                                    th3 = D(obj);
                                }
                                ((u1) obj4).a(th3);
                                Throwable c13 = d2 ^ true ? ((u1) obj4).c() : null;
                                if (c13 != null) {
                                    U(((u1) obj4).f20217a, c13);
                                }
                                bVar = b2.f20116a;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            obj2 = bVar;
        }
        if (obj2 != b2.f20116a && obj2 != b2.f20117b) {
            if (obj2 == b2.f20119d) {
                return false;
            }
            t(obj2);
        }
        return true;
    }

    public void y(CancellationException cancellationException) {
        w(cancellationException);
    }

    public final boolean z(Throwable th3) {
        if (P()) {
            return true;
        }
        boolean z13 = th3 instanceof CancellationException;
        s sVar = (s) f20112b.get(this);
        return (sVar == null || sVar == h2.f20160a) ? z13 : sVar.a(th3) || z13;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.g.d(coroutineContext, this);
    }

    @Override // ao2.o1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // ao2.o1
    public final x0 invokeOnCompletion(Function1 function1) {
        return O(true, new y0(function1, 1));
    }

    @Override // ao2.o1
    public /* synthetic */ boolean cancel(Throwable th3) {
        CancellationException jobCancellationException;
        if (th3 != null) {
            jobCancellationException = b0(this, th3);
        } else {
            jobCancellationException = new JobCancellationException(A(), null, this);
        }
        y(jobCancellationException);
        return true;
    }
}
