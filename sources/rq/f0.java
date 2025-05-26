package rq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 extends j {

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f109180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        if (hf0.b.q() && hf0.b.m()) {
            int W = bs1.c.W(this, eo1.c.space_600);
            getPaddingRect().left = W;
            getPaddingRect().right = W;
            getPaddingRect().bottom = bs1.c.W(this, eo1.c.space_300);
        } else {
            int W2 = bs1.c.W(this, eo1.c.space_400);
            getPaddingRect().top = bs1.c.W(this, eo1.c.space_100);
            getPaddingRect().left = W2;
            getPaddingRect().right = W2;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(o.f109413t);
        this.f109180c = gestaltText;
        addView(gestaltText);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_AFFILIATE_DISCLAIMER;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        String y33 = pin.y3();
        boolean z13 = !(y33 == null || kotlin.text.z.j(y33));
        boolean w13 = b40.w(pin);
        if (!z13 && !w13) {
            bs1.c.X0(this);
            return;
        }
        String string = getContext().getString(wy1.f.story_pin_feed_affiliate_link_indicator_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltText gestaltText = this.f109180c;
        if (gestaltText != null) {
            gestaltText.i(new k1.j1(string, 26));
        } else {
            Intrinsics.r("affiliateLabel");
            throw null;
        }
    }
}
