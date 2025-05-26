package tq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes3.dex */
public final class k0 extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f118886h = 0;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f118887e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f118888f;

    /* renamed from: g, reason: collision with root package name */
    public j f118889g;

    @Override // tq.e0
    public final void b() {
        if (this.f118888f == null) {
            return;
        }
        if (j1.d1(this.f118830c)) {
            GestaltText gestaltText = this.f118888f;
            if (gestaltText == null) {
                Intrinsics.r("titleTextView");
                throw null;
            }
            String str = this.f118830c;
            if (str != null) {
                pk.a0.p(gestaltText, str);
                gestaltText.i(g.f118851y);
            }
        } else {
            GestaltText gestaltText2 = this.f118888f;
            if (gestaltText2 == null) {
                Intrinsics.r("titleTextView");
                throw null;
            }
            gestaltText2.i(g.f118852z);
        }
        GestaltText gestaltText3 = this.f118888f;
        if (gestaltText3 == null) {
            Intrinsics.r("titleTextView");
            throw null;
        }
        if (gestaltText3.l().f108855m == fm1.c.VISIBLE) {
            bs1.c.U1(this);
        } else {
            bs1.c.X0(this);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        getPaddingRect().bottom = getResources().getDimensionPixelOffset(eo1.c.margin_quarter);
        getPaddingRect().top = getResources().getDimensionPixelOffset(eo1.c.space_400);
        updateHorizontalPadding();
        setOrientation(1);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(g.f118850x);
        this.f118888f = gestaltText;
        new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(r0.thumbnail_xsmall_size), getResources().getDimensionPixelSize(r0.thumbnail_xsmall_size));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setOnClickListener(this.f118889g);
        linearLayout.setOnLongClickListener(new rq.n(4));
        GestaltText gestaltText2 = this.f118888f;
        if (gestaltText2 == null) {
            Intrinsics.r("titleTextView");
            throw null;
        }
        linearLayout.addView(gestaltText2, layoutParams);
        this.f118887e = linearLayout;
        addView(linearLayout, -1, -2);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_TITLE;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        LinearLayout linearLayout = this.f118887e;
        if (linearLayout != null) {
            kh2.r.u(linearLayout, "PinCloseupTitleModule.titleContainer");
        } else {
            Intrinsics.r("titleContainer");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean useAutoVisibility() {
        return false;
    }
}
