package hd1;

import com.pinterest.api.model.vh;
import com.pinterest.api.model.xk;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import g1.g;
import gb2.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import nr0.k;
import qz.f0;
import z32.m0;

/* loaded from: classes5.dex */
public class b extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final c L;
    public final String M;
    public final String N;
    public final g O;
    public gb2.d P;
    public final LinkedHashMap Q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(hd1.c r36, java.lang.String r37, int r38) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hd1.b.<init>(hd1.c, java.lang.String, int):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.O.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new l[]{obj};
            } else if (!c0.y(E, obj)) {
                E = z.t(E, obj);
            }
        }
        return (l[]) E;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean e(int i13) {
        if (g0(i13)) {
            return false;
        }
        return this.E.e(i13);
    }

    public final f0 f0(HashMap hashMap) {
        f0 f0Var = new f0();
        if (hashMap != null) {
            f0Var.f(hashMap);
        }
        c cVar = this.L;
        String str = (String) cVar.f68884a.get("source");
        if (str != null) {
            f0Var.e("source", str);
        }
        String str2 = (String) cVar.f68884a.get("search_query");
        if (str2 != null) {
            f0Var.e("search_query", str2);
        }
        String str3 = this.M;
        if (str3 != null && str3.length() != 0) {
            f0Var.e("shop_source", str3);
        }
        f0Var.e("fields", this.N);
        f0Var.e("page_size", cVar.f68890g.d());
        return f0Var;
    }

    public final boolean g0(int i13) {
        if (!d2(i13)) {
            return false;
        }
        int itemViewType = getItemViewType(i13);
        return itemViewType == -2 || itemViewType == -1 || RecyclerViewTypes.INSTANCE.getFULL_BLEED_ITEM_TYPES().contains(Integer.valueOf(itemViewType));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public int getItemViewType(int i13) {
        s item = getItem(i13);
        boolean z13 = item instanceof vh;
        k kVar = this.E;
        if (!z13) {
            return item instanceof xk ? RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP : kVar.getItemViewType(i13);
        }
        m0 m0Var = ((vh) item).f42868z;
        int i14 = m0Var == null ? -1 : a.f68882a[m0Var.ordinal()];
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? kVar.getItemViewType(i13) : RecyclerViewTypes.VIEW_TYPE_SHOPPING_SPOTLIGHT : RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN : RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean h(int i13) {
        if (g0(i13)) {
            return false;
        }
        return this.E.h(i13);
    }

    public final void h0(List productFilterKeys, Map productFilterParamMap) {
        HashMap hashMap;
        f0 f0Var;
        Intrinsics.checkNotNullParameter(productFilterParamMap, "productFilterParamMap");
        Intrinsics.checkNotNullParameter(productFilterKeys, "productFilterKeys");
        c cVar = this.L;
        Map n13 = z0.n(cVar.f68884a);
        Intrinsics.g(n13, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        HashMap hashMap2 = (HashMap) n13;
        hashMap2.putAll(productFilterParamMap);
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.g(productFilterKeys, productFilterParamMap);
        } else {
            hashMap2.putAll(productFilterParamMap);
            f0(hashMap2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = productFilterKeys.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = cVar.f68884a;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (hashMap.containsKey((String) next)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            String str2 = (String) hashMap.get(str);
            if (str2 != null && (f0Var = this.f49121k) != null) {
                f0Var.e(str, str2);
            }
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        String str = (String) this.L.f68884a.get("search_query");
        return str == null ? "" : str;
    }
}
