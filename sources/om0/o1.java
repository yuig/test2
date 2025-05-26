package om0;

import c2.s2;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.z1;
import kh2.k3;
import kh2.u2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class o1 {
    static {
        k0 images = o0.f96555b;
        q0 metadata = kotlin.jvm.internal.r.h0("All saves", "132 Pins");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i13 = images.f96532b;
        e30 r33 = f30.r3();
        r33.x2("");
        r33.h0("");
        f30 pin = r33.a();
        Intrinsics.checkNotNullExpressionValue(pin, "build(...)");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullExpressionValue(pin.getUid(), "getUid(...)");
        bs1.c.p0(pin);
        i0 images2 = o0.f96554a;
        Intrinsics.checkNotNullParameter(images2, "images");
        Intrinsics.checkNotNullParameter("Lighten up 🌈", "title");
        Intrinsics.checkNotNullParameter("12 Pins", "description");
        q0 metadata2 = kotlin.jvm.internal.r.h0("Lighten up 🌈", "12 Pins");
        r1 overlay = r1.f96581a;
        Intrinsics.checkNotNullParameter(images2, "images");
        Intrinsics.checkNotNullParameter(metadata2, "metadata");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter("See all", "string");
        u50.f0 label = new u50.f0("See all");
        Intrinsics.checkNotNullParameter(label, "label");
    }

    public static final void a(a0 a0Var, u2.q qVar, Function0 function0, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1948005268);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function0 function02 = (i14 & 4) != 0 ? g1.f96501i : function0;
        yl1.b bVar = new yl1.b(a0Var.f96459a, false, null, null, yl1.d.TERTIARY.getColorPalette(), yl1.c.SMALL, null, null, 0, null, 974);
        sVar.W(262399888);
        boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(function02)) || (i13 & 384) == 256;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            J2 = new m1.e0(25, function02);
            sVar.g0(J2);
        }
        sVar.r(false);
        rl2.g0.b(bVar, qVar2, (Function1) J2, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 25, a0Var, qVar2, function02);
        }
    }

    public static final void b(c0 c0Var, u2.q qVar, f0 f0Var, float f13, float f14, float f15, Function1 function1, i2.o oVar, int i13, int i14) {
        float f16;
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1185875366);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        float f17 = (i14 & 8) != 0 ? h0.f96503a : f13;
        if ((i14 & 16) != 0) {
            f16 = com.bumptech.glide.d.A(eo1.c.rounding_200, sVar);
            i15 = i13 & (-57345);
        } else {
            f16 = f14;
            i15 = i13;
        }
        float f18 = (i14 & 32) != 0 ? 0.6666667f : f15;
        Function1 function12 = (i14 & 64) != 0 ? h1.f96504i : function1;
        u2.q L = u2.L(androidx.compose.foundation.layout.e.m(qVar2, f17), new y0(function12, c0Var, 1), sVar);
        if (f0Var2 != null) {
            sVar.W(1013846638);
            k3.k(new g0(c0Var.f96471b, c0Var.f96470a), f0Var2, L, sVar, 72, 0);
            sVar.r(false);
        } else {
            sVar.W(1014040884);
            String str = c0Var.f96473d;
            float f19 = h0.f96503a;
            o0.a(str, L, h0.a(f18, 0, f16, sVar, ((i15 >> 3) & 7168) | ((i15 >> 15) & 14) | 1572912, 52), 0.0f, sVar, 0, 8);
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i1(c0Var, qVar2, f0Var2, f17, f16, f18, function12, i13, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(om0.f1 r17, u2.q r18, om0.f0 r19, om0.a1 r20, i2.o r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.o1.c(om0.f1, u2.q, om0.f0, om0.a1, i2.o, int, int):void");
    }

    public static final void d(p1 p1Var, u2.q qVar, float f13, Function0 function0, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(161062444);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        float A = (i14 & 4) != 0 ? com.bumptech.glide.d.A(eo1.c.space_200, sVar) : f13;
        Function0 function02 = (i14 & 8) != 0 ? j1.f96526i : function0;
        l0 c13 = h0.c(sVar);
        int i16 = p1Var.f96565c;
        float f14 = h0.f96503a;
        c13.f96535a.getClass();
        sVar.W(1541675245);
        boolean f15 = sVar.f(i16) | sVar.e(0.75f);
        Object J2 = sVar.J();
        if (f15 || J2 == i2.n.f71185a) {
            J2 = new n4.e(((i16 - 1) * (1 - 0.75f) * f14) + f14);
            sVar.g0(J2);
        }
        float f16 = ((n4.e) J2).f89175a;
        sVar.r(false);
        u2.q L = u2.L(androidx.compose.foundation.layout.e.m(qVar2, f16), function02, sVar);
        p1.y a13 = p1.x.a(p1.l.g(A), u2.b.f120025m, sVar, 0);
        int i17 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, L);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        o0.c(p1Var.f96563a, null, c13, f14, sVar, 3080, 2);
        if (!p1Var.f96564b.e(sVar)) {
            kotlin.jvm.internal.r.c(p1Var.f96564b, androidx.compose.foundation.layout.b.p(nVar, A, 0.0f, 2), 0.0f, sVar, 8, 4);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.b(p1Var, qVar2, A, function02, i13, i14, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r5)) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(om0.t1 r19, u2.q r20, float r21, float r22, kotlin.jvm.functions.Function1 r23, kotlin.jvm.functions.Function0 r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: om0.o1.e(om0.t1, u2.q, float, float, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final void f(q1 q1Var, u2.q qVar, long j13, Function0 function0, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-80102319);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        long h10 = (i14 & 4) != 0 ? kh2.g0.h(eo1.b.sema_color_background_wash_scrims_opaque, sVar) : j13;
        Function0 function02 = (i14 & 8) != 0 ? n1.f96549i : function0;
        u2.q L = u2.L(androidx.compose.foundation.a.b(qVar2, h10, b3.s0.f21349a), function02, sVar);
        q3.p0 e13 = p1.q.e(u2.b.f120017e, false);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, L);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        yl1.b bVar = new yl1.b(q1Var.f96571a, false, null, null, yl1.d.TERTIARY.getColorPalette(), yl1.c.SMALL, null, null, 0, null, 974);
        sVar.W(-2116066890);
        boolean z13 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function02)) || (i13 & 3072) == 2048;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            J2 = new m1.e0(26, function02);
            sVar.g0(J2);
        }
        sVar.r(false);
        rl2.g0.b(bVar, null, (Function1) J2, sVar, 8, 2);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new s2(q1Var, qVar2, h10, function02, i13, i14);
        }
    }
}
