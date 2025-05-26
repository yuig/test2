package hc;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68660a = tb.c.k("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68661b = tb.c.k("shapes");

    public static cc.e a(ic.e eVar, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        eVar.c();
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        char c13 = 0;
        while (eVar.hasNext()) {
            int k13 = eVar.k(f68660a);
            if (k13 == 0) {
                c13 = eVar.Y0().charAt(0);
            } else if (k13 == 1) {
                eVar.s1();
            } else if (k13 == 2) {
                d2 = eVar.s1();
            } else if (k13 == 3) {
                str = eVar.Y0();
            } else if (k13 == 4) {
                str2 = eVar.Y0();
            } else if (k13 != 5) {
                eVar.m();
                eVar.E();
            } else {
                eVar.c();
                while (eVar.hasNext()) {
                    if (eVar.k(f68661b) != 0) {
                        eVar.m();
                        eVar.E();
                    } else {
                        eVar.a();
                        while (eVar.hasNext()) {
                            arrayList.add((ec.s) g.a(eVar, hVar));
                        }
                        eVar.d();
                    }
                }
                eVar.e();
            }
        }
        eVar.e();
        return new cc.e(arrayList, c13, d2, str, str2);
    }
}
