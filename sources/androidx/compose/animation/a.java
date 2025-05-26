package androidx.compose.animation;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import b3.b1;
import bs1.c;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.b;
import i1.d1;
import i1.e1;
import i1.f0;
import i1.g1;
import i1.n1;
import i1.p0;
import i1.p1;
import i1.q0;
import i1.t1;
import i1.w0;
import i1.w1;
import i1.x0;
import i1.z1;
import i2.n;
import i2.o;
import i2.q1;
import i2.s;
import i2.y3;
import j1.e;
import j1.e3;
import j1.g2;
import j1.h0;
import j1.m2;
import j1.o1;
import j1.o2;
import j1.p2;
import j1.q2;
import j1.y1;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import lb.l0;
import n4.h;
import n4.j;
import u2.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final p2 f17066a;

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f17067b;

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f17068c;

    /* renamed from: d, reason: collision with root package name */
    public static final o1 f17069d;

    static {
        f0 f0Var = f0.f70759l;
        f0 f0Var2 = f0.f70760m;
        p2 p2Var = q2.f74205a;
        f17066a = new p2(f0Var, f0Var2);
        f17067b = e.q(0.0f, 400.0f, null, 5);
        Map map = e3.f74054a;
        f17068c = e.q(0.0f, 400.0f, new h(b.a(1, 1)), 1);
        f17069d = e.q(0.0f, 400.0f, new j(l0.d(1, 1)), 1);
    }

    public static final q a(g2 g2Var, n1 n1Var, i1.o1 o1Var, o oVar, int i13) {
        int i14;
        i1.o1 o1Var2;
        y1 y1Var;
        y1 y1Var2;
        y1 y1Var3;
        p0 p0Var;
        boolean z13;
        y1 y1Var4;
        y1 y1Var5;
        y1 y1Var6;
        y1 y1Var7;
        y1 y1Var8;
        d1 d1Var = d1.f70739i;
        int i15 = i13 & 14;
        int i16 = (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | i15;
        boolean z14 = (((i16 & 14) ^ 6) > 4 && ((s) oVar).h(g2Var)) || (i16 & 6) == 4;
        s sVar = (s) oVar;
        Object J2 = sVar.J();
        Object obj = n.f71185a;
        y3 y3Var = y3.f71400a;
        if (z14 || J2 == obj) {
            J2 = c.u1(n1Var, y3Var);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        Object c13 = g2Var.c();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = g2Var.f74078d;
        if (c13 == parcelableSnapshotMutableState.getValue() && g2Var.c() == w0.Visible) {
            if (g2Var.g()) {
                q1Var.setValue(n1Var);
            } else {
                q1Var.setValue(n1.f70854b);
            }
        } else if (parcelableSnapshotMutableState.getValue() == w0.Visible) {
            q1Var.setValue(((n1) q1Var.getValue()).b(n1Var));
        }
        n1 n1Var2 = (n1) q1Var.getValue();
        int i17 = i13 >> 3;
        int i18 = (i17 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | i15;
        boolean z15 = (((i18 & 14) ^ 6) > 4 && sVar.h(g2Var)) || (i18 & 6) == 4;
        Object J3 = sVar.J();
        if (z15 || J3 == obj) {
            J3 = c.u1(o1Var, y3Var);
            sVar.g0(J3);
        }
        q1 q1Var2 = (q1) J3;
        if (g2Var.c() == parcelableSnapshotMutableState.getValue() && g2Var.c() == w0.Visible) {
            if (g2Var.g()) {
                q1Var2.setValue(o1Var);
            } else {
                q1Var2.setValue(i1.o1.f70858b);
            }
        } else if (parcelableSnapshotMutableState.getValue() != w0.Visible) {
            q1Var2.setValue(((i1.o1) q1Var2.getValue()).b(o1Var));
        }
        i1.o1 o1Var3 = (i1.o1) q1Var2.getValue();
        z1 z1Var = n1Var2.f70855a;
        boolean z16 = (z1Var.f70947b == null && o1Var3.f70860a.f70947b == null) ? false : true;
        boolean z17 = (z1Var.f70948c == null && o1Var3.f70860a.f70948c == null) ? false : true;
        if (z16) {
            sVar.W(-821375963);
            p2 p2Var = q2.f74211g;
            Object J4 = sVar.J();
            if (J4 == obj) {
                J4 = "Built-in slide";
                sVar.g0("Built-in slide");
            }
            i14 = i17;
            o1Var2 = o1Var3;
            y1 a13 = m2.a(g2Var, p2Var, (String) J4, sVar, i15 | 384, 0);
            sVar.r(false);
            y1Var = a13;
        } else {
            i14 = i17;
            o1Var2 = o1Var3;
            sVar.W(-821278096);
            sVar.r(false);
            y1Var = null;
        }
        if (z17) {
            sVar.W(-821202177);
            p2 p2Var2 = q2.f74212h;
            Object J5 = sVar.J();
            if (J5 == obj) {
                J5 = "Built-in shrink/expand";
                sVar.g0("Built-in shrink/expand");
            }
            y1 a14 = m2.a(g2Var, p2Var2, (String) J5, sVar, i15 | 384, 0);
            sVar.r(false);
            y1Var2 = a14;
        } else {
            sVar.W(-821099041);
            sVar.r(false);
            y1Var2 = null;
        }
        if (z17) {
            sVar.W(-821034002);
            p2 p2Var3 = q2.f74211g;
            Object J6 = sVar.J();
            if (J6 == obj) {
                J6 = "Built-in InterruptionHandlingOffset";
                sVar.g0("Built-in InterruptionHandlingOffset");
            }
            y1 a15 = m2.a(g2Var, p2Var3, (String) J6, sVar, i15 | 384, 0);
            sVar.r(false);
            y1Var3 = a15;
        } else {
            sVar.W(-820883777);
            sVar.r(false);
            y1Var3 = null;
        }
        z1 z1Var2 = n1Var2.f70855a;
        p0 p0Var2 = z1Var2.f70948c;
        boolean z18 = ((p0Var2 == null || p0Var2.f70869d) && ((p0Var = o1Var2.f70860a.f70948c) == null || p0Var.f70869d) && z17) ? false : true;
        int i19 = i15 | (i14 & 7168);
        boolean z19 = (z1Var2.f70946a == null && o1Var2.f70860a.f70946a == null) ? false : true;
        boolean z23 = (z1Var2.f70949d == null && o1Var2.f70860a.f70949d == null) ? false : true;
        if (z19) {
            sVar.W(-675389204);
            p2 p2Var4 = q2.f74205a;
            Object J7 = sVar.J();
            if (J7 == obj) {
                J7 = "Built-in alpha";
                sVar.g0("Built-in alpha");
            }
            z13 = z18;
            y1 a16 = m2.a(g2Var, p2Var4, (String) J7, sVar, (i19 & 14) | 384, 0);
            sVar.r(false);
            y1Var4 = a16;
        } else {
            z13 = z18;
            sVar.W(-675252433);
            sVar.r(false);
            y1Var4 = null;
        }
        if (z23) {
            sVar.W(-675193780);
            p2 p2Var5 = q2.f74205a;
            Object J8 = sVar.J();
            if (J8 == obj) {
                J8 = "Built-in scale";
                sVar.g0("Built-in scale");
            }
            y1Var5 = y1Var4;
            y1 a17 = m2.a(g2Var, p2Var5, (String) J8, sVar, (i19 & 14) | 384, 0);
            sVar.r(false);
            y1Var6 = a17;
        } else {
            y1Var5 = y1Var4;
            sVar.W(-675057009);
            sVar.r(false);
            y1Var6 = null;
        }
        if (z23) {
            sVar.W(-674987940);
            y1Var7 = y1Var6;
            y1 a18 = m2.a(g2Var, f17066a, "TransformOriginInterruptionHandling", sVar, (i19 & 14) | 384, 0);
            sVar.r(false);
            y1Var8 = a18;
        } else {
            y1Var7 = y1Var6;
            sVar.W(-674835793);
            sVar.r(false);
            y1Var8 = null;
        }
        y1 y1Var9 = y1Var5;
        y1 y1Var10 = y1Var7;
        boolean j13 = sVar.j(y1Var9) | sVar.h(n1Var2) | sVar.h(o1Var2) | sVar.j(y1Var10) | ((((i19 & 14) ^ 6) > 4 && sVar.h(g2Var)) || (i19 & 6) == 4) | sVar.j(y1Var8);
        Object J9 = sVar.J();
        if (j13 || J9 == obj) {
            x0 x0Var = new x0(y1Var9, y1Var10, g2Var, n1Var2, o1Var2, y1Var8);
            sVar.g0(x0Var);
            J9 = x0Var;
        }
        x0 x0Var2 = (x0) J9;
        u2.n nVar = u2.n.f120041b;
        boolean z24 = z13;
        boolean i23 = sVar.i(z24) | ((((i13 & 7168) ^ 3072) > 2048 && sVar.h(d1Var)) || (i13 & 3072) == 2048);
        Object J10 = sVar.J();
        if (i23 || J10 == obj) {
            J10 = new e1(z24, d1Var, 0);
            sVar.g0(J10);
        }
        return androidx.compose.ui.graphics.a.n(nVar, (Function1) J10).j(new EnterExitTransitionElement(g2Var, y1Var2, y1Var3, y1Var, n1Var2, o1Var2, d1Var, x0Var2));
    }

    public static n1 b() {
        Map map = e3.f74054a;
        return new n1(new z1(null, null, new p0(e.q(0.0f, 400.0f, new j(l0.d(1, 1)), 1), u2.b.f120021i, q0.f70875l, true), null, false, null, 59));
    }

    public static n1 c(o2 o2Var, int i13) {
        h0 h0Var = o2Var;
        if ((i13 & 1) != 0) {
            h0Var = e.q(0.0f, 400.0f, null, 5);
        }
        return new n1(new z1(new p1(0.0f, h0Var), null, null, null, false, null, 62));
    }

    public static i1.o1 d(o2 o2Var, int i13) {
        h0 h0Var = o2Var;
        if ((i13 & 1) != 0) {
            h0Var = e.q(0.0f, 400.0f, null, 5);
        }
        return new i1.o1(new z1(new p1(0.0f, h0Var), null, null, null, false, null, 62));
    }

    public static n1 e(h0 h0Var, float f13, int i13) {
        if ((i13 & 2) != 0) {
            f13 = 0.0f;
        }
        return new n1(new z1(null, null, null, new t1(f13, b1.f21304b, h0Var), false, null, 55));
    }

    public static i1.o1 f() {
        Map map = e3.f74054a;
        return new i1.o1(new z1(null, null, new p0(e.q(0.0f, 400.0f, new j(l0.d(1, 1)), 1), u2.b.f120021i, q0.f70877n, true), null, false, null, 59));
    }

    public static final n1 g(o2 o2Var, Function1 function1) {
        return new n1(new z1(null, new w1(o2Var, new g1(0, function1)), null, null, false, null, 61));
    }
}
