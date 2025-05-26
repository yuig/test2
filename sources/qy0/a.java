package qy0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.qz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import sw0.u;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f105339a;

    /* renamed from: b, reason: collision with root package name */
    public final List f105340b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f105341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105342d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f105343e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f105344f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f105345g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f105346h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f105347i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f105348j;

    public a(Map selectedPinsByUseCaseWithTimestamp, List selectedUseCaseIds, Map repinsByParentPinId, int i13) {
        Object obj;
        Intrinsics.checkNotNullParameter(selectedPinsByUseCaseWithTimestamp, "selectedPinsByUseCaseWithTimestamp");
        Intrinsics.checkNotNullParameter(selectedUseCaseIds, "selectedUseCaseIds");
        Intrinsics.checkNotNullParameter(repinsByParentPinId, "repinsByParentPinId");
        this.f105339a = selectedPinsByUseCaseWithTimestamp;
        this.f105340b = selectedUseCaseIds;
        this.f105341c = repinsByParentPinId;
        this.f105342d = i13;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(selectedPinsByUseCaseWithTimestamp.size()));
        for (Map.Entry entry : selectedPinsByUseCaseWithTimestamp.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((d) it.next()).f105352a);
            }
            linkedHashMap.put(key, arrayList);
        }
        this.f105343e = linkedHashMap;
        List<String> list2 = this.f105340b;
        ArrayList arrayList2 = new ArrayList();
        for (String str : list2) {
            Iterator it2 = this.f105343e.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.d(((qz) obj).getId(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            qz qzVar = (qz) obj;
            if (qzVar != null) {
                arrayList2.add(qzVar);
            }
        }
        this.f105344f = arrayList2;
        ArrayList r13 = g0.r(this.f105343e.values());
        this.f105345g = r13;
        ArrayList arrayList3 = new ArrayList(g0.q(r13, 10));
        Iterator it3 = r13.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((f30) it3.next()).getId());
        }
        this.f105346h = arrayList3;
        this.f105347i = arrayList3.size() >= this.f105342d;
        LinkedHashMap linkedHashMap2 = this.f105343e;
        ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            qz qzVar2 = (qz) entry2.getKey();
            List list3 = (List) entry2.getValue();
            String id3 = qzVar2.getId();
            List list4 = list3;
            ArrayList arrayList5 = new ArrayList(g0.q(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(((f30) it4.next()).getId());
            }
            arrayList4.add(new Pair(id3, arrayList5));
        }
        this.f105348j = z0.m(arrayList4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static a a(a aVar, Map selectedPinsByUseCaseWithTimestamp, ArrayList arrayList, Map repinsByParentPinId, int i13, int i14) {
        if ((i14 & 1) != 0) {
            selectedPinsByUseCaseWithTimestamp = aVar.f105339a;
        }
        ArrayList selectedUseCaseIds = arrayList;
        if ((i14 & 2) != 0) {
            selectedUseCaseIds = aVar.f105340b;
        }
        if ((i14 & 4) != 0) {
            repinsByParentPinId = aVar.f105341c;
        }
        if ((i14 & 8) != 0) {
            i13 = aVar.f105342d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPinsByUseCaseWithTimestamp, "selectedPinsByUseCaseWithTimestamp");
        Intrinsics.checkNotNullParameter(selectedUseCaseIds, "selectedUseCaseIds");
        Intrinsics.checkNotNullParameter(repinsByParentPinId, "repinsByParentPinId");
        return new a(selectedPinsByUseCaseWithTimestamp, selectedUseCaseIds, repinsByParentPinId, i13);
    }

    public final LinkedHashMap b(int i13) {
        List x03 = CollectionsKt.x0(g0.r(this.f105339a.values()), new u(3));
        ArrayList arrayList = new ArrayList(g0.q(x03, 10));
        Iterator it = x03.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).f105352a.getId());
        }
        List y03 = CollectionsKt.y0(arrayList, i13);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f105348j.entrySet()) {
            if (this.f105340b.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            List list = (List) entry2.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (y03.contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f105339a, aVar.f105339a) && Intrinsics.d(this.f105340b, aVar.f105340b) && Intrinsics.d(this.f105341c, aVar.f105341c) && this.f105342d == aVar.f105342d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105342d) + a.c.e(this.f105341c, ep.b.c(this.f105340b, this.f105339a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "NuxSharedState(selectedPinsByUseCaseWithTimestamp=" + this.f105339a + ", selectedUseCaseIds=" + this.f105340b + ", repinsByParentPinId=" + this.f105341c + ", minSelectedPins=" + this.f105342d + ")";
    }
}
