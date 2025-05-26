package jg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements mt1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ et1.e f75913b;

    public /* synthetic */ b(et1.e eVar, int i13) {
        this.f75912a = i13;
        this.f75913b = eVar;
    }

    @Override // mt1.c
    public final void b() {
        Long valueOf;
        int i13 = this.f75912a;
        et1.e eVar = this.f75913b;
        switch (i13) {
            case 0:
                break;
            case 1:
                ((c) eVar).f75921b = true;
                break;
            default:
                mt1.l lVar = (mt1.l) eVar;
                LinkedHashMap linkedHashMap = lVar.f88174e;
                ArrayList arrayList = new ArrayList();
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Long l13 = ((mt1.k) ((Map.Entry) it.next()).getValue()).f88165b;
                    if (l13 != null) {
                        arrayList.add(l13);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    valueOf = Long.valueOf(((Number) it2.next()).longValue());
                    while (it2.hasNext()) {
                        Long valueOf2 = Long.valueOf(((Number) it2.next()).longValue());
                        if (valueOf.compareTo(valueOf2) > 0) {
                            valueOf = valueOf2;
                        }
                    }
                } else {
                    valueOf = null;
                }
                Long valueOf3 = valueOf != null ? Long.valueOf(valueOf.longValue() + lVar.f88170a) : null;
                if (!lVar.f88175f) {
                    LinkedHashMap linkedHashMap2 = lVar.f88174e;
                    Collection values = linkedHashMap2.values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    Collection collection = values;
                    if (!collection.isEmpty()) {
                        Iterator it3 = collection.iterator();
                        while (it3.hasNext()) {
                            if (!((mt1.k) it3.next()).f88166c) {
                                Collection<mt1.k> values2 = linkedHashMap2.values();
                                Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
                                for (mt1.k kVar : values2) {
                                    if (!kVar.f88166c) {
                                        Long l14 = kVar.f88165b;
                                        if (l14 != null) {
                                            long longValue = l14.longValue();
                                            Intrinsics.f(valueOf3);
                                            if (longValue > valueOf3.longValue()) {
                                            }
                                        }
                                        kVar.f88167d.e(null);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    c();
                    break;
                }
                break;
        }
    }

    public final void c() {
        mt1.l lVar = (mt1.l) this.f75913b;
        if (lVar.f88175f) {
            return;
        }
        lVar.f88175f = true;
        Collection values = lVar.f88174e.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((mt1.k) it.next()).f88167d.f();
        }
    }

    @Override // mt1.a
    public final void g() {
        switch (this.f75912a) {
            case 0:
                c cVar = (c) this.f75913b;
                cVar.f75922c = true;
                if (!cVar.f75923d) {
                    cVar.f75923d = true;
                    cVar.f75926g.f();
                    break;
                }
                break;
            case 1:
                break;
            default:
                c();
                break;
        }
    }
}
