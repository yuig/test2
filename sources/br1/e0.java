package br1;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i1.n1;
import i1.o1;
import i2.c3;
import i2.f2;
import i2.j2;
import i2.m1;
import i2.q1;
import i2.v3;
import i2.y3;
import i2.z1;
import j1.d1;
import j1.e1;
import j1.g0;
import j1.g1;
import j1.p2;
import j1.q2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import q3.p0;
import u50.i0;

/* loaded from: classes2.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u2.q f23779a = androidx.compose.foundation.layout.e.e(u2.n.f120041b, 376);

    public static final void a(f fVar, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(118076780);
        if ((i13 & 14) == 0) {
            i14 = (sVar.h(fVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            androidx.compose.foundation.layout.b.a(androidx.compose.ui.draw.a.c(androidx.compose.foundation.layout.e.f17184c), null, false, q2.i.c(-2094978858, new zn1.d(fVar, 1), sVar), sVar, 3078, 6);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(fVar, i13, 17);
        }
    }

    public static final void b(int i13, int i14, i2.o oVar, u2.q qVar, f0 f0Var, Function1 function1, boolean z13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(558614138);
        if ((i14 & 4) != 0) {
            qVar = u2.n.f120041b;
        }
        j0 j0Var = new j0();
        sVar.W(1736835813);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new g1(Boolean.FALSE);
            sVar.g0(J2);
        }
        g1 g1Var = (g1) J2;
        sVar.r(false);
        j0Var.f80434a = g1Var;
        g1Var.f74074c.setValue(Boolean.valueOf(f0Var.f23780a.getTextTriggered()));
        i2.u.e(j0Var.f80434a, new m(j0Var, function1, null), sVar);
        n4.b bVar = (n4.b) sVar.m(t3.f2.f115983f);
        float q13 = q(z13, sVar);
        int c13 = ml2.c.c(bVar.l0(q13));
        g1 g1Var2 = (g1) j0Var.f80434a;
        sVar.W(1736858763);
        boolean f13 = sVar.f(c13);
        Object J3 = sVar.J();
        if (f13 || J3 == dVar) {
            J3 = new pn1.g(c13, 7);
            sVar.g0(J3);
        }
        sVar.r(false);
        b7.c.b(g1Var2, androidx.compose.foundation.layout.b.o(qVar, com.bumptech.glide.d.A(eo1.c.space_500, sVar), q13), r((Function1) J3, sVar), o1.f70858b, null, q2.i.c(1905700514, new mm1.g(f0Var, 3), sVar), sVar, 196608, 16);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new p1.w(i13, i14, qVar, f0Var, function1, z13);
        }
    }

    public static final void c(p1.u uVar, f0 f0Var, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1876047441);
        boolean staticLogoAndPins = f0Var.f23780a.getStaticLogoAndPins();
        u2.i iVar = u2.b.f120020h;
        u2.n nVar = u2.n.f120041b;
        if (staticLogoAndPins) {
            sVar.W(461317829);
            d(f0Var, uVar.a(nVar, iVar), sVar, 8, 0);
            sVar.r(false);
        } else {
            sVar.W(461428530);
            sVar.W(846169157);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                J2 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
                sVar.g0(J2);
            }
            q1 q1Var = (q1) J2;
            sVar.r(false);
            sVar.W(846170679);
            if (f0Var.f23780a.getLogoTriggered()) {
                Unit unit = Unit.f80348a;
                sVar.W(846173180);
                Object J3 = sVar.J();
                if (J3 == dVar) {
                    J3 = new n(q1Var, null);
                    sVar.g0(J3);
                }
                sVar.r(false);
                i2.u.e(unit, (Function2) J3, sVar);
            }
            sVar.r(false);
            b7.c.c(((Boolean) q1Var.getValue()).booleanValue(), uVar.a(nVar, iVar), androidx.compose.animation.a.e(j1.e.q(0.5f, 400.0f, null, 4), 0.0f, 6), o1.f70858b, null, q2.i.c(1342354731, new zn1.d(f0Var, 2), sVar), sVar, 196992, 16);
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.f2(uVar, f0Var, i13, 3);
        }
    }

    public static final void d(f0 f0Var, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(148396952);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if (f0Var.f23782c) {
            sVar.W(-1681701008);
            g3.b M0 = com.bumptech.glide.c.M0(rm1.q.PINTEREST.drawableRes((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b)), sVar);
            long t23 = dl2.b.t2(new u50.e(eo1.a.sema_color_icon_primary), sVar);
            com.bumptech.glide.c.b(M0, null, androidx.compose.foundation.layout.e.j(qVar, com.bumptech.glide.d.A(eo1.c.space_1000, sVar)), null, null, 0.0f, new b3.p(t23, 5, Build.VERSION.SDK_INT >= 29 ? b3.q.f21347a.a(t23, 5) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.u(t23), androidx.compose.ui.graphics.a.w(5))), sVar, 56, 56);
            sVar.r(false);
        } else {
            sVar.W(-1681299186);
            ve.h.a(new rm1.d(new rm1.f(rm1.q.PINTEREST, rm1.i.XL), rm1.c.BRAND, null, 0, null, 28), qVar, null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 4);
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new o(f0Var, qVar, i13, i14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0115, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r8)) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(br1.f0 r34, boolean r35, br1.f r36, u2.q r37, vn1.g r38, kotlin.jvm.functions.Function0 r39, kotlin.jvm.functions.Function1 r40, i2.o r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.e0.e(br1.f0, boolean, br1.f, u2.q, vn1.g, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(java.lang.String r10, long r11, u2.q r13, i2.o r14, int r15, int r16) {
        /*
            r1 = r10
            r5 = r15
            r0 = r14
            i2.s r0 = (i2.s) r0
            r2 = -808227297(0xffffffffcfd36e1f, float:-7.094419E9)
            r0.Y(r2)
            r2 = r16 & 1
            if (r2 == 0) goto L12
            r2 = r5 | 6
            goto L22
        L12:
            r2 = r5 & 14
            if (r2 != 0) goto L21
            boolean r2 = r0.h(r10)
            if (r2 == 0) goto L1e
            r2 = 4
            goto L1f
        L1e:
            r2 = 2
        L1f:
            r2 = r2 | r5
            goto L22
        L21:
            r2 = r5
        L22:
            r3 = r16 & 2
            if (r3 == 0) goto L2a
            r2 = r2 | 48
        L28:
            r3 = r11
            goto L3b
        L2a:
            r3 = r5 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L28
            r3 = r11
            boolean r6 = r0.g(r11)
            if (r6 == 0) goto L38
            r6 = 32
            goto L3a
        L38:
            r6 = 16
        L3a:
            r2 = r2 | r6
        L3b:
            r6 = r16 & 4
            if (r6 == 0) goto L43
            r2 = r2 | 384(0x180, float:5.38E-43)
        L41:
            r7 = r13
            goto L54
        L43:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L41
            r7 = r13
            boolean r8 = r0.h(r13)
            if (r8 == 0) goto L51
            r8 = 256(0x100, float:3.59E-43)
            goto L53
        L51:
            r8 = 128(0x80, float:1.8E-43)
        L53:
            r2 = r2 | r8
        L54:
            r8 = r2 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L66
            boolean r8 = r0.z()
            if (r8 != 0) goto L61
            goto L66
        L61:
            r0.Q()
            r6 = r7
            goto L85
        L66:
            if (r6 == 0) goto L6b
            u2.n r6 = u2.n.f120041b
            goto L6c
        L6b:
            r6 = r7
        L6c:
            kc0.a r7 = new kc0.a
            int r8 = androidx.compose.ui.graphics.a.u(r11)
            u50.f r9 = new u50.f
            r9.<init>(r8)
            r8 = 0
            r7.<init>(r10, r9, r8)
            int r2 = r2 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r9 = 8
            r2 = r2 | r9
            d7.b.b(r7, r6, r0, r2, r8)
        L85:
            i2.f2 r7 = r0.t()
            if (r7 == 0) goto L99
            w1.b r8 = new w1.b
            r0 = r8
            r1 = r10
            r2 = r11
            r4 = r6
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r4, r5, r6)
            r7.f71113d = r8
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.e0.f(java.lang.String, long, u2.q, i2.o, int, int):void");
    }

    public static final void g(i0 i0Var, vn1.g gVar, u2.q qVar, Function0 function0, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(184767200);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        Function0 function02 = (i14 & 8) != 0 ? x.f23832i : function0;
        rn1.a aVar = new rn1.a(i0Var, null, kotlin.collections.e0.b(vn1.b.CENTER), null, gVar, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130);
        u2.q b13 = androidx.compose.foundation.layout.e.b(qVar2, 1.0f);
        sVar.W(-1435597166);
        boolean z13 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function02)) || (i13 & 3072) == 2048;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            J2 = new hk1.t(function02, 18);
            sVar.g0(J2);
        }
        sVar.r(false);
        dl2.b.c(aVar, b13, (Function1) J2, null, sVar, 8, 8);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) i0Var, (Object) gVar, qVar2, function02, i13, i14, 26);
        }
    }

    public static final void h(f0 state, u2.q qVar, Function1 onEvent, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-531481255);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        u2.q j13 = qVar.j(androidx.compose.foundation.layout.e.f17184c);
        Unit unit = Unit.f80348a;
        sVar.W(2096697069);
        boolean z13 = (((i13 & 896) ^ 384) > 256 && sVar.h(onEvent)) || (i13 & 384) == 256;
        Object J2 = sVar.J();
        if (z13 || J2 == i2.n.f71185a) {
            J2 = new y(onEvent, null);
            sVar.g0(J2);
        }
        sVar.r(false);
        androidx.compose.foundation.layout.b.a(n3.f0.a(j13, unit, (Function2) J2), null, false, q2.i.c(562750787, new i1.j0(state, onEvent), sVar), sVar, 3072, 6);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 20, qVar, state, onEvent);
        }
    }

    public static final void i(u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1789472581);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            f("https://i.pinimg.com/originals/f5/da/2b/f5da2b46646b837491f888dc001cc1a7.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, 90), qVar, sVar, ((i15 << 6) & 896) | 54, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar, i13, i14, 8);
        }
    }

    public static final void j(u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1328944396);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            f("https://i.pinimg.com/originals/79/2d/84/792d8494b6a4d13bcafe8d148c41331a.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_HEADER, RecyclerViewTypes.VIEW_TYPE_STYLE_HEADER, RecyclerViewTypes.VIEW_TYPE_STYLE_DESCRIPTION), qVar, sVar, ((i15 << 6) & 896) | 54, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar, i13, i14, 9);
        }
    }

    public static final void k(u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-175414608);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            f("https://i.pinimg.com/originals/c1/37/b2/c137b2fdbe24946447c504765b44e0cf.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_IMAGE, 57), qVar, sVar, ((i15 << 6) & 896) | 54, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar, i13, i14, 10);
        }
    }

    public static final void l(u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-383628393);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            f("https://i.pinimg.com/originals/81/47/8d/81478d5d192489cd89623472da8c1685.webp", androidx.compose.ui.graphics.a.e(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE, RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL_ITEM_IMAGE, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL), qVar, sVar, ((i15 << 6) & 896) | 54, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar, i13, i14, 11);
        }
    }

    public static final void m(f0 f0Var, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-886552841);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        u2.q b13 = androidx.compose.foundation.layout.e.b(qVar, 1.0f);
        p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i15 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, b13);
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
        c(androidx.compose.foundation.layout.c.f17179a, f0Var, sVar, 70);
        f fVar = f0Var.f23780a;
        if (fVar.getStaticLogoAndPins()) {
            sVar.W(827283596);
            androidx.compose.foundation.layout.b.a(androidx.compose.ui.draw.a.c(androidx.compose.foundation.layout.e.f17184c), null, false, b.f23762a, sVar, 3078, 6);
            sVar.r(false);
        } else {
            sVar.W(827091830);
            a(fVar, sVar, 0);
            sVar.r(false);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new v31.d(f0Var, qVar, i13, i14, 4);
        }
    }

    public static final void n(f0 f0Var, boolean z13, n4.e eVar, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1879753335);
        androidx.compose.foundation.layout.b.a(null, null, false, q2.i.c(-1820760735, new v(f0Var, eVar, z13), sVar), sVar, 3072, 7);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b2.f(f0Var, z13, eVar, i13);
        }
    }

    public static final void o(int i13, int i14, i2.o oVar, u2.q qVar, f0 f0Var, Function1 function1, boolean z13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(247068629);
        u2.q qVar2 = (i14 & 4) != 0 ? u2.n.f120041b : qVar;
        sVar.W(-251732201);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = bs1.c.u1(Boolean.TRUE, y3.f71400a);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        sVar.r(false);
        if (((Boolean) q1Var.getValue()).booleanValue()) {
            sVar.W(786311879);
            e(f0Var, z13, f0Var.f23780a, androidx.compose.foundation.layout.e.b(qVar2, 1.0f), vn1.g.HEADING_600, new j2(11, f0Var, q1Var), function1, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 24584 | ((i13 << 9) & 3670016), 0);
            sVar.r(false);
        } else {
            sVar.W(786786830);
            b(((i13 >> 3) & 14) | 64 | (i13 & 7168), 0, sVar, androidx.compose.foundation.layout.e.b(qVar2, 1.0f), f0Var, function1, z13);
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w(i13, i14, qVar2, f0Var, function1, z13);
        }
    }

    public static final u2.q p(u2.q qVar, int i13, int i14, int i15, float f13, List list, f fVar, i2.o oVar, int i16, int i17) {
        j1.n e1Var;
        i2.s sVar = (i2.s) oVar;
        sVar.W(368321852);
        float f14 = (i17 & 8) != 0 ? 0.0f : f13;
        int i18 = 1;
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("offsetKeyframes cannot be empty".toString());
        }
        sVar.W(-608757667);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = b7.c.J(f14);
            sVar.g0(J2);
        }
        m1 m1Var = (m1) J2;
        Object d2 = jq.b.d(sVar, false, -608755469);
        if (d2 == dVar) {
            d2 = b7.c.J(1.0f);
            sVar.g0(d2);
        }
        m1 m1Var2 = (m1) d2;
        Object d13 = jq.b.d(sVar, false, -608753263);
        if (d13 == dVar) {
            d13 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
            sVar.g0(d13);
        }
        q1 q1Var = (q1) d13;
        sVar.r(false);
        sVar.U(-608750441, list);
        n4.f fVar2 = new n4.f(((Boolean) q1Var.getValue()).booleanValue() ? ((c) d7.b.j0(list)).f23768d : ((c) d7.b.F(list)).f23768d);
        p2 p2Var = q2.f74208d;
        if (list.size() == 2) {
            e1Var = j1.e.r(i14, 0, g0.f74071b, 2);
        } else {
            s2.s sVar2 = new s2.s(i14, list, i18);
            d1 d1Var = new d1();
            sVar2.invoke(d1Var);
            e1Var = new e1(d1Var);
        }
        v3 c13 = j1.i.c(fVar2, p2Var, e1Var, null, null, null, sVar, 576, 56);
        sVar.r(false);
        sVar.W(-608713495);
        if (fVar.getPinsTriggered()) {
            Unit unit = Unit.f80348a;
            sVar.W(-608712081);
            Object J3 = sVar.J();
            if (J3 == dVar) {
                J3 = new c0(i13, m1Var, q1Var, null);
                sVar.g0(J3);
            }
            sVar.r(false);
            i2.u.e(unit, (Function2) J3, sVar);
            sVar.W(-608706557);
            Object J4 = sVar.J();
            if (J4 == dVar) {
                J4 = new d0(i15, m1Var2, null);
                sVar.g0(J4);
            }
            sVar.r(false);
            i2.u.e(unit, (Function2) J4, sVar);
        }
        sVar.r(false);
        u2.q h10 = androidx.compose.ui.draw.a.h(androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.b.k(qVar, Float.intBitsToFloat((int) (((n4.f) c13.getValue()).f89176a >> 32)), Float.intBitsToFloat((int) (((n4.f) c13.getValue()).f89176a & 4294967295L))), ((Number) j1.i.b(((c3) m1Var).h(), j1.e.r(i14, 0, g0.f74071b, 2), null, sVar, 0, 28).getValue()).floatValue()), ((c3) m1Var2).h());
        sVar.r(false);
        return h10;
    }

    public static final float q(boolean z13, i2.o oVar) {
        float A;
        i2.s sVar = (i2.s) oVar;
        sVar.W(-2030856645);
        if (z13) {
            sVar.W(1761602749);
            A = com.bumptech.glide.d.A(eo1.c.space_400, sVar);
            sVar.r(false);
        } else {
            sVar.W(1761658301);
            A = com.bumptech.glide.d.A(eo1.c.space_600, sVar);
            sVar.r(false);
        }
        sVar.r(false);
        return A;
    }

    public static final n1 r(Function1 function1, i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(888085765);
        n1 b13 = androidx.compose.animation.a.c(j1.e.r(700, 0, null, 6), 2).b(androidx.compose.animation.a.g(j1.e.r(500, 0, g0.f74071b, 2), function1));
        sVar.r(false);
        return b13;
    }
}
