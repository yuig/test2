package we1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.following.carousel.view.ImpressionableUserRep;
import com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews.BoardMoreIdeasUpsellCardView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129452i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n2 f129453j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p2 f129454k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(n2 n2Var, p2 p2Var) {
        super(0);
        this.f129452i = 5;
        this.f129454k = p2Var;
        this.f129453j = n2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 6;
        int i14 = this.f129452i;
        p2 p2Var = this.f129454k;
        n2 n2Var = this.f129453j;
        switch (i14) {
            case 0:
                Context context = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new c(context, p2Var.f129555e);
            case 1:
                Context context2 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                BoardMoreIdeasUpsellCardView boardMoreIdeasUpsellCardView = new BoardMoreIdeasUpsellCardView(i13, context2, (AttributeSet) null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(p2Var.f129555e, -2);
                marginLayoutParams.topMargin = kh2.d.p(16);
                boardMoreIdeasUpsellCardView.setLayoutParams(marginLayoutParams);
                return boardMoreIdeasUpsellCardView;
            case 2:
                Context context3 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                k0 k0Var = new k0(context3);
                k0Var.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return k0Var;
            case 3:
                Context context4 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                Intrinsics.checkNotNullParameter(context4, "context");
                h2 h2Var = new h2(context4);
                View.inflate(context4, r82.f.view_triple_preview_display_card_item, h2Var);
                h2Var.f129372d = (GestaltText) h2Var.findViewById(r82.d.triple_preview_title);
                h2Var.f129373e = (GestaltText) h2Var.findViewById(r82.d.triple_preview_subtitle);
                WebImageView webImageView = (WebImageView) h2Var.findViewById(r82.d.triple_preview_first_image);
                webImageView.Y(new yv1.g(1));
                h2Var.f129369a = webImageView;
                WebImageView webImageView2 = (WebImageView) h2Var.findViewById(r82.d.triple_preview_second_image);
                webImageView2.g2(0.0f, 0.0f, 0.0f, 0.0f);
                webImageView2.Y(new yv1.g(1));
                h2Var.f129370b = webImageView2;
                WebImageView webImageView3 = (WebImageView) h2Var.findViewById(r82.d.triple_preview_third_image);
                webImageView3.Y(new yv1.g(1));
                h2Var.f129371c = webImageView3;
                boolean Y0 = df.j1.Y0(context4);
                float f13 = h2Var.f129374f;
                if (Y0) {
                    WebImageView webImageView4 = h2Var.f129369a;
                    if (webImageView4 != null) {
                        webImageView4.g2(0.0f, f13, 0.0f, f13);
                    }
                    WebImageView webImageView5 = h2Var.f129371c;
                    if (webImageView5 != null) {
                        webImageView5.g2(f13, 0.0f, f13, 0.0f);
                    }
                } else {
                    WebImageView webImageView6 = h2Var.f129369a;
                    if (webImageView6 != null) {
                        webImageView6.g2(f13, 0.0f, f13, 0.0f);
                    }
                    WebImageView webImageView7 = h2Var.f129371c;
                    if (webImageView7 != null) {
                        webImageView7.g2(0.0f, f13, 0.0f, f13);
                    }
                }
                h2Var.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return h2Var;
            case 4:
                Context context5 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                Intrinsics.checkNotNullParameter(context5, "context");
                v0 v0Var = new v0(context5);
                View.inflate(context5, r82.f.view_stacked_collage_display_card_item, v0Var);
                v0Var.f129372d = (GestaltText) v0Var.findViewById(r82.d.stacked_collage_title);
                v0Var.f129373e = (GestaltText) v0Var.findViewById(r82.d.stacked_collage_subtitle);
                WebImageView webImageView8 = (WebImageView) v0Var.findViewById(r82.d.stacked_collage_first_image);
                webImageView8.Y(new yv1.g(1));
                v0Var.f129369a = webImageView8;
                WebImageView webImageView9 = (WebImageView) v0Var.findViewById(r82.d.stacked_collage_second_image);
                webImageView9.g2(webImageView9.f2(), webImageView9.f2(), 0.0f, 0.0f);
                webImageView9.Y(new yv1.g(1));
                v0Var.f129370b = webImageView9;
                WebImageView webImageView10 = (WebImageView) v0Var.findViewById(r82.d.stacked_collage_third_image);
                webImageView10.Y(new yv1.g(1));
                v0Var.f129371c = webImageView10;
                v0Var.setBackgroundResource(eo1.d.lego_medium_black_rounded_rect);
                boolean Y02 = df.j1.Y0(context5);
                float f14 = v0Var.f129374f;
                if (Y02) {
                    WebImageView webImageView11 = v0Var.f129369a;
                    if (webImageView11 != null) {
                        webImageView11.g2(0.0f, 0.0f, 0.0f, f14);
                    }
                    WebImageView webImageView12 = v0Var.f129371c;
                    if (webImageView12 != null) {
                        webImageView12.g2(0.0f, 0.0f, f14, 0.0f);
                    }
                } else {
                    WebImageView webImageView13 = v0Var.f129369a;
                    if (webImageView13 != null) {
                        webImageView13.g2(0.0f, 0.0f, f14, 0.0f);
                    }
                    WebImageView webImageView14 = v0Var.f129371c;
                    if (webImageView14 != null) {
                        webImageView14.g2(0.0f, 0.0f, 0.0f, f14);
                    }
                }
                v0Var.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return v0Var;
            case 5:
                Float f15 = p2Var.f129552b.f129432p;
                float floatValue = f15 != null ? f15.floatValue() : 1.5f;
                Context context6 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                q qVar = new q(context6);
                int i15 = p2Var.f129555e;
                qVar.setLayoutParams(new ViewGroup.LayoutParams(i15, (int) (floatValue * i15)));
                return qVar;
            case 6:
                Context context7 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                g60.i iVar = new g60.i(context7, n2Var);
                iVar.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return iVar;
            case 7:
                Context context8 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                xa0.p pVar = new xa0.p(context8, n2Var.f129497d);
                pVar.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return pVar;
            case 8:
                Context context9 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                ImpressionableUserRep impressionableUserRep = new ImpressionableUserRep(context9);
                impressionableUserRep.y1(p2Var.f129552b.f129422f);
                impressionableUserRep.K1(2);
                if (p2Var.f129552b.f129422f == ze0.a.Compact) {
                    impressionableUserRep.r1();
                }
                impressionableUserRep.r0(false);
                impressionableUserRep.t0(false);
                impressionableUserRep.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return impressionableUserRep;
            case 9:
                Context context10 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                LegoBoardRep legoBoardRep = new LegoBoardRep(context10);
                legoBoardRep.a0(new qc2.d(), new ee1.d(p2Var, i13));
                legoBoardRep.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return legoBoardRep;
            case 10:
                Context context11 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                p pVar2 = new p(context11);
                pVar2.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return pVar2;
            case 11:
                Context context12 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                o0 o0Var = new o0(context12, false);
                o0Var.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return o0Var;
            case 12:
                Context context13 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                g2 g2Var = new g2(context13);
                g2Var.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return g2Var;
            case 13:
                Context context14 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                xo0.x xVar = new xo0.x(context14);
                xVar.f();
                xVar.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return xVar;
            default:
                Context context15 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                xi0.c cVar = new xi0.c(context15);
                cVar.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                List alignment = kotlin.collections.e0.b(vn1.h.f126276b);
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                w1.g gVar = new w1.g(alignment, 13);
                GestaltText gestaltText = cVar.f135012i;
                gestaltText.i(gVar);
                vn1.g variant = vn1.g.UI_400;
                Intrinsics.checkNotNullParameter(variant, "variant");
                gestaltText.i(new mp.m(variant, 3));
                int i16 = eo1.c.space_400;
                ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int W = bs1.c.W(cVar, i16);
                Intrinsics.checkNotNullParameter(layoutParams2, "<this>");
                com.bumptech.glide.c.a1(layoutParams2, W, W, W, W);
                ViewGroup.LayoutParams layoutParams3 = gestaltText.getLayoutParams();
                Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams3).gravity = 80;
                ProportionalImageView proportionalImageView = cVar.f135003p;
                proportionalImageView.setColorFilter(dl2.b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_100));
                Context context16 = proportionalImageView.getContext();
                int i17 = m60.s0.gradient_transparent_to_black;
                Object obj = d5.a.f53679a;
                proportionalImageView.setForeground(context16.getDrawable(i17));
                Float f16 = p2Var.f129552b.f129432p;
                float floatValue2 = f16 != null ? f16.floatValue() : 1.0f;
                cVar.f135006s = floatValue2;
                proportionalImageView.f52576J = floatValue2;
                ProportionalImageView proportionalImageView2 = cVar.f135004q;
                Intrinsics.g(proportionalImageView2, "null cannot be cast to non-null type com.pinterest.ui.imageview.ProportionalImageView");
                proportionalImageView2.f52576J = cVar.f135006s * 2;
                return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(n2 n2Var, p2 p2Var, int i13) {
        super(0);
        this.f129452i = i13;
        this.f129453j = n2Var;
        this.f129454k = p2Var;
    }
}
