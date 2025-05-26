package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 extends j implements i01.j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f109107k = 0;

    /* renamed from: c, reason: collision with root package name */
    public zf0.f f109108c;

    /* renamed from: d, reason: collision with root package name */
    public m60.w f109109d;

    /* renamed from: e, reason: collision with root package name */
    public lh0.a0 f109110e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f109111f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f109112g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f109113h;

    /* renamed from: i, reason: collision with root package name */
    public String f109114i;

    /* renamed from: j, reason: collision with root package name */
    public final x f109115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109115j = new x(context, this);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        constraintLayout.setId(View.generateViewId());
        this.f109111f = constraintLayout;
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(o.f109409p);
        gestaltText.j(new xo.k(this, 8));
        this.f109112g = gestaltText;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setId(n80.c.pin_closeup_source_attribution_pinner_avatar);
        getPaddingRect().top = bs1.c.W(this, n80.a.lego_ad_closeup_rp_module_top_padding);
        updateHorizontalPadding();
        ConstraintLayout constraintLayout = this.f109111f;
        constraintLayout.addView(this.f109112g, new LinearLayout.LayoutParams(-2, -2));
        addView(constraintLayout);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_LINK;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60.w wVar = this.f109109d;
        if (wVar != null) {
            wVar.h(this.f109115j);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m60.w wVar = this.f109109d;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f109115j);
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        f30 pin = getPin();
        this.f109114i = pin != null ? com.bumptech.glide.c.D(pin) : null;
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        int i13;
        f30 pin;
        wy0 N;
        String Z2;
        super.updateView();
        if (b40.w0(getPin())) {
            lh0.a0 a0Var = this.f109110e;
            if (a0Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            lh0.z3 z3Var = lh0.a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
            if (g1Var.o("ads_sponsored_label_cleanup", "enabled", z3Var) || g1Var.l("ads_sponsored_label_cleanup")) {
                i13 = nw.c.ads_sponsored_by_bold;
                pin = getPin();
                if (pin != null || (N = b40.N(pin)) == null || (Z2 = N.Z2()) == null) {
                    return;
                }
                GestaltText gestaltText = this.f109112g;
                gestaltText.i(new a0(gestaltText, i13, Z2, 0));
                return;
            }
        }
        i13 = nw.c.ads_promoted_by_bold;
        pin = getPin();
        if (pin != null) {
        }
    }
}
