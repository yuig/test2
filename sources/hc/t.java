package hc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68676a = tb.c.k("k");

    public static ArrayList a(ic.d dVar, com.airbnb.lottie.h hVar, float f13, l0 l0Var, boolean z13) {
        ArrayList arrayList = new ArrayList();
        if (dVar.g() == ic.c.STRING) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        dVar.c();
        while (dVar.hasNext()) {
            if (dVar.k(f68676a) != 0) {
                dVar.E();
            } else if (dVar.g() == ic.c.BEGIN_ARRAY) {
                dVar.a();
                if (dVar.g() == ic.c.NUMBER) {
                    arrayList.add(s.b(dVar, hVar, f13, l0Var, false, z13));
                } else {
                    while (dVar.hasNext()) {
                        arrayList.add(s.b(dVar, hVar, f13, l0Var, true, z13));
                    }
                }
                dVar.d();
            } else {
                arrayList.add(s.b(dVar, hVar, f13, l0Var, false, z13));
            }
        }
        dVar.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i13;
        Object obj;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            i13 = size - 1;
            if (i14 >= i13) {
                break;
            }
            kc.a aVar = (kc.a) arrayList.get(i14);
            i14++;
            kc.a aVar2 = (kc.a) arrayList.get(i14);
            aVar.f79110h = Float.valueOf(aVar2.f79109g);
            if (aVar.f79105c == null && (obj = aVar2.f79104b) != null) {
                aVar.f79105c = obj;
                if (aVar instanceof zb.m) {
                    ((zb.m) aVar).d();
                }
            }
        }
        kc.a aVar3 = (kc.a) arrayList.get(i13);
        if ((aVar3.f79104b == null || aVar3.f79105c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
