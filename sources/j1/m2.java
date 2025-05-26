package j1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f74156a = 0;

    static {
        xk2.m.a(xk2.n.NONE, h2.f74094i);
    }

    public static final y1 a(g2 g2Var, p2 p2Var, String str, i2.o oVar, int i13, int i14) {
        x1 x1Var;
        if ((i14 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i15 = (i13 & 14) ^ 6;
        boolean z13 = true;
        boolean z14 = (i15 > 4 && ((i2.s) oVar).h(g2Var)) || (i13 & 6) == 4;
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (z14 || J2 == dVar) {
            J2 = new y1(g2Var, p2Var, str);
            sVar.g0(J2);
        }
        y1 y1Var = (y1) J2;
        if ((i15 <= 4 || !sVar.h(g2Var)) && (i13 & 6) != 4) {
            z13 = false;
        }
        boolean j13 = sVar.j(y1Var) | z13;
        Object J3 = sVar.J();
        if (j13 || J3 == dVar) {
            J3 = new r1(3, g2Var, y1Var);
            sVar.g0(J3);
        }
        i2.u.b(y1Var, (Function1) J3, sVar);
        if (g2Var.g() && (x1Var = (x1) y1Var.f74325b.getValue()) != null) {
            Function1 function1 = x1Var.f74310c;
            g2 g2Var2 = y1Var.f74326c;
            x1Var.f74308a.g(function1.invoke(g2Var2.f().c()), x1Var.f74310c.invoke(g2Var2.f().a()), (h0) x1Var.f74309b.invoke(g2Var2.f()));
        }
        return y1Var;
    }

    public static final b2 b(g2 g2Var, Object obj, Object obj2, h0 h0Var, p2 p2Var, i2.o oVar, int i13) {
        boolean h10 = ((i2.s) oVar).h(g2Var);
        int i14 = 1;
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (h10 || J2 == dVar) {
            t tVar = (t) p2Var.f74197a.invoke(obj2);
            tVar.d();
            J2 = new b2(g2Var, obj, tVar, p2Var);
            sVar.g0(J2);
        }
        b2 b2Var = (b2) J2;
        if (g2Var.g()) {
            b2Var.g(obj, obj2, h0Var);
        } else {
            b2Var.h(obj2, h0Var);
        }
        boolean h13 = sVar.h(g2Var) | sVar.h(b2Var);
        Object J3 = sVar.J();
        if (h13 || J3 == dVar) {
            J3 = new x0(i14, g2Var, b2Var);
            sVar.g0(J3);
        }
        i2.u.b(b2Var, (Function1) J3, sVar);
        return b2Var;
    }

    public static final g2 c(Object obj, String str, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new g2(new g1(obj), null, str);
            sVar.g0(J2);
        }
        g2 g2Var = (g2) J2;
        g2Var.a(obj, sVar, (i13 & 8) | 48 | (i13 & 14));
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new l2(g2Var, 1);
            sVar.g0(J3);
        }
        i2.u.b(g2Var, (Function1) J3, sVar);
        return g2Var;
    }
}
