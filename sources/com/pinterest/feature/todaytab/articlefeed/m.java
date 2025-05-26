package com.pinterest.feature.todaytab.articlefeed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48631i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f48632j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i13) {
        super(1);
        this.f48631i = i13;
        this.f48632j = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f48631i;
        n nVar = this.f48632j;
        switch (i13) {
            case 0:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List d2 = nVar.f48635c.d();
                if (!(d2 instanceof List)) {
                    d2 = null;
                }
                if (d2 == null) {
                    d2 = q0.f80391a;
                }
                List list = d2;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((dl1.s) it2.next()).getUid());
                }
                ArrayList H0 = CollectionsKt.H0(arrayList);
                gb2.f fVar = gb2.f.f64747a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = H0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (Intrinsics.d((String) next, ((gb2.l) d7.b.j0(it)).a())) {
                        arrayList2.add(next);
                    }
                }
                if (arrayList2.size() != 1) {
                    return new ArrayList();
                }
                ArrayList arrayList3 = new ArrayList();
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
                    for (Object obj2 : it) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            f0.p();
                            throw null;
                        }
                        gb2.l lVar = (gb2.l) obj2;
                        if (Intrinsics.d(lVar.a(), str)) {
                            arrayList3.add(new Pair(Integer.valueOf(i14), lVar));
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
                return arrayList3;
            default:
                List<Pair> list2 = (List) obj;
                Intrinsics.f(list2);
                for (Pair pair : list2) {
                    Object obj3 = pair.f80346a;
                    gb2.k update = (gb2.k) pair.f80347b;
                    int intValue = ((Number) obj3).intValue();
                    dl1.s item = nVar.f48635c.getItem(intValue);
                    if (item != null) {
                        l lVar2 = nVar.f48635c;
                        lVar2.getClass();
                        Intrinsics.checkNotNullParameter(update, "update");
                        lVar2.M.put(update.f64758a, update);
                        lVar2.u1(intValue, item);
                    }
                }
                return Unit.f80348a;
        }
    }
}
