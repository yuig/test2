package bn2;

import am2.e0;
import am2.g1;
import am2.j1;
import am2.r0;
import am2.s0;
import am2.x;
import am2.y;
import dm2.o0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.h0;
import pn2.t1;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23580a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(new ym2.c("kotlin.jvm.JvmInline")), "topLevel(...)");
    }

    public static final boolean a(x xVar) {
        g1 J2;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar instanceof s0) {
            r0 r03 = ((o0) ((s0) xVar)).r0();
            Intrinsics.checkNotNullExpressionValue(r03, "getCorrespondingProperty(...)");
            Intrinsics.checkNotNullParameter(r03, "<this>");
            if (r03.D() == null) {
                am2.m g13 = r03.g();
                am2.g gVar = g13 instanceof am2.g ? (am2.g) g13 : null;
                if (gVar != null && (J2 = gVar.J()) != null) {
                    ym2.g name = r03.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (J2.a(name)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(am2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (mVar instanceof am2.g) && (((am2.g) mVar).J() instanceof y);
    }

    public static final boolean c(am2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (mVar instanceof am2.g) && (((am2.g) mVar).J() instanceof e0);
    }

    public static final boolean d(j1 j1Var) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        if (j1Var.D() == null) {
            am2.m g13 = j1Var.g();
            ym2.g gVar = null;
            am2.g gVar2 = g13 instanceof am2.g ? (am2.g) g13 : null;
            if (gVar2 != null) {
                int i13 = fn2.d.f62727a;
                g1 J2 = gVar2.J();
                y yVar = J2 instanceof y ? (y) J2 : null;
                if (yVar != null) {
                    gVar = yVar.f15603a;
                }
            }
            if (Intrinsics.d(gVar, j1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(am2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return b(mVar) || c(mVar);
    }

    public static final boolean f(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        am2.j b13 = b0Var.w0().b();
        if (b13 != null) {
            return e(b13);
        }
        return false;
    }

    public static final boolean g(b0 receiver) {
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        am2.j b13 = receiver.w0().b();
        if (b13 == null || !c(b13)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return !t1.g(receiver);
    }

    public static final h0 h(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        am2.j b13 = b0Var.w0().b();
        am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
        if (gVar == null) {
            return null;
        }
        int i13 = fn2.d.f62727a;
        g1 J2 = gVar.J();
        y yVar = J2 instanceof y ? (y) J2 : null;
        if (yVar != null) {
            return (h0) yVar.f15604b;
        }
        return null;
    }
}
