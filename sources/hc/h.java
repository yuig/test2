package hc;

import android.graphics.PointF;

/* loaded from: classes3.dex */
public final class h implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f68646a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final tb.c f68647b = tb.c.k("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // hc.l0
    public final Object f(ic.d dVar, float f13) {
        cc.b bVar = cc.b.CENTER;
        dVar.c();
        String str = null;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z13 = true;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (dVar.hasNext()) {
            switch (dVar.k(f68647b)) {
                case 0:
                    str = dVar.Y0();
                    break;
                case 1:
                    str2 = dVar.Y0();
                    break;
                case 2:
                    f14 = (float) dVar.s1();
                    break;
                case 3:
                    int o03 = dVar.o0();
                    cc.b bVar2 = cc.b.CENTER;
                    if (o03 <= bVar2.ordinal() && o03 >= 0) {
                        bVar = cc.b.values()[o03];
                        break;
                    } else {
                        bVar = bVar2;
                        break;
                    }
                    break;
                case 4:
                    i13 = dVar.o0();
                    break;
                case 5:
                    f15 = (float) dVar.s1();
                    break;
                case 6:
                    f16 = (float) dVar.s1();
                    break;
                case 7:
                    i14 = r.a(dVar);
                    break;
                case 8:
                    i15 = r.a(dVar);
                    break;
                case 9:
                    f17 = (float) dVar.s1();
                    break;
                case 10:
                    z13 = dVar.R0();
                    break;
                case 11:
                    dVar.a();
                    pointF = new PointF(((float) dVar.s1()) * f13, ((float) dVar.s1()) * f13);
                    dVar.d();
                    break;
                case 12:
                    dVar.a();
                    pointF2 = new PointF(((float) dVar.s1()) * f13, ((float) dVar.s1()) * f13);
                    dVar.d();
                    break;
                default:
                    dVar.m();
                    dVar.E();
                    break;
            }
        }
        dVar.e();
        cc.c cVar = new cc.c();
        cVar.f27411a = str;
        cVar.f27412b = str2;
        cVar.f27413c = f14;
        cVar.f27414d = bVar;
        cVar.f27415e = i13;
        cVar.f27416f = f15;
        cVar.f27417g = f16;
        cVar.f27418h = i14;
        cVar.f27419i = i15;
        cVar.f27420j = f17;
        cVar.f27421k = z13;
        cVar.f27422l = pointF;
        cVar.f27423m = pointF2;
        return cVar;
    }
}
