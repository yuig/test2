package hc;

import android.graphics.Path;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68665a = tb.c.k("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68666b = tb.c.k("p", "k");

    public static ec.d a(ic.e eVar, com.airbnb.lottie.h hVar) {
        dc.a aVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        ec.f fVar = null;
        dc.c cVar = null;
        dc.a aVar2 = null;
        dc.a aVar3 = null;
        boolean z13 = false;
        while (eVar.hasNext()) {
            switch (eVar.k(f68665a)) {
                case 0:
                    str = eVar.Y0();
                    break;
                case 1:
                    eVar.c();
                    int i13 = -1;
                    while (eVar.hasNext()) {
                        int k13 = eVar.k(f68666b);
                        if (k13 == 0) {
                            i13 = eVar.o0();
                        } else if (k13 != 1) {
                            eVar.m();
                            eVar.E();
                        } else {
                            cVar = new dc.c(t.a(eVar, hVar, 1.0f, new m(i13, 0), false), 0);
                        }
                    }
                    eVar.e();
                    break;
                case 2:
                    aVar = bs1.c.A1(eVar, hVar);
                    break;
                case 3:
                    fVar = eVar.o0() == 1 ? ec.f.LINEAR : ec.f.RADIAL;
                    break;
                case 4:
                    aVar2 = bs1.c.B1(eVar, hVar);
                    break;
                case 5:
                    aVar3 = bs1.c.B1(eVar, hVar);
                    break;
                case 6:
                    fillType = eVar.o0() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z13 = eVar.R0();
                    break;
                default:
                    eVar.m();
                    eVar.E();
                    break;
            }
        }
        return new ec.d(str, fVar, fillType, cVar, aVar == null ? new dc.a(Collections.singletonList(new kc.a(100)), 1) : aVar, aVar2, aVar3, z13);
    }
}
