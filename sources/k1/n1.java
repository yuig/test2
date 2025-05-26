package k1;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import c2.d6;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import i2.v3;
import i2.y3;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s80.l3;
import s80.t6;
import s80.w6;

/* loaded from: classes2.dex */
public final class n1 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77943i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f77944j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f77945k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i13, Object obj, Object obj2) {
        super(3);
        this.f77943i = i13;
        this.f77944j = obj;
        this.f77945k = obj2;
    }

    public final u2.q b(u2.q qVar, i2.o oVar) {
        Object obj = i2.n.f71185a;
        int i13 = this.f77943i;
        Object obj2 = this.f77945k;
        Object obj3 = this.f77944j;
        switch (i13) {
            case 0:
                i2.s sVar = (i2.s) oVar;
                sVar.W(-353972293);
                l1 a13 = ((k1) obj3).a((o1.k) obj2, sVar);
                boolean h10 = sVar.h(a13);
                Object J2 = sVar.J();
                if (h10 || J2 == obj) {
                    J2 = new o1(a13);
                    sVar.g0(J2);
                }
                o1 o1Var = (o1) J2;
                sVar.r(false);
                return o1Var;
            case 1:
            default:
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(759876635);
                Function0 function0 = (Function0) obj3;
                j1.q qVar2 = b2.i0.f21164a;
                Object J3 = sVar2.J();
                if (J3 == obj) {
                    J3 = bs1.c.S(function0);
                    sVar2.g0(J3);
                }
                v3 v3Var = (v3) J3;
                Object J4 = sVar2.J();
                if (J4 == obj) {
                    J4 = new j1.d(new a3.c(((a3.c) v3Var.getValue()).f482a), b2.i0.f21165b, new a3.c(b2.i0.f21166c), 8);
                    sVar2.g0(J4);
                }
                j1.d dVar = (j1.d) J4;
                Unit unit = Unit.f80348a;
                boolean j13 = sVar2.j(dVar);
                Object J5 = sVar2.J();
                if (j13 || J5 == obj) {
                    J5 = new b2.h0(v3Var, dVar, null);
                    sVar2.g0(J5);
                }
                i2.u.e(unit, (Function2) J5, sVar2);
                j1.o oVar2 = dVar.f74028c;
                Function1 function1 = (Function1) obj2;
                boolean h13 = sVar2.h(oVar2);
                Object J6 = sVar2.J();
                if (h13 || J6 == obj) {
                    J6 = new q1.o(oVar2, 4);
                    sVar2.g0(J6);
                }
                u2.q qVar3 = (u2.q) function1.invoke((Function0) J6);
                sVar2.r(false);
                return qVar3;
            case 2:
                i2.s sVar3 = (i2.s) oVar;
                sVar3.W(-102778667);
                Object J7 = sVar3.J();
                if (J7 == obj) {
                    Object e0Var = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar3));
                    sVar3.g0(e0Var);
                    J7 = e0Var;
                }
                ao2.j0 j0Var = ((i2.e0) J7).f71100a;
                Object J8 = sVar3.J();
                if (J8 == obj) {
                    J8 = bs1.c.u1(null, y3.f71400a);
                    sVar3.g0(J8);
                }
                i2.q1 q1Var = (i2.q1) J8;
                i2.q1 K1 = bs1.c.K1((Function1) obj3, sVar3);
                o1.l lVar = (o1.l) obj2;
                boolean h14 = sVar3.h(lVar);
                Object J9 = sVar3.J();
                if (h14 || J9 == obj) {
                    J9 = new j1.x0(14, q1Var, lVar);
                    sVar3.g0(J9);
                }
                i2.u.b(lVar, (Function1) J9, sVar3);
                u2.n nVar = u2.n.f120041b;
                boolean j14 = sVar3.j(j0Var) | sVar3.h(lVar) | sVar3.h(K1);
                Object J10 = sVar3.J();
                if (j14 || J10 == obj) {
                    J10 = new w1.j2(j0Var, q1Var, lVar, K1, null);
                    sVar3.g0(J10);
                }
                u2.q a14 = n3.f0.a(nVar, lVar, (Function2) J10);
                sVar3.r(false);
                return a14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.J(), java.lang.Integer.valueOf(r13)) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.compose.foundation.layout.d r52, i2.o r53, int r54) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.n1.e(androidx.compose.foundation.layout.d, i2.o, int):void");
    }

    public final void f(i1.m0 AnimatedVisibility, i2.o oVar) {
        boolean z13;
        Object obj = i2.n.f71185a;
        u2.n nVar = u2.n.f120041b;
        int i13 = this.f77943i;
        int i14 = 1;
        Object obj2 = this.f77945k;
        Object obj3 = this.f77944j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                ra0.u uVar = ((t6) obj3).f111805a;
                u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                float f13 = ra0.h0.f106929a;
                ra0.v b14 = ra0.h0.b(androidx.compose.foundation.layout.b.b(com.bumptech.glide.d.A(eo1.c.space_200, oVar), 2), oVar, ra0.h0.f106945q << 15, 15);
                i2.s sVar = (i2.s) oVar;
                sVar.W(-1188073796);
                Function1 function1 = (Function1) obj2;
                boolean h10 = sVar.h(function1);
                Object J2 = sVar.J();
                if (h10 || J2 == obj) {
                    J2 = jq.b.o(6, function1, sVar);
                }
                Function0 function0 = (Function0) J2;
                sVar.r(false);
                sVar.W(-1188071790);
                boolean h13 = sVar.h(function1);
                Object J3 = sVar.J();
                if (h13 || J3 == obj) {
                    J3 = new i1.f1(16, function1);
                    sVar.g0(J3);
                }
                sVar.r(false);
                kh2.r.c(uVar, b13, function0, null, (Function1) J3, b14, sVar, 56, 8);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(284263324);
                Object J4 = sVar2.J();
                if (J4 == obj) {
                    J4 = d7.g.o(sVar2);
                }
                sVar2.r(false);
                u2.q d2 = androidx.compose.foundation.a.d(fillElement, (o1.l) J4, null, false, null, l3.f111658j, 24);
                w6 w6Var = (w6) obj3;
                Function1 function12 = (Function1) obj2;
                q3.p0 e13 = p1.q.e(u2.b.f120016d, false);
                int i15 = sVar2.P;
                i2.z1 o13 = sVar2.o();
                u2.q X = ao2.m0.X(sVar2, d2);
                s3.k.Qo.getClass();
                s3.i iVar = s3.j.f110798b;
                boolean z14 = sVar2.f71265a instanceof i2.f;
                if (!z14) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar2.a0();
                if (sVar2.O) {
                    sVar2.n(iVar);
                } else {
                    sVar2.j0();
                }
                s3.h hVar = s3.j.f110801e;
                tb.f.f0(sVar2, e13, hVar);
                s3.h hVar2 = s3.j.f110800d;
                tb.f.f0(sVar2, o13, hVar2);
                s3.h hVar3 = s3.j.f110802f;
                if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                    ep.b.y(i15, sVar2, i15, hVar3);
                }
                s3.h hVar4 = s3.j.f110799c;
                tb.f.f0(sVar2, X, hVar4);
                if (w6Var.f111841b == null) {
                    sVar2.W(-1938290810);
                    sVar2.W(-2140731867);
                    boolean h14 = sVar2.h(function12);
                    Object J5 = sVar2.J();
                    if (h14 || J5 == obj) {
                        J5 = new i1.f1(18, function12);
                        sVar2.g0(J5);
                    }
                    sVar2.r(false);
                    u80.u.a(w6Var.f111840a, null, (Function1) J5, null, sVar2, 8, 10);
                    sVar2.r(false);
                    z13 = true;
                } else {
                    sVar2.W(-1938056884);
                    float A = com.bumptech.glide.d.A(eo1.c.space_400, sVar2);
                    u2.q r13 = androidx.compose.foundation.layout.b.r(nVar, 0.0f, com.bumptech.glide.d.A(eo1.c.space_1100, sVar2) + A, 0.0f, 0.0f, 13);
                    p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar2, 0);
                    int i16 = sVar2.P;
                    i2.z1 o14 = sVar2.o();
                    u2.q X2 = ao2.m0.X(sVar2, r13);
                    if (!z14) {
                        com.bumptech.glide.c.j0();
                        throw null;
                    }
                    sVar2.a0();
                    if (sVar2.O) {
                        sVar2.n(iVar);
                    } else {
                        sVar2.j0();
                    }
                    tb.f.f0(sVar2, a13, hVar);
                    tb.f.f0(sVar2, o14, hVar2);
                    if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i16))) {
                        ep.b.y(i16, sVar2, i16, hVar3);
                    }
                    tb.f.f0(sVar2, X2, hVar4);
                    sVar2.W(-1690449916);
                    boolean h15 = sVar2.h(function12);
                    Object J6 = sVar2.J();
                    if (h15 || J6 == obj) {
                        J6 = new i1.f1(19, function12);
                        sVar2.g0(J6);
                    }
                    sVar2.r(false);
                    u80.u.a(w6Var.f111840a, null, (Function1) J6, null, sVar2, 8, 10);
                    androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, A), sVar2);
                    yl1.g colorPalette = yl1.d.ALWAYS_LIGHT.getColorPalette();
                    int i17 = eo1.b.color_themed_text_dark;
                    int i18 = colorPalette.f139324a;
                    colorPalette.getClass();
                    yl1.b bVar = new yl1.b(w6Var.f111841b, false, null, null, new yl1.g(i18, i17), yl1.c.SMALL, null, null, 0, null, 974);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(u2.b.f120026n);
                    sVar2.W(-1690428626);
                    boolean h16 = sVar2.h(function12);
                    Object J7 = sVar2.J();
                    if (h16 || J7 == obj) {
                        J7 = new i1.f1(20, function12);
                        sVar2.g0(J7);
                    }
                    sVar2.r(false);
                    rl2.g0.b(bVar, horizontalAlignElement, (Function1) J7, sVar2, 8, 0);
                    z13 = true;
                    sVar2.r(true);
                    sVar2.r(false);
                }
                sVar2.r(z13);
                return;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                s80.j jVar = (s80.j) obj2;
                androidx.compose.ui.viewinterop.a.a(new t80.r(3, (IdeaPinHandDrawingEditor) obj3, jVar), null, new w80.i0(jVar, i14), oVar, 0, 2);
                return;
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u2.q b13;
        u2.n nVar = u2.n.f120041b;
        int i13 = this.f77943i;
        Object obj4 = this.f77945k;
        Object obj5 = this.f77944j;
        switch (i13) {
            case 0:
                ((Number) obj3).intValue();
                return b((u2.q) obj, (i2.o) obj2);
            case 1:
                i2.o oVar = (i2.o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return Unit.f80348a;
                    }
                }
                i2.s sVar2 = (i2.s) oVar;
                Object J2 = sVar2.J();
                if (J2 == i2.n.f71185a) {
                    J2 = new l1.j();
                    sVar2.g0(J2);
                }
                l1.j jVar = (l1.j) J2;
                jVar.f81336a.clear();
                ((Function1) obj5).invoke(jVar);
                jVar.a((l1.c) obj4, sVar2, 0);
                return Unit.f80348a;
            case 2:
                ((Number) obj3).intValue();
                return b((u2.q) obj, (i2.o) obj2);
            case 3:
                ((Number) obj3).intValue();
                return b((u2.q) obj, (i2.o) obj2);
            case 4:
                b4.g0 g0Var = (b4.g0) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) obj5;
                kl2.m mVar = (kl2.m) obj4;
                g4.e eVar = g0Var.f21580f;
                g4.l lVar = g0Var.f21577c;
                if (lVar == null) {
                    lVar = g4.l.f63469d;
                }
                g4.j jVar2 = g0Var.f21578d;
                g4.j jVar3 = new g4.j(jVar2 != null ? jVar2.f63465a : 0);
                g4.k kVar = g0Var.f21579e;
                spannable.setSpan(new e4.m((Typeface) mVar.c(eVar, lVar, jVar3, new g4.k(kVar != null ? kVar.f63466a : 1))), intValue, intValue2, 33);
                return Unit.f80348a;
            case 5:
                ((Number) obj3).intValue();
                f((i1.m0) obj, (i2.o) obj2);
                return Unit.f80348a;
            case 6:
                ((Number) obj3).intValue();
                f((i1.m0) obj, (i2.o) obj2);
                return Unit.f80348a;
            case 7:
                e((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                return Unit.f80348a;
            case 8:
                ((Number) obj3).intValue();
                f((i1.m0) obj, (i2.o) obj2);
                return Unit.f80348a;
            case 9:
                e((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                return Unit.f80348a;
            case 10:
                p1.f1 f1Var = (p1.f1) obj;
                i2.o oVar2 = (i2.o) obj2;
                int intValue3 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(f1Var, "$this$null");
                if ((intValue3 & 14) == 0) {
                    intValue3 |= ((i2.s) oVar2).h(f1Var) ? 4 : 2;
                }
                if ((intValue3 & 91) == 18) {
                    i2.s sVar3 = (i2.s) oVar2;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return Unit.f80348a;
                    }
                }
                b13 = ((p1.g1) f1Var).b(nVar, 1.0f, true);
                i2.s sVar4 = (i2.s) oVar2;
                d6.c((b4.g) obj5, androidx.compose.foundation.layout.b.p(b13, com.bumptech.glide.d.A(eo1.c.toolbar_general_h_padding_dp, oVar2), 0.0f, 2), 0L, 0L, null, null, null, 0L, null, new m4.j(3), 0L, 2, false, 2, 0, null, null, b4.q0.a(0, 16777214, ((nc0.e) obj4).f90370b, 0L, 0L, 0L, null, ((fc0.a) sVar4.m(fc0.c.f61692i)).f61677a, null, null, null), sVar4, 0, 3120, 120316);
                return Unit.f80348a;
            case 11:
                i2.o oVar3 = (i2.o) obj2;
                int intValue4 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter((q1.c) obj, "$this$item");
                if ((intValue4 & 81) == 16) {
                    i2.s sVar5 = (i2.s) oVar3;
                    if (sVar5.z()) {
                        sVar5.Q();
                        return Unit.f80348a;
                    }
                }
                androidx.compose.ui.viewinterop.a.a(new tc0.t((String) obj5, (uc0.p0) obj4), androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, oVar3, 48, 4);
                return Unit.f80348a;
            case 12:
                p1.u uVar = (p1.u) obj;
                i2.o oVar4 = (i2.o) obj2;
                int intValue5 = ((Number) obj3).intValue();
                Intrinsics.checkNotNullParameter(uVar, "$this$null");
                if ((intValue5 & 14) == 0) {
                    intValue5 |= ((i2.s) oVar4).h(uVar) ? 4 : 2;
                }
                if ((intValue5 & 91) == 18) {
                    i2.s sVar6 = (i2.s) oVar4;
                    if (sVar6.z()) {
                        sVar6.Q();
                        return Unit.f80348a;
                    }
                }
                om0.o1.f((om0.q1) ((om0.t1) obj5).f96600c, uVar.b(nVar), 0L, (Function0) obj4, oVar4, 8, 4);
                return Unit.f80348a;
            case 13:
                e((androidx.compose.foundation.layout.d) obj, (i2.o) obj2, ((Number) obj3).intValue());
                return Unit.f80348a;
            case 14:
                va1.m1 item = (va1.m1) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter((GestaltSwitch) obj3, "<anonymous parameter 2>");
                if (item instanceof va1.q0) {
                    u50.r rVar = ((eb1.b) obj5).f58225f;
                    if (rVar == null) {
                        Intrinsics.r("eventIntake");
                        throw null;
                    }
                    rVar.a(new com.pinterest.feature.settings.notifications.z((com.pinterest.feature.settings.notifications.c1) obj4, booleanValue));
                }
                return Unit.f80348a;
            default:
                ((Number) obj).intValue();
                ((ByteBuffer) obj5).put(((it1.a) obj4).f73674a, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                return Unit.f80348a;
        }
    }
}
