package co2;

import ao2.v2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class e implements v2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f28298a = o.f28340p;

    /* renamed from: b, reason: collision with root package name */
    public ao2.o f28299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f28300c;

    public e(m mVar) {
        this.f28300c = mVar;
    }

    public static final void b(e eVar) {
        ao2.o oVar = eVar.f28299b;
        Intrinsics.f(oVar);
        eVar.f28299b = null;
        eVar.f28298a = o.f28336l;
        Throwable A = eVar.f28300c.A();
        if (A == null) {
            xk2.q qVar = xk2.s.f135225b;
            oVar.resumeWith(Boolean.FALSE);
        } else {
            xk2.q qVar2 = xk2.s.f135225b;
            oVar.resumeWith(ue.c.m(A));
        }
    }

    @Override // ao2.v2
    public final void a(ho2.v vVar, int i13) {
        ao2.o oVar = this.f28299b;
        if (oVar != null) {
            oVar.a(vVar, i13);
        }
    }

    public final Object d(bl2.c frame) {
        Boolean bool;
        Object obj = this.f28298a;
        boolean z13 = true;
        if (obj == o.f28340p || obj == o.f28336l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f28317i;
            m mVar = this.f28300c;
            u uVar = (u) atomicReferenceFieldUpdater.get(mVar);
            while (true) {
                int i13 = 0;
                if (mVar.H()) {
                    f();
                    z13 = false;
                    break;
                }
                long andIncrement = m.f28313e.getAndIncrement(mVar);
                long j13 = o.f28326b;
                long j14 = andIncrement / j13;
                int i14 = (int) (andIncrement % j13);
                if (uVar.f69789c != j14) {
                    u z14 = mVar.z(j14, uVar);
                    if (z14 == null) {
                        continue;
                    } else {
                        uVar = z14;
                    }
                }
                Object U = mVar.U(uVar, i14, andIncrement, null);
                fi.b bVar = o.f28337m;
                if (U == bVar) {
                    throw new IllegalStateException("unreachable".toString());
                }
                fi.b bVar2 = o.f28339o;
                if (U == bVar2) {
                    if (andIncrement < mVar.D()) {
                        uVar.a();
                    }
                } else {
                    if (U == o.f28338n) {
                        m mVar2 = this.f28300c;
                        ao2.o x03 = l0.x0(cl2.h.b(frame));
                        try {
                            this.f28299b = x03;
                            Object U2 = mVar2.U(uVar, i14, andIncrement, this);
                            if (U2 == bVar) {
                                a(uVar, i14);
                            } else {
                                c cVar = null;
                                Function1 function1 = mVar2.f28322b;
                                if (U2 == bVar2) {
                                    if (andIncrement < mVar2.D()) {
                                        uVar.a();
                                    }
                                    u uVar2 = (u) m.f28317i.get(mVar2);
                                    while (true) {
                                        if (mVar2.H()) {
                                            b(this);
                                            break;
                                        }
                                        long andIncrement2 = m.f28313e.getAndIncrement(mVar2);
                                        long j15 = o.f28326b;
                                        long j16 = andIncrement2 / j15;
                                        int i15 = (int) (andIncrement2 % j15);
                                        if (uVar2.f69789c != j16) {
                                            u z15 = mVar2.z(j16, uVar2);
                                            if (z15 != null) {
                                                uVar2 = z15;
                                            }
                                        }
                                        Object U3 = mVar2.U(uVar2, i15, andIncrement2, this);
                                        if (U3 == o.f28337m) {
                                            a(uVar2, i15);
                                            break;
                                        }
                                        if (U3 == o.f28339o) {
                                            if (andIncrement2 < mVar2.D()) {
                                                uVar2.a();
                                            }
                                        } else {
                                            if (U3 == o.f28338n) {
                                                throw new IllegalStateException("unexpected".toString());
                                            }
                                            uVar2.a();
                                            this.f28298a = U3;
                                            this.f28299b = null;
                                            bool = Boolean.TRUE;
                                            if (function1 != null) {
                                                cVar = new c(i13, function1, U3);
                                            }
                                        }
                                    }
                                } else {
                                    uVar.a();
                                    this.f28298a = U2;
                                    this.f28299b = null;
                                    bool = Boolean.TRUE;
                                    if (function1 != null) {
                                        cVar = new c(i13, function1, U2);
                                    }
                                }
                                x03.n(bool, cVar);
                            }
                            Object u13 = x03.u();
                            if (u13 == cl2.a.COROUTINE_SUSPENDED) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            return u13;
                        } catch (Throwable th3) {
                            x03.C();
                            throw th3;
                        }
                    }
                    uVar.a();
                    this.f28298a = U;
                }
            }
        }
        return Boolean.valueOf(z13);
    }

    public final Object e() {
        Throwable B;
        Object obj = this.f28298a;
        fi.b bVar = o.f28340p;
        if (obj == bVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.f28298a = bVar;
        if (obj != o.f28336l) {
            return obj;
        }
        B = this.f28300c.B();
        int i13 = ho2.w.f69790a;
        throw B;
    }

    public final void f() {
        this.f28298a = o.f28336l;
        Throwable A = this.f28300c.A();
        if (A == null) {
            return;
        }
        int i13 = ho2.w.f69790a;
        throw A;
    }
}
