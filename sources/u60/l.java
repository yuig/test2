package u60;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.md0;
import com.pinterest.api.model.vh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.u2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import ue1.a0;
import we1.t2;

/* loaded from: classes5.dex */
public final class l implements oj0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120790b;

    public /* synthetic */ l(Object obj, int i13) {
        this.f120789a = i13;
        this.f120790b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 b(String str, List list) {
        f30 f30Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            f30Var = null;
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (Intrinsics.d(f30Var2.getId(), str)) {
                    f30Var = f30Var2;
                    arrayList.add(f30Var);
                }
            }
            if (u2.H0(sVar)) {
                List list3 = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                f30Var = b(str, list3);
            }
            arrayList.add(f30Var);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((f30) next) != null) {
                f30Var = next;
                break;
            }
        }
        return f30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 c(String str, List list) {
        f30 f30Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            f30Var = null;
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (Intrinsics.d(f30Var2.getId(), str)) {
                    f30Var = f30Var2;
                    arrayList.add(f30Var);
                }
            }
            if (u2.H0(sVar)) {
                List list3 = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                f30Var = c(str, list3);
            }
            arrayList.add(f30Var);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((f30) next) != null) {
                f30Var = next;
                break;
            }
        }
        return f30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 d(String str, List list) {
        f30 f30Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            f30Var = null;
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (Intrinsics.d(f30Var2.getId(), str)) {
                    f30Var = f30Var2;
                    arrayList.add(f30Var);
                }
            }
            if (u2.H0(sVar)) {
                List list3 = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                f30Var = d(str, list3);
            }
            arrayList.add(f30Var);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((f30) next) != null) {
                f30Var = next;
                break;
            }
        }
        return f30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 e(String str, List list) {
        f30 f30Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            f30Var = null;
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (Intrinsics.d(f30Var2.getId(), str)) {
                    f30Var = f30Var2;
                    arrayList.add(f30Var);
                }
            }
            if (u2.H0(sVar)) {
                List list3 = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                f30Var = e(str, list3);
            }
            arrayList.add(f30Var);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((f30) next) != null) {
                f30Var = next;
                break;
            }
        }
        return f30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 f(String str, List list) {
        f30 f30Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            f30Var = null;
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (Intrinsics.d(f30Var2.getId(), str)) {
                    f30Var = f30Var2;
                    arrayList.add(f30Var);
                }
            }
            if (u2.H0(sVar)) {
                List list3 = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                f30Var = f(str, list3);
            }
            arrayList.add(f30Var);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((f30) next) != null) {
                f30Var = next;
                break;
            }
        }
        return f30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f30 g(String str, List list) {
        f30 f30Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            f30Var = null;
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (Intrinsics.d(f30Var2.getId(), str)) {
                    f30Var = f30Var2;
                    arrayList.add(f30Var);
                }
            }
            if (u2.H0(sVar)) {
                List list3 = ((vh) sVar).f42865w;
                Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                f30Var = g(str, list3);
            }
            arrayList.add(f30Var);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((f30) next) != null) {
                f30Var = next;
                break;
            }
        }
        return f30Var;
    }

    public final f30 a(String pinUid) {
        int i13 = this.f120789a;
        Object obj = this.f120790b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                return b(pinUid, ((m) obj).d());
            case 1:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                return c(pinUid, ((s) obj).d());
            case 2:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                return d(pinUid, ((x) obj).d());
            case 3:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                return e(pinUid, ((jj0.c) obj).d());
            case 4:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                return f(pinUid, ((com.pinterest.framework.multisection.datasource.pagedlist.c) obj).d());
            case 5:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                pj0.d dVar = (pj0.d) obj;
                Iterator it = dVar.d().iterator();
                int i14 = 0;
                while (true) {
                    if (it.hasNext()) {
                        dl1.s sVar = (dl1.s) it.next();
                        if (!Intrinsics.d(pinUid, sVar.getId()) || !(sVar instanceof f30)) {
                            i14++;
                        }
                    } else {
                        i14 = -1;
                    }
                }
                if (i14 < 0) {
                    return null;
                }
                Object obj2 = dVar.d().get(i14);
                Intrinsics.g(obj2, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                return (f30) obj2;
            case 6:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                return g(pinUid, ((pe1.g) obj).d());
            default:
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                List<dl1.s> d2 = ((t2) obj).d();
                ArrayList arrayList = new ArrayList();
                for (dl1.s sVar2 : d2) {
                    if (sVar2 instanceof ue1.w) {
                        ue1.w wVar = (ue1.w) sVar2;
                        if (Intrinsics.d(wVar.f122062a.getId(), pinUid)) {
                            return wVar.f122062a;
                        }
                    }
                }
                return (f30) CollectionsKt.firstOrNull(arrayList);
        }
    }

    public final void h(f30 updatedPin) {
        List list;
        int i13 = this.f120789a;
        int i14 = 0;
        Object obj = this.f120790b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                m mVar = (m) obj;
                boolean z13 = !mVar.f0().f95376m.isEmpty();
                mVar.V = z13;
                if (mVar.S != null && z13) {
                    mVar.Q.a3();
                }
                int i15 = 0;
                for (Object obj2 : mVar.d()) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar = (dl1.s) obj2;
                    if ((sVar instanceof f30) && Intrinsics.d(((f30) sVar).getId(), updatedPin.getId())) {
                        mVar.u1(i15, updatedPin);
                        return;
                    }
                    if (u2.H0(sVar)) {
                        List list2 = ((vh) sVar).f42865w;
                        Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                        int i17 = 0;
                        for (Object obj3 : list2) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                f0.p();
                                throw null;
                            }
                            dl1.s sVar2 = (dl1.s) obj3;
                            if ((sVar2 instanceof f30) && Intrinsics.d(((f30) sVar2).getId(), updatedPin.getId())) {
                                gb2.f fVar = gb2.f.f64747a;
                                String id3 = updatedPin.getId();
                                Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                                gb2.f.c(new gb2.j(id3, String.valueOf(updatedPin.z4())));
                                return;
                            }
                            i17 = i18;
                        }
                    }
                    i15 = i16;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                s sVar3 = (s) obj;
                sVar3.X = !((oj0.f) sVar3.f120805d0.getValue()).f95376m.isEmpty();
                if (sVar3.i0() && sVar3.f120803b0 && sVar3.h0() && sVar3.X && s.f0(sVar3)) {
                    sVar3.S.a3();
                }
                int i19 = 0;
                for (Object obj4 : sVar3.d()) {
                    int i23 = i19 + 1;
                    if (i19 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar4 = (dl1.s) obj4;
                    if ((sVar4 instanceof f30) && Intrinsics.d(((f30) sVar4).getId(), updatedPin.getId())) {
                        sVar3.u1(i19, updatedPin);
                        return;
                    }
                    if (u2.H0(sVar4)) {
                        List list3 = ((vh) sVar4).f42865w;
                        Intrinsics.checkNotNullExpressionValue(list3, "getObjects(...)");
                        int i24 = 0;
                        for (Object obj5 : list3) {
                            int i25 = i24 + 1;
                            if (i24 < 0) {
                                f0.p();
                                throw null;
                            }
                            dl1.s sVar5 = (dl1.s) obj5;
                            if ((sVar5 instanceof f30) && Intrinsics.d(((f30) sVar5).getId(), updatedPin.getId())) {
                                gb2.f fVar2 = gb2.f.f64747a;
                                String id4 = updatedPin.getId();
                                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                                gb2.f.c(new gb2.j(id4, String.valueOf(updatedPin.z4())));
                                return;
                            }
                            i24 = i25;
                        }
                    }
                    i19 = i23;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                x xVar = (x) obj;
                xVar.Y = !((oj0.f) xVar.f120817d0.getValue()).f95376m.isEmpty();
                if (!xVar.C && xVar.f0() && xVar.Y) {
                    xVar.P.a3();
                }
                int i26 = 0;
                for (Object obj6 : xVar.d()) {
                    int i27 = i26 + 1;
                    if (i26 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar6 = (dl1.s) obj6;
                    if ((sVar6 instanceof f30) && Intrinsics.d(((f30) sVar6).getId(), updatedPin.getId())) {
                        xVar.u1(i26, updatedPin);
                        return;
                    }
                    if (u2.H0(sVar6)) {
                        List list4 = ((vh) sVar6).f42865w;
                        Intrinsics.checkNotNullExpressionValue(list4, "getObjects(...)");
                        int i28 = 0;
                        for (Object obj7 : list4) {
                            int i29 = i28 + 1;
                            if (i28 < 0) {
                                f0.p();
                                throw null;
                            }
                            dl1.s sVar7 = (dl1.s) obj7;
                            if ((sVar7 instanceof f30) && Intrinsics.d(((f30) sVar7).getId(), updatedPin.getId())) {
                                gb2.f fVar3 = gb2.f.f64747a;
                                String id5 = updatedPin.getId();
                                Intrinsics.checkNotNullExpressionValue(id5, "getUid(...)");
                                gb2.f.c(new gb2.j(id5));
                                return;
                            }
                            i28 = i29;
                        }
                    }
                    i26 = i27;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                jj0.c cVar = (jj0.c) obj;
                int i33 = 0;
                for (Object obj8 : cVar.d()) {
                    int i34 = i33 + 1;
                    if (i33 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar8 = (dl1.s) obj8;
                    if ((sVar8 instanceof f30) && Intrinsics.d(((f30) sVar8).getId(), updatedPin.getId())) {
                        cVar.u1(i33, updatedPin);
                        return;
                    }
                    if (u2.H0(sVar8)) {
                        List list5 = ((vh) sVar8).f42865w;
                        Intrinsics.checkNotNullExpressionValue(list5, "getObjects(...)");
                        int i35 = 0;
                        for (Object obj9 : list5) {
                            int i36 = i35 + 1;
                            if (i35 < 0) {
                                f0.p();
                                throw null;
                            }
                            dl1.s sVar9 = (dl1.s) obj9;
                            if ((sVar9 instanceof f30) && Intrinsics.d(((f30) sVar9).getId(), updatedPin.getId())) {
                                gb2.f fVar4 = gb2.f.f64747a;
                                String id6 = updatedPin.getId();
                                Intrinsics.checkNotNullExpressionValue(id6, "getUid(...)");
                                gb2.f.c(new gb2.j(id6, String.valueOf(updatedPin.z4())));
                                return;
                            }
                            i35 = i36;
                        }
                    }
                    i33 = i34;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                com.pinterest.framework.multisection.datasource.pagedlist.c cVar2 = (com.pinterest.framework.multisection.datasource.pagedlist.c) obj;
                for (Object obj10 : cVar2.d()) {
                    int i37 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar10 = (dl1.s) obj10;
                    if ((sVar10 instanceof f30) && Intrinsics.d(((f30) sVar10).getId(), updatedPin.getId())) {
                        cVar2.u1(i14, updatedPin);
                        return;
                    }
                    if (u2.H0(sVar10)) {
                        vh vhVar = sVar10 instanceof vh ? (vh) sVar10 : null;
                        if (vhVar != null && (list = vhVar.f42865w) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj11 : list) {
                                dl1.s sVar11 = (dl1.s) obj11;
                                if ((sVar11 instanceof f30) && Intrinsics.d(((f30) sVar11).getId(), updatedPin.getId())) {
                                    arrayList.add(obj11);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                dl1.s sVar12 = (dl1.s) it.next();
                                gb2.f fVar5 = gb2.f.f64747a;
                                String id7 = sVar12.getId();
                                Intrinsics.checkNotNullExpressionValue(id7, "getUid(...)");
                                gb2.f.c(new gb2.j(id7));
                            }
                        }
                    }
                    i14 = i37;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                pj0.d dVar = (pj0.d) obj;
                for (Object obj12 : dVar.d()) {
                    int i38 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    if (Intrinsics.d(updatedPin.getId(), ((dl1.s) obj12).getId())) {
                        dVar.u1(i14, updatedPin);
                        return;
                    }
                    i14 = i38;
                }
                return;
            case 6:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                pe1.g.k0((pe1.g) obj, updatedPin);
                return;
            default:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                t2 t2Var = (t2) obj;
                t2Var.f129615c.d(new md0());
                for (Object obj13 : t2Var.d()) {
                    int i39 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    a0 a0Var = (a0) obj13;
                    if (a0Var instanceof ue1.w) {
                        ue1.w wVar = (ue1.w) a0Var;
                        if (Intrinsics.d(wVar.f122062a.getId(), updatedPin.getId())) {
                            t2Var.u1(i14, ue1.w.c(wVar, updatedPin, null, 2046));
                        }
                    }
                    i14 = i39;
                }
                return;
        }
    }
}
