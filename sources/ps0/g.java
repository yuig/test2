package ps0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;

/* loaded from: classes5.dex */
public final class g extends FrameLayout implements yk1.u {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton f101258a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f101259b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f101260c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f101261d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f101262e;

    /* renamed from: f, reason: collision with root package name */
    public final d4 f101263f;

    /* renamed from: g, reason: collision with root package name */
    public final a4 f101264g;

    /* renamed from: h, reason: collision with root package name */
    public final h32.g0 f101265h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        from.inflate(wp1.e.view_home_empty_state_with_refresh_option, this);
        View findViewById = findViewById(wp1.d.refresh_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f101258a = (GestaltButton) findViewById;
        View findViewById2 = findViewById(wp1.d.container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        this.f101259b = linearLayout;
        View findViewById3 = findViewById(wp1.d.empty_state_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f101260c = (ImageView) findViewById3;
        View findViewById4 = findViewById(wp1.d.empty_state_uh_oh_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f101261d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(wp1.d.empty_state_message_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f101262e = (GestaltText) findViewById5;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setClipChildren(false);
        setClipToPadding(false);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 13));
        } else {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).topMargin = (bs1.c.W(this, eo1.c.tab_bar_height) + hf0.b.f()) * (-1);
            requestLayout();
        }
        this.f101263f = d4.FEED;
        this.f101264g = a4.FEED_HOME;
        this.f101265h = h32.g0.HOME_FEED_EMPTY_STATE;
    }

    public final void a(k eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f101258a.e(eventHandler);
    }

    public final void b() {
        Integer drawableRes = tm1.d.GUMBALL.drawableRes(g92.d.CALICO, tm1.b.SPOT, tm1.a.RATIO_1_1);
        this.f101260c.setImageResource(drawableRes != null ? drawableRes.intValue() : wp1.c.ic_empty_state_illustration);
        pp2.a.k(this.f101261d, f.f101252j);
        pp2.a.k(this.f101262e, f.f101253k);
        bs1.c.s(this.f101258a, new f1(this, 12));
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getV0() {
        return this.f101265h;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getQ0() {
        return this.f101264g;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getC0() {
        return this.f101263f;
    }

    @Override // yk1.r
    public final void setPinalytics(nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        pinalytics.z(null);
    }
}
