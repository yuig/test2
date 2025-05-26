package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
/* loaded from: classes.dex */
public class BoardSectionFeed extends Feed<ba> {
    public static final Parcelable.Creator<BoardSectionFeed> CREATOR = new ca();

    public BoardSectionFeed(vd0.c cVar, String str, ke0.b bVar) {
        super(cVar, str);
        if (cVar == null) {
            return;
        }
        vd0.a aVar = (vd0.a) this.f105381a;
        H(new ArrayList(aVar != null ? bVar.c(aVar) : new ArrayList()));
        g(null);
    }

    @Override // com.pinterest.api.model.Feed
    public final List u() {
        ba baVar;
        gw gwVar = fw.f37821a;
        ArrayList arrayList = this.f35559k;
        gwVar.getClass();
        if (qb0.b.o(arrayList)) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ba baVar2 = null;
            if (str != null && (baVar = (ba) ew.f37360d.get(str)) != null) {
                boolean[] zArr = baVar.f36034k;
                if (zArr.length <= 6 || !zArr[6]) {
                    aa aaVar = new aa(baVar, 0);
                    ArrayList arrayList3 = new ArrayList();
                    nw nwVar = (nw) ew.f();
                    nwVar.c();
                    Set<String> keySet = nwVar.f40520e.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                    ArrayList arrayList4 = new ArrayList();
                    for (String str2 : keySet) {
                        Intrinsics.f(str2);
                        dl1.s b13 = nwVar.b(str2);
                        if (b13 != null) {
                            arrayList4.add(b13);
                        }
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        f30 f30Var = (f30) it2.next();
                        ba j63 = f30Var.j6();
                        if (j63 != null && str.equals(j63.getId())) {
                            arrayList3.add(f30Var);
                        }
                    }
                    aaVar.c(arrayList3);
                    ba a13 = aaVar.a();
                    LruCache lruCache = ew.f37360d;
                    synchronized (lruCache) {
                        lruCache.put(a13.getId(), a13);
                    }
                    baVar2 = a13;
                } else {
                    baVar2 = baVar;
                }
            }
            if (baVar2 == null) {
                break;
            }
            arrayList2.add(baVar2);
        }
        return arrayList2.size() == arrayList.size() ? arrayList2 : new ArrayList();
    }

    public BoardSectionFeed(Parcel parcel) {
        super(null, null);
        C(parcel);
    }
}
