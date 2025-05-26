package co2;

import ao2.v2;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import lb.l0;

/* loaded from: classes2.dex */
public class m implements q {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28312d = AtomicLongFieldUpdater.newUpdater(m.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28313e = AtomicLongFieldUpdater.newUpdater(m.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28314f = AtomicLongFieldUpdater.newUpdater(m.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f28315g = AtomicLongFieldUpdater.newUpdater(m.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28316h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28317i = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28318j = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28319k = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28320l = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f28321a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f28322b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final b f28323c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public m(int i13, Function1 function1) {
        this.f28321a = i13;
        this.f28322b = function1;
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Invalid channel capacity: ", i13, ", should be >=0").toString());
        }
        u uVar = o.f28325a;
        this.bufferEnd$volatile = i13 != 0 ? i13 != Integer.MAX_VALUE ? i13 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f28314f.get(this);
        u uVar2 = new u(0L, null, this, 3);
        this.sendSegment$volatile = uVar2;
        this.receiveSegment$volatile = uVar2;
        if (J()) {
            uVar2 = o.f28325a;
            Intrinsics.g(uVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = uVar2;
        this.f28323c = function1 != null ? new b(this, 0) : null;
        this._closeCause$volatile = o.f28343s;
    }

    public static void E(m mVar) {
        mVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28315g;
        if ((atomicLongFieldUpdater.addAndGet(mVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(mVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object N(co2.m r13, bl2.c r14) {
        /*
            boolean r0 = r14 instanceof co2.k
            if (r0 == 0) goto L14
            r0 = r14
            co2.k r0 = (co2.k) r0
            int r1 = r0.f28308t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f28308t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            co2.k r0 = new co2.k
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f28306r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f28308t
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            ue.c.H(r14)
            co2.t r14 = (co2.t) r14
            java.lang.Object r13 = r14.f28348a
            goto L9a
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            ue.c.H(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = co2.m.f28317i
            java.lang.Object r14 = r14.get(r13)
            co2.u r14 = (co2.u) r14
        L41:
            boolean r1 = r13.H()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.A()
            co2.r r14 = new co2.r
            r14.<init>(r13)
            goto La0
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = co2.m.f28313e
            long r4 = r1.getAndIncrement(r13)
            int r1 = co2.o.f28326b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f69789c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L6e
            co2.u r1 = r13.z(r7, r14)
            if (r1 != 0) goto L6d
            goto L41
        L6d:
            r14 = r1
        L6e:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.U(r8, r9, r10, r12)
            fi.b r7 = co2.o.f28337m
            if (r1 == r7) goto La1
            fi.b r7 = co2.o.f28339o
            if (r1 != r7) goto L8b
            long r7 = r13.D()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L41
            r14.a()
            goto L41
        L8b:
            fi.b r7 = co2.o.f28338n
            if (r1 != r7) goto L9c
            r6.f28308t = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.O(r2, r3, r4, r6)
            if (r13 != r0) goto L9a
            return r0
        L9a:
            r14 = r13
            goto La0
        L9c:
            r14.a()
            r14 = r1
        La0:
            return r14
        La1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.N(co2.m, bl2.c):java.lang.Object");
    }

    public static final u c(m mVar, long j13, u uVar) {
        Object a13;
        mVar.getClass();
        u uVar2 = o.f28325a;
        n nVar = n.f28324a;
        loop0: while (true) {
            a13 = ho2.a.a(uVar, j13, nVar);
            if (!l0.F0(a13)) {
                ho2.v y03 = l0.y0(a13);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28316h;
                    ho2.v vVar = (ho2.v) atomicReferenceFieldUpdater.get(mVar);
                    if (vVar.f69789c >= y03.f69789c) {
                        break loop0;
                    }
                    if (!y03.l()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(mVar, vVar, y03)) {
                        if (atomicReferenceFieldUpdater.get(mVar) != vVar) {
                            if (y03.h()) {
                                y03.g();
                            }
                        }
                    }
                    if (vVar.h()) {
                        vVar.g();
                    }
                }
            } else {
                break;
            }
        }
        boolean F0 = l0.F0(a13);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28313e;
        if (F0) {
            mVar.s();
            if (uVar.f69789c * o.f28326b >= atomicLongFieldUpdater.get(mVar)) {
                return null;
            }
            uVar.a();
            return null;
        }
        u uVar3 = (u) l0.y0(a13);
        long j14 = uVar3.f69789c;
        if (j14 <= j13) {
            return uVar3;
        }
        long j15 = j14 * o.f28326b;
        mVar.X(j15);
        if (j15 >= atomicLongFieldUpdater.get(mVar)) {
            return null;
        }
        uVar3.a();
        return null;
    }

    public static final void e(m mVar, ao2.o oVar) {
        mVar.getClass();
        xk2.q qVar = xk2.s.f135225b;
        oVar.resumeWith(new t(new r(mVar.A())));
    }

    public static final void f(m mVar, ao2.o oVar) {
        mVar.getClass();
        xk2.q qVar = xk2.s.f135225b;
        oVar.resumeWith(ue.c.m(mVar.B()));
    }

    public static final void h(m mVar, Object obj, ao2.o oVar) {
        Function1 function1 = mVar.f28322b;
        if (function1 != null) {
            kg.t.r(function1, obj, oVar.f20185e);
        }
        Throwable C = mVar.C();
        xk2.q qVar = xk2.s.f135225b;
        oVar.resumeWith(ue.c.m(C));
    }

    public static final void i(m mVar, lo2.i iVar) {
        mVar.getClass();
        u uVar = (u) f28317i.get(mVar);
        while (!mVar.H()) {
            long andIncrement = f28313e.getAndIncrement(mVar);
            long j13 = o.f28326b;
            long j14 = andIncrement / j13;
            int i13 = (int) (andIncrement % j13);
            if (uVar.f69789c != j14) {
                u z13 = mVar.z(j14, uVar);
                if (z13 == null) {
                    continue;
                } else {
                    uVar = z13;
                }
            }
            Object U = mVar.U(uVar, i13, andIncrement, iVar);
            if (U == o.f28337m) {
                v2 v2Var = iVar instanceof v2 ? (v2) iVar : null;
                if (v2Var != null) {
                    v2Var.a(uVar, i13);
                    return;
                }
                return;
            }
            if (U != o.f28339o) {
                if (U == o.f28338n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                uVar.a();
                ((lo2.h) iVar).f84192e = U;
                return;
            }
            if (andIncrement < mVar.D()) {
                uVar.a();
            }
        }
        ((lo2.h) iVar).f84192e = o.f28336l;
    }

    public static final int j(m mVar, u uVar, int i13, Object obj, long j13, Object obj2, boolean z13) {
        mVar.getClass();
        uVar.q(i13, obj);
        if (z13) {
            return mVar.V(uVar, i13, obj, j13, obj2, z13);
        }
        Object o13 = uVar.o(i13);
        if (o13 == null) {
            if (mVar.t(j13)) {
                if (uVar.m(i13, null, o.f28328d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (uVar.m(i13, null, obj2)) {
                    return 2;
                }
            }
        } else if (o13 instanceof v2) {
            uVar.q(i13, null);
            if (mVar.R(o13, obj)) {
                uVar.r(i13, o.f28333i);
                return 0;
            }
            fi.b bVar = o.f28335k;
            if (uVar.n(i13, bVar) != bVar) {
                uVar.p(i13, true);
            }
            return 5;
        }
        return mVar.V(uVar, i13, obj, j13, obj2, z13);
    }

    public final Throwable A() {
        return (Throwable) f28319k.get(this);
    }

    public final Throwable B() {
        Throwable A = A();
        return A == null ? new ClosedReceiveChannelException() : A;
    }

    public final Throwable C() {
        Throwable A = A();
        return A == null ? new ClosedSendChannelException() : A;
    }

    public final long D() {
        return f28312d.get(this) & 1152921504606846975L;
    }

    public final boolean F(u uVar, int i13, long j13) {
        Object o13;
        do {
            o13 = uVar.o(i13);
            if (o13 != null && o13 != o.f28329e) {
                if (o13 == o.f28328d) {
                    return true;
                }
                if (o13 == o.f28334j || o13 == o.f28336l || o13 == o.f28333i || o13 == o.f28332h) {
                    return false;
                }
                if (o13 == o.f28331g) {
                    return true;
                }
                return o13 != o.f28330f && j13 == f28313e.get(this);
            }
        } while (!uVar.m(i13, o13, o.f28332h));
        x();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c3, code lost:
    
        r0 = (co2.u) r0.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.G(long, boolean):boolean");
    }

    public final boolean H() {
        return G(f28312d.get(this), true);
    }

    public boolean I() {
        return false;
    }

    public final boolean J() {
        long j13 = f28314f.get(this);
        return j13 == 0 || j13 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        r9 = (co2.u) r9.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long K(co2.u r9) {
        /*
            r8 = this;
        L0:
            int r0 = co2.o.f28326b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r2 = -1
            if (r1 >= r0) goto L3a
            int r1 = co2.o.f28326b
            long r4 = (long) r1
            long r6 = r9.f69789c
            long r6 = r6 * r4
            long r4 = (long) r0
            long r6 = r6 + r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = co2.m.f28313e
            long r4 = r1.get(r8)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L1c
            return r2
        L1c:
            java.lang.Object r1 = r9.o(r0)
            if (r1 == 0) goto L2c
            fi.b r2 = co2.o.f28329e
            if (r1 != r2) goto L27
            goto L2c
        L27:
            fi.b r2 = co2.o.f28328d
            if (r1 != r2) goto L37
            return r6
        L2c:
            fi.b r2 = co2.o.f28336l
            boolean r1 = r9.m(r0, r1, r2)
            if (r1 == 0) goto L1c
            r9.k()
        L37:
            int r0 = r0 + (-1)
            goto L4
        L3a:
            ho2.b r9 = r9.d()
            co2.u r9 = (co2.u) r9
            if (r9 != 0) goto L0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.K(co2.u):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(long r5, co2.u r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f69789c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ho2.b r0 = r7.c()
            co2.u r0 = (co2.u) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            ho2.b r5 = r7.c()
            co2.u r5 = (co2.u) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = co2.m.f28318j
            java.lang.Object r6 = r5.get(r4)
            ho2.v r6 = (ho2.v) r6
            long r0 = r6.f69789c
            long r2 = r7.f69789c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.l()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r5 = a.c.z(r5, r4, r6, r7)
            if (r5 == 0) goto L4a
            boolean r5 = r6.h()
            if (r5 == 0) goto L49
            r6.g()
        L49:
            return
        L4a:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            r7.g()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.L(long, co2.u):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r4 = kg.t.s(r1, r4, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(java.lang.Object r4, bl2.c r5) {
        /*
            r3 = this;
            ao2.o r0 = new ao2.o
            bl2.c r1 = cl2.h.b(r5)
            r2 = 1
            r0.<init>(r2, r1)
            r0.v()
            kotlin.jvm.functions.Function1 r1 = r3.f28322b
            if (r1 == 0) goto L28
            kotlinx.coroutines.internal.UndeliveredElementException r4 = kg.t.t(r1, r4)
            if (r4 == 0) goto L28
            java.lang.Throwable r1 = r3.C()
            xk2.f.a(r4, r1)
            xk2.q r1 = xk2.s.f135225b
            xk2.r r4 = ue.c.m(r4)
            r0.resumeWith(r4)
            goto L35
        L28:
            java.lang.Throwable r4 = r3.C()
            xk2.q r1 = xk2.s.f135225b
            xk2.r r4 = ue.c.m(r4)
            r0.resumeWith(r4)
        L35:
            java.lang.Object r4 = r0.u()
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L42
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
        L42:
            if (r4 != r0) goto L45
            return r4
        L45:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.M(java.lang.Object, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(co2.u r17, int r18, long r19, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.O(co2.u, int, long, bl2.c):java.lang.Object");
    }

    public final void P(v2 v2Var) {
        Q(v2Var, false);
    }

    public final void Q(v2 v2Var, boolean z13) {
        if (v2Var instanceof ao2.m) {
            bl2.c cVar = (bl2.c) v2Var;
            xk2.q qVar = xk2.s.f135225b;
            cVar.resumeWith(ue.c.m(z13 ? B() : C()));
            return;
        }
        if (v2Var instanceof a0) {
            ao2.o oVar = ((a0) v2Var).f28288a;
            xk2.q qVar2 = xk2.s.f135225b;
            oVar.resumeWith(new t(new r(A())));
            return;
        }
        if (!(v2Var instanceof e)) {
            if (v2Var instanceof lo2.i) {
                ((lo2.h) ((lo2.i) v2Var)).i(this, o.f28336l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + v2Var).toString());
            }
        }
        e eVar = (e) v2Var;
        ao2.o oVar2 = eVar.f28299b;
        Intrinsics.f(oVar2);
        eVar.f28299b = null;
        eVar.f28298a = o.f28336l;
        Throwable A = eVar.f28300c.A();
        if (A == null) {
            xk2.q qVar3 = xk2.s.f135225b;
            oVar2.resumeWith(Boolean.FALSE);
        } else {
            xk2.q qVar4 = xk2.s.f135225b;
            oVar2.resumeWith(ue.c.m(A));
        }
    }

    public final boolean R(Object obj, Object obj2) {
        if (obj instanceof lo2.i) {
            return ((lo2.h) ((lo2.i) obj)).i(this, obj2);
        }
        boolean z13 = obj instanceof a0;
        Function1 function1 = this.f28322b;
        if (z13) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return o.b(((a0) obj).f28288a, new t(obj2), function1 != null ? q() : null);
        }
        if (!(obj instanceof e)) {
            if (obj instanceof ao2.m) {
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return o.b((ao2.m) obj, obj2, function1 != null ? n() : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        e eVar = (e) obj;
        ao2.o oVar = eVar.f28299b;
        Intrinsics.f(oVar);
        eVar.f28299b = null;
        eVar.f28298a = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = eVar.f28300c.f28322b;
        return o.b(oVar, bool, function12 != null ? new c(0, function12, obj2) : null);
    }

    public final boolean S(Object obj, u uVar, int i13) {
        if (obj instanceof ao2.m) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return o.b((ao2.m) obj, Unit.f80348a, null);
        }
        if (!(obj instanceof lo2.i)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        lo2.l j13 = ((lo2.h) obj).j(this, Unit.f80348a);
        if (j13 == lo2.l.REREGISTER) {
            uVar.q(i13, null);
        }
        return j13 == lo2.l.SUCCESSFUL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T(co2.u r8, int r9, long r10) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.o(r9)
            boolean r1 = r0 instanceof ao2.v2
            r2 = 1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = co2.m.f28313e
            r4 = 0
            if (r1 == 0) goto L32
            long r5 = r3.get(r7)
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 < 0) goto L32
            fi.b r1 = co2.o.f28331g
            boolean r1 = r8.m(r9, r0, r1)
            if (r1 == 0) goto L32
            boolean r10 = r7.S(r0, r8, r9)
            if (r10 == 0) goto L28
            fi.b r10 = co2.o.f28328d
            r8.r(r9, r10)
            goto L31
        L28:
            fi.b r10 = co2.o.f28334j
            r8.r(r9, r10)
            r8.p(r9, r4)
            r2 = r4
        L31:
            return r2
        L32:
            java.lang.Object r0 = r8.o(r9)
            boolean r1 = r0 instanceof ao2.v2
            if (r1 == 0) goto L6f
            long r5 = r3.get(r7)
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 >= 0) goto L52
            co2.d0 r1 = new co2.d0
            r5 = r0
            ao2.v2 r5 = (ao2.v2) r5
            r1.<init>(r5)
            boolean r0 = r8.m(r9, r0, r1)
            if (r0 == 0) goto L32
            goto Lb4
        L52:
            fi.b r1 = co2.o.f28331g
            boolean r1 = r8.m(r9, r0, r1)
            if (r1 == 0) goto L32
            boolean r10 = r7.S(r0, r8, r9)
            if (r10 == 0) goto L66
            fi.b r10 = co2.o.f28328d
            r8.r(r9, r10)
            goto Lb4
        L66:
            fi.b r10 = co2.o.f28334j
            r8.r(r9, r10)
            r8.p(r9, r4)
            goto L73
        L6f:
            fi.b r1 = co2.o.f28334j
            if (r0 != r1) goto L75
        L73:
            r2 = r4
            goto Lb4
        L75:
            if (r0 != 0) goto L80
            fi.b r1 = co2.o.f28329e
            boolean r0 = r8.m(r9, r0, r1)
            if (r0 == 0) goto L32
            goto Lb4
        L80:
            fi.b r1 = co2.o.f28328d
            if (r0 != r1) goto L85
            goto Lb4
        L85:
            fi.b r1 = co2.o.f28332h
            if (r0 == r1) goto Lb4
            fi.b r1 = co2.o.f28333i
            if (r0 == r1) goto Lb4
            fi.b r1 = co2.o.f28335k
            if (r0 != r1) goto L92
            goto Lb4
        L92:
            fi.b r1 = co2.o.f28336l
            if (r0 != r1) goto L97
            goto Lb4
        L97:
            fi.b r1 = co2.o.f28330f
            if (r0 != r1) goto L9c
            goto L32
        L9c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unexpected cell state: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lb4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.T(co2.u, int, long):boolean");
    }

    public final Object U(u uVar, int i13, long j13, Object obj) {
        Object o13 = uVar.o(i13);
        AtomicReferenceArray atomicReferenceArray = uVar.f28350f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28312d;
        if (o13 == null) {
            if (j13 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return o.f28338n;
                }
                if (uVar.m(i13, o13, obj)) {
                    x();
                    return o.f28337m;
                }
            }
        } else if (o13 == o.f28328d && uVar.m(i13, o13, o.f28333i)) {
            x();
            Object obj2 = atomicReferenceArray.get(i13 * 2);
            uVar.q(i13, null);
            return obj2;
        }
        while (true) {
            Object o14 = uVar.o(i13);
            if (o14 == null || o14 == o.f28329e) {
                if (j13 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (uVar.m(i13, o14, o.f28332h)) {
                        x();
                        return o.f28339o;
                    }
                } else {
                    if (obj == null) {
                        return o.f28338n;
                    }
                    if (uVar.m(i13, o14, obj)) {
                        x();
                        return o.f28337m;
                    }
                }
            } else {
                if (o14 != o.f28328d) {
                    fi.b bVar = o.f28334j;
                    if (o14 != bVar && o14 != o.f28332h) {
                        if (o14 == o.f28336l) {
                            x();
                            return o.f28339o;
                        }
                        if (o14 != o.f28331g && uVar.m(i13, o14, o.f28330f)) {
                            boolean z13 = o14 instanceof d0;
                            if (z13) {
                                o14 = ((d0) o14).f28297a;
                            }
                            if (S(o14, uVar, i13)) {
                                uVar.r(i13, o.f28333i);
                                x();
                                Object obj3 = atomicReferenceArray.get(i13 * 2);
                                uVar.q(i13, null);
                                return obj3;
                            }
                            uVar.r(i13, bVar);
                            uVar.p(i13, false);
                            if (z13) {
                                x();
                            }
                            return o.f28339o;
                        }
                    }
                    return o.f28339o;
                }
                if (uVar.m(i13, o14, o.f28333i)) {
                    x();
                    Object obj4 = atomicReferenceArray.get(i13 * 2);
                    uVar.q(i13, null);
                    return obj4;
                }
            }
        }
    }

    public final int V(u uVar, int i13, Object obj, long j13, Object obj2, boolean z13) {
        while (true) {
            Object o13 = uVar.o(i13);
            if (o13 == null) {
                if (!t(j13) || z13) {
                    if (z13) {
                        if (uVar.m(i13, null, o.f28334j)) {
                            uVar.p(i13, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (uVar.m(i13, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (uVar.m(i13, null, o.f28328d)) {
                    return 1;
                }
            } else {
                if (o13 != o.f28329e) {
                    fi.b bVar = o.f28335k;
                    if (o13 == bVar) {
                        uVar.q(i13, null);
                        return 5;
                    }
                    if (o13 == o.f28332h) {
                        uVar.q(i13, null);
                        return 5;
                    }
                    if (o13 == o.f28336l) {
                        uVar.q(i13, null);
                        s();
                        return 4;
                    }
                    uVar.q(i13, null);
                    if (o13 instanceof d0) {
                        o13 = ((d0) o13).f28297a;
                    }
                    if (R(o13, obj)) {
                        uVar.r(i13, o.f28333i);
                        return 0;
                    }
                    if (uVar.n(i13, bVar) != bVar) {
                        uVar.p(i13, true);
                    }
                    return 5;
                }
                if (uVar.m(i13, o13, o.f28328d)) {
                    return 1;
                }
            }
        }
    }

    public final void W(long j13) {
        long j14;
        do {
            j14 = f28313e.get(this);
            if (j14 >= j13) {
                return;
            }
        } while (!f28313e.compareAndSet(this, j14, j13));
    }

    public final void X(long j13) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j14;
        long j15;
        do {
            atomicLongFieldUpdater = f28312d;
            j14 = atomicLongFieldUpdater.get(this);
            j15 = 1152921504606846975L & j14;
            if (j15 >= j13) {
                return;
            } else {
                u uVar = o.f28325a;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j14, j15 + (((int) (j14 >> 60)) << 60)));
    }

    public final void Y(long j13) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j15;
        if (J()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f28314f;
        } while (atomicLongFieldUpdater.get(this) <= j13);
        int i13 = o.f28327c;
        int i14 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = f28315g;
            if (i14 >= i13) {
                do {
                    j14 = atomicLongFieldUpdater3.get(this);
                } while (!atomicLongFieldUpdater3.compareAndSet(this, j14, o.a(j14 & 4611686018427387903L, true)));
                while (true) {
                    long j16 = atomicLongFieldUpdater.get(this);
                    atomicLongFieldUpdater2 = f28315g;
                    long j17 = atomicLongFieldUpdater2.get(this);
                    long j18 = j17 & 4611686018427387903L;
                    boolean z13 = (4611686018427387904L & j17) != 0;
                    if (j16 == j18 && j16 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z13) {
                        atomicLongFieldUpdater2.compareAndSet(this, j17, o.a(j18, true));
                    }
                }
                do {
                    j15 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j15, o.a(j15 & 4611686018427387903L, false)));
                return;
            }
            long j19 = atomicLongFieldUpdater.get(this);
            if (j19 == (atomicLongFieldUpdater3.get(this) & 4611686018427387903L) && j19 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i14++;
            }
        }
    }

    @Override // co2.b0
    public final Object a(bl2.c cVar) {
        return N(this, cVar);
    }

    @Override // co2.c0
    public final void b(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f28320l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            fi.b bVar = o.f28341q;
            if (obj != bVar) {
                if (obj == o.f28342r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            fi.b bVar2 = o.f28342r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, bVar, bVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != bVar) {
                    break;
                }
            }
            function1.invoke(A());
            return;
        }
    }

    @Override // co2.b0
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        u(true, cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return kotlin.Unit.f80348a;
     */
    @Override // co2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.g(java.lang.Object):java.lang.Object");
    }

    @Override // co2.b0
    public final e iterator() {
        return new e(this);
    }

    @Override // co2.b0
    public final lo2.d k() {
        g gVar = g.f28302a;
        dl2.b.y(3, gVar);
        h hVar = h.f28303a;
        dl2.b.y(3, hVar);
        return new lo2.e(this, gVar, hVar, this.f28323c);
    }

    @Override // co2.b0
    public final lo2.d l() {
        i iVar = i.f28304a;
        dl2.b.y(3, iVar);
        j jVar = j.f28305a;
        dl2.b.y(3, jVar);
        return new lo2.e(this, iVar, jVar, this.f28323c);
    }

    @Override // co2.b0
    public final Object m() {
        u uVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28313e;
        long j13 = atomicLongFieldUpdater.get(this);
        long j14 = f28312d.get(this);
        if (G(j14, true)) {
            return new r(A());
        }
        long j15 = j14 & 1152921504606846975L;
        Object obj = t.f28347b;
        if (j13 >= j15) {
            return obj;
        }
        Object obj2 = o.f28335k;
        u uVar2 = (u) f28317i.get(this);
        while (!H()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j16 = o.f28326b;
            long j17 = andIncrement / j16;
            int i13 = (int) (andIncrement % j16);
            if (uVar2.f69789c != j17) {
                u z13 = z(j17, uVar2);
                if (z13 == null) {
                    continue;
                } else {
                    uVar = z13;
                }
            } else {
                uVar = uVar2;
            }
            Object U = U(uVar, i13, andIncrement, obj2);
            if (U == o.f28337m) {
                v2 v2Var = obj2 instanceof v2 ? (v2) obj2 : null;
                if (v2Var != null) {
                    v2Var.a(uVar, i13);
                }
                Y(andIncrement);
                uVar.k();
            } else if (U == o.f28339o) {
                if (andIncrement < D()) {
                    uVar.a();
                }
                uVar2 = uVar;
            } else {
                if (U == o.f28338n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                uVar.a();
                obj = U;
            }
            return obj;
        }
        return new r(A());
    }

    public final f n() {
        return new f(this, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e3, code lost:
    
        return kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        h(r25, r26, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c6, code lost:
    
        r1.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0137, code lost:
    
        if (r22 >= r5.get(r25)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0139, code lost:
    
        r20.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013c, code lost:
    
        r1 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // co2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(java.lang.Object r26, bl2.c r27) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.o(java.lang.Object, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [ao2.o] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r17v0, types: [co2.m, java.lang.Object] */
    @Override // co2.b0
    public final Object p(bl2.c frame) {
        u uVar;
        ?? r13;
        Object U;
        ao2.o oVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28317i;
        u uVar2 = (u) atomicReferenceFieldUpdater.get(this);
        while (!H()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f28313e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = o.f28326b;
            long j14 = andIncrement / j13;
            int i13 = (int) (andIncrement % j13);
            if (uVar2.f69789c != j14) {
                u z13 = z(j14, uVar2);
                if (z13 == null) {
                    continue;
                } else {
                    uVar = z13;
                }
            } else {
                uVar = uVar2;
            }
            Object U2 = U(uVar, i13, andIncrement, null);
            fi.b bVar = o.f28337m;
            if (U2 == bVar) {
                throw new IllegalStateException("unexpected".toString());
            }
            fi.b bVar2 = o.f28339o;
            if (U2 != bVar2) {
                if (U2 == o.f28338n) {
                    ao2.o x03 = l0.x0(cl2.h.b(frame));
                    try {
                        U = U(uVar, i13, andIncrement, x03);
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = x03;
                    }
                    try {
                        if (U == bVar) {
                            oVar = x03;
                            oVar.a(uVar, i13);
                        } else {
                            oVar = x03;
                            f fVar = null;
                            Function1 function1 = this.f28322b;
                            if (U == bVar2) {
                                if (andIncrement < D()) {
                                    uVar.a();
                                }
                                u uVar3 = (u) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (H()) {
                                        f(this, oVar);
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j15 = o.f28326b;
                                    long j16 = andIncrement2 / j15;
                                    int i14 = (int) (andIncrement2 % j15);
                                    if (uVar3.f69789c != j16) {
                                        u z14 = z(j16, uVar3);
                                        if (z14 != null) {
                                            uVar3 = z14;
                                        }
                                    }
                                    Function1 function12 = function1;
                                    U = U(uVar3, i14, andIncrement2, oVar);
                                    if (U == o.f28337m) {
                                        oVar.a(uVar3, i14);
                                        break;
                                    }
                                    if (U == o.f28339o) {
                                        if (andIncrement2 < D()) {
                                            uVar3.a();
                                        }
                                        function1 = function12;
                                    } else {
                                        if (U == o.f28338n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        uVar3.a();
                                        if (function12 != null) {
                                            fVar = n();
                                        }
                                    }
                                }
                            } else {
                                uVar.a();
                                if (function1 != null) {
                                    fVar = n();
                                }
                            }
                            oVar.n(U, fVar);
                        }
                        U2 = oVar.u();
                        if (U2 == cl2.a.COROUTINE_SUSPENDED) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r13 = bVar;
                        r13.C();
                        throw th;
                    }
                } else {
                    uVar.a();
                }
                return U2;
            }
            if (andIncrement < D()) {
                uVar.a();
            }
            uVar2 = uVar;
        }
        Throwable B = B();
        int i15 = ho2.w.f69790a;
        throw B;
    }

    public final f q() {
        return new f(this, 1);
    }

    @Override // co2.c0
    public final boolean r(Throwable th3) {
        return u(false, th3);
    }

    @Override // co2.c0
    public final boolean s() {
        return G(f28312d.get(this), false);
    }

    public final boolean t(long j13) {
        return j13 < f28314f.get(this) || j13 < f28313e.get(this) + ((long) this.f28321a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b3, code lost:
    
        r3 = (co2.u) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.toString():java.lang.String");
    }

    public final boolean u(boolean z13, Throwable th3) {
        boolean z14;
        long j13;
        long j14;
        long j15;
        Object obj;
        long j16;
        long j17;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28312d;
        if (z13) {
            do {
                j17 = atomicLongFieldUpdater.get(this);
                if (((int) (j17 >> 60)) != 0) {
                    break;
                }
                u uVar = o.f28325a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j17, (1 << 60) + (j17 & 1152921504606846975L)));
        }
        fi.b bVar = o.f28343s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28319k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, bVar, th3)) {
                z14 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != bVar) {
                z14 = false;
                break;
            }
        }
        if (z13) {
            do {
                j16 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j16, (3 << 60) + (j16 & 1152921504606846975L)));
        } else {
            do {
                j13 = atomicLongFieldUpdater.get(this);
                int i13 = (int) (j13 >> 60);
                if (i13 == 0) {
                    j14 = j13 & 1152921504606846975L;
                    j15 = 2;
                } else {
                    if (i13 != 1) {
                        break;
                    }
                    j14 = j13 & 1152921504606846975L;
                    j15 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j13, (j15 << 60) + j14));
        }
        s();
        if (z14) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28320l;
                obj = atomicReferenceFieldUpdater2.get(this);
                fi.b bVar2 = obj == null ? o.f28341q : o.f28342r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, bVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                dl2.b.y(1, obj);
                ((Function1) obj).invoke(A());
            }
        }
        return z14;
    }

    public final u v(long j13) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f28318j.get(this);
        u uVar = (u) f28316h.get(this);
        if (uVar.f69789c > ((u) obj2).f69789c) {
            obj2 = uVar;
        }
        u uVar2 = (u) f28317i.get(this);
        if (uVar2.f69789c > ((u) obj2).f69789c) {
            obj2 = uVar2;
        }
        ho2.b bVar = (ho2.b) obj2;
        fi.b bVar2 = ho2.a.f69743a;
        loop0: while (true) {
            bVar.getClass();
            Object obj3 = ho2.b.f69748a.get(bVar);
            fi.b bVar3 = ho2.a.f69743a;
            obj = null;
            if (obj3 == bVar3) {
                break;
            }
            ho2.b bVar4 = (ho2.b) obj3;
            if (bVar4 == null) {
                do {
                    atomicReferenceFieldUpdater = ho2.b.f69748a;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, bVar3)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar4;
            }
        }
        u uVar3 = (u) bVar;
        if (I()) {
            long K = K(uVar3);
            if (K != -1) {
                w(K);
            }
        }
        loop2: for (u uVar4 = uVar3; uVar4 != null; uVar4 = (u) uVar4.d()) {
            for (int i13 = o.f28326b - 1; -1 < i13; i13--) {
                if ((uVar4.f69789c * o.f28326b) + i13 < j13) {
                    break loop2;
                }
                while (true) {
                    Object o13 = uVar4.o(i13);
                    if (o13 != null && o13 != o.f28329e) {
                        if (!(o13 instanceof d0)) {
                            if (!(o13 instanceof v2)) {
                                break;
                            }
                            if (uVar4.m(i13, o13, o.f28336l)) {
                                obj = dl2.b.n2(obj, o13);
                                uVar4.p(i13, true);
                                break;
                            }
                        } else {
                            if (uVar4.m(i13, o13, o.f28336l)) {
                                obj = dl2.b.n2(obj, ((d0) o13).f28297a);
                                uVar4.p(i13, true);
                                break;
                            }
                        }
                    } else {
                        if (uVar4.m(i13, o13, o.f28336l)) {
                            uVar4.k();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Q((v2) arrayList.get(size), true);
                }
            } else {
                Q((v2) obj, true);
            }
        }
        return uVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r1 = kg.t.s(r2, r1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(long r11) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = co2.m.f28317i
            java.lang.Object r0 = r0.get(r10)
            co2.u r0 = (co2.u) r0
        L8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = co2.m.f28313e
            long r8 = r1.get(r10)
            int r2 = r10.f28321a
            long r2 = (long) r2
            long r2 = r2 + r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = co2.m.f28314f
            long r4 = r4.get(r10)
            long r2 = java.lang.Math.max(r2, r4)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 >= 0) goto L21
            return
        L21:
            r2 = 1
            long r5 = r8 + r2
            r2 = r10
            r3 = r8
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L8
            int r1 = co2.o.f28326b
            long r1 = (long) r1
            long r3 = r8 / r1
            long r1 = r8 % r1
            int r1 = (int) r1
            long r5 = r0.f69789c
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L43
            co2.u r2 = r10.z(r3, r0)
            if (r2 != 0) goto L42
            goto L8
        L42:
            r0 = r2
        L43:
            r7 = 0
            r2 = r10
            r3 = r0
            r4 = r1
            r5 = r8
            java.lang.Object r1 = r2.U(r3, r4, r5, r7)
            fi.b r2 = co2.o.f28339o
            if (r1 != r2) goto L5c
            long r1 = r10.D()
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 >= 0) goto L8
            r0.a()
            goto L8
        L5c:
            r0.a()
            kotlin.jvm.functions.Function1 r2 = r10.f28322b
            if (r2 == 0) goto L8
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kg.t.t(r2, r1)
            if (r1 != 0) goto L6a
            goto L8
        L6a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.m.w(long):void");
    }

    public final void x() {
        if (J()) {
            return;
        }
        u uVar = (u) f28318j.get(this);
        while (true) {
            long andIncrement = f28314f.getAndIncrement(this);
            long j13 = o.f28326b;
            long j14 = andIncrement / j13;
            if (D() <= andIncrement) {
                if (uVar.f69789c < j14 && uVar.c() != null) {
                    L(j14, uVar);
                }
                E(this);
                return;
            }
            if (uVar.f69789c != j14) {
                u y13 = y(j14, uVar, andIncrement);
                if (y13 == null) {
                    continue;
                } else {
                    uVar = y13;
                }
            }
            if (T(uVar, (int) (andIncrement % j13), andIncrement)) {
                E(this);
                return;
            }
            E(this);
        }
    }

    public final u y(long j13, u uVar, long j14) {
        Object a13;
        u uVar2 = o.f28325a;
        n nVar = n.f28324a;
        loop0: while (true) {
            a13 = ho2.a.a(uVar, j13, nVar);
            if (!l0.F0(a13)) {
                ho2.v y03 = l0.y0(a13);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28318j;
                    ho2.v vVar = (ho2.v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f69789c >= y03.f69789c) {
                        break loop0;
                    }
                    if (!y03.l()) {
                        break;
                    }
                    if (a.c.A(atomicReferenceFieldUpdater, this, vVar, y03)) {
                        if (vVar.h()) {
                            vVar.g();
                        }
                    } else if (y03.h()) {
                        y03.g();
                    }
                }
            } else {
                break;
            }
        }
        if (l0.F0(a13)) {
            s();
            L(j13, uVar);
            E(this);
            return null;
        }
        u uVar3 = (u) l0.y0(a13);
        long j15 = uVar3.f69789c;
        if (j15 <= j13) {
            return uVar3;
        }
        long j16 = j15 * o.f28326b;
        if (!f28314f.compareAndSet(this, j14 + 1, j16)) {
            E(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28315g;
        if ((atomicLongFieldUpdater.addAndGet(this, j16 - j14) & 4611686018427387904L) == 0) {
            return null;
        }
        while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
        }
        return null;
    }

    public final u z(long j13, u uVar) {
        Object a13;
        u uVar2 = o.f28325a;
        n nVar = n.f28324a;
        loop0: while (true) {
            a13 = ho2.a.a(uVar, j13, nVar);
            if (!l0.F0(a13)) {
                ho2.v y03 = l0.y0(a13);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28317i;
                    ho2.v vVar = (ho2.v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f69789c >= y03.f69789c) {
                        break loop0;
                    }
                    if (!y03.l()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, y03)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            if (y03.h()) {
                                y03.g();
                            }
                        }
                    }
                    if (vVar.h()) {
                        vVar.g();
                    }
                }
            } else {
                break;
            }
        }
        if (l0.F0(a13)) {
            s();
            if (uVar.f69789c * o.f28326b >= D()) {
                return null;
            }
            uVar.a();
            return null;
        }
        u uVar3 = (u) l0.y0(a13);
        boolean J2 = J();
        long j14 = uVar3.f69789c;
        if (!J2 && j13 <= f28314f.get(this) / o.f28326b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28318j;
                ho2.v vVar2 = (ho2.v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f69789c >= j14 || !uVar3.l()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, uVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                        if (uVar3.h()) {
                            uVar3.g();
                        }
                    }
                }
                if (vVar2.h()) {
                    vVar2.g();
                }
            }
        }
        if (j14 <= j13) {
            return uVar3;
        }
        long j15 = j14 * o.f28326b;
        W(j15);
        if (j15 >= D()) {
            return null;
        }
        uVar3.a();
        return null;
    }
}
