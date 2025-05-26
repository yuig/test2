package id1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import gb2.k;
import gb2.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import p91.v;
import wa2.a0;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f72148j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i13) {
        super(1);
        this.f72147i = i13;
        this.f72148j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f72147i;
        g gVar = this.f72148j;
        switch (i13) {
            case 0:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                return c0.d.i0(user, new ic1.c(11, gVar, gVar.f72153a.f72169h), new v(14, gVar, user));
            case 1:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List d2 = gVar.v3().d();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : d2) {
                    if (obj2 instanceof f30) {
                        arrayList.add(obj2);
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
                    if (Intrinsics.d((String) next, ((l) d7.b.j0(it)).a())) {
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
                    for (Object obj3 : it) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            f0.p();
                            throw null;
                        }
                        l lVar = (l) obj3;
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
                List<Pair> list = (List) obj;
                Intrinsics.f(list);
                for (Pair pair : list) {
                    Object obj4 = pair.f80346a;
                    k update = (k) pair.f80347b;
                    int intValue = ((Number) obj4).intValue();
                    dl1.s item = gVar.v3().getItem(intValue);
                    if (item != null) {
                        hd1.b v33 = gVar.v3();
                        v33.getClass();
                        Intrinsics.checkNotNullParameter(update, "update");
                        v33.O.put(update.f64758a, update);
                        if (update.f64759b == a0.PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE) {
                            LinkedHashMap linkedHashMap = v33.Q;
                            String str2 = update.f64758a;
                            hd1.e eVar = (hd1.e) linkedHashMap.get(str2);
                            gb2.d dVar = update.f64761d;
                            if (eVar != null && !Intrinsics.d(eVar.f68911b, dVar)) {
                                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                eVar.f68911b = dVar;
                                v33.P = dVar;
                            }
                            if (eVar == null) {
                                eVar = new hd1.e(str2, dVar, null);
                                v33.P = dVar;
                            }
                            if (v33.P == null) {
                                v33.P = dVar;
                            }
                            linkedHashMap.put(str2, eVar);
                        }
                        gVar.v3().u1(intValue, item);
                    }
                }
                return Unit.f80348a;
        }
    }
}
