package k1;

import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public o1.n f77825r;

    /* renamed from: s, reason: collision with root package name */
    public int f77826s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f77827t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f77828u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1.l f77829v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, long j13, o1.l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f77827t = jVar;
        this.f77828u = j13;
        this.f77829v = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f77827t, this.f77828u, this.f77829v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [u2.p] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        s3.j1 j1Var;
        u2.p pVar;
        o1.n nVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77826s;
        j jVar = this.f77827t;
        if (i13 == 0) {
            ue.c.H(obj);
            d0.o oVar = j.G;
            jVar.getClass();
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            am.d dVar = m1.n1.f85471o;
            int i14 = 0;
            c0 c0Var = new c0(f0Var, i14);
            u2.p pVar2 = jVar.f120042a;
            if (!pVar2.f120054m) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            u2.p pVar3 = pVar2.f120046e;
            s3.k0 U0 = com.bumptech.glide.c.U0(jVar);
            loop0: while (U0 != null) {
                if ((U0.f110837y.f110808e.f120045d & 262144) != 0) {
                    while (pVar3 != null) {
                        if ((pVar3.f120044c & 262144) != 0) {
                            s3.n nVar2 = pVar3;
                            k2.e eVar = null;
                            while (nVar2 != 0) {
                                if (nVar2 instanceof s3.j2) {
                                    s3.j2 j2Var = (s3.j2) nVar2;
                                    if (Intrinsics.d(dVar, j2Var.l()) && !((Boolean) c0Var.invoke(j2Var)).booleanValue()) {
                                        break loop0;
                                    }
                                } else if ((nVar2.f120044c & 262144) != 0 && (nVar2 instanceof s3.n)) {
                                    u2.p pVar4 = nVar2.f110843o;
                                    pVar = nVar2;
                                    eVar = eVar;
                                    while (pVar4 != null) {
                                        if ((pVar4.f120044c & 262144) != 0) {
                                            i14++;
                                            eVar = eVar;
                                            if (i14 == 1) {
                                                pVar = pVar4;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new k2.e(new u2.p[16]);
                                                }
                                                if (pVar != null) {
                                                    eVar.b(pVar);
                                                    pVar = null;
                                                }
                                                eVar.b(pVar4);
                                            }
                                        }
                                        pVar4 = pVar4.f120047f;
                                        pVar = pVar;
                                        eVar = eVar;
                                    }
                                    if (i14 == 1) {
                                        i14 = 0;
                                        nVar2 = pVar;
                                        eVar = eVar;
                                    }
                                }
                                pVar = com.bumptech.glide.c.g(eVar);
                                i14 = 0;
                                nVar2 = pVar;
                                eVar = eVar;
                            }
                        }
                        pVar3 = pVar3.f120046e;
                        i14 = 0;
                    }
                }
                U0 = U0.v();
                pVar3 = (U0 == null || (j1Var = U0.f110837y) == null) ? null : j1Var.f110807d;
                i14 = 0;
            }
            if (!f0Var.f80424a) {
                int i15 = f0.f77861b;
                ViewParent parent = bp1.h.G(jVar).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
            }
            long j13 = f0.f77860a;
            this.f77826s = 1;
            if (lb.l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = this.f77825r;
                ue.c.H(obj);
                jVar.f77900z = nVar;
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        o1.n nVar3 = new o1.n(this.f77828u);
        this.f77825r = nVar3;
        this.f77826s = 2;
        if (this.f77829v.a(nVar3, this) == aVar) {
            return aVar;
        }
        nVar = nVar3;
        jVar.f77900z = nVar;
        return Unit.f80348a;
    }
}
