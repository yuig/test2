package i1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.compose.foundation.layout.FillElement;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.screen.IdeaPinCreationLocation;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.o4;
import i2.v3;
import i2.y3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.m2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.f7;
import s80.l3;
import s80.n3;
import s80.t2;
import t3.f2;
import w1.b2;
import w1.q2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70776i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70777j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i13) {
        super(3);
        this.f70776i = i13;
        this.f70777j = obj;
    }

    public final u2.q b(u2.q qVar, i2.o oVar) {
        long a13;
        long a14;
        am.d dVar = i2.n.f71185a;
        int i13 = this.f70776i;
        Object obj = this.f70777j;
        switch (i13) {
            case 3:
                i2.s sVar = (i2.s) oVar;
                sVar.W(-1415685722);
                p1.m1 m1Var = (p1.m1) obj;
                boolean h10 = sVar.h(m1Var);
                Object J2 = sVar.J();
                if (h10 || J2 == dVar) {
                    J2 = new p1.k0(m1Var);
                    sVar.g0(J2);
                }
                p1.k0 k0Var = (p1.k0) J2;
                sVar.r(false);
                return k0Var;
            case 4:
            default:
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(1980580247);
                n4.b bVar = (n4.b) sVar2.m(f2.f115983f);
                Object J3 = sVar2.J();
                if (J3 == dVar) {
                    J3 = bs1.c.u1(new n4.j(0L), y3.f71400a);
                    sVar2.g0(J3);
                }
                i2.q1 q1Var = (i2.q1) J3;
                b2.t0 t0Var = (b2.t0) obj;
                boolean j13 = sVar2.j(t0Var);
                Object J4 = sVar2.J();
                if (j13 || J4 == dVar) {
                    J4 = new k1.v0(7, t0Var, q1Var);
                    sVar2.g0(J4);
                }
                Function0 function0 = (Function0) J4;
                boolean h13 = sVar2.h(bVar);
                Object J5 = sVar2.J();
                if (h13 || J5 == dVar) {
                    J5 = new b2.y0(bVar, q1Var, r2);
                    sVar2.g0(J5);
                }
                j1.q qVar2 = b2.i0.f21164a;
                u2.q p13 = ao2.m0.p(qVar, t3.p.f116119m, new k1.n1(3, function0, (Function1) J5));
                sVar2.r(false);
                return p13;
            case 5:
                i2.s sVar3 = (i2.s) oVar;
                sVar3.W(1582736677);
                n4.b bVar2 = (n4.b) sVar3.m(f2.f115983f);
                g4.d dVar2 = (g4.d) sVar3.m(f2.f115986i);
                n4.k kVar = (n4.k) sVar3.m(f2.f115989l);
                b4.q0 q0Var = (b4.q0) obj;
                boolean h14 = sVar3.h(q0Var) | sVar3.h(kVar);
                Object J6 = sVar3.J();
                if (h14 || J6 == dVar) {
                    J6 = rl2.g0.f0(q0Var, kVar);
                    sVar3.g0(J6);
                }
                b4.q0 q0Var2 = (b4.q0) J6;
                boolean h15 = sVar3.h(dVar2) | sVar3.h(q0Var2);
                Object J7 = sVar3.J();
                if (h15 || J7 == dVar) {
                    b4.g0 g0Var = q0Var2.f21648a;
                    g4.e eVar = g0Var.f21580f;
                    g4.l lVar = g0Var.f21577c;
                    if (lVar == null) {
                        lVar = g4.l.f63469d;
                    }
                    g4.j jVar = g0Var.f21578d;
                    int i14 = jVar != null ? jVar.f63465a : 0;
                    g4.k kVar2 = g0Var.f21579e;
                    J7 = ((g4.f) dVar2).b(eVar, lVar, i14, kVar2 != null ? kVar2.f63466a : 1);
                    sVar3.g0(J7);
                }
                v3 v3Var = (v3) J7;
                Object J8 = sVar3.J();
                Object obj2 = J8;
                if (J8 == dVar) {
                    Object value = v3Var.getValue();
                    q2 q2Var = new q2();
                    q2Var.f127457a = kVar;
                    q2Var.f127458b = bVar2;
                    q2Var.f127459c = dVar2;
                    q2Var.f127460d = q0Var;
                    q2Var.f127461e = value;
                    a14 = b2.a(q0Var, bVar2, dVar2, b2.f127170a, 1);
                    q2Var.f127462f = a14;
                    sVar3.g0(q2Var);
                    obj2 = q2Var;
                }
                q2 q2Var2 = (q2) obj2;
                Object value2 = v3Var.getValue();
                if (kVar != q2Var2.f127457a || !Intrinsics.d(bVar2, q2Var2.f127458b) || !Intrinsics.d(dVar2, q2Var2.f127459c) || !Intrinsics.d(q0Var2, q2Var2.f127460d) || !Intrinsics.d(value2, q2Var2.f127461e)) {
                    q2Var2.f127457a = kVar;
                    q2Var2.f127458b = bVar2;
                    q2Var2.f127459c = dVar2;
                    q2Var2.f127460d = q0Var2;
                    q2Var2.f127461e = value2;
                    a13 = b2.a(q0Var2, bVar2, dVar2, b2.f127170a, 1);
                    q2Var2.f127462f = a13;
                }
                u2.n nVar = u2.n.f120041b;
                boolean j14 = sVar3.j(q2Var2);
                Object J9 = sVar3.J();
                if (j14 || J9 == dVar) {
                    J9 = new h(q2Var2, 4);
                    sVar3.g0(J9);
                }
                u2.q f13 = androidx.compose.ui.layout.b.f(nVar, (kl2.l) J9);
                sVar3.r(false);
                return f13;
        }
    }

    public final void e(androidx.compose.foundation.layout.d BoxWithConstraints, i2.o oVar, int i13) {
        int i14;
        int i15;
        u2.n nVar = u2.n.f120041b;
        int i16 = this.f70776i;
        Object obj = this.f70777j;
        switch (i16) {
            case 16:
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i13 & 14) == 0) {
                    i14 = i13 | (((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                if ((i14 & 91) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                i2.s sVar2 = (i2.s) oVar;
                float l03 = ((n4.b) sVar2.m(f2.f115983f)).l0(BoxWithConstraints.d() * 0.045f);
                u2.q j13 = androidx.compose.foundation.layout.e.j(nVar, BoxWithConstraints.d() * 0.964f);
                sVar2.W(1093422572);
                boolean e13 = sVar2.e(l03);
                Object J2 = sVar2.J();
                if (e13 || J2 == i2.n.f71185a) {
                    J2 = new p1.v0(9, l03);
                    sVar2.g0(J2);
                }
                sVar2.r(false);
                u2.q j14 = androidx.compose.ui.graphics.a.n(j13, (Function1) J2).j(dn.c.i0(sVar2));
                yy0.f0 f0Var = (yy0.f0) obj;
                p1.q.a(androidx.compose.foundation.a.b(j14, dl2.b.t2(f0Var.f140453d, sVar2), b3.s0.f21349a), sVar2, 0);
                dn.c.d(BoxWithConstraints, f0Var, j14, sVar2, (i14 & 14) | 64, 0);
                return;
            default:
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i13 & 14) == 0) {
                    i15 = i13 | (((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2);
                } else {
                    i15 = i13;
                }
                if ((i15 & 91) == 18) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                float d2 = BoxWithConstraints.d();
                List j15 = kotlin.collections.f0.j(Float.valueOf(4.68f), Float.valueOf(4.68f), Float.valueOf(3.75f), Float.valueOf(3.17f));
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(j15, 10));
                Iterator it = j15.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n4.e(d2 / ((Number) it.next()).floatValue()));
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new n4.e(((n4.e) it2.next()).f89175a * 1.5f));
                }
                float f13 = d2 / 30.0f;
                float f14 = 0;
                List j16 = kotlin.collections.f0.j(new n4.e(f13), new n4.e(f13), new n4.e(f14), new n4.e(f14));
                float f15 = -d2;
                List j17 = kotlin.collections.f0.j(new n4.e(f15 / 3.5f), new n4.e(d2 / 3.5f), new n4.e(d2 / 9.0f), new n4.e(f15 / 9.0f));
                List j18 = kotlin.collections.f0.j(Float.valueOf(-16.0f), Float.valueOf(16.0f), Float.valueOf(6.0f), Float.valueOf(-6.0f));
                FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                List list = (List) obj;
                q3.p0 e14 = p1.q.e(u2.b.f120017e, false);
                i2.s sVar4 = (i2.s) oVar;
                int i17 = sVar4.P;
                i2.z1 o13 = sVar4.o();
                u2.q X = ao2.m0.X(oVar, fillElement);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                if (!(sVar4.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar4.a0();
                if (sVar4.O) {
                    sVar4.n(iVar);
                } else {
                    sVar4.j0();
                }
                tb.f.f0(oVar, e14, s3.j.f110801e);
                tb.f.f0(oVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar4.O || !Intrinsics.d(sVar4.J(), Integer.valueOf(i17))) {
                    ep.b.y(i17, sVar4, i17, hVar);
                }
                tb.f.f0(oVar, X, s3.j.f110799c);
                Iterator it3 = arrayList2.iterator();
                int i18 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    ((n4.e) next).getClass();
                    c2.j1.b(androidx.compose.ui.graphics.a.n(nVar, new w1.z0(i18, j18, j17, j16)), v1.i.a(com.bumptech.glide.d.A(db0.a.reward_page_large_paddings, oVar)), 0L, null, f14, q2.i.c(-1887384334, new androidx.compose.foundation.lazy.layout.u0(i18, list, arrayList, arrayList2), oVar), oVar, 1769472, 28);
                    i18 = i19;
                    j18 = j18;
                    j16 = j16;
                    sVar4 = sVar4;
                    list = list;
                    j17 = j17;
                }
                sVar4.r(true);
                return;
        }
    }

    public final void f(m0 AnimatedVisibility, i2.o oVar) {
        am.d dVar = i2.n.f71185a;
        u2.g gVar = u2.b.f120026n;
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
        u2.i iVar = u2.b.f120013a;
        u2.n nVar = u2.n.f120041b;
        int i13 = this.f70776i;
        Object obj = this.f70777j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                u2.q b13 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.f17184c, kh2.g0.h(eo1.b.color_background_wash_dark, oVar), b3.s0.f21349a);
                i2.s sVar = (i2.s) oVar;
                sVar.W(-1926577833);
                Object J2 = sVar.J();
                if (J2 == dVar) {
                    J2 = d7.g.o(sVar);
                }
                sVar.r(false);
                u2.q d2 = androidx.compose.foundation.a.d(b13, (o1.l) J2, null, false, null, l3.f111659k, 28);
                f7 f7Var = (f7) obj;
                p1.y a13 = p1.x.a(p1.l.f98547e, gVar, sVar, 54);
                int i14 = sVar.P;
                i2.z1 o13 = sVar.o();
                u2.q X = ao2.m0.X(sVar, d2);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                if (sVar.O) {
                    sVar.n(iVar2);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, a13, s3.j.f110801e);
                tb.f.f0(sVar, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i14))) {
                    ep.b.y(i14, sVar, i14, hVar);
                }
                tb.f.f0(sVar, X, s3.j.f110799c);
                androidx.compose.ui.viewinterop.a.a(n3.f111690k, null, new mz.c(f7Var, 18), sVar, 6, 2);
                androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.j(nVar, com.bumptech.glide.d.A(eo1.c.space_400, sVar)), sVar);
                dl2.b.c(new rn1.a(f7Var.f111540b, vn1.c.LIGHT, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097132), null, null, null, sVar, 8, 14);
                sVar.r(true);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                w80.h1 h1Var = (w80.h1) obj;
                q3.p0 e13 = p1.q.e(iVar, false);
                i2.s sVar2 = (i2.s) oVar;
                int i15 = sVar2.P;
                i2.z1 o14 = sVar2.o();
                u2.q X2 = ao2.m0.X(oVar, fillElement);
                s3.k.Qo.getClass();
                s3.i iVar3 = s3.j.f110798b;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar3);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(oVar, e13, s3.j.f110801e);
                tb.f.f0(oVar, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar2, i15, hVar2);
                }
                tb.f.f0(oVar, X2, s3.j.f110799c);
                u2.q a14 = cVar.a(nVar, u2.b.f120014b);
                sVar2.W(1961989041);
                boolean h10 = sVar2.h(h1Var);
                Object J3 = sVar2.J();
                if (h10 || J3 == dVar) {
                    J3 = new t2(h1Var, 7);
                    sVar2.g0(J3);
                }
                sVar2.r(false);
                gh0.b.s(androidx.compose.foundation.layout.b.j(a14, (Function1) J3), oVar, 0, 0);
                sVar2.r(true);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                u2.q q13 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.e.b((u2.q) obj, 1.0f), com.bumptech.glide.d.A(eo1.c.space_400, oVar), com.bumptech.glide.d.A(eo1.c.space_1200, oVar), com.bumptech.glide.d.A(eo1.c.space_400, oVar), com.bumptech.glide.d.A(eo1.c.space_400, oVar));
                p1.g gVar2 = p1.l.f98543a;
                p1.y a15 = p1.x.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.space_100, oVar)), gVar, oVar, 48);
                i2.s sVar3 = (i2.s) oVar;
                int i16 = sVar3.P;
                i2.z1 o15 = sVar3.o();
                u2.q X3 = ao2.m0.X(oVar, q13);
                s3.k.Qo.getClass();
                s3.i iVar4 = s3.j.f110798b;
                if (!(sVar3.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar3.a0();
                if (sVar3.O) {
                    sVar3.n(iVar4);
                } else {
                    sVar3.j0();
                }
                tb.f.f0(oVar, a15, s3.j.f110801e);
                tb.f.f0(oVar, o15, s3.j.f110800d);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar3, i16, hVar3);
                }
                tb.f.f0(oVar, X3, s3.j.f110799c);
                String D0 = kh2.a1.D0(l90.c.collage_content_picker_onboarding_title, oVar);
                u50.f0 x13 = ep.b.x(D0, "string", D0);
                vn1.g gVar3 = vn1.g.HEADING_400;
                vn1.b bVar = vn1.b.CENTER;
                dl2.b.c(new rn1.a(x13, null, kotlin.collections.e0.b(bVar), null, gVar3, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), null, null, null, oVar, 8, 14);
                String D02 = kh2.a1.D0(l90.c.collage_content_picker_onboarding_subtitle, oVar);
                dl2.b.c(new rn1.a(ep.b.x(D02, "string", D02), null, kotlin.collections.e0.b(bVar), null, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), null, null, null, oVar, 8, 14);
                sVar3.r(true);
                return;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                u2.q p13 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.a.b(nVar, b3.w.b(kh2.g0.h(eo1.b.color_white_mochimalist_0, oVar), 0.8f), v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_600, oVar))), com.bumptech.glide.d.A(eo1.c.space_1100, oVar), Float.NaN), com.bumptech.glide.d.A(eo1.c.space_400, oVar), 0.0f, 2);
                s90.r0 r0Var = (s90.r0) obj;
                q3.p0 e14 = p1.q.e(iVar, false);
                i2.s sVar4 = (i2.s) oVar;
                int i17 = sVar4.P;
                i2.z1 o16 = sVar4.o();
                u2.q X4 = ao2.m0.X(oVar, p13);
                s3.k.Qo.getClass();
                s3.i iVar5 = s3.j.f110798b;
                if (!(sVar4.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar4.a0();
                if (sVar4.O) {
                    sVar4.n(iVar5);
                } else {
                    sVar4.j0();
                }
                tb.f.f0(oVar, e14, s3.j.f110801e);
                tb.f.f0(oVar, o16, s3.j.f110800d);
                s3.h hVar4 = s3.j.f110802f;
                if (sVar4.O || !Intrinsics.d(sVar4.J(), Integer.valueOf(i17))) {
                    ep.b.y(i17, sVar4, i17, hVar4);
                }
                tb.f.f0(oVar, X4, s3.j.f110799c);
                dl2.b.c(new rn1.a(r0Var.f112015a, vn1.c.DARK, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.HEADING_200, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097124), cVar.a(nVar, u2.b.f120017e), null, null, oVar, 8, 12);
                sVar4.r(true);
                return;
        }
    }

    public final void h(String pinId, String action, String phase) {
        int i13 = this.f70776i;
        Object obj = this.f70777j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(pinId, "pinId");
                Intrinsics.checkNotNullParameter(action, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(phase, "<anonymous parameter 2>");
                mv0.i iVar = (mv0.i) obj;
                int i14 = mv0.i.f88365f1;
                iVar.getClass();
                if (com.bumptech.glide.d.G(iVar, "com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", false)) {
                    com.pinterest.framework.screens.s sVar = iVar.f91293r;
                    List i15 = sVar != null ? sVar.i() : null;
                    if (i15 == null) {
                        i15 = kotlin.collections.q0.f80391a;
                    }
                    List list = i15;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.d(((ScreenDescription) it.next()).getScreenClass(), IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST.getF34948a())) {
                                iVar.y1(mv0.g.f88348k, "com.pinterest.EXTRA_IDEA_PIN_TAG_PRODUCTS_LIST_ADDED_PRODUCTS", e0.t.j(new Pair("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID", pinId)));
                            }
                        }
                    }
                    NavigationImpl w13 = Navigation.w1(IdeaPinCreationLocation.IDEA_PIN_CREATION_PRODUCT_TAG_LIST);
                    Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                    iVar.M1(w13);
                } else {
                    iVar.z(mv0.g.f88347j);
                }
                GestaltSpinner gestaltSpinner = iVar.f88367b1;
                if (gestaltSpinner != null) {
                    dl2.b.X2(gestaltSpinner, ln1.e.LOADED);
                    return;
                } else {
                    Intrinsics.r("gestaltSpinner");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(pinId, "event");
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(phase, "phase");
                ((p91.c0) obj).f99271k.i(pinId, action, phase);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(va1.m1 r34, boolean r35, com.pinterest.gestalt.switchComponent.GestaltSwitch r36) {
        /*
            Method dump skipped, instructions count: 2212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.h.i(va1.m1, boolean, com.pinterest.gestalt.switchComponent.GestaltSwitch):void");
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        u2.n nVar = u2.n.f120041b;
        int i13 = this.f70776i;
        Object obj4 = this.f70777j;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((Number) obj3).intValue();
                i2.s sVar = (i2.s) ((i2.o) obj2);
                sVar.W(438406499);
                j1.h0 h0Var = (j1.h0) obj4;
                sVar.r(false);
                break;
            case 3:
                ((Number) obj3).intValue();
                break;
            case 4:
                break;
            case 5:
                ((Number) obj3).intValue();
                break;
            case 6:
                ((Number) obj3).intValue();
                break;
            case 7:
                ((Number) obj3).intValue();
                f((m0) obj, (i2.o) obj2);
                break;
            case 8:
                ((Number) obj3).intValue();
                f((m0) obj, (i2.o) obj2);
                break;
            case 9:
                ((Number) obj3).intValue();
                f((m0) obj, (i2.o) obj2);
                break;
            case 10:
                ((Number) obj3).intValue();
                f((m0) obj, (i2.o) obj2);
                break;
            case 11:
                f2.e0 sliderState = (f2.e0) obj;
                i2.o oVar = (i2.o) obj2;
                int intValue = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(sliderState, "sliderState");
                if ((intValue & 14) == 0) {
                    intValue |= ((i2.s) oVar).h(sliderState) ? 4 : 2;
                }
                if ((intValue & 91) == 18) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                f2.s.f60907a.b(sliderState, androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_100, oVar)), false, (f2.k) obj4, null, null, 0, 0.0f, oVar, 102260744 | (intValue & 14), RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING);
            case 12:
                p1.x0 innerPadding = (p1.x0) obj;
                i2.o oVar2 = (i2.o) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                if ((intValue2 & 14) == 0) {
                    intValue2 |= ((i2.s) oVar2).h(innerPadding) ? 4 : 2;
                }
                if ((intValue2 & 91) == 18) {
                    i2.s sVar3 = (i2.s) oVar2;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                m2.F((z9.e0) obj4, "Home", androidx.compose.foundation.layout.b.m(nVar, innerPadding), null, null, null, null, null, null, oc0.b.f94033i, oVar2, 805306376, 504);
            case 13:
                q1.c item = (q1.c) obj;
                i2.o oVar3 = (i2.o) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((intValue3 & 81) == 16) {
                    i2.s sVar4 = (i2.s) oVar3;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                gh0.b.m(((tc0.y) obj4).f117358a, null, oVar3, 0, 2);
            case 14:
                h((String) obj, (String) obj2, (String) obj3);
                break;
            case 15:
                r1.q item2 = (r1.q) obj;
                i2.o oVar4 = (i2.o) obj2;
                int intValue4 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(item2, "$this$item");
                if ((intValue4 & 81) == 16) {
                    i2.s sVar5 = (i2.s) oVar4;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                dn.c.i((yy0.d) obj4, oVar4, 8);
            case 16:
                e((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 17:
                e((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 18:
                h((String) obj, (String) obj2, (String) obj3);
                break;
            case 19:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 20:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 21:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 22:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 23:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 24:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 25:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 26:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 27:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            case 28:
                i((va1.m1) obj, ((Boolean) obj2).booleanValue(), (GestaltSwitch) obj3);
                break;
            default:
                String bubbleTitle = (String) obj;
                String bubbleId = (String) obj2;
                HashMap hashMap = (HashMap) obj3;
                Intrinsics.checkNotNullParameter(bubbleTitle, "bubbleTitle");
                Intrinsics.checkNotNullParameter(bubbleId, "bubbleId");
                if (hashMap != null && (str = (String) ((sd1.a) obj4).f112314n) != null) {
                    hashMap.put("board_id", str);
                }
                sd1.a aVar = (sd1.a) obj4;
                nx.d0.B(aVar.getPinalytics(), null, h32.g0.WISHLIST_SHOP_YOUR_PRODUCTS_STORY, bubbleId, hashMap, 17);
                NavigationImpl w13 = Navigation.w1((ScreenLocation) o4.f51174b.getValue());
                w13.m0("com.pinterest.EXTRA_USER_ID", (String) aVar.f112313m);
                w13.m0("module_source", "module_wishlist_bubble_categories");
                String boardId = (String) aVar.f112314n;
                if (boardId != null) {
                    Intrinsics.checkNotNullParameter(boardId, "boardId");
                    w13.m0("api_endpoint", "boards/" + boardId + "/shopping/feed/category/");
                    w13.m0("com.pinterest.EXTRA_SHOP_CATEGORY", bubbleTitle);
                    w13.m0("com.pinterest.EXTRA_WISHLIST_FEED_TYPE", "wishlist_bubble_category_feed");
                }
                m60.u.f85943a.d(w13);
                break;
        }
        return Unit.f80348a;
    }

    public final q3.q0 j(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        q3.q0 s04;
        q3.q0 s05;
        int i13 = this.f70776i;
        Object obj = this.f70777j;
        switch (i13) {
            case 0:
                q3.c1 Q = o0Var.Q(j13);
                s03 = r0Var.s0(Q.f102178a, Q.f102179b, kotlin.collections.z0.d(), new v(1, Q, (r0) obj));
                return s03;
            case 1:
                q3.c1 Q2 = o0Var.Q(j13);
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                if (r0Var.K()) {
                    throw null;
                }
                s04 = r0Var.s0(Q2.f102178a, Q2.f102179b, kotlin.collections.z0.d(), new a0(Q2, 0));
                return s04;
            default:
                long j14 = ((q2) obj).f127462f;
                q3.c1 Q3 = o0Var.Q(n4.a.a(j13, ql2.s.g((int) (j14 >> 32), n4.a.j(j13), n4.a.h(j13)), 0, ql2.s.g((int) (j14 & 4294967295L), n4.a.i(j13), n4.a.g(j13)), 0, 10));
                s05 = r0Var.s0(Q3.f102178a, Q3.f102179b, kotlin.collections.z0.d(), new a0(Q3, 5));
                return s05;
        }
    }
}
