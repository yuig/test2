package com.pinterest.activity.pin.view.modules;

import a11.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import eo1.c;
import h32.g0;
import hf0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.b0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import r80.a;
import rq.y3;
import so.jb;
import so.oa;
import so.s8;
import uk1.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/pin/view/modules/PinCloseupUnifiedActionBarModule;", "Lcom/pinterest/activity/pin/view/modules/PinCloseupBaseModule;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PinCloseupUnifiedActionBarModule extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public boolean f35036a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f35037b;

    /* renamed from: c, reason: collision with root package name */
    public UnifiedPinActionBarView f35038c;

    /* renamed from: d, reason: collision with root package name */
    public String f35039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupUnifiedActionBarModule(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        setClipChildren(false);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(0);
        updateHorizontalPadding();
        getPaddingRect().bottom = getResources().getDimensionPixelSize(a.lego_action_button_module_bottom_padding);
        getPaddingRect().top = isTabletLandscapeMode() ? getResources().getDimensionPixelSize(c.lego_spacing_vertical_large) : getResources().getDimensionPixelSize(r0.margin_half);
        b.p();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d0 d0Var = this.f35037b;
        if (d0Var == null) {
            Intrinsics.r("topLevelPinalytics");
            throw null;
        }
        UnifiedPinActionBarView unifiedPinActionBarView = new UnifiedPinActionBarView(context, d0Var, this.f35039d);
        unifiedPinActionBarView.f47057x = getProductTagParentPinId();
        this.f35038c = unifiedPinActionBarView;
        rm1.c iconColor = rm1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        unifiedPinActionBarView.f47040g.g2(new sp.b(iconColor, 2));
        unifiedPinActionBarView.f47042i.Z(iconColor);
        unifiedPinActionBarView.f47047n = iconColor;
        androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(-1, unifiedPinActionBarView.getResources().getDimensionPixelSize(p80.a.pin_closeup_unified_action_bar_height));
        cVar.f17902c = 81;
        unifiedPinActionBarView.setLayoutParams(cVar);
        addView(this.f35038c);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final g0 getComponentType() {
        return g0.PIN_CLOSEUP_ACTION;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f35036a) {
            return;
        }
        this.f35036a = true;
        jb jbVar = (jb) ((y3) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (b0) oaVar.R8.get();
        this.f35037b = (d0) oaVar.f113817n2.get();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void renderLandscapeConfiguration() {
        super.renderLandscapeConfiguration();
        UnifiedPinActionBarView unifiedPinActionBarView = this.f35038c;
        if (unifiedPinActionBarView != null) {
            bs1.c.X0(unifiedPinActionBarView.f47039f);
            int dimensionPixelSize = unifiedPinActionBarView.getResources().getDimensionPixelSize(p80.a.unified_pin_action_bar_start_end_margin);
            LinearLayout linearLayout = unifiedPinActionBarView.f47043j;
            linearLayout.setGravity(8388613);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).setMargins(0, 0, dimensionPixelSize, 0);
            ViewGroup.LayoutParams layoutParams2 = unifiedPinActionBarView.f47041h.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams2).setMargins(dimensionPixelSize, 0, 0, 0);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return false;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        UnifiedPinActionBarView unifiedPinActionBarView = this.f35038c;
        if (unifiedPinActionBarView != null) {
            unifiedPinActionBarView.X(pin);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePinSpamParams(c82.a aVar) {
        super.updatePinSpamParams(aVar);
        UnifiedPinActionBarView unifiedPinActionBarView = this.f35038c;
        if (unifiedPinActionBarView != null) {
            unifiedPinActionBarView.f47051r = aVar;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        UnifiedPinActionBarView unifiedPinActionBarView;
        super.updateView();
        f30 pin = getPin();
        if (pin == null || (unifiedPinActionBarView = this.f35038c) == null) {
            return;
        }
        unifiedPinActionBarView.X(pin);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupUnifiedActionBarModule(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        inject();
        setClipChildren(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupUnifiedActionBarModule(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        inject();
        setClipChildren(false);
    }
}
