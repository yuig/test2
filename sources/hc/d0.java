package hc;

/* loaded from: classes3.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68638a = tb.c.k("nm", "r", "hd");

    public static ec.p a(ic.e eVar, com.airbnb.lottie.h hVar) {
        boolean z13 = false;
        String str = null;
        dc.b bVar = null;
        while (eVar.hasNext()) {
            int k13 = eVar.k(f68638a);
            if (k13 == 0) {
                str = eVar.Y0();
            } else if (k13 == 1) {
                bVar = bs1.c.z1(eVar, hVar, true);
            } else if (k13 != 2) {
                eVar.E();
            } else {
                z13 = eVar.R0();
            }
        }
        if (z13) {
            return null;
        }
        return new ec.p(str, bVar);
    }
}
