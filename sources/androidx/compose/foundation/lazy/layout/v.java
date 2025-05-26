package androidx.compose.foundation.lazy.layout;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.compose.foundation.layout.FillElement;
import c2.r2;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import i2.q1;
import i2.v3;
import i2.z1;
import java.util.ArrayList;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import s80.l7;
import uc0.k1;
import uc0.k2;
import uc0.l2;
import uc0.m1;
import uc0.n1;
import uc0.o1;
import uc0.p1;
import uc0.u1;
import uc0.v1;
import uc0.w2;
import uc0.y1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17307i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17308j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f17309k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13, Object obj, Object obj2) {
        super(2);
        this.f17307i = i13;
        this.f17308j = obj;
        this.f17309k = obj2;
    }

    public final void b(i2.o oVar, int i13) {
        Object obj = i2.n.f71185a;
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f17307i;
        int i15 = 8;
        int i16 = 17;
        int i17 = 3;
        int i18 = 11;
        Object obj2 = this.f17309k;
        Object obj3 = this.f17308j;
        int i19 = 2;
        switch (i14) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                x xVar = (x) obj3;
                y yVar = (y) xVar.f17322b.invoke();
                w wVar = (w) obj2;
                int i23 = wVar.f17315c;
                int a13 = yVar.a();
                Object obj4 = wVar.f17313a;
                if ((i23 >= a13 || !Intrinsics.d(yVar.c(i23), obj4)) && (i23 = yVar.b(obj4)) != -1) {
                    wVar.f17315c = i23;
                }
                int i24 = i23;
                if (i24 != -1) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(-660479623);
                    o.f(yVar, xVar.f17321a, i24, wVar.f17313a, sVar2, 0);
                    sVar2.r(false);
                } else {
                    i2.s sVar3 = (i2.s) oVar;
                    sVar3.W(-660272047);
                    sVar3.r(false);
                }
                i2.s sVar4 = (i2.s) oVar;
                boolean j13 = sVar4.j(wVar);
                Object J2 = sVar4.J();
                if (j13 || J2 == obj) {
                    J2 = new q0.e(wVar, 14);
                    sVar4.g0(J2);
                }
                i2.u.b(obj4, (Function1) J2, sVar4);
                return;
            case 1:
            case 3:
            case 9:
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return;
                    }
                }
                FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                u2.q r13 = androidx.compose.foundation.layout.b.r(p1.z.a((p1.z) obj3, fillElement, 1.0f), 0.0f, com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar), 0.0f, 0.0f, 13);
                v3 v3Var = (v3) obj2;
                q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
                i2.s sVar6 = (i2.s) oVar;
                int i25 = sVar6.P;
                z1 o13 = sVar6.o();
                u2.q X = ao2.m0.X(oVar, r13);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                boolean z13 = sVar6.f71265a instanceof i2.f;
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar6.a0();
                if (sVar6.O) {
                    sVar6.n(iVar);
                } else {
                    sVar6.j0();
                }
                s3.h hVar = s3.j.f110801e;
                tb.f.f0(oVar, e13, hVar);
                s3.h hVar2 = s3.j.f110800d;
                tb.f.f0(oVar, o13, hVar2);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar6.O || !Intrinsics.d(sVar6.J(), Integer.valueOf(i25))) {
                    ep.b.y(i25, sVar6, i25, hVar3);
                }
                s3.h hVar4 = s3.j.f110799c;
                tb.f.f0(oVar, X, hVar4);
                p1.y a14 = p1.x.a(p1.l.f98545c, u2.b.f120025m, oVar, 0);
                int i26 = sVar6.P;
                z1 o14 = sVar6.o();
                u2.q X2 = ao2.m0.X(oVar, nVar);
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar6.a0();
                if (sVar6.O) {
                    sVar6.n(iVar);
                } else {
                    sVar6.j0();
                }
                tb.f.f0(oVar, a14, hVar);
                tb.f.f0(oVar, o14, hVar2);
                if (sVar6.O || !Intrinsics.d(sVar6.J(), Integer.valueOf(i26))) {
                    ep.b.y(i26, sVar6, i26, hVar3);
                }
                tb.f.f0(oVar, X2, hVar4);
                u2.q r14 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_xlarge_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar), 0.0f, 8);
                p1.g gVar = p1.l.f98543a;
                u2.h hVar5 = u2.b.f120022j;
                p1.e1 a15 = p1.c1.a(gVar, hVar5, oVar, 6);
                int i27 = sVar6.P;
                z1 o15 = sVar6.o();
                u2.q X3 = ao2.m0.X(oVar, r14);
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar6.a0();
                if (sVar6.O) {
                    sVar6.n(iVar);
                } else {
                    sVar6.j0();
                }
                tb.f.f0(oVar, a15, hVar);
                tb.f.f0(oVar, o15, hVar2);
                if (sVar6.O || !Intrinsics.d(sVar6.J(), Integer.valueOf(i27))) {
                    ep.b.y(i27, sVar6, i27, hVar3);
                }
                tb.f.f0(oVar, X3, hVar4);
                com.bumptech.glide.c.b(com.bumptech.glide.c.M0(db0.b.pinterest_logo, oVar), null, null, null, null, 0.0f, null, oVar, 56, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                sVar6.r(true);
                u2.q q13 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.e.b(nVar, 1.0f), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_medium_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar), com.bumptech.glide.d.A(db0.a.reward_page_medium_plus_paddings, oVar));
                p1.e1 a16 = p1.c1.a(gVar, hVar5, oVar, 6);
                int i28 = sVar6.P;
                z1 o16 = sVar6.o();
                u2.q X4 = ao2.m0.X(oVar, q13);
                if (!z13) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar6.a0();
                if (sVar6.O) {
                    sVar6.n(iVar);
                } else {
                    sVar6.j0();
                }
                tb.f.f0(oVar, a16, hVar);
                tb.f.f0(oVar, o16, hVar2);
                if (sVar6.O || !Intrinsics.d(sVar6.J(), Integer.valueOf(i28))) {
                    ep.b.y(i28, sVar6, i28, hVar3);
                }
                tb.f.f0(oVar, X4, hVar4);
                String str = ((u21.b) v3Var.getValue()).f120071a;
                dl2.b.c(new rn1.a(ep.b.x(str, "string", str), vn1.c.DEFAULT, null, null, vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, oVar, 8, 14);
                sVar6.r(true);
                androidx.compose.foundation.layout.b.a(fillElement, null, false, q2.i.c(954639178, new tc0.p(v3Var, 1), oVar), oVar, 3078, 6);
                sVar6.r(true);
                sVar6.r(true);
                return;
            case 2:
                if ((i13 & 3) == 2) {
                    i2.s sVar7 = (i2.s) oVar;
                    if (sVar7.z()) {
                        sVar7.Q();
                        return;
                    }
                }
                v0 v0Var = (v0) obj3;
                v0Var.f17311b.setValue(kh2.n.X(oVar));
                ((kl2.l) obj2).invoke(v0Var, oVar, 0);
                return;
            case 4:
                if ((i13 & 3) == 2) {
                    i2.s sVar8 = (i2.s) oVar;
                    if (sVar8.z()) {
                        sVar8.Q();
                        return;
                    }
                }
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj3);
                throw null;
            case 5:
                if ((i13 & 3) == 2) {
                    i2.s sVar9 = (i2.s) oVar;
                    if (sVar9.z()) {
                        sVar9.Q();
                        return;
                    }
                }
                u2.q a17 = z3.l.a(nVar, false, q4.c.f102313m);
                q4.w wVar2 = (q4.w) obj3;
                i2.s sVar10 = (i2.s) oVar;
                boolean j14 = sVar10.j(wVar2);
                Object J3 = sVar10.J();
                if (j14 || J3 == obj) {
                    J3 = new q4.k(wVar2, 1);
                    sVar10.g0(J3);
                }
                u2.q a18 = androidx.compose.ui.draw.a.a(androidx.compose.ui.layout.b.h(a17, (Function1) J3), ((Boolean) wVar2.f102379s.getValue()).booleanValue() ? 1.0f : 0.0f);
                q2.h c13 = q2.i.c(606497925, new q4.d((v3) obj2, i19), sVar10);
                q4.f fVar = q4.f.f102324c;
                int i29 = sVar10.P;
                z1 o17 = sVar10.o();
                u2.q X5 = ao2.m0.X(sVar10, a18);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar10.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar10.a0();
                if (sVar10.O) {
                    sVar10.n(iVar2);
                } else {
                    sVar10.j0();
                }
                tb.f.f0(sVar10, fVar, s3.j.f110801e);
                tb.f.f0(sVar10, o17, s3.j.f110800d);
                s3.h hVar6 = s3.j.f110802f;
                if (sVar10.O || !Intrinsics.d(sVar10.J(), Integer.valueOf(i29))) {
                    ep.b.y(i29, sVar10, i29, hVar6);
                }
                tb.f.f0(sVar10, X5, s3.j.f110799c);
                c13.invoke(sVar10, 6);
                sVar10.r(true);
                return;
            case 6:
                if ((i13 & 11) == 2) {
                    i2.s sVar11 = (i2.s) oVar;
                    if (sVar11.z()) {
                        sVar11.Q();
                        return;
                    }
                }
                ((ba.m) obj3).f22283l.invoke((z9.k) obj2, oVar, 8);
                return;
            case 7:
                if ((i13 & 11) == 2) {
                    i2.s sVar12 = (i2.s) oVar;
                    if (sVar12.z()) {
                        sVar12.Q();
                        return;
                    }
                }
                z9.k kVar = (z9.k) obj3;
                z9.z zVar = kVar.f141211b;
                Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                ((ba.h) zVar).f22264k.c((i1.r) obj2, kVar, oVar, 72);
                return;
            case 8:
                if ((i13 & 11) == 2) {
                    i2.s sVar13 = (i2.s) oVar;
                    if (sVar13.z()) {
                        sVar13.Q();
                        return;
                    }
                }
                u2.q b13 = androidx.compose.foundation.a.b(kh2.m0.Q0(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.layout.e.p(nVar, null, 3), 40, Float.NaN), 2, v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_300, oVar)), 28), kh2.g0.h(eo1.b.color_background_light, oVar), b3.s0.f21349a);
                i2.s sVar14 = (i2.s) oVar;
                sVar14.W(1115265944);
                Function1 function1 = (Function1) obj3;
                boolean h10 = sVar14.h(function1);
                Object J4 = sVar14.J();
                if (h10 || J4 == obj) {
                    J4 = jq.b.o(1, function1, sVar14);
                }
                sVar14.r(false);
                u2.q o18 = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.a.e(b13, false, null, (Function0) J4, 7), com.bumptech.glide.d.A(eo1.c.space_300, sVar14), com.bumptech.glide.d.A(eo1.c.space_200, sVar14));
                sVar14.W(1115275694);
                q1 q1Var = (q1) obj2;
                Object J5 = sVar14.J();
                if (J5 == obj) {
                    J5 = new w1.o(i19, q1Var);
                    sVar14.g0(J5);
                }
                sVar14.r(false);
                u2.q g13 = androidx.compose.ui.layout.b.g(o18, (Function1) J5);
                q3.p0 e14 = p1.q.e(u2.b.f120017e, false);
                int i33 = sVar14.P;
                z1 o19 = sVar14.o();
                u2.q X6 = ao2.m0.X(sVar14, g13);
                s3.k.Qo.getClass();
                Function0 function0 = s3.j.f110798b;
                if (!(sVar14.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar14.a0();
                if (sVar14.O) {
                    sVar14.n(function0);
                } else {
                    sVar14.j0();
                }
                tb.f.f0(sVar14, e14, s3.j.f110801e);
                tb.f.f0(sVar14, o19, s3.j.f110800d);
                s3.h hVar7 = s3.j.f110802f;
                if (sVar14.O || !Intrinsics.d(sVar14.J(), Integer.valueOf(i33))) {
                    ep.b.y(i33, sVar14, i33, hVar7);
                }
                tb.f.f0(sVar14, X6, s3.j.f110799c);
                int i34 = l7.paste_from_clipboard_popup_title;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                rn1.a aVar = new rn1.a(new u50.k0(i34, new ArrayList(0)), vn1.c.DARK, null, null, vn1.g.UI_200, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.COPY_TO_CLIPBOARD, rm1.i.SM), rm1.c.DARK, null, 0, null, 28), false, 0, null, null, null, false, null, null, 2096620);
                sVar14.W(-384904085);
                boolean h13 = sVar14.h(function1);
                Object J6 = sVar14.J();
                if (h13 || J6 == obj) {
                    J6 = new i1.f1(i18, function1);
                    sVar14.g0(J6);
                }
                sVar14.r(false);
                dl2.b.c(aVar, null, null, (Function1) J6, sVar14, 8, 6);
                sVar14.r(true);
                return;
            case 10:
                if ((i13 & 11) == 2) {
                    i2.s sVar15 = (i2.s) oVar;
                    if (sVar15.z()) {
                        sVar15.Q();
                        return;
                    }
                }
                g3.d((z9.e0) obj3, ((oc0.r) obj2).f94048b, null, null, oVar, 72, 12);
                return;
            case 11:
                if ((i13 & 11) == 2) {
                    i2.s sVar16 = (i2.s) oVar;
                    if (sVar16.z()) {
                        sVar16.Q();
                        return;
                    }
                }
                int i35 = ((uc0.c) ((v3) obj3).getValue()).f121763a;
                i2.s sVar17 = (i2.s) oVar;
                sVar17.W(326180275);
                uc0.d dVar = (uc0.d) obj2;
                boolean h14 = sVar17.h(dVar);
                Object J7 = sVar17.J();
                if (h14 || J7 == obj) {
                    J7 = new lr.v(dVar, 28);
                    sVar17.g0(J7);
                }
                sVar17.r(false);
                kh2.b0.y(i35, null, 0, (Function0) J7, sVar17, 0, 6);
                return;
            case 12:
                if ((i13 & 11) == 2) {
                    i2.s sVar18 = (i2.s) oVar;
                    if (sVar18.z()) {
                        sVar18.Q();
                        return;
                    }
                }
                int i36 = ((uc0.e) ((v3) obj3).getValue()).f121772b;
                i2.s sVar19 = (i2.s) oVar;
                sVar19.W(1305958356);
                uc0.f fVar2 = (uc0.f) obj2;
                boolean h15 = sVar19.h(fVar2);
                Object J8 = sVar19.J();
                if (h15 || J8 == obj) {
                    J8 = new lr.v(fVar2, 29);
                    sVar19.g0(J8);
                }
                sVar19.r(false);
                kh2.b0.y(i36, null, 0, (Function0) J8, sVar19, 0, 6);
                return;
            case 13:
                if ((i13 & 11) == 2) {
                    i2.s sVar20 = (i2.s) oVar;
                    if (sVar20.z()) {
                        sVar20.Q();
                        return;
                    }
                }
                int i37 = ((uc0.p) ((v3) obj3).getValue()).f121844b;
                i2.s sVar21 = (i2.s) oVar;
                sVar21.W(-1398504996);
                uc0.q qVar = (uc0.q) obj2;
                boolean h16 = sVar21.h(qVar);
                Object J9 = sVar21.J();
                if (h16 || J9 == obj) {
                    J9 = new tc0.c(qVar, 1);
                    sVar21.g0(J9);
                }
                sVar21.r(false);
                kh2.b0.y(i37, null, 0, (Function0) J9, sVar21, 0, 6);
                return;
            case 14:
                if ((i13 & 11) == 2) {
                    i2.s sVar22 = (i2.s) oVar;
                    if (sVar22.z()) {
                        sVar22.Q();
                        return;
                    }
                }
                int i38 = ((uc0.t) ((v3) obj3).getValue()).f121863b;
                i2.s sVar23 = (i2.s) oVar;
                sVar23.W(-884126208);
                uc0.u uVar = (uc0.u) obj2;
                boolean h17 = sVar23.h(uVar);
                Object J10 = sVar23.J();
                if (h17 || J10 == obj) {
                    J10 = new tc0.c(uVar, i17);
                    sVar23.g0(J10);
                }
                sVar23.r(false);
                kh2.b0.y(i38, null, 0, (Function0) J10, sVar23, 0, 6);
                return;
            case 15:
                if ((i13 & 11) == 2) {
                    i2.s sVar24 = (i2.s) oVar;
                    if (sVar24.z()) {
                        sVar24.Q();
                        return;
                    }
                }
                int i39 = ((uc0.v) ((v3) obj3).getValue()).f121871b;
                i2.s sVar25 = (i2.s) oVar;
                sVar25.W(-1567471827);
                uc0.w wVar3 = (uc0.w) obj2;
                boolean h18 = sVar25.h(wVar3);
                Object J11 = sVar25.J();
                if (h18 || J11 == obj) {
                    J11 = new tc0.c(wVar3, 4);
                    sVar25.g0(J11);
                }
                sVar25.r(false);
                kh2.b0.y(i39, null, 0, (Function0) J11, sVar25, 0, 6);
                return;
            case 16:
                if ((i13 & 11) == 2) {
                    i2.s sVar26 = (i2.s) oVar;
                    if (sVar26.z()) {
                        sVar26.Q();
                        return;
                    }
                }
                int i43 = ((uc0.e0) ((v3) obj3).getValue()).f121773a;
                i2.s sVar27 = (i2.s) oVar;
                sVar27.W(-505141079);
                uc0.f0 f0Var = (uc0.f0) obj2;
                boolean h19 = sVar27.h(f0Var);
                Object J12 = sVar27.J();
                if (h19 || J12 == obj) {
                    J12 = new tc0.c(f0Var, 5);
                    sVar27.g0(J12);
                }
                sVar27.r(false);
                kh2.b0.y(i43, null, 0, (Function0) J12, sVar27, 0, 6);
                return;
            case 17:
                if ((i13 & 11) == 2) {
                    i2.s sVar28 = (i2.s) oVar;
                    if (sVar28.z()) {
                        sVar28.Q();
                        return;
                    }
                }
                kh2.b0.y(((uc0.l0) ((v3) obj3).getValue()).f121814a, null, 0, new tc0.c((uc0.p0) obj2, 6), oVar, 0, 6);
                return;
            case 18:
                if ((i13 & 11) == 2) {
                    i2.s sVar29 = (i2.s) oVar;
                    if (sVar29.z()) {
                        sVar29.Q();
                        return;
                    }
                }
                int i44 = ((uc0.c1) ((v3) obj3).getValue()).f121765a;
                i2.s sVar30 = (i2.s) oVar;
                sVar30.W(1121718065);
                uc0.d1 d1Var = (uc0.d1) obj2;
                boolean h23 = sVar30.h(d1Var);
                Object J13 = sVar30.J();
                if (h23 || J13 == obj) {
                    J13 = new tc0.c(d1Var, i15);
                    sVar30.g0(J13);
                }
                sVar30.r(false);
                kh2.b0.y(i44, null, 0, (Function0) J13, sVar30, 0, 6);
                return;
            case 19:
                if ((i13 & 11) == 2) {
                    i2.s sVar31 = (i2.s) oVar;
                    if (sVar31.z()) {
                        sVar31.Q();
                        return;
                    }
                }
                i2.s sVar32 = (i2.s) oVar;
                sVar32.W(-1682559591);
                Function1 function12 = (Function1) obj3;
                boolean h24 = sVar32.h(function12);
                Object J14 = sVar32.J();
                if (h24 || J14 == obj) {
                    J14 = jq.b.o(26, function12, sVar32);
                }
                sVar32.r(false);
                r2.a((Function0) J14, null, false, null, q2.i.c(587405553, new tc0.c0((k1) obj2, 1), sVar32), sVar32, 24576, 14);
                return;
            case 20:
                if ((i13 & 11) == 2) {
                    i2.s sVar33 = (i2.s) oVar;
                    if (sVar33.z()) {
                        sVar33.Q();
                        return;
                    }
                }
                int i45 = ((m1) ((v3) obj3).getValue()).f121828a;
                i2.s sVar34 = (i2.s) oVar;
                sVar34.W(1561401503);
                n1 n1Var = (n1) obj2;
                boolean h25 = sVar34.h(n1Var);
                Object J15 = sVar34.J();
                if (h25 || J15 == obj) {
                    J15 = new tc0.c(n1Var, i18);
                    sVar34.g0(J15);
                }
                sVar34.r(false);
                kh2.b0.y(i45, null, 0, (Function0) J15, sVar34, 0, 6);
                return;
            case 21:
                if ((i13 & 11) == 2) {
                    i2.s sVar35 = (i2.s) oVar;
                    if (sVar35.z()) {
                        sVar35.Q();
                        return;
                    }
                }
                int i46 = ((o1) ((v3) obj3).getValue()).f121839a;
                i2.s sVar36 = (i2.s) oVar;
                sVar36.W(1242649810);
                p1 p1Var = (p1) obj2;
                boolean h26 = sVar36.h(p1Var);
                Object J16 = sVar36.J();
                if (h26 || J16 == obj) {
                    J16 = new tc0.c(p1Var, 12);
                    sVar36.g0(J16);
                }
                sVar36.r(false);
                kh2.b0.y(i46, null, 0, (Function0) J16, sVar36, 0, 6);
                return;
            case 22:
                if ((i13 & 11) == 2) {
                    i2.s sVar37 = (i2.s) oVar;
                    if (sVar37.z()) {
                        sVar37.Q();
                        return;
                    }
                }
                int i47 = ((u1) ((v3) obj3).getValue()).f121868a;
                i2.s sVar38 = (i2.s) oVar;
                sVar38.W(-853226974);
                v1 v1Var = (v1) obj2;
                boolean h27 = sVar38.h(v1Var);
                Object J17 = sVar38.J();
                if (h27 || J17 == obj) {
                    J17 = new tc0.c(v1Var, 15);
                    sVar38.g0(J17);
                }
                sVar38.r(false);
                kh2.b0.y(i47, null, 0, (Function0) J17, sVar38, 0, 6);
                return;
            case 23:
                if ((i13 & 11) == 2) {
                    i2.s sVar39 = (i2.s) oVar;
                    if (sVar39.z()) {
                        sVar39.Q();
                        return;
                    }
                }
                int i48 = ((y1) ((v3) obj3).getValue()).f121885a;
                i2.s sVar40 = (i2.s) oVar;
                sVar40.W(-2151302);
                uc0.z1 z1Var = (uc0.z1) obj2;
                boolean h28 = sVar40.h(z1Var);
                Object J18 = sVar40.J();
                if (h28 || J18 == obj) {
                    J18 = new tc0.c(z1Var, i16);
                    sVar40.g0(J18);
                }
                sVar40.r(false);
                kh2.b0.y(i48, null, 0, (Function0) J18, sVar40, 0, 6);
                return;
            case 24:
                if ((i13 & 11) == 2) {
                    i2.s sVar41 = (i2.s) oVar;
                    if (sVar41.z()) {
                        sVar41.Q();
                        return;
                    }
                }
                int i49 = ((k2) ((v3) obj3).getValue()).f121809a;
                i2.s sVar42 = (i2.s) oVar;
                sVar42.W(1100559767);
                l2 l2Var = (l2) obj2;
                boolean h29 = sVar42.h(l2Var);
                Object J19 = sVar42.J();
                if (h29 || J19 == obj) {
                    J19 = new tc0.c(l2Var, 22);
                    sVar42.g0(J19);
                }
                sVar42.r(false);
                kh2.b0.y(i49, null, 0, (Function0) J19, sVar42, 0, 6);
                return;
            case 25:
                if ((i13 & 11) == 2) {
                    i2.s sVar43 = (i2.s) oVar;
                    if (sVar43.z()) {
                        sVar43.Q();
                        return;
                    }
                }
                kh2.b0.y(oc0.q.design_tokens, null, 0, new b10.z(i16, (ao2.j0) obj3, (w2) obj2), oVar, 0, 6);
                return;
        }
    }

    public final q3.q0 e(q3.o1 SubcomposeLayout, long j13) {
        q3.q0 s03;
        int i13 = this.f17307i;
        Object obj = this.f17309k;
        Object obj2 = this.f17308j;
        switch (i13) {
            case 1:
                return (q3.q0) ((Function2) obj).invoke(new d0((x) obj2, SubcomposeLayout), new n4.a(j13));
            default:
                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                q3.c1 Q = ((q3.o0) SubcomposeLayout.m("viewToMeasure", (Function2) obj2).get(0)).Q(bs1.c.b(0, 0, 15));
                w1.a aVar = new w1.a((kl2.l) obj, b7.c.e(SubcomposeLayout.f0(Q.f102178a), SubcomposeLayout.f0(Q.f102179b)), 2);
                Object obj3 = q2.i.f102113a;
                q3.c1 Q2 = ((q3.o0) SubcomposeLayout.m("content", new q2.h(aVar, true, 935594011)).get(0)).Q(j13);
                s03 = SubcomposeLayout.s0(Q2.f102178a, Q2.f102179b, kotlin.collections.z0.d(), new i1.a0(Q2, 10));
                return s03;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i13 = this.f17307i;
        Object obj3 = this.f17309k;
        Object obj4 = this.f17308j;
        switch (i13) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.g0 g0Var = (kotlin.jvm.internal.g0) obj4;
                g0Var.f80425a += ((m1.m1) obj3).a(floatValue - g0Var.f80425a);
                break;
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 8:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 9:
                break;
            case 10:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 11:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 12:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 13:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 14:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 15:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 16:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 17:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 18:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 19:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 20:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 21:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 22:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 23:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 24:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 25:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 26:
                dl1.s pinModel = (dl1.s) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(pinModel, "pinModel");
                gx0.e eVar = (gx0.e) obj4;
                eVar.getClass();
                break;
            case 27:
                dl1.s model = (dl1.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(model, "model");
                vh vhVar = (vh) model;
                lh0.a0 a0Var = (lh0.a0) obj4;
                boolean z13 = a0Var.V("enabled_cta") || a0Var.V("employees");
                h32.w0 e13 = ((uk1.d) obj3).e();
                if (e13 == null || (str = e13.G) == null) {
                    str = "";
                }
                String str2 = str;
                Integer valueOf = Integer.valueOf(intValue2);
                yw0.l lVar = yw0.l.CLOSEUP;
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) a0Var.f83294a;
                break;
            case 28:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((ScreenDescription) obj, "<anonymous parameter 0>");
                com.pinterest.framework.screens.s sVar = (com.pinterest.framework.screens.s) obj4;
                ScreenDescription screenDescription = (ScreenDescription) obj3;
                sVar.f49226a.removeView(sVar.m(screenDescription, sVar.f49226a));
                ((il1.b) sVar.f49228c).a(screenDescription);
                com.pinterest.framework.screens.s.f49224n.removeViewModelStore(screenDescription);
                break;
        }
        return Unit.f80348a;
    }
}
