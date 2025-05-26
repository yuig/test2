package zd1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kh2.g3;
import kotlin.Pair;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f141706a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f141707b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f141708c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f141709d = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(boolean r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap r1 = r12.f141707b
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L10:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Integer r5 = kotlin.text.StringsKt.toIntOrNull(r5)
            r6 = 0
            if (r5 == 0) goto L37
            int r5 = r5.intValue()
            t32.d r7 = t32.f.Companion
            r7.getClass()
            t32.f r5 = t32.d.a(r5)
            goto L38
        L37:
            r5 = r6
        L38:
            if (r3 <= 0) goto L66
            zd1.i r7 = new zd1.i
            zd1.q r8 = zd1.q.FILTER_HEADER
            zd1.j r9 = zd1.j.MULTI_SELECT_FILTER_HEADER
            java.util.LinkedHashMap r10 = r12.f141706a
            if (r5 == 0) goto L4d
            int r11 = r5.value()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L4e
        L4d:
            r11 = r6
        L4e:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.Object r10 = r10.get(r11)
            com.pinterest.api.model.px0 r10 = (com.pinterest.api.model.px0) r10
            if (r10 == 0) goto L5f
            java.lang.String r10 = r10.p()
            goto L60
        L5f:
            r10 = r6
        L60:
            r7.<init>(r5, r8, r9, r10)
            r0.add(r7)
        L66:
            java.util.LinkedHashMap r7 = r12.f141708c
            java.lang.Object r8 = r4.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L83
            r8 = r13 ^ 1
            if (r8 == 0) goto L79
            r6 = r7
        L79:
            if (r6 == 0) goto L83
            java.util.ArrayList r4 = kh2.g3.N(r6)
            r0.addAll(r4)
            goto L96
        L83:
            java.lang.Object r4 = r4.getKey()
            java.lang.Object r4 = r1.get(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L96
            java.util.ArrayList r4 = kh2.g3.N(r4)
            r0.addAll(r4)
        L96:
            int r3 = r3 + 1
            int r4 = r1.size()
            if (r3 == r4) goto L10
            zd1.e r4 = new zd1.e
            zd1.q r6 = zd1.q.FILTER_DIVIDER
            r4.<init>(r5, r6)
            r0.add(r4)
            goto L10
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zd1.e0.a(boolean):java.util.ArrayList");
    }

    public final int b() {
        Collection values = this.f141708c.values();
        ArrayList arrayList = new ArrayList(g0.q(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(g3.H((ArrayList) it.next(), null)));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return 0;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
        }
        return ((Number) next).intValue();
    }

    public final Pair c(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        ArrayList arrayList = (ArrayList) this.f141708c.get(productFilterType);
        if (arrayList != null) {
            return new Pair(g3.N(arrayList), Boolean.TRUE);
        }
        ArrayList arrayList2 = (ArrayList) this.f141707b.get(productFilterType);
        if (arrayList2 != null) {
            return new Pair(g3.N(arrayList2), Boolean.FALSE);
        }
        return null;
    }

    public final ArrayList d(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        if (Intrinsics.d(productFilterType, String.valueOf(t32.f.PRODUCT_CONTENT_TYPE.value()))) {
            return g3.N(a(true));
        }
        ArrayList arrayList = (ArrayList) this.f141707b.get(productFilterType);
        if (arrayList != null) {
            return g3.N(arrayList);
        }
        return null;
    }

    public final ArrayList e(t32.f fVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f141708c.values().iterator();
        while (it.hasNext()) {
            for (h hVar : (ArrayList) it.next()) {
                if (hVar.c() != fVar) {
                    if (hVar instanceof r) {
                        r rVar = (r) hVar;
                        if (rVar.f141748c != rVar.f141751f || rVar.f141750e != rVar.f141752g) {
                            arrayList.add(hVar);
                        }
                    } else if ((hVar instanceof g) && ((g) hVar).f141719j) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return b() > 0;
    }

    public final void g(String productFilterType) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        boolean d2 = Intrinsics.d(productFilterType, String.valueOf(t32.f.PRODUCT_CONTENT_TYPE.value()));
        LinkedHashMap linkedHashMap = this.f141708c;
        if (d2) {
            linkedHashMap.clear();
        } else {
            linkedHashMap.remove(productFilterType);
        }
    }

    public final void h(String productFilterType, ArrayList filterList) {
        Intrinsics.checkNotNullParameter(productFilterType, "productFilterType");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        ArrayList arrayList = (ArrayList) this.f141707b.get(productFilterType);
        if (arrayList != null) {
            boolean d2 = Intrinsics.d(arrayList, filterList);
            LinkedHashMap linkedHashMap = this.f141708c;
            if (d2) {
                linkedHashMap.remove(productFilterType);
            } else {
                linkedHashMap.put(productFilterType, filterList);
            }
        }
    }
}
