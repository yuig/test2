package hc;

/* loaded from: classes3.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68662a = tb.c.k("s", "e", "o", "nm", "m", "hd");

    public static ec.z a(ic.e eVar, com.airbnb.lottie.h hVar) {
        String str = null;
        ec.y yVar = null;
        dc.b bVar = null;
        dc.b bVar2 = null;
        dc.b bVar3 = null;
        boolean z13 = false;
        while (eVar.hasNext()) {
            int k13 = eVar.k(f68662a);
            if (k13 == 0) {
                bVar = bs1.c.z1(eVar, hVar, false);
            } else if (k13 == 1) {
                bVar2 = bs1.c.z1(eVar, hVar, false);
            } else if (k13 == 2) {
                bVar3 = bs1.c.z1(eVar, hVar, false);
            } else if (k13 == 3) {
                str = eVar.Y0();
            } else if (k13 == 4) {
                yVar = ec.y.forId(eVar.o0());
            } else if (k13 != 5) {
                eVar.E();
            } else {
                z13 = eVar.R0();
            }
        }
        return new ec.z(str, yVar, bVar, bVar2, bVar3, z13);
    }
}
