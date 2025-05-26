package rq;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.creator.analytics.view.LegoCreatorPinalyticsItemMediumView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f109527k = 0;

    /* renamed from: d, reason: collision with root package name */
    public cr0.i f109528d;

    /* renamed from: e, reason: collision with root package name */
    public cr0.i f109529e;

    /* renamed from: f, reason: collision with root package name */
    public cr0.i f109530f;

    /* renamed from: g, reason: collision with root package name */
    public final int f109531g;

    /* renamed from: h, reason: collision with root package name */
    public final er0.d f109532h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltIconButton f109533i;

    /* renamed from: j, reason: collision with root package name */
    public FrameLayout f109534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.n context, er0.d passedPresenter, pb0.d dateFormatter) {
        super(context, dateFormatter);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(passedPresenter, "passedPresenter");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(passedPresenter, "passedPresenter");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        this.f109531g = n80.d.pin_closeup_creator_analytics_module_lego;
        this.f109532h = passedPresenter;
    }

    @Override // cr0.j
    public final cr0.i M0(cr0.a aVar) {
        cr0.i iVar;
        cr0.f type = (cr0.f) aVar;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof cr0.e) {
            iVar = this.f109528d;
            if (iVar == null) {
                Intrinsics.r("impressionsView");
                throw null;
            }
        } else if (type instanceof cr0.d) {
            iVar = this.f109529e;
            if (iVar == null) {
                Intrinsics.r("savesView");
                throw null;
            }
        } else {
            if (!(type instanceof cr0.b) && !(type instanceof cr0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = this.f109530f;
            if (iVar == null) {
                Intrinsics.r("clicksView");
                throw null;
            }
        }
        return iVar;
    }

    @Override // rq.b
    public final int b() {
        return this.f109531g;
    }

    @Override // rq.b
    public final er0.d e() {
        return this.f109532h;
    }

    @Override // rq.b
    public final void g(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(root, "root");
        KeyEvent.Callback findViewById = root.findViewById(n80.c.views_stats);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f109528d = (cr0.i) findViewById;
        KeyEvent.Callback findViewById2 = root.findViewById(n80.c.save_stats);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f109529e = (cr0.i) findViewById2;
        KeyEvent.Callback findViewById3 = root.findViewById(n80.c.click_stats);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f109530f = (cr0.i) findViewById3;
        View findViewById4 = root.findViewById(n80.c.analytics_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        if (hf0.b.q()) {
            lh0.n1 n1Var = a11.o.f334a;
            if (!a11.o.b(getPin())) {
                View view = (LinearLayout) root.findViewById(n80.c.analytics_module_linear_layout);
                bs1.c.U1(view);
                Intrinsics.f(view);
                maybeUpdateLayoutForTabletPortrait(view);
                view.setBackground(bs1.c.f0(view, r80.b.pin_closeup_module_background, null, null, 6));
                int W = bs1.c.W(view, eo1.c.space_200);
                view.setPaddingRelative(W, W, W, bs1.c.W(view, eo1.c.space_400));
                View findViewById5 = root.findViewById(n80.c.analytics_module_visibility_tooltip_container);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
                this.f109534j = (FrameLayout) findViewById5;
                View findViewById6 = root.findViewById(n80.c.analytics_module_visibility_indicator);
                Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
                this.f109533i = (GestaltIconButton) findViewById6;
                View findViewById7 = root.findViewById(n80.c.analytics_module_visibility_container);
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById7;
                Intrinsics.f(constraintLayout);
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.setMarginEnd(0);
                constraintLayout.setLayoutParams(marginLayoutParams);
                Intrinsics.checkNotNullExpressionValue(findViewById7, "apply(...)");
                GestaltIconButton gestaltIconButton = this.f109533i;
                if (gestaltIconButton == null) {
                    Intrinsics.r("visibilityIndicator");
                    throw null;
                }
                gestaltIconButton.u(new xo.k(this, 5));
                ((GestaltText) root.findViewById(n80.c.analytics_module_header_text)).i(o.f109405l);
                ((GestaltText) root.findViewById(n80.c.analytics_text)).i(o.f109406m);
                LegoCreatorPinalyticsItemMediumView legoCreatorPinalyticsItemMediumView = (LegoCreatorPinalyticsItemMediumView) root.findViewById(n80.c.views_stats);
                vn1.c cVar = vn1.c.DEFAULT;
                legoCreatorPinalyticsItemMediumView.a(cVar);
                ((LegoCreatorPinalyticsItemMediumView) root.findViewById(n80.c.click_stats)).a(cVar);
                ((LegoCreatorPinalyticsItemMediumView) root.findViewById(n80.c.save_stats)).a(cVar);
                if (isTabletLandscapeMode()) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginStart(bs1.c.W(view, eo1.c.space_400));
                    marginLayoutParams2.setMarginEnd(bs1.c.W(view, eo1.c.space_400));
                    view.setLayoutParams(marginLayoutParams2);
                    return;
                }
                return;
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        oq.p pVar = new oq.p(context, 0);
        String text = bs1.c.f2(pVar, cd0.c.pin_stats);
        Intrinsics.checkNotNullParameter(text, "text");
        pk.a0.p((GestaltText) pVar.f97117b, text);
        pVar.setOnClickListener(new a.l2(this, 22));
        addView(pVar);
    }
}
