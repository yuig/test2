package rq;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t extends PinCloseupBaseModule {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f109546c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final er0.d f109547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f109548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.n context, er0.d presenter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f109547a = presenter;
        this.f109548b = n80.d.pin_closeup_business_account_upsell;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        View inflate = View.inflate(getContext(), this.f109548b, this);
        Intrinsics.f(inflate);
        View view = (LinearLayout) inflate.findViewById(n80.c.analytics_module_linear_layout);
        Intrinsics.f(view);
        maybeUpdateLayoutForTabletPortrait(view);
        view.setBackground(bs1.c.f0(view, r80.b.pin_closeup_redesign_module_background, null, null, 6));
        int W = bs1.c.W(view, eo1.c.pinterest_margin_small);
        view.setPadding(W, W, W, W);
        if (isTabletLandscapeMode()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(bs1.c.W(view, eo1.c.space_400));
            marginLayoutParams.setMarginEnd(bs1.c.W(view, eo1.c.space_400));
            view.setLayoutParams(marginLayoutParams);
        }
        ((GestaltText) inflate.findViewById(n80.c.pin_stats_biz_account_upsell_title)).i(o.f109407n);
        ((GestaltText) inflate.findViewById(n80.c.pin_stats_biz_account_upsell_desc)).i(o.f109408o);
        ((GestaltButton) findViewById(n80.c.navigationButton)).e(new xo.k(this, 6));
        updateView();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_PIN_ANALYTICS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return this.f109547a.t3();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }
}
