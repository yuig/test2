package c2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24573i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24574j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24575k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f24576l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i13) {
        super(3);
        this.f24573i = i13;
        this.f24574j = obj;
        this.f24575k = obj2;
        this.f24576l = obj3;
    }

    public final void b(androidx.compose.foundation.layout.d BoxWithConstraints, i2.o oVar, int i13) {
        int i14;
        Pair pair;
        int i15;
        int i16 = this.f24573i;
        Object obj = this.f24576l;
        Object obj2 = this.f24575k;
        Object obj3 = this.f24574j;
        switch (i16) {
            case 3:
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
                u80.j jVar = (u80.j) obj3;
                Integer num = jVar.f120950d;
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-236217056);
                if (num != null) {
                    com.bumptech.glide.c.b(com.bumptech.glide.c.M0(num.intValue(), sVar2), null, androidx.compose.foundation.layout.e.f17184c, null, null, 0.0f, null, sVar2, 440, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
                    Unit unit = Unit.f80348a;
                }
                sVar2.r(false);
                Function1 function1 = (Function1) obj2;
                u80.k kVar = (u80.k) obj;
                u2.n nVar = u2.n.f120041b;
                p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar2, 0);
                int i17 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(sVar2, nVar);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                vn1.c cVar = null;
                if (!(sVar2.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                tb.f.f0(sVar2, a13, s3.j.f110801e);
                tb.f.f0(sVar2, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i17))) {
                    ep.b.y(i17, sVar2, i17, hVar);
                }
                tb.f.f0(sVar2, X, s3.j.f110799c);
                float c13 = BoxWithConstraints.c();
                List list = u80.u.f120983a;
                sVar2.W(171939686);
                boolean z13 = Float.compare(c13, (float) 200) < 0;
                boolean T1 = dl2.b.T1((Context) sVar2.m(AndroidCompositionLocals_androidKt.f17455b));
                if (z13) {
                    pair = new Pair(vn1.g.UI_200, vn1.g.UI_300);
                } else {
                    pair = new Pair(T1 ? vn1.g.HEADING_400 : vn1.g.HEADING_600, T1 ? vn1.g.HEADING_600 : vn1.g.HEADING_700);
                }
                sVar2.r(false);
                vn1.g gVar = (vn1.g) pair.f80346a;
                vn1.g gVar2 = (vn1.g) pair.f80347b;
                sVar2.W(924361164);
                vn1.c cVar2 = jVar.f120949c;
                if (cVar2 != null && androidx.compose.foundation.a.h(sVar2)) {
                    cVar = cVar2;
                }
                sVar2.r(false);
                rn1.a aVar = new rn1.a(jVar.f120947a, cVar == null ? jVar.f120948b : cVar, kotlin.collections.e0.b(vn1.b.START), kotlin.collections.e0.b(vn1.e.BOLD), gVar2, 3, null, rn1.b.END, null, null, false, 0, null, gVar, gVar2, false, null, null, 2072384);
                float A = com.bumptech.glide.d.A(eo1.c.space_400, sVar2);
                sVar2.W(924379469);
                n4.e eVar = jVar.f120955i;
                float A2 = eVar == null ? com.bumptech.glide.d.A(eo1.c.space_600, sVar2) : eVar.f89175a;
                sVar2.r(false);
                dl2.b.c(aVar, androidx.compose.foundation.layout.b.r(nVar, A, A2, com.bumptech.glide.d.A(eo1.c.space_400, sVar2), 0.0f, 8), null, new t80.r(2, function1, jVar), sVar2, 8, 4);
                if (!jVar.f120953g.f120938b.isEmpty()) {
                    androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.e.f17184c, u2.b.f120017e, false, q2.i.c(-1888277295, new k1.n1(7, jVar, kVar), sVar2), sVar2, 3126, 4);
                }
                sVar2.r(true);
                if (jVar.f120957k != null) {
                    rl2.g0.b(new yl1.b(jVar.f120957k, false, null, null, yl1.d.TERTIARY.getColorPalette(), yl1.c.SMALL, null, null, 0, yl1.e.FULL_WIDTH, 462), androidx.compose.foundation.layout.e.b(androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.c.f17179a.a(nVar, u2.b.f120020h), com.bumptech.glide.d.A(eo1.c.space_400, sVar2)), 1.0f), null, sVar2, 8, 4);
                    return;
                }
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
                n4.e a14 = new n4.e(BoxWithConstraints.d());
                n4.e b13 = new n4.e(BoxWithConstraints.c() * 0.5f);
                Intrinsics.checkNotNullParameter(a14, "a");
                Intrinsics.checkNotNullParameter(b13, "b");
                if (a14.compareTo(b13) > 0) {
                    a14 = b13;
                }
                u80.k kVar2 = (u80.k) obj3;
                float f13 = a14.f89175a * kVar2.f120959b;
                float d2 = (BoxWithConstraints.d() - f13) / 2;
                p1.g gVar3 = p1.l.f98543a;
                rl2.g0.g(null, null, androidx.compose.foundation.layout.b.c(d2, d2, 0.0f, 10), false, p1.l.g(com.bumptech.glide.d.A(eo1.c.space_600, oVar)), null, null, false, new n1.j((t80.d) obj2, (Function1) obj, kVar2, f13), oVar, 0, RecyclerViewTypes.VIEW_TYPE_SHARESHEET_CONTACT);
                return;
        }
    }

    public final void e(i1.m0 AnimatedVisibility, i2.o oVar) {
        Object obj = i2.n.f71185a;
        u2.n nVar = u2.n.f120041b;
        int i13 = this.f24573i;
        Object obj2 = this.f24576l;
        Object obj3 = this.f24575k;
        Object obj4 = this.f24574j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                w80.d1 d1Var = ((s80.j) obj4).f111597f;
                do2.b2 b2Var = (do2.b2) obj3;
                u2.q j13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f).j(kh2.b0.y1(oVar));
                i2.s sVar = (i2.s) oVar;
                sVar.W(1661310053);
                Function1 function1 = (Function1) obj2;
                boolean h10 = sVar.h(function1);
                Object J2 = sVar.J();
                if (h10 || J2 == obj) {
                    J2 = jq.b.o(7, function1, sVar);
                }
                sVar.r(false);
                w80.d0.a(d1Var, b2Var, j13, 0.0f, (Function0) J2, sVar, 64, 8);
                break;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                w80.x1 x1Var = ((s80.j) obj4).f111593b;
                u2.q j14 = androidx.compose.foundation.layout.e.b(nVar, 1.0f).j(kh2.b0.y1(oVar));
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-861802488);
                Function1 function12 = (Function1) obj3;
                boolean h13 = sVar2.h(function12);
                Object J3 = sVar2.J();
                if (h13 || J3 == obj) {
                    J3 = jq.b.o(8, function12, sVar2);
                }
                Function0 function0 = (Function0) J3;
                sVar2.r(false);
                sVar2.W(-861800793);
                boolean h14 = sVar2.h(function12);
                Object J4 = sVar2.J();
                if (h14 || J4 == obj) {
                    J4 = jq.b.o(9, function12, sVar2);
                }
                Function0 function02 = (Function0) J4;
                sVar2.r(false);
                sVar2.W(-861799129);
                boolean h15 = sVar2.h(function12);
                Object J5 = sVar2.J();
                if (h15 || J5 == obj) {
                    J5 = jq.b.o(10, function12, sVar2);
                }
                Function0 function03 = (Function0) J5;
                sVar2.r(false);
                sVar2.W(-861797465);
                boolean h16 = sVar2.h(function12);
                Object J6 = sVar2.J();
                if (h16 || J6 == obj) {
                    J6 = jq.b.o(11, function12, sVar2);
                }
                Function0 function04 = (Function0) J6;
                sVar2.r(false);
                sVar2.W(-861795801);
                boolean h17 = sVar2.h(function12);
                Object J7 = sVar2.J();
                if (h17 || J7 == obj) {
                    J7 = jq.b.o(12, function12, sVar2);
                }
                sVar2.r(false);
                w80.a1.c(x1Var, j14, null, 0.0f, function0, function02, function03, function04, (Function0) J7, (Function1) obj2, sVar2, 8, 12);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(p1.f1 f1Var, i2.o oVar, int i13) {
        int i14;
        boolean z13;
        u2.q b13;
        int i15;
        p1.f1 BottomNavigation = f1Var;
        int i16 = this.f24573i;
        int i17 = 1;
        Object obj = this.f24576l;
        Object obj2 = this.f24575k;
        int i18 = 0;
        Object obj3 = this.f24574j;
        switch (i16) {
            case 0:
                if ((((i13 & 6) == 0 ? i13 | (((i2.s) oVar).h(BottomNavigation) ? 4 : 2) : i13) & 19) == 18) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                Function2 function2 = (Function2) obj3;
                u2.h hVar = u2.b.f120023k;
                if (function2 == null) {
                    i2.s sVar2 = (i2.s) oVar;
                    sVar2.W(1108907693);
                    androidx.compose.foundation.layout.a.a(e0.f24657c, sVar2);
                    i14 = 0;
                    sVar2.r(false);
                    z13 = true;
                } else {
                    i14 = 0;
                    i2.s sVar3 = (i2.s) oVar;
                    sVar3.W(1108973289);
                    u2.q qVar = e0.f24658d;
                    p1.e1 a13 = p1.c1.a(p1.l.f98543a, hVar, sVar3, 48);
                    int i19 = sVar3.P;
                    i2.z1 o13 = sVar3.o();
                    u2.q X = ao2.m0.X(sVar3, qVar);
                    s3.k.Qo.getClass();
                    s3.i iVar = s3.j.f110798b;
                    if (!(sVar3.f71265a instanceof i2.f)) {
                        com.bumptech.glide.c.j0();
                        throw null;
                    }
                    sVar3.a0();
                    if (sVar3.O) {
                        sVar3.n(iVar);
                    } else {
                        sVar3.j0();
                    }
                    tb.f.f0(sVar3, a13, s3.j.f110801e);
                    tb.f.f0(sVar3, o13, s3.j.f110800d);
                    s3.h hVar2 = s3.j.f110802f;
                    if (sVar3.O || !Intrinsics.d(sVar3.J(), Integer.valueOf(i19))) {
                        ep.b.y(i19, sVar3, i19, hVar2);
                    }
                    tb.f.f0(sVar3, X, s3.j.f110799c);
                    i2.u0 u0Var = b1.f24558a;
                    long j13 = ((b3.w) sVar3.m(c1.f24577a)).f21392a;
                    com.bumptech.glide.d.a(u0Var.c(Float.valueOf((!((s0) sVar3.m(u0.f25271a)).f() ? ((double) androidx.compose.ui.graphics.a.q(j13)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j13)) > 0.5d) ? 0.87f : 1.0f)), function2, sVar3, 8);
                    z13 = true;
                    sVar3.r(true);
                    sVar3.r(false);
                }
                b13 = ((p1.g1) BottomNavigation).b(androidx.compose.foundation.layout.e.f17183b, 1.0f, true);
                Function2 function22 = (Function2) obj2;
                p1.e1 a14 = p1.c1.a(p1.l.f98543a, hVar, oVar, 48);
                i2.s sVar4 = (i2.s) oVar;
                int i23 = sVar4.P;
                i2.z1 o14 = sVar4.o();
                u2.q X2 = ao2.m0.X(oVar, b13);
                s3.k.Qo.getClass();
                s3.i iVar2 = s3.j.f110798b;
                if (!(sVar4.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar4.a0();
                if (sVar4.O) {
                    sVar4.n(iVar2);
                } else {
                    sVar4.j0();
                }
                tb.f.f0(oVar, a14, s3.j.f110801e);
                tb.f.f0(oVar, o14, s3.j.f110800d);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar4.O || !Intrinsics.d(sVar4.J(), Integer.valueOf(i23))) {
                    ep.b.y(i23, sVar4, i23, hVar3);
                }
                tb.f.f0(oVar, X2, s3.j.f110799c);
                i2.s sVar5 = (i2.s) oVar;
                d6.a(((e6) sVar5.m(f6.f24738b)).f24707f, q2.i.c(-1654084516, new a0(function22, i14), oVar), oVar, 48);
                sVar4.r(z13);
                i2.u0 u0Var2 = b1.f24558a;
                long j14 = ((b3.w) sVar5.m(c1.f24577a)).f21392a;
                com.bumptech.glide.d.a(u0Var2.c(Float.valueOf((!((s0) sVar5.m(u0.f25271a)).f() ? ((double) androidx.compose.ui.graphics.a.q(j14)) < 0.5d : ((double) androidx.compose.ui.graphics.a.q(j14)) > 0.5d) ? 0.6f : 0.74f)), q2.i.c(2129753671, new b0(i14, (kl2.l) obj), oVar), oVar, 56);
                return;
            default:
                Intrinsics.checkNotNullParameter(BottomNavigation, "$this$BottomNavigation");
                int i24 = (i13 & 14) == 0 ? i13 | (((i2.s) oVar).h(BottomNavigation) ? 4 : 2) : i13;
                if ((i24 & 91) == 18) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        return;
                    }
                }
                i2.s sVar7 = (i2.s) oVar;
                sVar7.X(-120375203);
                i2.q1 y13 = bs1.c.y(((z9.e0) obj3).E, null, null, sVar7, 56, 2);
                sVar7.r(false);
                z9.k kVar = (z9.k) y13.getValue();
                z9.z zVar = kVar != null ? kVar.f141211b : null;
                Object J2 = sVar7.J();
                if (J2 == i2.n.f71185a) {
                    i2.e0 e0Var = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar7));
                    sVar7.g0(e0Var);
                    J2 = e0Var;
                }
                ao2.j0 j0Var = ((i2.e0) J2).f71100a;
                do2.j jVar = (do2.j) obj;
                for (tc0.m0 m0Var : (List) obj2) {
                    if (zVar != null) {
                        int i25 = z9.z.f141321j;
                        Sequence m03 = g4.u.m0(zVar);
                        if (m03 != null) {
                            Iterator it = m03.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.d(((z9.z) it.next()).f141330i, m0Var.f117287a.f103517a)) {
                                    i15 = i17;
                                    i2.s sVar8 = sVar7;
                                    o0.c(f1Var, i15, new k1.q(j0Var, jVar, m0Var, 17), q2.i.c(-921868656, new tc0.b(m0Var, i18), sVar7), null, false, q2.i.c(-1893893805, new tc0.b(m0Var, i17), sVar7), false, null, 0L, 0L, sVar8, (i24 & 14) | 1575936, 0, 984);
                                    BottomNavigation = BottomNavigation;
                                    j0Var = j0Var;
                                    sVar7 = sVar8;
                                    jVar = jVar;
                                    i17 = 1;
                                    i18 = 0;
                                }
                            }
                        }
                    }
                    i15 = i18;
                    i2.s sVar82 = sVar7;
                    o0.c(f1Var, i15, new k1.q(j0Var, jVar, m0Var, 17), q2.i.c(-921868656, new tc0.b(m0Var, i18), sVar7), null, false, q2.i.c(-1893893805, new tc0.b(m0Var, i17), sVar7), false, null, 0L, 0L, sVar82, (i24 & 14) | 1575936, 0, 984);
                    BottomNavigation = BottomNavigation;
                    j0Var = j0Var;
                    sVar7 = sVar82;
                    jVar = jVar;
                    i17 = 1;
                    i18 = 0;
                }
                return;
        }
    }

    public final void h(q1.c item, i2.o oVar, int i13) {
        int i14 = this.f24573i;
        Object obj = this.f24576l;
        Object obj2 = this.f24575k;
        Object obj3 = this.f24574j;
        switch (i14) {
            case 5:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                ca0.d dVar = (ca0.d) obj3;
                n72.m mVar = (n72.m) obj;
                ca0.n0.e(dVar.f27090i, dVar.f27083b, dVar.f27084c, (com.pinterest.shuffles.scene.composer.z0) obj2, mVar, null, oVar, 37440, 32);
                break;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i13 & 81) == 16) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                i2.v3 v3Var = (i2.v3) obj3;
                kh2.j.i(((uc0.l0) v3Var.getValue()).f121818e.f121793a.f121802a, (String) ((i2.v3) obj2).getValue(), new tc0.q(((uc0.l0) v3Var.getValue()).f121818e.f121793a, 2), ((uc0.l0) v3Var.getValue()).f121818e.f121794b.f121802a, (String) ((i2.v3) obj).getValue(), null, new tc0.q(((uc0.l0) v3Var.getValue()).f121818e.f121794b, 3), oVar, 0, 32);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24573i) {
            case 0:
                f((p1.f1) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 1:
                ((Number) obj3).intValue();
                e((i1.m0) obj, (i2.o) obj2);
                break;
            case 2:
                ((Number) obj3).intValue();
                e((i1.m0) obj, (i2.o) obj2);
                break;
            case 3:
                b((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 4:
                b((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 5:
                h((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            case 6:
                f((p1.f1) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            default:
                h((q1.c) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
