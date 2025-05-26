package hc;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68667a = tb.c.k("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68668b = tb.c.k("p", "k");

    /* renamed from: c, reason: collision with root package name */
    public static final tb.c f68669c = tb.c.k("n", "v");

    public static ec.e a(ic.e eVar, com.airbnb.lottie.h hVar) {
        dc.b bVar;
        ArrayList arrayList = new ArrayList();
        float f13 = 0.0f;
        String str = null;
        ec.f fVar = null;
        dc.c cVar = null;
        dc.a aVar = null;
        dc.a aVar2 = null;
        dc.b bVar2 = null;
        ec.v vVar = null;
        ec.w wVar = null;
        dc.b bVar3 = null;
        boolean z13 = false;
        dc.a aVar3 = null;
        while (eVar.hasNext()) {
            switch (eVar.k(f68667a)) {
                case 0:
                    bVar = bVar3;
                    str = eVar.Y0();
                    break;
                case 1:
                    bVar = bVar3;
                    eVar.c();
                    int i13 = -1;
                    while (eVar.hasNext()) {
                        int k13 = eVar.k(f68668b);
                        if (k13 == 0) {
                            i13 = eVar.o0();
                        } else if (k13 != 1) {
                            eVar.m();
                            eVar.E();
                        } else {
                            cVar = new dc.c(t.a(eVar, hVar, 1.0f, new m(i13, 0), false), 0);
                            i13 = i13;
                        }
                    }
                    eVar.e();
                    break;
                case 2:
                    aVar3 = bs1.c.A1(eVar, hVar);
                    continue;
                case 3:
                    bVar = bVar3;
                    fVar = eVar.o0() == 1 ? ec.f.LINEAR : ec.f.RADIAL;
                    break;
                case 4:
                    aVar = bs1.c.B1(eVar, hVar);
                    continue;
                case 5:
                    aVar2 = bs1.c.B1(eVar, hVar);
                    continue;
                case 6:
                    bVar = bVar3;
                    bVar2 = bs1.c.z1(eVar, hVar, true);
                    break;
                case 7:
                    bVar = bVar3;
                    vVar = ec.v.values()[eVar.o0() - 1];
                    break;
                case 8:
                    bVar = bVar3;
                    wVar = ec.w.values()[eVar.o0() - 1];
                    break;
                case 9:
                    bVar = bVar3;
                    f13 = (float) eVar.s1();
                    break;
                case 10:
                    z13 = eVar.R0();
                    continue;
                case 11:
                    eVar.a();
                    while (eVar.hasNext()) {
                        eVar.c();
                        String str2 = null;
                        dc.b bVar4 = null;
                        while (eVar.hasNext()) {
                            int k14 = eVar.k(f68669c);
                            if (k14 != 0) {
                                dc.b bVar5 = bVar3;
                                if (k14 != 1) {
                                    eVar.m();
                                    eVar.E();
                                } else {
                                    bVar4 = bs1.c.z1(eVar, hVar, true);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = eVar.Y0();
                            }
                        }
                        dc.b bVar6 = bVar3;
                        eVar.e();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                hVar.f28410o = true;
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    dc.b bVar7 = bVar3;
                    eVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((dc.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    continue;
                default:
                    eVar.m();
                    eVar.E();
                    continue;
            }
            bVar3 = bVar;
        }
        return new ec.e(str, fVar, cVar, aVar3 == null ? new dc.a(Collections.singletonList(new kc.a(100)), 1) : aVar3, aVar, aVar2, bVar2, vVar, wVar, f13, arrayList, bVar3, z13);
    }
}
