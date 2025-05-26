package g72;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63967i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ro2.n f63968j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(ro2.n nVar, int i13) {
        super(2);
        this.f63967i = i13;
        this.f63968j = nVar;
    }

    public final ro2.n b(String str, ro2.n value) {
        Object obj;
        ro2.n nVar;
        ArrayList<Pair> arrayList;
        int i13 = this.f63967i;
        ro2.n element = this.f63968j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                qo2.b0 b0Var = ro2.o.f109027a;
                Intrinsics.checkNotNullParameter(value, "<this>");
                ro2.e eVar = value instanceof ro2.e ? (ro2.e) value : null;
                if (eVar == null) {
                    ro2.o.c("JsonArray", value);
                    throw null;
                }
                Iterator it = CollectionsKt.L0(eVar, 2, 2, false).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.d(((List) obj).get(0), element)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter("type", "key");
                Intrinsics.checkNotNullParameter(element, "element");
                if (list != null && (nVar = (ro2.n) CollectionsKt.U(1, list)) != null) {
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    ro2.e eVar2 = nVar instanceof ro2.e ? (ro2.e) nVar : null;
                    if (eVar2 == null) {
                        ro2.o.c("JsonArray", nVar);
                        throw null;
                    }
                    d0 transform = d0.f63960j;
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    Intrinsics.checkNotNullParameter(transform, "transform");
                    kg.o.g(2, 2);
                    boolean z13 = eVar2 instanceof RandomAccess;
                    List list2 = eVar2.f108981a;
                    if (z13) {
                        int size = list2.size();
                        arrayList = new ArrayList((size / 2) + (size % 2 == 0 ? 0 : 1));
                        kotlin.collections.g gVar = new kotlin.collections.g(eVar2);
                        for (int i14 = 0; i14 >= 0 && i14 < size; i14 += 2) {
                            int i15 = size - i14;
                            if (2 <= i15) {
                                i15 = 2;
                            }
                            if (i15 >= 2) {
                                gVar.c(i14, i15 + i14);
                                arrayList.add(transform.invoke(gVar));
                            }
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator O = kg.o.O(list2.iterator(), 2, 2, false, true);
                        while (O.hasNext()) {
                            arrayList2.add(transform.invoke((List) O.next()));
                        }
                        arrayList = arrayList2;
                    }
                    for (Pair pair : arrayList) {
                        String key = (String) pair.f80346a;
                        ro2.n element2 = (ro2.n) pair.f80347b;
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(element2, "element");
                    }
                }
                return new ro2.c0(linkedHashMap);
            default:
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(value, "value");
                ro2.f fVar = new ro2.f();
                ro2.c0 f13 = ro2.o.f(value);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : f13.f108979a.entrySet()) {
                    if (!Intrinsics.d((String) entry.getKey(), "type")) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                boolean z14 = !linkedHashMap2.isEmpty();
                ArrayList arrayList3 = fVar.f108985a;
                if (z14) {
                    Intrinsics.checkNotNullParameter(element, "element");
                    arrayList3.add(element);
                    ap.m builderAction = new ap.m(r5, linkedHashMap2);
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    Intrinsics.checkNotNullParameter(builderAction, "builderAction");
                    ro2.f fVar2 = new ro2.f();
                    builderAction.invoke(fVar2);
                    ro2.e element3 = new ro2.e(fVar2.f108985a);
                    Intrinsics.checkNotNullParameter(element3, "element");
                    arrayList3.add(element3);
                }
                return new ro2.e(arrayList3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f63967i) {
        }
        return b((String) obj, (ro2.n) obj2);
    }
}
