package i2;

import com.pinterest.activity.PinterestActivity;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import lh0.m4;

/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71138i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f71139j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f71140k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(int i13, Object obj, Object obj2) {
        super(0);
        this.f71138i = i13;
        this.f71139j = obj;
        this.f71140k = obj2;
    }

    public final List b() {
        KTypeProjection kTypeProjection;
        int i13 = this.f71138i;
        Object obj = this.f71140k;
        Object obj2 = this.f71139j;
        switch (i13) {
            case 17:
                ul2.q1 q1Var = (ul2.q1) obj2;
                List u03 = q1Var.f122585a.u0();
                if (u03.isEmpty()) {
                    return kotlin.collections.q0.f80391a;
                }
                xk2.k a13 = xk2.m.a(xk2.n.PUBLICATION, new kh2.g2(q1Var, 10));
                List list = u03;
                Function0 function0 = (Function0) obj;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                int i14 = 0;
                for (Object obj3 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    pn2.g1 g1Var = (pn2.g1) obj3;
                    if (g1Var.b()) {
                        KTypeProjection.f80456c.getClass();
                        kTypeProjection = KTypeProjection.f80457d;
                    } else {
                        pn2.b0 type = g1Var.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        ul2.q1 type2 = new ul2.q1(type, function0 != null ? new mu0.i(q1Var, i14, a13, 8) : null);
                        int i16 = ul2.p1.f122580a[g1Var.c().ordinal()];
                        if (i16 == 1) {
                            KTypeProjection.f80456c.getClass();
                            Intrinsics.checkNotNullParameter(type2, "type");
                            kTypeProjection = new KTypeProjection(rl2.z.INVARIANT, type2);
                        } else if (i16 == 2) {
                            KTypeProjection.f80456c.getClass();
                            Intrinsics.checkNotNullParameter(type2, "type");
                            kTypeProjection = new KTypeProjection(rl2.z.IN, type2);
                        } else {
                            if (i16 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            KTypeProjection.f80456c.getClass();
                            Intrinsics.checkNotNullParameter(type2, "type");
                            kTypeProjection = new KTypeProjection(rl2.z.OUT, type2);
                        }
                    }
                    arrayList.add(kTypeProjection);
                    i14 = i15;
                }
                return arrayList;
            default:
                lb.p0 p0Var = ((ln2.l0) obj2).f84099a;
                return ((ln2.o) p0Var.f82653b).f84112e.g((tm2.s0) obj, (vm2.f) p0Var.f82654c);
        }
    }

    public final pn2.h0 e() {
        int i13 = this.f71138i;
        Object obj = this.f71140k;
        Object obj2 = this.f71139j;
        switch (i13) {
            case 20:
                zl2.r rVar = (zl2.r) obj2;
                rl2.u[] uVarArr = zl2.r.f142144h;
                am2.d0 d0Var = rVar.i().f142130a;
                zl2.g.f142122d.getClass();
                return lb.l0.e0(d0Var, zl2.g.f142126h, new com.google.firebase.messaging.q((on2.u) obj, rVar.i().f142130a)).j();
            default:
                pn2.h0 j13 = ((rg.a) obj2).b().f().i(((jm2.b) obj).f77046a).j();
                Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
                return j13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fc A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.j2.invoke():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [u2.p] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [k2.e] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [k2.e] */
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m153invoke() {
        q3.m0 m0Var;
        switch (this.f71138i) {
            case 0:
                g1.g0 g0Var = (g1.g0) this.f71139j;
                i0 i0Var = (i0) this.f71140k;
                Object[] objArr = g0Var.f63286b;
                long[] jArr = g0Var.f63285a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                ((z) i0Var).A(objArr[(i13 << 3) + i15]);
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            return;
                        }
                    }
                    if (i13 == length) {
                        return;
                    } else {
                        i13++;
                    }
                }
            case 1:
                s3.j1 j1Var = ((s3.k0) this.f71139j).f110837y;
                kotlin.jvm.internal.j0 j0Var = (kotlin.jvm.internal.j0) this.f71140k;
                if ((j1Var.f110808e.f120045d & 8) != 0) {
                    for (u2.p pVar = j1Var.f110807d; pVar != null; pVar = pVar.f120046e) {
                        if ((pVar.f120044c & 8) != 0) {
                            s3.n nVar = pVar;
                            ?? r73 = 0;
                            while (nVar != 0) {
                                if (nVar instanceof s3.g2) {
                                    s3.g2 g2Var = (s3.g2) nVar;
                                    if (g2Var.z()) {
                                        z3.j jVar = new z3.j();
                                        j0Var.f80434a = jVar;
                                        jVar.f140702c = true;
                                    }
                                    if (g2Var.x0()) {
                                        ((z3.j) j0Var.f80434a).f140701b = true;
                                    }
                                    g2Var.m0((z3.j) j0Var.f80434a);
                                } else if ((nVar.f120044c & 8) != 0 && (nVar instanceof s3.n)) {
                                    u2.p pVar2 = nVar.f110843o;
                                    int i16 = 0;
                                    nVar = nVar;
                                    r73 = r73;
                                    while (pVar2 != null) {
                                        if ((pVar2.f120044c & 8) != 0) {
                                            i16++;
                                            r73 = r73;
                                            if (i16 == 1) {
                                                nVar = pVar2;
                                            } else {
                                                if (r73 == 0) {
                                                    r73 = new k2.e(new u2.p[16]);
                                                }
                                                if (nVar != 0) {
                                                    r73.b(nVar);
                                                    nVar = 0;
                                                }
                                                r73.b(pVar2);
                                            }
                                        }
                                        pVar2 = pVar2.f120047f;
                                        nVar = nVar;
                                        r73 = r73;
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                nVar = com.bumptech.glide.c.g(r73);
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                s3.v0 v0Var = (s3.v0) this.f71139j;
                s3.q1 q1Var = v0Var.b().f110901o;
                if (q1Var == null || (m0Var = q1Var.f111015i) == null) {
                    t3.c0 c0Var = (t3.c0) s3.n0.a(v0Var.f110967a);
                    int i17 = q3.e1.f102202b;
                    m0Var = new q3.m0(c0Var, 1);
                }
                s3.t0 t0Var = (s3.t0) this.f71140k;
                Function1 function1 = t0Var.B;
                e3.d dVar = t0Var.C;
                if (dVar != null) {
                    s3.q1 b13 = v0Var.b();
                    long j14 = t0Var.D;
                    float f13 = t0Var.E;
                    q3.b1.c(m0Var, b13);
                    b13.k1(n4.h.c(j14, b13.f102182e), f13, dVar);
                    return;
                }
                if (function1 == null) {
                    s3.q1 b14 = v0Var.b();
                    long j15 = t0Var.D;
                    float f14 = t0Var.E;
                    q3.b1.c(m0Var, b14);
                    b14.u0(n4.h.c(j15, b14.f102182e), f14, null);
                    return;
                }
                s3.q1 b15 = v0Var.b();
                long j16 = t0Var.D;
                float f15 = t0Var.E;
                q3.b1.c(m0Var, b15);
                b15.u0(n4.h.c(j16, b15.f102182e), f15, function1);
                return;
            case 3:
                rb.f fVar = ((qb.c) this.f71139j).f103383a;
                qb.a listener = (qb.a) this.f71140k;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                synchronized (fVar.f107062c) {
                    try {
                        if (fVar.f107063d.remove(listener) && fVar.f107063d.isEmpty()) {
                            fVar.d();
                        }
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 5:
                ((vy.m) this.f71139j).a("install_submit");
                se2.a aVar = ((PinterestActivity) this.f71140k).f34828u;
                if (aVar != null) {
                    ((lb0.q) ((bf2.b) aVar).get()).k("PREF_FIRST_LAUNCH", false);
                    return;
                } else {
                    Intrinsics.r("prefsManagerPersisted");
                    throw null;
                }
            case 11:
                if (((br1.f0) this.f71139j).f23781b) {
                    q1 q1Var2 = (q1) this.f71140k;
                    u2.q qVar = br1.e0.f23779a;
                    q1Var2.setValue(Boolean.FALSE);
                    return;
                }
                return;
            default:
                PinVideoGridCell pinVideoGridCell = (PinVideoGridCell) this.f71139j;
                m4 videoFeatureLibraryExperiments = pinVideoGridCell.getVideoFeatureLibraryExperiments();
                videoFeatureLibraryExperiments.getClass();
                lh0.z3 z3Var = lh0.a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) videoFeatureLibraryExperiments.f83425a;
                if (g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) {
                    pinVideoGridCell.pinRepViewModel.c().a(new ni1.v1(new ek1.e0(ro1.c.f108967f.i((f30) this.f71140k, pinVideoGridCell.getAdsCommonDisplay(), pinVideoGridCell.getAdFormats()))));
                    return;
                }
                return;
        }
    }
}
