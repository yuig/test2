package i1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.graphics.RectF;
import android.view.View;
import c2.d6;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.collage.cutoutpicker.browse.components.CutoutPickerCarouselView;
import com.pinterest.collage.cutoutpicker.closeup.components.CloseupMetadataSectionView;
import com.pinterest.collage.effects.components.EffectCategoryTabView;
import com.pinterest.collage.effects.components.EffectToolView;
import com.pinterest.collage.remix.closeup.components.RemixCollageView;
import com.pinterest.collage.remix.closeup.components.TemplateCollageView;
import com.pinterest.collage.remix.components.CollageRemixCarouselView;
import com.pinterest.collage.remix.components.CollageTemplateCarouselView;
import com.pinterest.collagesCoreLibrary.components.ColorPickerCellView;
import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import java.util.Iterator;
import kh2.g3;
import kh2.k3;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1.e2;
import m1.g2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70795i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, int i13) {
        super(2);
        this.f70795i = i13;
        this.f70796j = obj;
    }

    public final void b(i2.o oVar, int i13) {
        u2.n nVar = u2.n.f120041b;
        int i14 = this.f70795i;
        int i15 = 3;
        Object obj = this.f70796j;
        switch (i14) {
            case 13:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                kh2.n.e(((u80.h) obj).f120942b, null, oVar, 8, 2);
                break;
            case 14:
            case 25:
            case 26:
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                EffectSliderView effectSliderView = (EffectSliderView) obj;
                int i16 = EffectSliderView.f44674l;
                k3.j((va0.j) effectSliderView.f44675h.getValue(), null, new ra0.l0(effectSliderView, i15), new lr.v(effectSliderView, 25), (Function1) effectSliderView.f44676i.getValue(), (Function1) effectSliderView.f44677j.getValue(), oVar, 0, 2);
                break;
            case 15:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                CutoutPickerCarouselView cutoutPickerCarouselView = (CutoutPickerCarouselView) obj;
                n90.l.b((n90.c) cutoutPickerCarouselView.f44623h.getValue(), null, null, (Function1) cutoutPickerCarouselView.f44624i.getValue(), oVar, 8, 6);
                break;
            case 16:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                kh2.b0.d((q90.b) ((CloseupMetadataSectionView) obj).f44625h.getValue(), null, oVar, 8, 2);
                break;
            case 17:
                if ((i13 & 11) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                kh2.s0.s(((z90.d) obj).f141346b, null, oVar, 8, 2);
                break;
            case 18:
                if ((i13 & 11) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        break;
                    }
                }
                EffectCategoryTabView effectCategoryTabView = (EffectCategoryTabView) obj;
                int i17 = EffectCategoryTabView.f44645j;
                kh2.s0.e((z90.d) effectCategoryTabView.f44646h.getValue(), null, effectCategoryTabView.f44647i, oVar, 8, 2);
                break;
            case 19:
                if ((i13 & 11) == 2) {
                    i2.s sVar7 = (i2.s) oVar;
                    if (sVar7.z()) {
                        sVar7.Q();
                        break;
                    }
                }
                EffectToolView effectToolView = (EffectToolView) obj;
                kh2.a1.c((z90.g) effectToolView.f44648h.getValue(), androidx.compose.foundation.layout.e.p(nVar, null, 3), effectToolView.f44649i, oVar, 56, 0);
                break;
            case 20:
                if ((i13 & 11) == 2) {
                    i2.s sVar8 = (i2.s) oVar;
                    if (sVar8.z()) {
                        sVar8.Q();
                        break;
                    }
                }
                ca0.c cVar = (ca0.c) obj;
                if (!(cVar instanceof ca0.a)) {
                    i2.s sVar9 = (i2.s) oVar;
                    sVar9.W(877734118);
                    ve.h.a(new rm1.d(new rm1.f(rm1.q.PERSON), null, null, 0, null, 30), null, null, sVar9, 8, 6);
                    sVar9.r(false);
                    break;
                } else {
                    i2.s sVar10 = (i2.s) oVar;
                    sVar10.W(877507415);
                    String str = ((ca0.a) cVar).f27062c;
                    if (str != null) {
                        dl2.b.f(str, null, null, null, sVar10, 0, 14);
                    }
                    sVar10.r(false);
                    break;
                }
            case 21:
                if ((i13 & 11) == 2) {
                    i2.s sVar11 = (i2.s) oVar;
                    if (sVar11.z()) {
                        sVar11.Q();
                        break;
                    }
                }
                RemixCollageView remixCollageView = (RemixCollageView) obj;
                kh2.j1.m((ga0.i) remixCollageView.f44651h.getValue(), androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(nVar, 1.0f)), 0.0f, (Function0) remixCollageView.f44652i.getValue(), oVar, 56, 4);
                break;
            case 22:
                if ((i13 & 11) == 2) {
                    i2.s sVar12 = (i2.s) oVar;
                    if (sVar12.z()) {
                        sVar12.Q();
                        break;
                    }
                }
                TemplateCollageView templateCollageView = (TemplateCollageView) obj;
                g3.h((ga0.i) templateCollageView.f44653h.getValue(), androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(nVar, 1.0f)), 0.0f, (Function0) templateCollageView.f44654i.getValue(), (Function0) templateCollageView.f44655j.getValue(), oVar, 56, 4);
                break;
            case 23:
                if ((i13 & 11) == 2) {
                    i2.s sVar13 = (i2.s) oVar;
                    if (sVar13.z()) {
                        sVar13.Q();
                        break;
                    }
                }
                CollageRemixCarouselView collageRemixCarouselView = (CollageRemixCarouselView) obj;
                ia0.l.d((ia0.m) collageRemixCarouselView.f44656h.getValue(), null, (Function1) collageRemixCarouselView.f44657i.getValue(), oVar, 8, 2);
                break;
            case 24:
                if ((i13 & 11) == 2) {
                    i2.s sVar14 = (i2.s) oVar;
                    if (sVar14.z()) {
                        sVar14.Q();
                        break;
                    }
                }
                CollageTemplateCarouselView collageTemplateCarouselView = (CollageTemplateCarouselView) obj;
                ia0.z.a((ia0.m) collageTemplateCarouselView.f44658h.getValue(), null, (Function1) collageTemplateCarouselView.f44659i.getValue(), (Function1) collageTemplateCarouselView.f44660j.getValue(), oVar, 8, 2);
                break;
            case 27:
                if ((i13 & 11) == 2) {
                    i2.s sVar15 = (i2.s) oVar;
                    if (sVar15.z()) {
                        sVar15.Q();
                        break;
                    }
                }
                ColorPickerCellView colorPickerCellView = (ColorPickerCellView) obj;
                kh2.r.d((ra0.z) colorPickerCellView.f44671h.getValue(), ((Boolean) colorPickerCellView.f44672i.getValue()).booleanValue(), null, colorPickerCellView.f44673j, null, false, oVar, 0, 52);
                break;
            case 28:
                if ((i13 & 11) == 2) {
                    i2.s sVar16 = (i2.s) oVar;
                    if (sVar16.z()) {
                        sVar16.Q();
                        break;
                    }
                }
                u50.i0 i0Var = (u50.i0) obj;
                if (!Intrinsics.d(i0Var, u50.h0.f120562a)) {
                    d6.b(dl2.b.u2(i0Var, oVar).toString(), null, kh2.g0.h(eo1.b.color_themed_text_subtle, oVar), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((fc0.a) ((i2.s) oVar).m(fc0.c.f61692i)).f61679c.f86908e, oVar, 0, 0, 65530);
                    break;
                }
                break;
        }
    }

    public final void e(Integer num, String collageId) {
        int i13 = this.f70795i;
        Object obj = this.f70796j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                com.pinterest.boardAutoCollages.q qVar = (com.pinterest.boardAutoCollages.q) obj;
                int i14 = com.pinterest.boardAutoCollages.q.T0;
                kh2.j.x2(qVar.k9(), new com.pinterest.boardAutoCollages.h(collageId, (String) qVar.O0.getValue(), num));
                break;
            default:
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                int i15 = la0.f0.V0;
                kh2.j.x2(((la0.f0) obj).l9(), new la0.k(collageId, num));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean f13;
        xa0.l lVar;
        int i13 = this.f70795i;
        boolean z13 = true;
        Object obj3 = null;
        int i14 = 0;
        Object obj4 = this.f70796j;
        switch (i13) {
            case 0:
                w0 w0Var = (w0) obj;
                w0 w0Var2 = (w0) obj2;
                w0 w0Var3 = w0.PostExit;
                break;
            case 1:
                g2 g2Var = (g2) obj4;
                kotlin.jvm.internal.j.z(g2Var.z0(), null, null, new e2(g2Var, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), null), 3);
                break;
            case 2:
                break;
            case 3:
                s1.o0 o0Var = (s1.o0) obj4;
                o0Var.f110508r.i(o0Var.k(((Number) obj2).intValue()));
                break;
            case 4:
                ((Number) obj2).longValue();
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj4);
                i2.u0 u0Var = b2.l0.f21174a;
                break;
            case 5:
                ((Number) obj2).intValue();
                i2.s sVar = (i2.s) ((i2.o) obj);
                sVar.W(-1451087197);
                String resolvedString = ((w1.w1) obj4).resolvedString(sVar, 0);
                sVar.r(false);
                break;
            case 6:
                ((w1.y1) obj4).e(((a3.c) obj2).f482a);
                break;
            case 7:
                a3.d P0 = n3.P0((RectF) obj);
                a3.d P02 = n3.P0((RectF) obj2);
                switch (((a.e) ((b4.j0) obj4)).f33a) {
                    case 2:
                        f13 = P0.f(P02);
                        break;
                    default:
                        f13 = P02.a(P0.b());
                        break;
                }
                break;
            case 8:
                break;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                int i15 = ns.r.f91954c1;
                kh2.j.x2(((ns.r) obj4).b9(), new ns.d(booleanValue, booleanValue2));
                break;
            case 10:
                dl1.s model = (dl1.s) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(model, "model");
                vh vhVar = (vh) model;
                bx0.z zVar = bx0.z.FOCUS;
                u60.m mVar = (u60.m) obj4;
                h32.w0 e13 = mVar.R.e();
                if (e13 == null || (r0 = e13.G) == null) {
                    String str = "";
                }
                break;
            case 11:
                View view = (View) obj;
                ba section = (ba) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(section, "section");
                u60.x xVar = (u60.x) obj4;
                xVar.getClass();
                v7 u13 = section.u();
                if (u13 != null && kh2.w.i0(u13)) {
                    xVar.S.d(new m10.c(view, section));
                }
                break;
            case 12:
                e((Integer) obj2, (String) obj);
                break;
            case 13:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 14:
                g90.e0 swipeType = (g90.e0) obj;
                Intrinsics.checkNotNullParameter(swipeType, "swipeType");
                g90.d dVar = new g90.d(swipeType, (String) obj2);
                int i16 = g90.n.f64537w0;
                kh2.j.x2((g90.c0) ((g90.n) obj4).f64548q0.getValue(), dVar);
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
                e((Integer) obj2, (String) obj);
                break;
            case 26:
                l82.e createLens = (l82.e) obj;
                l82.c0 subResult = (l82.c0) obj2;
                Intrinsics.checkNotNullParameter(createLens, "$this$createLens");
                Intrinsics.checkNotNullParameter(subResult, "subResult");
                la0.k1 k1Var = (la0.k1) obj4;
                x31.p pVar = (x31.p) subResult.f82213b;
                k1Var.getClass();
                Iterator it = ph.a.F0(pVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((x31.a) next) instanceof la0.e) {
                            obj3 = next;
                        }
                    }
                }
                x31.a aVar = (x31.a) obj3;
                if (aVar == null || (lVar = ((la0.e) aVar).b()) == null) {
                    lVar = xa0.l.ALL;
                }
                if (((x31.p) subResult.f82213b).f131643i) {
                    createLens.f(new la0.a1(subResult, lVar, i14));
                } else {
                    createLens.f(new la0.a1(subResult, lVar, z13 ? 1 : 0));
                }
                d7.g.y(subResult, 25, createLens);
                la0.m1 m1Var = (la0.m1) createLens.f82219b;
                if (lVar == m1Var.f82428a) {
                    createLens.h(new s90.i0(subResult, 19));
                } else {
                    createLens.h(new sv.y(subResult, xa0.j.n(lVar, m1Var.f82429b), lVar, 11));
                    o82.g0[] g0VarArr = {new o82.b0(true)};
                    l82.h0 h0Var = k1Var.f82417b;
                    bk.f.I(createLens, h0Var, g0VarArr);
                    bk.f.I(createLens, h0Var, o82.d0.f93560a);
                }
                break;
            case 27:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 28:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
