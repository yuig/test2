package cg;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class f extends j {

    /* renamed from: o, reason: collision with root package name */
    public final bg.d f27680o;

    public f(bg.l lVar, bg.d dVar, c cVar, String str) {
        super(lVar, dVar, cVar, "<", str);
        this.f27680o = dVar;
    }

    public static bg.a[] q(bg.a[] aVarArr, HashMap hashMap, HashSet hashSet) {
        bg.a[] aVarArr2 = (bg.a[]) aVarArr.clone();
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            bg.a aVar = aVarArr[i13];
            if (hashSet.add(aVar)) {
                if (aVar instanceof g) {
                    g gVar = (g) aVar;
                    g gVar2 = (g) hashMap.get(gVar.f27670d);
                    if (gVar2 != null) {
                        bg.a aVar2 = (bg.a) gVar2.clone();
                        aVarArr2[i13] = aVar2;
                        ((g) aVar2).f27667a = gVar.f27667a;
                    } else {
                        gVar.f27668b.f27676j = q(gVar.g(), hashMap, hashSet);
                    }
                } else {
                    if ((aVar instanceof e) && !hashMap.containsKey(((e) aVar).f27670d)) {
                        aVar.c(new bg.a[0]);
                    }
                    bg.a[] g13 = aVar.g();
                    if (g13 != null) {
                        aVar.c(q(g13, hashMap, hashSet));
                    }
                }
                hashSet.remove(aVar);
            }
        }
        return aVarArr2;
    }

    @Override // cg.j, cg.b, bg.a
    public final synchronized void a() {
        try {
            k();
            HashMap hashMap = new HashMap();
            for (bg.a aVar : this.f27668b.f27676j) {
                if (aVar instanceof g) {
                    g gVar = (g) aVar;
                    hashMap.put(gVar.f27670d, gVar);
                    gVar.a();
                } else if (!(aVar instanceof l) && !(aVar instanceof a)) {
                    throw new IllegalArgumentException("Illegal code in extend section: " + aVar.getClass().getName());
                }
            }
            c cVar = (c) this.f27680o.c(p()).clone();
            this.f27684l = cVar;
            bg.a[] aVarArr = cVar.f27676j;
            HashSet hashSet = new HashSet();
            hashSet.add(this.f27684l);
            this.f27684l.f27676j = q(aVarArr, hashMap, hashSet);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
