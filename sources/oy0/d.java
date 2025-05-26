package oy0;

import ao2.j0;
import ao2.o1;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qz;
import do2.t2;
import do2.u2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import ny0.d0;
import ny0.e0;
import ny0.f0;
import ny0.g0;
import ny0.m;
import py0.e;
import u50.r;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final qy0.b f98272a;

    /* renamed from: b, reason: collision with root package name */
    public final e f98273b;

    /* renamed from: c, reason: collision with root package name */
    public final c30.a f98274c;

    /* renamed from: d, reason: collision with root package name */
    public final t2 f98275d;

    public d(qy0.b nuxSharedStateRepository, e nuxPinSelectionSEP, c30.a userStateService) {
        Intrinsics.checkNotNullParameter(nuxSharedStateRepository, "nuxSharedStateRepository");
        Intrinsics.checkNotNullParameter(nuxPinSelectionSEP, "nuxPinSelectionSEP");
        Intrinsics.checkNotNullParameter(userStateService, "userStateService");
        this.f98272a = nuxSharedStateRepository;
        this.f98273b = nuxPinSelectionSEP;
        this.f98274c = userStateService;
        this.f98275d = u2.a(z0.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.ArrayList] */
    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        t2 t2Var;
        boolean z13;
        Iterator it;
        t2 t2Var2;
        Object obj;
        g0 request = (g0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z14 = request instanceof f0;
        qy0.b bVar = this.f98272a;
        if (!z14) {
            if (request instanceof d0) {
                eventIntake.a(new m(bVar.a()));
                return;
            } else {
                if (request instanceof e0) {
                    j.z(scope, null, null, new a(this, null), 3);
                    return;
                }
                return;
            }
        }
        f0 f0Var = (f0) request;
        t2 t2Var3 = this.f98275d;
        o1 o1Var = (o1) ((Map) t2Var3.getValue()).get(f0Var.f92589a.getUid());
        if (o1Var == null || !o1Var.isActive()) {
            bVar.getClass();
            f30 pin = f0Var.f92589a;
            Intrinsics.checkNotNullParameter(pin, "pin");
            String useCaseId = f0Var.f92590b;
            Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
            while (true) {
                t2 t2Var4 = bVar.f105350b;
                Object value = t2Var4.getValue();
                qy0.a aVar = (qy0.a) value;
                Map map = aVar.f105339a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(map.size()));
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    qz qzVar = (qz) entry.getKey();
                    ?? r14 = (List) entry.getValue();
                    if (Intrinsics.d(qzVar.getUid(), useCaseId)) {
                        Iterable iterable = (Iterable) r14;
                        it = it2;
                        t2Var2 = t2Var3;
                        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable, 10));
                        for (Iterator it3 = iterable.iterator(); it3.hasNext(); it3 = it3) {
                            arrayList.add(((qy0.d) it3.next()).f105352a.getUid());
                        }
                        if (arrayList.contains(pin.getUid())) {
                            r14 = new ArrayList();
                            Iterator it4 = iterable.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                Iterator it5 = it4;
                                if (!Intrinsics.d(((qy0.d) next).f105352a.getUid(), pin.getUid())) {
                                    r14.add(next);
                                }
                                it4 = it5;
                            }
                        } else {
                            ((pb0.g) bVar.f105349a).getClass();
                            obj = key;
                            r14 = CollectionsKt.m0(new qy0.d(pin, System.currentTimeMillis()), (Collection) r14);
                            linkedHashMap.put(obj, r14);
                            it2 = it;
                            t2Var3 = t2Var2;
                        }
                    } else {
                        it = it2;
                        t2Var2 = t2Var3;
                    }
                    obj = key;
                    linkedHashMap.put(obj, r14);
                    it2 = it;
                    t2Var3 = t2Var2;
                }
                t2Var = t2Var3;
                if (t2Var4.h(value, qy0.a.a(aVar, linkedHashMap, null, null, 0, 14))) {
                    break;
                } else {
                    t2Var3 = t2Var;
                }
            }
            Set<Map.Entry> entrySet = bVar.a().f105343e.entrySet();
            if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                for (Map.Entry entry2 : entrySet) {
                    qz qzVar2 = (qz) entry2.getKey();
                    List list = (List) entry2.getValue();
                    if (Intrinsics.d(qzVar2.getUid(), useCaseId)) {
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(((f30) it6.next()).getUid());
                        }
                        if (arrayList2.contains(pin.getUid())) {
                            z13 = true;
                            break;
                        }
                    }
                }
            }
            z13 = false;
            eventIntake.a(new m(bVar.a()));
            if (f0Var.f92592d) {
                t2Var.i(z0.k((Map) t2Var.getValue(), new Pair(pin.getUid(), j.z(scope, null, null, new c(z13, f0Var, this, null), 3))));
            }
        }
    }
}
