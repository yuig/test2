package rq;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.qk0;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t3 extends j {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f109554g = 0;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f109555c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f109556d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f109557e;

    /* renamed from: f, reason: collision with root package name */
    public oq.q f109558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Context context) {
        super(context, 11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        GestaltText gestaltText;
        View.inflate(getContext(), n80.d.idea_pin_closeup_details_module, this);
        this.f109555c = (LinearLayout) findViewById(n80.c.idea_pin_closeup_details_module_container);
        if (hf0.b.q()) {
            lh0.n1 n1Var = a11.o.f334a;
            if (!a11.o.b(getPin())) {
                View view = this.f109555c;
                GestaltText gestaltText2 = null;
                if (view != null) {
                    maybeUpdateLayoutForTabletPortrait(view);
                    view.setBackground(bs1.c.f0(view, r80.b.pin_closeup_module_background, null, null, 6));
                    int W = bs1.c.W(view, isTabletLandscapeMode() ? eo1.c.space_600 : eo1.c.space_400);
                    int W2 = bs1.c.W(view, eo1.c.space_600);
                    view.setPaddingRelative(W, W2, W, W2);
                }
                GestaltText gestaltText3 = (GestaltText) findViewById(n80.c.idea_pin_closeup_details_module_header);
                if (gestaltText3 != null) {
                    gestaltText3.i(f2.C);
                    gestaltText2 = gestaltText3;
                }
                this.f109556d = gestaltText2;
                this.f109557e = (GestaltText) findViewById(n80.c.idea_pin_closeup_details_module_details);
                int W3 = bs1.c.W(this, isTabletLandscapeMode() ? eo1.c.space_600 : eo1.c.space_400);
                int W4 = bs1.c.W(this, eo1.c.space_400);
                LinearLayout linearLayout = this.f109555c;
                if (linearLayout != null) {
                    linearLayout.setPaddingRelative(W3, W4, W3, W4);
                }
                if (!isTabletLandscapeMode() || (gestaltText = this.f109556d) == null) {
                    return;
                }
                gestaltText.i(f2.D);
                return;
            }
        }
        LinearLayout linearLayout2 = this.f109555c;
        if (linearLayout2 != null) {
            linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), 0, linearLayout2.getPaddingEnd(), linearLayout2.getPaddingBottom());
            removeAllViews();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            oq.q qVar = new oq.q(context, linearLayout2, false, new e(this, 7), new e(this, 8));
            this.f109558f = qVar;
            addView(qVar);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_DETAILS;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        dl0 v63;
        jo0 q13;
        qk0 k13;
        f30 pin = getPin();
        if (pin == null || (v63 = pin.v6()) == null || (q13 = v63.q()) == null || (k13 = q13.k()) == null) {
            return false;
        }
        return qg1.d.c(k13);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updatePin(com.pinterest.api.model.f30 r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.t3.updatePin(com.pinterest.api.model.f30):void");
    }
}
