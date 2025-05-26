package hc;

import android.graphics.Rect;
import g1.p0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68681a = tb.c.k("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68682b = tb.c.k("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final tb.c f68683c = tb.c.k("list");

    /* renamed from: d, reason: collision with root package name */
    public static final tb.c f68684d = tb.c.k("cm", "tm", "dr");

    public static com.airbnb.lottie.h a(ic.e eVar) {
        ArrayList arrayList;
        float f13;
        float f14;
        int i13;
        float f15;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList2;
        float c13 = jc.g.c();
        g1.p pVar = new g1.p((Object) null);
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        p0 p0Var = new p0(0);
        com.airbnb.lottie.h hVar = new com.airbnb.lottie.h();
        eVar.c();
        int i14 = 0;
        int i15 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (eVar.hasNext()) {
            switch (eVar.k(f68681a)) {
                case 0:
                    arrayList = arrayList4;
                    f13 = f16;
                    i14 = eVar.o0();
                    f16 = f13;
                    arrayList4 = arrayList;
                    break;
                case 1:
                    arrayList = arrayList4;
                    i15 = eVar.o0();
                    arrayList4 = arrayList;
                    break;
                case 2:
                    arrayList = arrayList4;
                    f13 = f16;
                    f17 = (float) eVar.s1();
                    i15 = i15;
                    f16 = f13;
                    arrayList4 = arrayList;
                    break;
                case 3:
                    hashMap5 = hashMap5;
                    i15 = i15;
                    f17 = f17;
                    arrayList4 = arrayList4;
                    f16 = ((float) eVar.s1()) - 0.01f;
                    break;
                case 4:
                    arrayList = arrayList4;
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    f18 = (float) eVar.s1();
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                case 5:
                    arrayList = arrayList4;
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    hashMap = hashMap5;
                    String[] split = eVar.Y0().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        hVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                case 6:
                    arrayList = arrayList4;
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    HashMap hashMap6 = hashMap5;
                    eVar.a();
                    int i16 = 0;
                    while (eVar.hasNext()) {
                        fc.i a13 = v.a(eVar, hVar);
                        if (a13.f61652e == fc.g.IMAGE) {
                            i16++;
                        }
                        arrayList3.add(a13);
                        HashMap hashMap7 = hashMap6;
                        pVar.j(a13.f61651d, a13);
                        if (i16 > 4) {
                            jc.b.c("You have " + i16 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        hashMap6 = hashMap7;
                    }
                    hashMap = hashMap6;
                    eVar.d();
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                case 7:
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    eVar.a();
                    while (eVar.hasNext()) {
                        ArrayList arrayList5 = new ArrayList();
                        g1.p pVar2 = new g1.p((Object) null);
                        eVar.c();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (eVar.hasNext()) {
                            int k13 = eVar.k(f68682b);
                            if (k13 != 0) {
                                if (k13 == 1) {
                                    eVar.a();
                                    while (eVar.hasNext()) {
                                        fc.i a14 = v.a(eVar, hVar);
                                        pVar2.j(a14.f61651d, a14);
                                        arrayList5.add(a14);
                                        hashMap5 = hashMap5;
                                        arrayList4 = arrayList4;
                                    }
                                    hashMap2 = hashMap5;
                                    arrayList2 = arrayList4;
                                    eVar.d();
                                } else if (k13 == 2) {
                                    i17 = eVar.o0();
                                } else if (k13 == 3) {
                                    i18 = eVar.o0();
                                } else if (k13 == 4) {
                                    str2 = eVar.Y0();
                                } else if (k13 != 5) {
                                    eVar.m();
                                    eVar.E();
                                    hashMap2 = hashMap5;
                                    arrayList2 = arrayList4;
                                } else {
                                    str3 = eVar.Y0();
                                }
                                hashMap5 = hashMap2;
                                arrayList4 = arrayList2;
                            } else {
                                str = eVar.Y0();
                            }
                        }
                        HashMap hashMap8 = hashMap5;
                        ArrayList arrayList6 = arrayList4;
                        eVar.e();
                        if (str2 != null) {
                            hashMap4.put(str, new com.airbnb.lottie.w(str, i17, str2, i18, str3));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        hashMap5 = hashMap8;
                        arrayList4 = arrayList6;
                    }
                    arrayList = arrayList4;
                    eVar.d();
                    hashMap = hashMap5;
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                case 8:
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    c(eVar, hashMap5);
                    arrayList = arrayList4;
                    hashMap = hashMap5;
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                case 9:
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    b(eVar, hVar, p0Var);
                    arrayList = arrayList4;
                    hashMap = hashMap5;
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                case 10:
                    eVar.a();
                    while (eVar.hasNext()) {
                        eVar.c();
                        String str4 = null;
                        float f19 = 0.0f;
                        while (eVar.hasNext()) {
                            float f23 = f16;
                            int k14 = eVar.k(f68684d);
                            if (k14 != 0) {
                                float f24 = f17;
                                if (k14 == 1) {
                                    f19 = (float) eVar.s1();
                                    i15 = i15;
                                } else if (k14 != 2) {
                                    eVar.m();
                                    eVar.E();
                                } else {
                                    eVar.s1();
                                }
                                f16 = f23;
                                f17 = f24;
                            } else {
                                str4 = eVar.Y0();
                                f16 = f23;
                            }
                        }
                        eVar.e();
                        arrayList4.add(new cc.i(str4, f19));
                        i15 = i15;
                        f16 = f16;
                    }
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    eVar.d();
                    arrayList = arrayList4;
                    hashMap = hashMap5;
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
                default:
                    eVar.m();
                    eVar.E();
                    arrayList = arrayList4;
                    f14 = f16;
                    i13 = i15;
                    f15 = f17;
                    hashMap = hashMap5;
                    hashMap5 = hashMap;
                    i15 = i13;
                    f16 = f14;
                    f17 = f15;
                    arrayList4 = arrayList;
                    break;
            }
        }
        Rect rect = new Rect(0, 0, (int) (i14 * c13), (int) (i15 * c13));
        float c14 = jc.g.c();
        hVar.f28406k = rect;
        hVar.f28407l = f17;
        hVar.f28408m = f16;
        hVar.f28409n = f18;
        hVar.f28405j = arrayList3;
        hVar.f28404i = pVar;
        hVar.f28398c = hashMap3;
        hVar.f28399d = hashMap4;
        hVar.f28400e = c14;
        hVar.f28403h = p0Var;
        hVar.f28401f = hashMap5;
        hVar.f28402g = arrayList4;
        return hVar;
    }

    public static void b(ic.e eVar, com.airbnb.lottie.h hVar, p0 p0Var) {
        eVar.a();
        while (eVar.hasNext()) {
            cc.e a13 = k.a(eVar, hVar);
            p0Var.j(a13.hashCode(), a13);
        }
        eVar.d();
    }

    public static void c(ic.e eVar, HashMap hashMap) {
        eVar.c();
        while (eVar.hasNext()) {
            if (eVar.k(f68683c) != 0) {
                eVar.m();
                eVar.E();
            } else {
                eVar.a();
                while (eVar.hasNext()) {
                    cc.d a13 = l.a(eVar);
                    hashMap.put(a13.f27425b, a13);
                }
                eVar.d();
            }
        }
        eVar.e();
    }
}
