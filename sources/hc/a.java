package hc;

import i2.a2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68628a = tb.c.k("k", "x", "y");

    public static a2 a(ic.e eVar, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar.g() == ic.c.BEGIN_ARRAY) {
            eVar.a();
            while (eVar.hasNext()) {
                arrayList.add(new zb.m(hVar, s.b(eVar, hVar, jc.g.c(), y.f68686a, eVar.g() == ic.c.BEGIN_OBJECT, false)));
            }
            eVar.d();
            t.b(arrayList);
        } else {
            arrayList.add(new kc.a(r.b(eVar, jc.g.c())));
        }
        return new a2(arrayList, 2);
    }

    public static dc.f b(ic.e eVar, com.airbnb.lottie.h hVar) {
        eVar.c();
        a2 a2Var = null;
        dc.b bVar = null;
        boolean z13 = false;
        dc.b bVar2 = null;
        while (eVar.g() != ic.c.END_OBJECT) {
            int k13 = eVar.k(f68628a);
            if (k13 == 0) {
                a2Var = a(eVar, hVar);
            } else if (k13 != 1) {
                if (k13 != 2) {
                    eVar.m();
                    eVar.E();
                } else if (eVar.g() == ic.c.STRING) {
                    eVar.E();
                    z13 = true;
                } else {
                    bVar = bs1.c.z1(eVar, hVar, true);
                }
            } else if (eVar.g() == ic.c.STRING) {
                eVar.E();
                z13 = true;
            } else {
                bVar2 = bs1.c.z1(eVar, hVar, true);
            }
        }
        eVar.e();
        if (z13) {
            hVar.a("Lottie doesn't support expressions.");
        }
        return a2Var != null ? a2Var : new dc.d(bVar2, bVar);
    }
}
