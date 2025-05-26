package tq;

import a.l2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TableRow;
import com.pinterest.activity.pin.view.PinCloseupChevronIconView;
import com.pinterest.api.model.bm;
import com.pinterest.api.model.em;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gm;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rq.e2;
import rq.t4;

/* loaded from: classes3.dex */
public final class g0 extends b {

    /* renamed from: k, reason: collision with root package name */
    public final u0 f118854k;

    /* renamed from: l, reason: collision with root package name */
    public final u0 f118855l;

    /* renamed from: m, reason: collision with root package name */
    public final g4.u f118856m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118854k = u0.PIN_CLOSEUP_PRODUCT_DETAILS_EXPANDED;
        this.f118855l = u0.PIN_CLOSEUP_PRODUCT_DETAILS_COLLAPSED;
        this.f118856m = new g4.u();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void bindData(boolean z13, f30 pin, b11.g config, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        super.bindData(z13, pin, config, pinalytics);
        setFullPinLoaded(z13);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        View.inflate(getContext(), n80.d.pdp_accordion, this);
        getPaddingRect().bottom = getResources().getDimensionPixelOffset(eo1.c.margin_half);
        if (hf0.b.n()) {
            int W = bs1.c.W(this, eo1.c.margin_one_and_a_half);
            getPaddingRect().left = W;
            getPaddingRect().right = W;
        } else if (hf0.b.p()) {
            int W2 = bs1.c.W(this, eo1.c.margin);
            getPaddingRect().left = W2;
            getPaddingRect().right = W2;
        } else {
            applyDefaultSidePadding();
        }
        GestaltText i13 = ((GestaltText) findViewById(n80.c.title)).i(g.f118836j);
        Intrinsics.checkNotNullParameter(i13, "<set-?>");
        this.f118802c = i13;
        if (this.f118800a) {
            ViewStub viewStub = (ViewStub) findViewById(n80.c.collapsed_preview_view_stub);
            viewStub.setLayoutResource(n80.d.pdp_accordion_content);
            View inflate = viewStub.inflate();
            viewStub.setVisibility(this.f118801b ? 0 : 8);
            Intrinsics.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f118805f = (ViewGroup) inflate;
        }
        View findViewById = findViewById(n80.c.action_button);
        PinCloseupChevronIconView pinCloseupChevronIconView = (PinCloseupChevronIconView) findViewById;
        dl2.b.z(pinCloseupChevronIconView.f34987a, oq.n.f97096o);
        if (!this.f118801b) {
            pinCloseupChevronIconView.T(200L, true);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f118804e = pinCloseupChevronIconView;
        setOnClickListener(new l2(this, 29));
        ViewStub viewStub2 = (ViewStub) findViewById(n80.c.expanded_view_stub);
        viewStub2.setLayoutResource(n80.d.pdp_accordion_content);
        View inflate2 = viewStub2.inflate();
        viewStub2.setVisibility(this.f118801b ^ true ? 0 : 8);
        Intrinsics.g(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate2;
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.f118803d = viewGroup;
        setVisibility(8);
        GestaltText gestaltText = this.f118802c;
        if (gestaltText == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        gestaltText.i(g.f118844r);
        View findViewById2 = findViewById(n80.c.top_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        j1.A0((GestaltDivider) findViewById2);
        setBackground(bs1.c.f0(this, r80.b.pin_closeup_module_background, null, null, 6));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_PRODUCT_DETAILS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        em p43;
        List b13;
        f30 pin = getPin();
        if (pin == null || (p43 = pin.p4()) == null || (b13 = p43.b()) == null) {
            return false;
        }
        return !b13.isEmpty();
    }

    public final GestaltText i(String str, boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new t4(z13, str, 1));
        gestaltText.setTextDirection(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, gestaltText.getResources().getDimensionPixelOffset(eo1.c.space_200));
        gestaltText.setLayoutParams(layoutParams);
        return gestaltText;
    }

    public final GestaltText j(boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-1, -2);
        layoutParams.setMargins(0, gestaltText.getResources().getDimensionPixelOffset(eo1.c.space_200), 0, gestaltText.getResources().getDimensionPixelOffset(eo1.c.space_200));
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.setTextDirection(5);
        gestaltText.i(new r1.f(gestaltText, z13, 3));
        return gestaltText;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void setFullPinLoaded(boolean z13) {
        String str;
        ViewGroup viewGroup;
        em p43;
        List b13;
        super.setFullPinLoaded(z13);
        if (z13) {
            ViewGroup viewGroup2 = this.f118805f;
            if (viewGroup2 == null || viewGroup2.getChildCount() <= 0) {
                int i13 = hf0.b.n() ? 3 : 1;
                f30 pin = getPin();
                if (pin != null && (p43 = pin.p4()) != null && (b13 = p43.b()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = b13.iterator();
                    while (it.hasNext()) {
                        gp0.a a13 = ((bm) it.next()).a(this.f118856m);
                        String a14 = a13 instanceof gm ? ((gm) a13).a() : null;
                        if (a14 != null) {
                            arrayList.add(a14);
                        }
                    }
                    List y03 = CollectionsKt.y0(arrayList, i13);
                    if (y03 != null) {
                        str = CollectionsKt.Z(y03, "\n", null, null, 0, null, null, 62);
                        if (str != null || kotlin.text.z.j(str) || (viewGroup = this.f118805f) == null) {
                            return;
                        }
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                        gestaltText.i(new e2(str, i13, 2));
                        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        gestaltText.setTextDirection(5);
                        viewGroup.addView(gestaltText);
                        return;
                    }
                }
                str = null;
                if (str != null) {
                }
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }
}
