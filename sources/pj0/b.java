package pj0;

import com.pinterest.api.model.f30;
import dl1.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wa2.a0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100227i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f100228j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f100227i = i13;
        this.f100228j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100227i;
        Object obj2 = null;
        d dVar = this.f100228j;
        switch (i13) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List d2 = dVar.d();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : d2) {
                    if (obj3 instanceof f30) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
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
                        f0.p();
                        throw null;
                    }
                    String str = (String) next2;
                    int i16 = -1;
                    int i17 = 0;
                    for (Object obj4 : it) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            f0.p();
                            throw null;
                        }
                        gb2.l lVar = (gb2.l) obj4;
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
            case 1:
                List<Pair> list = (List) obj;
                Intrinsics.f(list);
                for (Pair pair : list) {
                    Object obj5 = pair.f80346a;
                    gb2.k kVar = (gb2.k) pair.f80347b;
                    int intValue = ((Number) obj5).intValue();
                    a0 a0Var = kVar.f64759b;
                    if (a0Var == a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION || a0Var == a0.PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN) {
                        dVar.S.put(kVar.f64758a, a0Var);
                        dl1.s item = dVar.getItem(intValue);
                        if (item != null) {
                            dVar.u1(intValue, item);
                        }
                    }
                }
                return Unit.f80348a;
            case 2:
                s0 s0Var = (s0) obj;
                f30 f30Var = (f30) s0Var.f55286b;
                Iterator it5 = dVar.d().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        Object next3 = it5.next();
                        dl1.s sVar = (dl1.s) next3;
                        if ((sVar instanceof f30) && Intrinsics.d(((f30) sVar).z4(), f30Var.z4())) {
                            obj2 = next3;
                        }
                    }
                }
                dl1.s sVar2 = (dl1.s) obj2;
                if (sVar2 instanceof f30) {
                    int i19 = c.f100229a[s0Var.f55285a.ordinal()];
                    oj0.f fVar2 = dVar.T;
                    if (i19 == 1) {
                        fVar2.b(f30Var, (f30) sVar2);
                    } else if (i19 == 2) {
                        f30 f30Var2 = (f30) sVar2;
                        if (f30Var2.B5() == null) {
                            fVar2.g(f30Var2);
                        }
                    } else if (i19 == 3) {
                        fVar2.g((f30) sVar2);
                    }
                }
                return Unit.f80348a;
            default:
                gb2.i iVar = (gb2.i) obj;
                dVar.R.put(iVar.f64753a, iVar);
                return Unit.f80348a;
        }
    }
}
