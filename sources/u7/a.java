package u7;

import a7.i0;
import android.net.Uri;
import b7.c;
import g7.i;
import h7.d;
import h7.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import pk.c1;
import v7.h;
import v7.k;
import v7.o;
import v7.p;
import z7.n;
import z7.q;
import z7.s;
import z7.u;

/* loaded from: classes3.dex */
public final class a extends u {
    public a(i0 i0Var, d dVar, Executor executor) {
        super(i0Var, new p(), dVar, executor);
    }

    public static void i(k kVar, h hVar, HashSet hashSet, ArrayList arrayList) {
        long j13 = kVar.f124305h + hVar.f124289e;
        String str = kVar.f124341a;
        String str2 = hVar.f124291g;
        if (str2 != null) {
            Uri O = c.O(str, str2);
            if (hashSet.add(O)) {
                arrayList.add(new s(j13, u.d(O)));
            }
        }
        arrayList.add(new s(j13, new i(c.O(str, hVar.f124285a), hVar.f124293i, hVar.f124294j)));
    }

    @Override // z7.u
    public final ArrayList e(e eVar, n nVar, boolean z13) {
        o oVar = (o) nVar;
        ArrayList arrayList = new ArrayList();
        if (oVar instanceof v7.n) {
            List list = ((v7.n) oVar).f124331d;
            for (int i13 = 0; i13 < list.size(); i13++) {
                arrayList.add(u.d((Uri) list.get(i13)));
            }
        } else {
            arrayList.add(u.d(Uri.parse(oVar.f124341a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            arrayList2.add(new s(0L, iVar));
            try {
                k kVar = (k) ((n) c(new q(this, eVar, iVar), z13));
                c1 c1Var = kVar.f124315r;
                h hVar = null;
                for (int i14 = 0; i14 < c1Var.size(); i14++) {
                    h hVar2 = (h) c1Var.get(i14);
                    h hVar3 = hVar2.f124286b;
                    if (hVar3 != null && hVar3 != hVar) {
                        i(kVar, hVar3, hashSet, arrayList2);
                        hVar = hVar3;
                    }
                    i(kVar, hVar2, hashSet, arrayList2);
                }
            } catch (IOException e13) {
                if (!z13) {
                    throw e13;
                }
            }
        }
        return arrayList2;
    }
}
