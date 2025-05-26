package hc;

/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68629a = tb.c.k("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    public static ec.n a(ic.e eVar, com.airbnb.lottie.h hVar, int i13) {
        boolean z13 = false;
        boolean z14 = i13 == 3;
        String str = null;
        ec.m mVar = null;
        dc.b bVar = null;
        dc.f fVar = null;
        dc.b bVar2 = null;
        dc.b bVar3 = null;
        dc.b bVar4 = null;
        dc.b bVar5 = null;
        dc.b bVar6 = null;
        while (eVar.hasNext()) {
            switch (eVar.k(f68629a)) {
                case 0:
                    str = eVar.Y0();
                    break;
                case 1:
                    mVar = ec.m.forValue(eVar.o0());
                    break;
                case 2:
                    bVar = bs1.c.z1(eVar, hVar, false);
                    break;
                case 3:
                    fVar = a.b(eVar, hVar);
                    break;
                case 4:
                    bVar2 = bs1.c.z1(eVar, hVar, false);
                    break;
                case 5:
                    bVar4 = bs1.c.z1(eVar, hVar, true);
                    break;
                case 6:
                    bVar6 = bs1.c.z1(eVar, hVar, false);
                    break;
                case 7:
                    bVar3 = bs1.c.z1(eVar, hVar, true);
                    break;
                case 8:
                    bVar5 = bs1.c.z1(eVar, hVar, false);
                    break;
                case 9:
                    z13 = eVar.R0();
                    break;
                case 10:
                    if (eVar.o0() != 3) {
                        z14 = false;
                        break;
                    } else {
                        z14 = true;
                        break;
                    }
                default:
                    eVar.m();
                    eVar.E();
                    break;
            }
        }
        return new ec.n(str, mVar, bVar, fVar, bVar2, bVar3, bVar4, bVar5, bVar6, z13, z14);
    }
}
