package hc;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import t3.n1;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f68673a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68674b = tb.c.k("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final tb.c f68675c = tb.c.k("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        BaseInterpolator pathInterpolator;
        pointF.x = jc.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = jc.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = jc.f.b(pointF2.x, -1.0f, 1.0f);
        float b13 = jc.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b13;
        n1 n1Var = jc.g.f75394a;
        com.airbnb.lottie.a aVar = com.airbnb.lottie.b.f28381a;
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, b13);
        } catch (IllegalArgumentException e13) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e13.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        com.airbnb.lottie.a aVar2 = com.airbnb.lottie.b.f28381a;
        return pathInterpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.animation.BaseInterpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.BaseInterpolator] */
    public static kc.a b(ic.d dVar, com.airbnb.lottie.h hVar, float f13, l0 l0Var, boolean z13, boolean z14) {
        Object obj;
        LinearInterpolator a13;
        BaseInterpolator a14;
        BaseInterpolator a15;
        Object obj2;
        LinearInterpolator linearInterpolator;
        tb.c cVar;
        PointF pointF;
        PointF pointF2;
        Object obj3;
        PointF pointF3;
        LinearInterpolator linearInterpolator2 = f68673a;
        tb.c cVar2 = f68674b;
        if (!z13 || !z14) {
            tb.c cVar3 = cVar2;
            if (!z13) {
                return new kc.a(l0Var.f(dVar, f13));
            }
            dVar.c();
            Object obj4 = null;
            PointF pointF4 = null;
            boolean z15 = false;
            float f14 = 0.0f;
            PointF pointF5 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            Object obj5 = null;
            while (dVar.hasNext()) {
                tb.c cVar4 = cVar3;
                switch (dVar.k(cVar4)) {
                    case 0:
                        f14 = (float) dVar.s1();
                        break;
                    case 1:
                        obj4 = l0Var.f(dVar, f13);
                        break;
                    case 2:
                        obj5 = l0Var.f(dVar, f13);
                        break;
                    case 3:
                        pointF5 = r.b(dVar, 1.0f);
                        break;
                    case 4:
                        pointF4 = r.b(dVar, 1.0f);
                        break;
                    case 5:
                        if (dVar.o0() != 1) {
                            z15 = false;
                            break;
                        } else {
                            z15 = true;
                            break;
                        }
                    case 6:
                        pointF6 = r.b(dVar, f13);
                        break;
                    case 7:
                        pointF7 = r.b(dVar, f13);
                        break;
                    default:
                        dVar.E();
                        break;
                }
                cVar3 = cVar4;
            }
            dVar.e();
            if (z15) {
                obj = obj4;
            } else {
                if (pointF5 != null && pointF4 != null) {
                    a13 = a(pointF5, pointF4);
                    obj = obj5;
                    kc.a aVar = new kc.a(hVar, obj4, obj, a13, f14, (Float) null);
                    aVar.f79117o = pointF6;
                    aVar.f79118p = pointF7;
                    return aVar;
                }
                obj = obj5;
            }
            a13 = linearInterpolator2;
            kc.a aVar2 = new kc.a(hVar, obj4, obj, a13, f14, (Float) null);
            aVar2.f79117o = pointF6;
            aVar2.f79118p = pointF7;
            return aVar2;
        }
        dVar.c();
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        boolean z16 = false;
        PointF pointF11 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        Object obj6 = null;
        PointF pointF14 = null;
        PointF pointF15 = null;
        float f15 = 0.0f;
        Object obj7 = null;
        while (dVar.hasNext()) {
            int k13 = dVar.k(cVar2);
            tb.c cVar5 = f68675c;
            switch (k13) {
                case 0:
                    linearInterpolator = linearInterpolator2;
                    cVar = cVar2;
                    pointF = pointF10;
                    f15 = (float) dVar.s1();
                    linearInterpolator2 = linearInterpolator;
                    cVar2 = cVar;
                    pointF10 = pointF;
                    break;
                case 1:
                    pointF = pointF10;
                    obj6 = l0Var.f(dVar, f13);
                    pointF10 = pointF;
                    break;
                case 2:
                    pointF = pointF10;
                    obj7 = l0Var.f(dVar, f13);
                    pointF10 = pointF;
                    break;
                case 3:
                    linearInterpolator = linearInterpolator2;
                    cVar = cVar2;
                    PointF pointF16 = pointF9;
                    pointF = pointF10;
                    Object obj8 = obj6;
                    PointF pointF17 = pointF14;
                    if (dVar.g() == ic.c.BEGIN_OBJECT) {
                        dVar.c();
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        while (dVar.hasNext()) {
                            int k14 = dVar.k(cVar5);
                            if (k14 == 0) {
                                ic.c g13 = dVar.g();
                                ic.c cVar6 = ic.c.NUMBER;
                                if (g13 == cVar6) {
                                    f18 = (float) dVar.s1();
                                    f16 = f18;
                                } else {
                                    dVar.a();
                                    f16 = (float) dVar.s1();
                                    f18 = dVar.g() == cVar6 ? (float) dVar.s1() : f16;
                                    dVar.d();
                                }
                            } else if (k14 != 1) {
                                dVar.E();
                            } else {
                                ic.c g14 = dVar.g();
                                ic.c cVar7 = ic.c.NUMBER;
                                if (g14 == cVar7) {
                                    f19 = (float) dVar.s1();
                                    f17 = f19;
                                } else {
                                    dVar.a();
                                    f17 = (float) dVar.s1();
                                    f19 = dVar.g() == cVar7 ? (float) dVar.s1() : f17;
                                    dVar.d();
                                }
                            }
                        }
                        pointF13 = new PointF(f16, f17);
                        pointF14 = new PointF(f18, f19);
                        dVar.e();
                        pointF9 = pointF16;
                        obj6 = obj8;
                    } else {
                        pointF11 = r.b(dVar, f13);
                        pointF9 = pointF16;
                        obj6 = obj8;
                        pointF14 = pointF17;
                    }
                    linearInterpolator2 = linearInterpolator;
                    cVar2 = cVar;
                    pointF10 = pointF;
                    break;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    cVar = cVar2;
                    if (dVar.g() == ic.c.BEGIN_OBJECT) {
                        dVar.c();
                        float f23 = 0.0f;
                        float f24 = 0.0f;
                        float f25 = 0.0f;
                        float f26 = 0.0f;
                        while (dVar.hasNext()) {
                            PointF pointF18 = pointF10;
                            int k15 = dVar.k(cVar5);
                            if (k15 != 0) {
                                pointF2 = pointF9;
                                if (k15 != 1) {
                                    dVar.E();
                                    pointF9 = pointF2;
                                } else {
                                    ic.c g15 = dVar.g();
                                    ic.c cVar8 = ic.c.NUMBER;
                                    if (g15 == cVar8) {
                                        f26 = (float) dVar.s1();
                                        pointF9 = pointF2;
                                        f24 = f26;
                                    } else {
                                        dVar.a();
                                        obj3 = obj6;
                                        pointF3 = pointF14;
                                        f24 = (float) dVar.s1();
                                        f26 = dVar.g() == cVar8 ? (float) dVar.s1() : f24;
                                        dVar.d();
                                    }
                                }
                                pointF10 = pointF18;
                            } else {
                                pointF2 = pointF9;
                                obj3 = obj6;
                                pointF3 = pointF14;
                                ic.c g16 = dVar.g();
                                ic.c cVar9 = ic.c.NUMBER;
                                if (g16 == cVar9) {
                                    f25 = (float) dVar.s1();
                                    pointF9 = pointF2;
                                    obj6 = obj3;
                                    f23 = f25;
                                    pointF14 = pointF3;
                                    pointF10 = pointF18;
                                } else {
                                    dVar.a();
                                    f23 = (float) dVar.s1();
                                    f25 = dVar.g() == cVar9 ? (float) dVar.s1() : f23;
                                    dVar.d();
                                }
                            }
                            pointF9 = pointF2;
                            obj6 = obj3;
                            pointF14 = pointF3;
                            pointF10 = pointF18;
                        }
                        pointF = pointF10;
                        PointF pointF19 = new PointF(f23, f24);
                        PointF pointF20 = new PointF(f25, f26);
                        dVar.e();
                        pointF8 = pointF20;
                        pointF15 = pointF19;
                    } else {
                        pointF = pointF10;
                        pointF12 = r.b(dVar, f13);
                    }
                    linearInterpolator2 = linearInterpolator;
                    cVar2 = cVar;
                    pointF10 = pointF;
                    break;
                case 5:
                    if (dVar.o0() != 1) {
                        z16 = false;
                        break;
                    } else {
                        z16 = true;
                        break;
                    }
                case 6:
                    pointF9 = r.b(dVar, f13);
                    break;
                case 7:
                    pointF10 = r.b(dVar, f13);
                    break;
                default:
                    dVar.E();
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator2;
        PointF pointF21 = pointF9;
        PointF pointF22 = pointF10;
        Object obj9 = obj6;
        PointF pointF23 = pointF14;
        dVar.e();
        if (z16) {
            obj2 = obj9;
        } else {
            if (pointF11 != null && pointF12 != null) {
                linearInterpolator3 = a(pointF11, pointF12);
            } else if (pointF13 != null && pointF23 != null && pointF15 != null && pointF8 != null) {
                a14 = a(pointF13, pointF15);
                a15 = a(pointF23, pointF8);
                obj2 = obj7;
                linearInterpolator3 = null;
                kc.a aVar3 = (a14 != null || a15 == null) ? new kc.a(hVar, obj9, obj2, linearInterpolator3, f15, (Float) null) : new kc.a(hVar, obj9, obj2, a14, a15, f15);
                aVar3.f79117o = pointF21;
                aVar3.f79118p = pointF22;
                return aVar3;
            }
            obj2 = obj7;
        }
        a14 = null;
        a15 = null;
        if (a14 != null) {
        }
        aVar3.f79117o = pointF21;
        aVar3.f79118p = pointF22;
        return aVar3;
    }
}
