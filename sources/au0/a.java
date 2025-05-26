package au0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.fragment.app.FragmentActivity;
import bk.l;
import bk.m;
import bk.o;
import com.pinterest.feature.ideaPinCreation.closeup.view.m0;
import com.pinterest.feature.ideaPinCreation.closeup.view.w2;
import com.pinterest.feature.ideaPinCreation.closeup.view.x0;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinInteractiveFrameLayout;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingEditor;
import com.pinterest.feature.ideaPinCreation.interesttagging.view.PinInterestTagView;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataLegalDisclaimerView;
import com.pinterest.feature.pear.ui.PearStyleHeaderDisplayView;
import com.pinterest.feature.pear.ui.PearStyleHeaderScreenshotView;
import com.pinterest.feature.pearlibrary.view.PearStyleTagsScrollView;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFilterRepView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import i32.y0;
import kh2.s0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.h2;
import lh0.z3;
import qv0.u;
import qv0.z;
import x02.l2;
import yy0.n;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20468i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20469j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(0);
        this.f20468i = i13;
        this.f20469j = obj;
    }

    public final Float b() {
        int i13 = this.f20468i;
        Object obj = this.f20469j;
        switch (i13) {
            case 1:
                return Float.valueOf(r1.getResources().getDimensionPixelSize(((m0) obj).f46233a == a42.c.DEFAULT ? aq1.b.idea_pin_board_sticker_image_radius_default : aq1.b.idea_pin_board_sticker_image_radius_compact));
            case 2:
                return Float.valueOf(((x0) obj).getResources().getDimensionPixelSize(aq1.b.idea_pin_board_sticker_image_radius_default));
            default:
                return Float.valueOf(((u) obj).getResources().getDimensionPixelSize(aq1.b.idea_pin_board_sticker_button_image_radius));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f20468i;
        Object obj = this.f20469j;
        switch (i13) {
            case 16:
                h2 h2Var = ((px0.i) obj).f101609d;
                h2Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) h2Var.f83382a;
                return Boolean.valueOf(g1Var.o("sg_android_inbox_more_invite_ctas", "enabled", z3Var) || g1Var.l("sg_android_inbox_more_invite_ctas"));
            case 28:
                w01.c cVar = (w01.c) obj;
                if (cVar.f126981f.w() && !cVar.f126981f.f()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                w01.d dVar = (w01.d) obj;
                if (dVar.f126989d.w() && !dVar.f126989d.f()) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        y0 placement;
        int i13 = this.f20468i;
        byte b13 = 0;
        Object obj = this.f20469j;
        switch (i13) {
            case 0:
                m45invoke();
                return Unit.f80348a;
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                Paint paint = new Paint(1);
                paint.setColor(dl2.b.x0((Context) ((w2) obj).f46361b, eo1.a.color_yellow_caramellow_300));
                return paint;
            case 4:
                IdeaPinInteractiveFrameLayout ideaPinInteractiveFrameLayout = (IdeaPinInteractiveFrameLayout) obj;
                return new q5.j(ideaPinInteractiveFrameLayout.getContext(), new c1.a(ideaPinInteractiveFrameLayout, 4));
            case 5:
                IdeaPinHandDrawingEditor ideaPinHandDrawingEditor = (IdeaPinHandDrawingEditor) obj;
                return Integer.valueOf(((Number) ideaPinHandDrawingEditor.f46500r.getValue()).intValue() - ((Number) ideaPinHandDrawingEditor.f46501s.getValue()).intValue());
            case 6:
                return new PinInterestTagView(((zu0.g) obj).requireContext());
            case 7:
                return (GestaltText) ((MetadataLegalDisclaimerView) obj).findViewById(aq1.d.metadata_legal_disclaimer_text);
            case 8:
                m45invoke();
                return Unit.f80348a;
            case 9:
                m45invoke();
                return Unit.f80348a;
            case 10:
                m45invoke();
                return Unit.f80348a;
            case 11:
                return b();
            case 12:
                TextPaint textPaint = new TextPaint();
                wk2.a aVar = ((z) obj).f105228e;
                if (aVar != null) {
                    Object obj2 = aVar.get();
                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    Typeface d2 = ((zf1.e) obj2).d(zf1.f.REGULAR_ITALIC);
                    if (d2 == null) {
                        d2 = Typeface.DEFAULT;
                    }
                    textPaint.setTypeface(Typeface.create(d2, 2));
                    return textPaint;
                }
                Intrinsics.r("fontManagerProvider");
                throw null;
            case 13:
                wp0.d[] dVarArr = new wp0.d[1];
                tv0.e eVar = (tv0.e) obj;
                l2 l2Var = eVar.Y;
                if (l2Var != null) {
                    dVarArr[0] = new wp0.d(l2Var, eVar.getF119531o0());
                    return f0.l(dVarArr);
                }
                Intrinsics.r("typeaheadRepository");
                throw null;
            case 14:
                m45invoke();
                return Unit.f80348a;
            case 15:
                Navigation navigation = ((ow0.c) obj).I;
                return (mw0.a) (navigation != null ? navigation.i0("LOCATION_REQUEST_DATA_KEY") : null);
            case 16:
                return invoke();
            case 17:
                iy0.a aVar2 = ((ly0.d) obj).f85120m0;
                return (aVar2 == null || (placement = aVar2.getPlacement()) == null) ? y0.ANDROID_MAIN_USER_ED : placement;
            case 18:
                FragmentActivity requireActivity = ((n) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return requireActivity;
            case 19:
                m45invoke();
                return Unit.f80348a;
            case 20:
                nz0.d dVar = (nz0.d) obj;
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new nz0.f(requireContext, dVar.s7());
            case 21:
                rz0.c cVar = (rz0.c) obj;
                Context requireContext2 = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                c01.b bVar = new c01.b(requireContext2);
                dx0.d dVar2 = new dx0.d(cVar, 22);
                Intrinsics.checkNotNullParameter(dVar2, "<set-?>");
                bVar.f24418g = dVar2;
                int W = bs1.c.W(bVar, eo1.c.space_1600);
                Flow flow = bVar.f24416e;
                ViewGroup.LayoutParams layoutParams = flow.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = W;
                    flow.setLayoutParams(marginLayoutParams);
                    int W2 = bs1.c.W(bVar, iy1.b.pear_related_styles_content_padding_vertical);
                    bVar.setPaddingRelative(bVar.getPaddingStart(), W2, bVar.getPaddingEnd(), W2);
                    return bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 22:
                vz0.a aVar3 = (vz0.a) obj;
                Context requireContext3 = aVar3.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                PearStyleHeaderDisplayView pearStyleHeaderDisplayView = new PearStyleHeaderDisplayView(6, requireContext3, (AttributeSet) (b13 == true ? 1 : 0));
                pearStyleHeaderDisplayView.f24432i = aVar3.s7();
                pearStyleHeaderDisplayView.f24433j = com.bumptech.glide.d.O(aVar3, "com.pinterest.EXTRA_DEPTH", 0);
                String Z = com.bumptech.glide.d.Z(aVar3, "com.pinterest.EXTRA_SOURCE_PIN_ID", "");
                Intrinsics.checkNotNullParameter(Z, "<set-?>");
                pearStyleHeaderDisplayView.f24434k = Z;
                return pearStyleHeaderDisplayView;
            case 23:
                return (PearStyleTagsScrollView) ((PearStyleHeaderDisplayView) obj).findViewById(iy1.d.related_style_tags);
            case 24:
                return (Flow) ((PearStyleHeaderScreenshotView) obj).findViewById(iy1.d.related_style_tags);
            case 25:
                return (uk1.d) obj;
            case 26:
                l lVar = new l();
                l lVar2 = new l();
                l lVar3 = new l();
                l lVar4 = new l();
                bk.a aVar4 = new bk.a(0.0f);
                bk.a aVar5 = new bk.a(0.0f);
                bk.a aVar6 = new bk.a(0.0f);
                bk.a aVar7 = new bk.a(0.0f);
                bk.f fVar = new bk.f();
                bk.f fVar2 = new bk.f();
                bk.f fVar3 = new bk.f();
                bk.f fVar4 = new bk.f();
                m mVar = new m();
                mVar.f23078a = lVar;
                mVar.f23079b = lVar2;
                mVar.f23080c = lVar3;
                mVar.f23081d = lVar4;
                mVar.f23082e = aVar4;
                mVar.f23083f = aVar5;
                mVar.f23084g = aVar6;
                mVar.f23085h = aVar7;
                mVar.f23086i = fVar;
                mVar.f23087j = fVar2;
                mVar.f23088k = fVar3;
                mVar.f23089l = fVar4;
                RelatedPinsFilterRepView relatedPinsFilterRepView = (RelatedPinsFilterRepView) obj;
                mVar.d(bs1.c.W(relatedPinsFilterRepView, eo1.c.lego_corner_radius_medium_to_large));
                o a13 = mVar.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                bk.i iVar = new bk.i(a13);
                float W3 = bs1.c.W(relatedPinsFilterRepView, n80.a.related_pins_filter_rep_border_thickness);
                int B = bs1.c.B(relatedPinsFilterRepView, eo1.b.color_icon_default);
                iVar.f23052a.f23040k = W3;
                iVar.invalidateSelf();
                iVar.y(ColorStateList.valueOf(B));
                iVar.t(ColorStateList.valueOf(0));
                return iVar;
            case 27:
                m45invoke();
                return Unit.f80348a;
            case 28:
                return invoke();
            default:
                return invoke();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m45invoke() {
        ln1.i iVar = ln1.i.f84010k;
        int i13 = this.f20468i;
        Object obj = this.f20469j;
        switch (i13) {
            case 0:
                ((d) obj).J3(aq1.h.story_pin_validation_error_missing_media);
                return;
            case 8:
                ((cv0.j) obj).f53277g.invoke();
                return;
            case 9:
                pv0.d dVar = (pv0.d) obj;
                if (dVar.isBound()) {
                    GestaltSpinner gestaltSpinner = ((qv0.g) ((nv0.n) dVar.getView())).G0;
                    if (gestaltSpinner != null) {
                        Intrinsics.checkNotNullParameter(gestaltSpinner, "<this>");
                        s0.w(gestaltSpinner, iVar);
                        dVar.f101446e.h(m60.x0.oops_something_went_wrong);
                        return;
                    }
                    Intrinsics.r("overlayGestaltSpinner");
                    throw null;
                }
                return;
            case 10:
                pv0.f fVar = (pv0.f) obj;
                if (fVar.isBound()) {
                    GestaltSpinner gestaltSpinner2 = ((qv0.j) ((nv0.m) fVar.getView())).D0;
                    if (gestaltSpinner2 != null) {
                        Intrinsics.checkNotNullParameter(gestaltSpinner2, "<this>");
                        s0.w(gestaltSpinner2, iVar);
                        fVar.f101466f.h(m60.x0.oops_something_went_wrong);
                        return;
                    }
                    Intrinsics.r("overlayLoadingView");
                    throw null;
                }
                return;
            case 14:
                nw0.a aVar = (nw0.a) obj;
                if (aVar.isBound()) {
                    ((ku1.j) ((ow0.c) ((com.pinterest.feature.location.a) aVar.getView())).o7()).f();
                    return;
                }
                return;
            case 19:
                int i14 = fz0.l.f63133l0;
                ((fz0.l) obj).Y7().f63158f.e().a(fz0.f.f63122a);
                return;
            default:
                r01.c cVar = (r01.c) obj;
                com.pinterest.feature.pin.closeup.datasource.j jVar = cVar.f105711h;
                if (jVar != null) {
                    int i15 = 0;
                    for (Object obj2 : CollectionsKt.F0(jVar.f135191h)) {
                        int i16 = i15 + 1;
                        if (i15 >= 0) {
                            com.pinterest.feature.pin.closeup.datasource.j jVar2 = cVar.f105711h;
                            if (jVar2 != null) {
                                if (jVar2.getItemViewType(i15) == 106) {
                                    com.pinterest.feature.pin.closeup.datasource.j jVar3 = cVar.f105711h;
                                    if (jVar3 == null) {
                                        Intrinsics.r("moduleList");
                                        throw null;
                                    }
                                    dl1.s sVar = (dl1.s) jVar3.getItem(i15);
                                    if (sVar == null) {
                                        continue;
                                    } else {
                                        com.pinterest.feature.pin.closeup.datasource.j jVar4 = cVar.f105711h;
                                        if (jVar4 == null) {
                                            Intrinsics.r("moduleList");
                                            throw null;
                                        }
                                        jVar4.u1(i15, sVar);
                                    }
                                }
                                i15 = i16;
                            } else {
                                Intrinsics.r("moduleList");
                                throw null;
                            }
                        } else {
                            f0.p();
                            throw null;
                        }
                    }
                    return;
                }
                Intrinsics.r("moduleList");
                throw null;
        }
    }
}
