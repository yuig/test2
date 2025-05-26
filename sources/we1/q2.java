package we1;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129581i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t2 f129582j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(t2 t2Var, int i13) {
        super(1);
        this.f129581i = i13;
        this.f129582j = t2Var;
    }

    public final List b(List it) {
        int i13 = this.f129581i;
        t2 t2Var = this.f129582j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                List<ue1.a0> d2 = t2Var.d();
                ArrayList arrayList = new ArrayList();
                for (ue1.a0 a0Var : d2) {
                    f30 f30Var = a0Var instanceof ue1.w ? ((ue1.w) a0Var).f122062a : null;
                    if (f30Var != null) {
                        arrayList.add(f30Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((dl1.s) it2.next()).getUid());
                }
                ArrayList H0 = CollectionsKt.H0(arrayList2);
                gb2.f fVar = gb2.f.f64747a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = H0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (Intrinsics.d((String) next, ((gb2.l) d7.b.j0(it)).a())) {
                        arrayList3.add(next);
                    }
                }
                if (arrayList3.size() != 1) {
                    return new ArrayList();
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = H0.iterator();
                int i14 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String str = (String) next2;
                    int i16 = -1;
                    int i17 = 0;
                    for (Object obj : it) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        gb2.l lVar = (gb2.l) obj;
                        if (Intrinsics.d(lVar.a(), str)) {
                            arrayList4.add(new Pair(Integer.valueOf(i14), lVar));
                            i16 = i17;
                        }
                        i17 = i18;
                    }
                    if (i16 > 0) {
                        it.remove(i16);
                    }
                    it.isEmpty();
                    i14 = i15;
                }
                return arrayList4;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List<ue1.a0> d13 = t2Var.d();
                ArrayList arrayList5 = new ArrayList();
                for (ue1.a0 a0Var2 : d13) {
                    f30 f30Var2 = a0Var2 instanceof ue1.u ? ((ue1.u) a0Var2).f122053a : a0Var2 instanceof ue1.w ? ((ue1.w) a0Var2).f122062a : null;
                    if (f30Var2 != null) {
                        arrayList5.add(f30Var2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(kotlin.collections.g0.q(arrayList5, 10));
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((dl1.s) it5.next()).getUid());
                }
                ArrayList H02 = CollectionsKt.H0(arrayList6);
                gb2.f fVar2 = gb2.f.f64747a;
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = H02.iterator();
                while (it6.hasNext()) {
                    Object next3 = it6.next();
                    if (Intrinsics.d((String) next3, ((gb2.l) d7.b.j0(it)).a())) {
                        arrayList7.add(next3);
                    }
                }
                if (arrayList7.size() != 1) {
                    return new ArrayList();
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it7 = H02.iterator();
                int i19 = 0;
                while (it7.hasNext()) {
                    Object next4 = it7.next();
                    int i23 = i19 + 1;
                    if (i19 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String str2 = (String) next4;
                    int i24 = -1;
                    int i25 = 0;
                    for (Object obj2 : it) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        gb2.l lVar2 = (gb2.l) obj2;
                        if (Intrinsics.d(lVar2.a(), str2)) {
                            arrayList8.add(new Pair(Integer.valueOf(i19), lVar2));
                            i24 = i25;
                        }
                        i25 = i26;
                    }
                    if (i24 > 0) {
                        it.remove(i24);
                    }
                    it.isEmpty();
                    i19 = i23;
                }
                return arrayList8;
        }
    }

    public final void e(List list) {
        int i13 = this.f129581i;
        t2 t2Var = this.f129582j;
        switch (i13) {
            case 3:
                Intrinsics.f(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Object obj = pair.f80346a;
                    gb2.j jVar = (gb2.j) pair.f80347b;
                    ((Number) obj).intValue();
                    Iterator it2 = t2Var.d().iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i14 = -1;
                        } else if (!Intrinsics.d(((ue1.a0) it2.next()).getUid(), jVar.f64756a)) {
                            i14++;
                        }
                    }
                    ue1.a0 a0Var = (ue1.a0) t2Var.d().get(i14);
                    if (a0Var instanceof ue1.w) {
                        t2Var.u1(i14, a0Var);
                    }
                }
                break;
            default:
                Intrinsics.f(list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Pair pair2 = (Pair) it3.next();
                    Object obj2 = pair2.f80346a;
                    gb2.k kVar = (gb2.k) pair2.f80347b;
                    int intValue = ((Number) obj2).intValue();
                    wa2.a0 a0Var2 = kVar.f64759b;
                    if (a0Var2 == wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION || a0Var2 == wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN) {
                        t2Var.f129625m.put(kVar.f64758a, a0Var2);
                        ue1.a0 a0Var3 = (ue1.a0) t2Var.getItem(intValue);
                        if (a0Var3 != null) {
                            t2Var.u1(intValue, a0Var3);
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.q2.invoke(java.lang.Object):java.lang.Object");
    }
}
