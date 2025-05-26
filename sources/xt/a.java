package xt;

import com.pinterest.ads.feature.owc.presenter.showcase.ShowcaseException;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.md;
import h32.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jk2.z1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import tb0.p;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135850i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f135851j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f135850i = i13;
        this.f135851j = cVar;
    }

    public final void b(f30 pin) {
        List N;
        String Z;
        List m13;
        f3 z33;
        List N2;
        md O3;
        List m14;
        f fVar;
        int i13 = this.f135850i;
        c cVar = this.f135851j;
        switch (i13) {
            case 0:
                f fVar2 = cVar.H;
                if (fVar2 != null) {
                    Intrinsics.f(pin);
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    fVar2.f135861d = pin;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(pin);
                    if (f.d(pin)) {
                        f30 f30Var = fVar2.f135861d;
                        if (f30Var != null && (O3 = f30Var.O3()) != null && (m14 = O3.m()) != null) {
                            arrayList.addAll(f.e(m14));
                        }
                    } else {
                        f30 f30Var2 = fVar2.f135861d;
                        if (f30Var2 != null && (z33 = f30Var2.z3()) != null && (N2 = z33.N()) != null) {
                            arrayList.addAll(N2);
                        }
                    }
                    fVar2.f135862e = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = fVar2.f135862e.iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            f0.p();
                            throw null;
                        }
                        arrayList2.add(new pt.a((f30) next, i14 == fVar2.f135864g));
                        i14 = i15;
                    }
                    if (fVar2.f135862e.size() > 1) {
                        ArrayList arrayList3 = fVar2.f135862e;
                        List subList = arrayList3.subList(1, arrayList3.size());
                        Intrinsics.checkNotNullExpressionValue(subList, "subList(...)");
                        fVar2.f135868k = subList;
                    }
                    fVar2.f(false, false);
                }
                Intrinsics.f(pin);
                if (cVar.H == null || !f.d(pin)) {
                    f3 z34 = pin.z3();
                    if (z34 != null && (N = z34.N()) != null) {
                        Z = CollectionsKt.Z(N, ",", null, null, 0, null, b.f135855m, 30);
                    }
                    Z = null;
                } else {
                    md O32 = pin.O3();
                    if (O32 != null && (m13 = O32.m()) != null) {
                        Z = CollectionsKt.Z(m13, ",", null, null, 0, null, b.f135854l, 30);
                    }
                    Z = null;
                }
                if (Z != null) {
                    z1 z1Var = new z1(cVar.F.getPins(Z, n00.b.a(n00.c.PIN_CLOSEUP)).r(tk2.e.f118017c).l(wj2.c.a()).u());
                    Intrinsics.checkNotNullExpressionValue(z1Var, "retry(...)");
                    cVar.addDisposable(nl.b.s(z1Var, new a(cVar, 3), null, null, 6));
                }
                cVar.v3(pin);
                return;
            default:
                Boolean e53 = pin.e5();
                Intrinsics.checkNotNullExpressionValue(e53, "getIsRepin(...)");
                if (!e53.booleanValue() || (fVar = cVar.H) == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(pin, "pin");
                ArrayList arrayList4 = fVar.f135862e;
                if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.d(((f30) it2.next()).z4(), pin.z4())) {
                            fVar.f135858a.u(f1.SHOWCASE_SUBPAGE_REPIN, pin.getUid(), f.a(fVar.f135861d, fVar.f135860c, null), null, false);
                            return;
                        }
                    }
                }
                fVar.f135858a.u(f1.SHOWCASE_SUBPIN_REPIN, pin.getUid(), f.a(fVar.f135861d, fVar.f135860c, pin), null, false);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar;
        List m13;
        int i13 = this.f135850i;
        c cVar = this.f135851j;
        switch (i13) {
            case 0:
                b((f30) obj);
                break;
            case 1:
                j jVar = (j) obj;
                if (jVar instanceof i) {
                    f30 f30Var = ((i) jVar).f135882d;
                    cVar.f119047x = f30Var != null ? f30Var.getUid() : null;
                } else if (jVar instanceof h) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.q(new ShowcaseException(), ((h) jVar).f135878a, p.SHOWCASE_ADS);
                } else if (jVar instanceof g) {
                    cVar.M3(((g) jVar).f135877a);
                }
                break;
            case 2:
                b((f30) obj);
                break;
            default:
                tt1.a aVar = (tt1.a) obj;
                lh0.g gVar = cVar.f105116f;
                gVar.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) gVar.f83348a;
                if ((g1Var.o("android_showcase_subcard_video", "enabled", z3Var) || g1Var.l("android_showcase_subcard_video")) && (fVar = cVar.H) != null) {
                    Object c13 = aVar.c();
                    Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                    List<f30> subpages = (List) c13;
                    Intrinsics.checkNotNullParameter(subpages, "subpages");
                    for (f30 f30Var2 : subpages) {
                        int size = fVar.f135868k.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            if (Intrinsics.d(((f30) fVar.f135868k.get(i14)).getUid(), f30Var2.getUid())) {
                                fVar.f135868k.set(i14, f30Var2);
                            }
                        }
                    }
                }
                f fVar2 = cVar.H;
                if (fVar2 != null) {
                    Object c14 = aVar.c();
                    Intrinsics.checkNotNullExpressionValue(c14, "getData(...)");
                    List<f30> subpages2 = (List) c14;
                    Intrinsics.checkNotNullParameter(subpages2, "subpages");
                    HashMap hashMap = new HashMap();
                    for (f30 f30Var3 : subpages2) {
                        String uid = f30Var3.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        ?? arrayList = new ArrayList();
                        if (f.d(f30Var3)) {
                            md O3 = f30Var3.O3();
                            if (O3 != null && (m13 = O3.m()) != null) {
                                arrayList.addAll(f.e(m13));
                            }
                        } else {
                            f3 z33 = f30Var3.z3();
                            List N = z33 != null ? z33.N() : null;
                            if (N == null) {
                                N = new ArrayList();
                            }
                            arrayList = N;
                        }
                        hashMap.put(uid, arrayList);
                    }
                    fVar2.f135863f = hashMap;
                    fVar2.f(false, false);
                }
                f fVar3 = cVar.H;
                if (fVar3 != null) {
                    fVar3.f(false, false);
                }
                break;
        }
        return Unit.f80348a;
    }
}
