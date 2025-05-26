package hc;

/* loaded from: classes3.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68632a = tb.c.k("nm", "p", "s", "r", "hd");

    public static ec.o a(ic.e eVar, com.airbnb.lottie.h hVar) {
        String str = null;
        dc.f fVar = null;
        dc.a aVar = null;
        dc.b bVar = null;
        boolean z13 = false;
        while (eVar.hasNext()) {
            int k13 = eVar.k(f68632a);
            if (k13 == 0) {
                str = eVar.Y0();
            } else if (k13 == 1) {
                fVar = a.b(eVar, hVar);
            } else if (k13 == 2) {
                aVar = bs1.c.B1(eVar, hVar);
            } else if (k13 == 3) {
                bVar = bs1.c.z1(eVar, hVar, true);
            } else if (k13 != 4) {
                eVar.E();
            } else {
                z13 = eVar.R0();
            }
        }
        return new ec.o(str, fVar, aVar, bVar, z13);
    }
}
