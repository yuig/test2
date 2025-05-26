package ao2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;

/* loaded from: classes2.dex */
public class o extends t0 implements m, dl2.e, v2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20181f = AtomicIntegerFieldUpdater.newUpdater(o.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20182g = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20183h = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final bl2.c f20184d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f20185e;

    public o(int i13, bl2.c cVar) {
        super(i13);
        this.f20184d = cVar;
        this.f20185e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f20113a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object E(i2 i2Var, Object obj, int i13, kl2.l lVar) {
        if ((obj instanceof z) || !com.bumptech.glide.c.p0(i13)) {
            return obj;
        }
        if (lVar != null || (i2Var instanceof l)) {
            return new y(obj, i2Var instanceof l ? (l) i2Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        bl2.c cVar = this.f20184d;
        Throwable th3 = null;
        ho2.e eVar = cVar instanceof ho2.e ? (ho2.e) cVar : null;
        if (eVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ho2.e.f69753h;
                Object obj = atomicReferenceFieldUpdater.get(eVar);
                fi.b bVar = ho2.f.f69759b;
                if (obj == bVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, bVar, this)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != bVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th3 = (Throwable) obj;
                }
            }
            if (th3 == null) {
                return;
            }
            r();
            cancel(th3);
        }
    }

    public final void D(Object obj, int i13, kl2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20182g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof i2) {
                Object E = E((i2) obj2, obj, i13, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    r();
                }
                s(i13);
                return;
            }
            if (obj2 instanceof q) {
                q qVar = (q) obj2;
                qVar.getClass();
                if (q.f20194c.compareAndSet(qVar, 0, 1)) {
                    if (lVar != null) {
                        p(lVar, qVar.f20242a, obj);
                        return;
                    }
                    return;
                }
            }
            m(obj);
            throw null;
        }
    }

    public final fi.b F(Object obj, kl2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20182g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof i2)) {
                boolean z13 = obj2 instanceof y;
                return null;
            }
            Object E = E((i2) obj2, obj, this.f20207c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!z()) {
                r();
            }
            return p.f20189a;
        }
    }

    @Override // ao2.v2
    public final void a(ho2.v vVar, int i13) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        do {
            atomicIntegerFieldUpdater = f20181f;
            i14 = atomicIntegerFieldUpdater.get(this);
            if ((i14 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, ((i14 >> 29) << 29) + i13));
        y(vVar);
    }

    @Override // ao2.t0
    public final void b(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20182g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof i2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj instanceof z) {
                return;
            }
            if (!(obj instanceof y)) {
                y yVar = new y(obj, (l) null, (kl2.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, yVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            y yVar2 = (y) obj;
            if (!(!(yVar2.f20237e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            y a13 = y.a(yVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a13)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            l lVar = yVar2.f20234b;
            if (lVar != null) {
                o(lVar, cancellationException);
            }
            kl2.l lVar2 = yVar2.f20235c;
            if (lVar2 != null) {
                p(lVar2, cancellationException, yVar2.f20233a);
                return;
            }
            return;
        }
    }

    @Override // ao2.t0
    public final bl2.c c() {
        return this.f20184d;
    }

    @Override // ao2.m
    public final boolean cancel(Throwable th3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20182g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof i2)) {
                return false;
            }
            q qVar = new q(this, th3, (obj instanceof l) || (obj instanceof ho2.v));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            i2 i2Var = (i2) obj;
            if (i2Var instanceof l) {
                o((l) obj, th3);
            } else if (i2Var instanceof ho2.v) {
                q((ho2.v) obj, th3);
            }
            if (!z()) {
                r();
            }
            s(this.f20207c);
            return true;
        }
    }

    @Override // ao2.t0
    public final Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    @Override // ao2.m
    public final void e(Function1 function1) {
        lb.l0.E0(this, new k(function1, 0));
    }

    @Override // ao2.m
    public final fi.b f(Throwable th3) {
        return F(new z(false, th3), null);
    }

    @Override // ao2.t0
    public final Object g(Object obj) {
        return obj instanceof y ? ((y) obj).f20233a : obj;
    }

    @Override // dl2.e
    public final dl2.e getCallerFrame() {
        bl2.c cVar = this.f20184d;
        if (cVar instanceof dl2.e) {
            return (dl2.e) cVar;
        }
        return null;
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f20185e;
    }

    @Override // ao2.m
    public final void h(Object obj, final Function1 function1) {
        D(obj, this.f20207c, new kl2.l() { // from class: ao2.n
            @Override // kl2.l
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Function1.this.invoke((Throwable) obj2);
                return Unit.f80348a;
            }
        });
    }

    @Override // ao2.m
    public final void i(f0 f0Var, Unit unit) {
        bl2.c cVar = this.f20184d;
        ho2.e eVar = cVar instanceof ho2.e ? (ho2.e) cVar : null;
        D(unit, (eVar != null ? eVar.f69754d : null) == f0Var ? 4 : this.f20207c, null);
    }

    @Override // ao2.m
    public final boolean isActive() {
        return f20182g.get(this) instanceof i2;
    }

    @Override // ao2.m
    public final boolean isCompleted() {
        return !(f20182g.get(this) instanceof i2);
    }

    @Override // ao2.m
    public final fi.b j(Object obj, kl2.l lVar) {
        return F(obj, lVar);
    }

    @Override // ao2.t0
    public final Object l() {
        return f20182g.get(this);
    }

    @Override // ao2.m
    public final void n(Object obj, kl2.l lVar) {
        D(obj, this.f20207c, lVar);
    }

    public final void o(l lVar, Throwable th3) {
        try {
            lVar.b(th3);
        } catch (Throwable th4) {
            kh2.j1.l0(this.f20185e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    public final void p(kl2.l lVar, Throwable th3, Object obj) {
        CoroutineContext coroutineContext = this.f20185e;
        try {
            lVar.invoke(th3, obj, coroutineContext);
        } catch (Throwable th4) {
            kh2.j1.l0(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th4));
        }
    }

    public final void q(ho2.v vVar, Throwable th3) {
        CoroutineContext coroutineContext = this.f20185e;
        int i13 = f20181f.get(this) & 536870911;
        if (i13 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            vVar.j(i13, coroutineContext);
        } catch (Throwable th4) {
            kh2.j1.l0(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20183h;
        x0 x0Var = (x0) atomicReferenceFieldUpdater.get(this);
        if (x0Var == null) {
            return;
        }
        x0Var.dispose();
        atomicReferenceFieldUpdater.set(this, h2.f20160a);
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        Throwable a13 = xk2.s.a(obj);
        if (a13 != null) {
            obj = new z(false, a13);
        }
        D(obj, this.f20207c, null);
    }

    public final void s(int i13) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        do {
            atomicIntegerFieldUpdater = f20181f;
            i14 = atomicIntegerFieldUpdater.get(this);
            int i15 = i14 >> 29;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z13 = i13 == 4;
                bl2.c cVar = this.f20184d;
                if (z13 || !(cVar instanceof ho2.e) || com.bumptech.glide.c.p0(i13) != com.bumptech.glide.c.p0(this.f20207c)) {
                    com.bumptech.glide.c.Z0(this, cVar, z13);
                    return;
                }
                ho2.e eVar = (ho2.e) cVar;
                f0 f0Var = eVar.f69754d;
                CoroutineContext context = eVar.f69755e.getContext();
                if (f0Var.k(context)) {
                    f0Var.g(context, this);
                    return;
                }
                f1 a13 = o2.a();
                if (a13.J()) {
                    a13.w(this);
                    return;
                }
                a13.A(true);
                try {
                    com.bumptech.glide.c.Z0(this, cVar, true);
                    do {
                    } while (a13.L());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, 1073741824 + (536870911 & i14)));
    }

    public Throwable t(a2 a2Var) {
        return a2Var.getCancellationException();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(B());
        sb3.append('(');
        sb3.append(m0.q0(this.f20184d));
        sb3.append("){");
        Object obj = f20182g.get(this);
        sb3.append(obj instanceof i2 ? "Active" : obj instanceof q ? "Cancelled" : "Completed");
        sb3.append("}@");
        sb3.append(m0.y(this));
        return sb3.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        boolean z13 = z();
        do {
            atomicIntegerFieldUpdater = f20181f;
            i13 = atomicIntegerFieldUpdater.get(this);
            int i14 = i13 >> 29;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (z13) {
                    C();
                }
                Object obj = f20182g.get(this);
                if (obj instanceof z) {
                    throw ((z) obj).f20242a;
                }
                if (com.bumptech.glide.c.p0(this.f20207c)) {
                    o1 o1Var = (o1) this.f20185e.get(g0.f20154b);
                    if (o1Var != null && !o1Var.isActive()) {
                        CancellationException cancellationException = o1Var.getCancellationException();
                        b(cancellationException);
                        throw cancellationException;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, 536870912 + (536870911 & i13)));
        if (((x0) f20183h.get(this)) == null) {
            w();
        }
        if (z13) {
            C();
        }
        return cl2.a.COROUTINE_SUSPENDED;
    }

    public final void v() {
        x0 w13 = w();
        if (w13 != null && isCompleted()) {
            w13.dispose();
            f20183h.set(this, h2.f20160a);
        }
    }

    public final x0 w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var = (o1) this.f20185e.get(g0.f20154b);
        if (o1Var == null) {
            return null;
        }
        x0 R = m0.R(o1Var, true, new r(this, 0));
        do {
            atomicReferenceFieldUpdater = f20183h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, R)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return R;
    }

    @Override // ao2.m
    public final void x(Object obj) {
        s(this.f20207c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b8, code lost:
    
        A(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bb, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ao2.o.f20182g
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof ao2.b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof ao2.l
            r2 = 0
            if (r1 != 0) goto Lb8
            boolean r1 = r7 instanceof ho2.v
            if (r1 != 0) goto Lb8
            boolean r1 = r7 instanceof ao2.z
            if (r1 == 0) goto L5a
            r0 = r7
            ao2.z r0 = (ao2.z) r0
            r0.getClass()
            r3 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = ao2.z.f20241b
            r5 = 0
            boolean r3 = r4.compareAndSet(r0, r5, r3)
            if (r3 == 0) goto L56
            boolean r3 = r7 instanceof ao2.q
            if (r3 == 0) goto L55
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L41
            java.lang.Throwable r2 = r0.f20242a
        L41:
            boolean r0 = r10 instanceof ao2.l
            if (r0 == 0) goto L4b
            ao2.l r10 = (ao2.l) r10
            r9.o(r10, r2)
            goto L55
        L4b:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.Intrinsics.g(r10, r0)
            ho2.v r10 = (ho2.v) r10
            r9.q(r10, r2)
        L55:
            return
        L56:
            A(r10, r7)
            throw r2
        L5a:
            boolean r1 = r7 instanceof ao2.y
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L93
            r1 = r7
            ao2.y r1 = (ao2.y) r1
            ao2.l r4 = r1.f20234b
            if (r4 != 0) goto L8f
            boolean r4 = r10 instanceof ho2.v
            if (r4 == 0) goto L6c
            return
        L6c:
            kotlin.jvm.internal.Intrinsics.g(r10, r3)
            r3 = r10
            ao2.l r3 = (ao2.l) r3
            java.lang.Throwable r4 = r1.f20237e
            if (r4 == 0) goto L7a
            r9.o(r3, r4)
            return
        L7a:
            r4 = 29
            ao2.y r1 = ao2.y.a(r1, r3, r2, r4)
        L80:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L87
            return
        L87:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L80
            goto L0
        L8f:
            A(r10, r7)
            throw r2
        L93:
            boolean r1 = r10 instanceof ho2.v
            if (r1 == 0) goto L98
            return
        L98:
            kotlin.jvm.internal.Intrinsics.g(r10, r3)
            r3 = r10
            ao2.l r3 = (ao2.l) r3
            ao2.y r8 = new ao2.y
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        La9:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto Lb0
            return
        Lb0:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La9
            goto L0
        Lb8:
            A(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ao2.o.y(java.lang.Object):void");
    }

    public final boolean z() {
        if (this.f20207c == 2) {
            bl2.c cVar = this.f20184d;
            Intrinsics.g(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (ho2.e.f69753h.get((ho2.e) cVar) != null) {
                return true;
            }
        }
        return false;
    }
}
