package j1;

import i2.v3;
import i2.y3;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f74095a = e.q(0.0f, 0.0f, null, 7);

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f74096b;

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f74097c;

    static {
        Map map = e3.f74054a;
        f74096b = e.q(0.0f, 0.0f, new n4.e(0.1f), 3);
        bs1.c.c(0.5f, 0.5f);
        com.bumptech.glide.c.d(0.5f, 0.5f);
        f74097c = e.q(0.0f, 0.0f, 1, 3);
        d7.b.a(1, 1);
    }

    public static final v3 a(float f13, o2 o2Var, String str, i2.o oVar, int i13, int i14) {
        h0 h0Var = o2Var;
        if ((i14 & 2) != 0) {
            h0Var = f74096b;
        }
        h0 h0Var2 = h0Var;
        if ((i14 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new n4.e(f13), q2.f74207c, h0Var2, null, str, null, oVar, ((i13 << 3) & 896) | ((i13 << 6) & 57344), 8);
    }

    public static final v3 b(float f13, o2 o2Var, String str, i2.o oVar, int i13, int i14) {
        h0 h0Var;
        int i15 = i14 & 2;
        h0 h0Var2 = f74095a;
        h0 h0Var3 = i15 != 0 ? h0Var2 : o2Var;
        String str2 = (i14 & 8) != 0 ? "FloatAnimation" : str;
        if (h0Var3 == h0Var2) {
            i2.s sVar = (i2.s) oVar;
            sVar.W(1125598679);
            boolean e13 = sVar.e(0.01f);
            Object J2 = sVar.J();
            if (e13 || J2 == i2.n.f71185a) {
                J2 = e.q(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                sVar.g0(J2);
            }
            h0Var = (o1) J2;
            sVar.r(false);
        } else {
            i2.s sVar2 = (i2.s) oVar;
            sVar2.W(1125708605);
            sVar2.r(false);
            h0Var = h0Var3;
        }
        return c(Float.valueOf(f13), q2.f74205a, h0Var, Float.valueOf(0.01f), str2, null, oVar, (i13 << 3) & 57344, 0);
    }

    public static final v3 c(Object obj, p2 p2Var, n nVar, Float f13, String str, Function1 function1, i2.o oVar, int i13, int i14) {
        n nVar2 = nVar;
        am.d dVar = i2.n.f71185a;
        Float f14 = (i14 & 8) != 0 ? null : f13;
        Function1 function12 = (i14 & 32) != 0 ? null : function1;
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        if (J2 == dVar) {
            J2 = bs1.c.u1(null, y3.f71400a);
            sVar.g0(J2);
        }
        i2.q1 q1Var = (i2.q1) J2;
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new d(obj, p2Var, f14);
            sVar.g0(J3);
        }
        d dVar2 = (d) J3;
        i2.q1 K1 = bs1.c.K1(function12, sVar);
        if (f14 != null && (nVar2 instanceof o1)) {
            o1 o1Var = (o1) nVar2;
            if (!Intrinsics.d(o1Var.f74185c, f14)) {
                nVar2 = new o1(o1Var.f74183a, o1Var.f74184b, f14);
            }
        }
        i2.q1 K12 = bs1.c.K1(nVar2, sVar);
        Object J4 = sVar.J();
        if (J4 == dVar) {
            J4 = lb.l0.b(-1, null, 6);
            sVar.g0(J4);
        }
        co2.q qVar = (co2.q) J4;
        boolean j13 = sVar.j(qVar) | ((((i13 & 14) ^ 6) > 4 && sVar.j(obj)) || (i13 & 6) == 4);
        Object J5 = sVar.J();
        if (j13 || J5 == dVar) {
            J5 = new f(qVar, obj);
            sVar.g0(J5);
        }
        i2.u.f((Function0) J5, sVar);
        boolean j14 = sVar.j(qVar) | sVar.j(dVar2) | sVar.h(K12) | sVar.h(K1);
        Object J6 = sVar.J();
        if (j14 || J6 == dVar) {
            J6 = new h(qVar, dVar2, K12, K1, null);
            sVar.g0(J6);
        }
        i2.u.e(qVar, (Function2) J6, sVar);
        v3 v3Var = (v3) q1Var.getValue();
        return v3Var == null ? dVar2.f74028c : v3Var;
    }
}
