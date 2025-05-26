package hc;

import android.graphics.Color;
import android.view.animation.BaseInterpolator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68678a = tb.c.k("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68679b = tb.c.k("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final tb.c f68680c = tb.c.k("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v80 */
    public static fc.i a(ic.e eVar, com.airbnb.lottie.h hVar) {
        ArrayList arrayList;
        long j13;
        boolean z13;
        String str;
        dc.e eVar2;
        String str2;
        boolean z14;
        boolean z15;
        com.airbnb.lottie.h hVar2;
        char c13;
        String str3;
        char c14;
        boolean z16;
        com.airbnb.lottie.h hVar3;
        boolean z17;
        dc.b bVar;
        dc.b bVar2;
        dc.b bVar3;
        dc.b bVar4;
        ?? r63;
        boolean z18;
        com.airbnb.lottie.h hVar4 = hVar;
        fc.h hVar5 = fc.h.NONE;
        ec.h hVar6 = ec.h.NORMAL;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        eVar.c();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        boolean z19 = false;
        fc.h hVar7 = hVar5;
        ec.h hVar8 = hVar6;
        float f13 = 1.0f;
        boolean z23 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z24 = false;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        long j14 = -1;
        fc.g gVar = null;
        String str4 = null;
        dc.c cVar = null;
        m.h hVar9 = null;
        dc.b bVar5 = null;
        h1.b bVar6 = null;
        androidx.camera.core.impl.j jVar = null;
        dc.e eVar3 = null;
        float f18 = 0.0f;
        long j15 = 0;
        String str5 = "UNSET";
        String str6 = null;
        while (eVar.hasNext()) {
            boolean z25 = true;
            switch (eVar.k(f68678a)) {
                case 0:
                    str2 = str6;
                    str5 = eVar.Y0();
                    str6 = str2;
                    break;
                case 1:
                    str2 = str6;
                    j15 = eVar.o0();
                    str6 = str2;
                    break;
                case 2:
                    str2 = str6;
                    str4 = eVar.Y0();
                    str6 = str2;
                    break;
                case 3:
                    z14 = z23;
                    str2 = str6;
                    z15 = z19;
                    hVar2 = hVar4;
                    int o03 = eVar.o0();
                    gVar = fc.g.UNKNOWN;
                    if (o03 < gVar.ordinal()) {
                        gVar = fc.g.values()[o03];
                    }
                    z19 = z15;
                    hVar4 = hVar2;
                    z23 = z14;
                    str6 = str2;
                    break;
                case 4:
                    str2 = str6;
                    j14 = eVar.o0();
                    str6 = str2;
                    break;
                case 5:
                    str2 = str6;
                    i13 = (int) (jc.g.c() * eVar.o0());
                    str6 = str2;
                    break;
                case 6:
                    str2 = str6;
                    i14 = (int) (jc.g.c() * eVar.o0());
                    str6 = str2;
                    break;
                case 7:
                    str2 = str6;
                    i15 = Color.parseColor(eVar.Y0());
                    str6 = str2;
                    break;
                case 8:
                    str2 = str6;
                    eVar3 = c.a(eVar, hVar);
                    str6 = str2;
                    break;
                case 9:
                    z14 = z23;
                    str2 = str6;
                    z15 = z19;
                    hVar2 = hVar4;
                    int o04 = eVar.o0();
                    if (o04 >= fc.h.values().length) {
                        hVar2.a("Unsupported matte type: " + o04);
                    } else {
                        hVar7 = fc.h.values()[o04];
                        int i16 = u.f68677a[hVar7.ordinal()];
                        if (i16 == 1) {
                            hVar2.a("Unsupported matte type: Luma");
                        } else if (i16 == 2) {
                            hVar2.a("Unsupported matte type: Luma Inverted");
                        }
                        hVar2.f28411p++;
                    }
                    z19 = z15;
                    hVar4 = hVar2;
                    z23 = z14;
                    str6 = str2;
                    break;
                case 10:
                    z14 = z23;
                    hVar2 = hVar4;
                    eVar.a();
                    while (eVar.hasNext()) {
                        eVar.c();
                        boolean z26 = false;
                        ec.i iVar = null;
                        dc.a aVar = null;
                        dc.a aVar2 = null;
                        while (eVar.hasNext()) {
                            String k03 = eVar.k0();
                            k03.getClass();
                            switch (k03.hashCode()) {
                                case RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE /* 111 */:
                                    if (k03.equals("o")) {
                                        c13 = 0;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 3588:
                                    if (k03.equals("pt")) {
                                        c13 = 1;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 104433:
                                    if (k03.equals("inv")) {
                                        c13 = 2;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 3357091:
                                    if (k03.equals("mode")) {
                                        c13 = 3;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                default:
                                    c13 = 65535;
                                    break;
                            }
                            switch (c13) {
                                case 0:
                                    str3 = str6;
                                    aVar2 = bs1.c.A1(eVar, hVar);
                                    break;
                                case 1:
                                    str3 = str6;
                                    aVar = new dc.a(t.a(eVar, hVar2, jc.g.c(), f0.f68642a, false), 4);
                                    break;
                                case 2:
                                    z26 = eVar.R0();
                                    str3 = str6;
                                    break;
                                case 3:
                                    String Y0 = eVar.Y0();
                                    Y0.getClass();
                                    switch (Y0.hashCode()) {
                                        case 97:
                                            if (Y0.equals("a")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE /* 105 */:
                                            if (Y0.equals("i")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL /* 110 */:
                                            if (Y0.equals("n")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE /* 115 */:
                                            if (Y0.equals("s")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            iVar = ec.i.MASK_MODE_ADD;
                                            break;
                                        case 1:
                                            hVar2.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            iVar = ec.i.MASK_MODE_INTERSECT;
                                            break;
                                        case 2:
                                            iVar = ec.i.MASK_MODE_NONE;
                                            break;
                                        case 3:
                                            iVar = ec.i.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            jc.b.c("Unknown mask mode " + k03 + ". Defaulting to Add.");
                                            iVar = ec.i.MASK_MODE_ADD;
                                            break;
                                    }
                                    str3 = str6;
                                    break;
                                default:
                                    eVar.E();
                                    str3 = str6;
                                    break;
                            }
                            str6 = str3;
                        }
                        eVar.e();
                        arrayList2.add(new ec.j(iVar, aVar, aVar2, z26));
                        str6 = str6;
                    }
                    str2 = str6;
                    z15 = false;
                    hVar2.f28411p += arrayList2.size();
                    eVar.d();
                    z19 = z15;
                    hVar4 = hVar2;
                    z23 = z14;
                    str6 = str2;
                    break;
                case 11:
                    z14 = z23;
                    hVar2 = hVar4;
                    eVar.a();
                    while (eVar.hasNext()) {
                        ec.b a13 = g.a(eVar, hVar);
                        if (a13 != null) {
                            arrayList3.add(a13);
                        }
                    }
                    eVar.d();
                    str2 = str6;
                    z15 = false;
                    z19 = z15;
                    hVar4 = hVar2;
                    z23 = z14;
                    str6 = str2;
                    break;
                case 12:
                    z16 = z23;
                    hVar3 = hVar4;
                    eVar.c();
                    while (eVar.hasNext()) {
                        int k13 = eVar.k(f68679b);
                        if (k13 == 0) {
                            cVar = new dc.c(t.a(eVar, hVar3, jc.g.c(), h.f68646a, false), 1);
                        } else if (k13 != 1) {
                            eVar.m();
                            eVar.E();
                        } else {
                            eVar.a();
                            if (eVar.hasNext()) {
                                tb.c cVar2 = b.f68630a;
                                eVar.c();
                                m.h hVar10 = null;
                                while (eVar.hasNext()) {
                                    if (eVar.k(b.f68630a) != 0) {
                                        eVar.m();
                                        eVar.E();
                                    } else {
                                        eVar.c();
                                        dc.a aVar3 = null;
                                        dc.a aVar4 = null;
                                        dc.b bVar7 = null;
                                        dc.b bVar8 = null;
                                        while (eVar.hasNext()) {
                                            int k14 = eVar.k(b.f68631b);
                                            if (k14 == 0) {
                                                aVar3 = bs1.c.y1(eVar, hVar);
                                            } else if (k14 == 1) {
                                                aVar4 = bs1.c.y1(eVar, hVar);
                                            } else if (k14 == 2) {
                                                bVar7 = bs1.c.z1(eVar, hVar3, true);
                                            } else if (k14 != 3) {
                                                eVar.m();
                                                eVar.E();
                                            } else {
                                                bVar8 = bs1.c.z1(eVar, hVar3, true);
                                            }
                                        }
                                        eVar.e();
                                        hVar10 = new m.h(aVar3, aVar4, bVar7, bVar8, 8);
                                    }
                                }
                                eVar.e();
                                if (hVar10 == null) {
                                    hVar10 = new m.h(null, null, null, null, 8);
                                }
                                hVar9 = hVar10;
                            }
                            while (eVar.hasNext()) {
                                eVar.E();
                            }
                            eVar.d();
                        }
                    }
                    eVar.e();
                    hVar4 = hVar3;
                    z23 = z16;
                    z19 = false;
                    break;
                case 13:
                    eVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    while (eVar.hasNext()) {
                        eVar.c();
                        while (eVar.hasNext()) {
                            int k15 = eVar.k(f68680c);
                            if (k15 != 0) {
                                if (k15 != z25) {
                                    eVar.m();
                                    eVar.E();
                                } else {
                                    arrayList4.add(eVar.Y0());
                                }
                                z17 = z23;
                            } else {
                                int o05 = eVar.o0();
                                if (o05 == 29) {
                                    tb.c cVar3 = d.f68636a;
                                    bVar6 = null;
                                    while (eVar.hasNext()) {
                                        if (eVar.k(d.f68636a) != 0) {
                                            eVar.m();
                                            eVar.E();
                                        } else {
                                            eVar.a();
                                            while (eVar.hasNext()) {
                                                eVar.c();
                                                boolean z27 = false;
                                                h1.b bVar9 = null;
                                                while (eVar.hasNext()) {
                                                    int k16 = eVar.k(d.f68637b);
                                                    if (k16 == 0) {
                                                        z18 = z23;
                                                        z27 = eVar.o0() == 0 ? z25 : false;
                                                    } else if (k16 != z25) {
                                                        eVar.m();
                                                        eVar.E();
                                                        z18 = z23;
                                                    } else if (z27) {
                                                        z18 = z23;
                                                        bVar9 = new h1.b(bs1.c.z1(eVar, hVar, z25), 25);
                                                    } else {
                                                        z18 = z23;
                                                        eVar.E();
                                                    }
                                                    z23 = z18;
                                                }
                                                boolean z28 = z23;
                                                eVar.e();
                                                if (bVar9 != null) {
                                                    bVar6 = bVar9;
                                                }
                                                z23 = z28;
                                            }
                                            eVar.d();
                                        }
                                    }
                                } else {
                                    z17 = z23;
                                    if (o05 == 25) {
                                        i iVar2 = new i();
                                        while (eVar.hasNext()) {
                                            if (eVar.k(i.f68649f) != 0) {
                                                eVar.m();
                                                eVar.E();
                                            } else {
                                                eVar.a();
                                                while (eVar.hasNext()) {
                                                    eVar.c();
                                                    String str7 = "";
                                                    while (eVar.hasNext()) {
                                                        int k17 = eVar.k(i.f68650g);
                                                        if (k17 == 0) {
                                                            str7 = eVar.Y0();
                                                        } else if (k17 == z25) {
                                                            str7.getClass();
                                                            switch (str7.hashCode()) {
                                                                case 353103893:
                                                                    if (str7.equals("Distance")) {
                                                                        r63 = 0;
                                                                        break;
                                                                    }
                                                                    r63 = -1;
                                                                    break;
                                                                case 397447147:
                                                                    if (str7.equals("Opacity")) {
                                                                        r63 = z25;
                                                                        break;
                                                                    }
                                                                    r63 = -1;
                                                                    break;
                                                                case 1041377119:
                                                                    if (str7.equals("Direction")) {
                                                                        r63 = 2;
                                                                        break;
                                                                    }
                                                                    r63 = -1;
                                                                    break;
                                                                case 1379387491:
                                                                    if (str7.equals("Shadow Color")) {
                                                                        r63 = 3;
                                                                        break;
                                                                    }
                                                                    r63 = -1;
                                                                    break;
                                                                case 1383710113:
                                                                    if (str7.equals("Softness")) {
                                                                        r63 = 4;
                                                                        break;
                                                                    }
                                                                    r63 = -1;
                                                                    break;
                                                                default:
                                                                    r63 = -1;
                                                                    break;
                                                            }
                                                            switch (r63) {
                                                                case 0:
                                                                    iVar2.f68654d = bs1.c.z1(eVar, hVar, z25);
                                                                    break;
                                                                case 1:
                                                                    iVar2.f68652b = bs1.c.z1(eVar, hVar, false);
                                                                    break;
                                                                case 2:
                                                                    iVar2.f68653c = bs1.c.z1(eVar, hVar, false);
                                                                    break;
                                                                case 3:
                                                                    iVar2.f68651a = bs1.c.y1(eVar, hVar);
                                                                    break;
                                                                case 4:
                                                                    iVar2.f68655e = bs1.c.z1(eVar, hVar, z25);
                                                                    break;
                                                                default:
                                                                    eVar.E();
                                                                    break;
                                                            }
                                                        } else {
                                                            eVar.m();
                                                            eVar.E();
                                                        }
                                                    }
                                                    eVar.e();
                                                }
                                                eVar.d();
                                            }
                                        }
                                        dc.a aVar5 = iVar2.f68651a;
                                        jVar = (aVar5 == null || (bVar = iVar2.f68652b) == null || (bVar2 = iVar2.f68653c) == null || (bVar3 = iVar2.f68654d) == null || (bVar4 = iVar2.f68655e) == null) ? null : new androidx.camera.core.impl.j(aVar5, bVar, bVar2, bVar3, bVar4, 5);
                                    }
                                }
                            }
                            z23 = z17;
                            z25 = true;
                        }
                        eVar.e();
                        z25 = true;
                    }
                    hVar3 = hVar;
                    z16 = z23;
                    eVar.d();
                    hVar3.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    hVar4 = hVar3;
                    z23 = z16;
                    z19 = false;
                    break;
                case 14:
                    hVar4 = hVar;
                    f13 = (float) eVar.s1();
                    z19 = false;
                    break;
                case 15:
                    hVar4 = hVar;
                    f14 = (float) eVar.s1();
                    z19 = false;
                    break;
                case 16:
                    hVar4 = hVar;
                    f15 = (float) (eVar.s1() * jc.g.c());
                    z19 = false;
                    break;
                case 17:
                    hVar4 = hVar;
                    f16 = (float) (eVar.s1() * jc.g.c());
                    z19 = false;
                    break;
                case 18:
                    f18 = (float) eVar.s1();
                    break;
                case 19:
                    f17 = (float) eVar.s1();
                    break;
                case 20:
                    bVar5 = bs1.c.z1(eVar, hVar4, z19);
                    break;
                case 21:
                    str6 = eVar.Y0();
                    break;
                case 22:
                    z24 = eVar.R0();
                    break;
                case 23:
                    if (eVar.o0() != 1) {
                        z23 = z19;
                        break;
                    } else {
                        z23 = true;
                        break;
                    }
                case 24:
                    int o06 = eVar.o0();
                    if (o06 < ec.h.values().length) {
                        hVar8 = ec.h.values()[o06];
                        break;
                    } else {
                        hVar4.a("Unsupported Blend Mode: " + o06);
                        hVar8 = ec.h.NORMAL;
                        break;
                    }
                default:
                    eVar.m();
                    eVar.E();
                    z14 = z23;
                    str2 = str6;
                    z15 = z19;
                    hVar2 = hVar4;
                    z19 = z15;
                    hVar4 = hVar2;
                    z23 = z14;
                    str6 = str2;
                    break;
            }
        }
        boolean z29 = z23;
        String str8 = str6;
        com.airbnb.lottie.h hVar11 = hVar4;
        eVar.e();
        ArrayList arrayList5 = new ArrayList();
        if (f18 > 0.0f) {
            z13 = z29;
            arrayList = arrayList2;
            str = str8;
            j13 = j15;
            arrayList5.add(new kc.a(hVar, valueOf, valueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(f18)));
        } else {
            arrayList = arrayList2;
            j13 = j15;
            z13 = z29;
            str = str8;
        }
        if (f17 <= 0.0f) {
            f17 = hVar11.f28408m;
        }
        arrayList5.add(new kc.a(hVar, valueOf2, valueOf2, (BaseInterpolator) null, f18, Float.valueOf(f17)));
        arrayList5.add(new kc.a(hVar, valueOf, valueOf, (BaseInterpolator) null, f17, Float.valueOf(Float.MAX_VALUE)));
        if (str5.endsWith(".ai") || "ai".equals(str)) {
            hVar11.a("Convert your Illustrator layers to shape layers.");
        }
        boolean z33 = z13;
        if (z33) {
            if (eVar3 == null) {
                eVar3 = new dc.e();
            }
            dc.e eVar4 = eVar3;
            eVar4.f54316j = z33;
            eVar2 = eVar4;
        } else {
            eVar2 = eVar3;
        }
        return new fc.i(arrayList3, hVar, str5, j13, gVar, j14, str4, arrayList, eVar2, i13, i14, i15, f13, f14, f15, f16, cVar, hVar9, arrayList5, hVar7, bVar5, z24, bVar6, jVar, hVar8);
    }
}
