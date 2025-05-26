package com.pinterest.feature.browser.view;

import a11.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.api.model.f30;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.view.NestedScrollWebView;
import eu.m;
import fu.a;
import java.util.WeakHashMap;
import jo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.x;
import lb0.q;
import lu.a0;
import np0.b;
import np0.h;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import q5.m0;
import q5.v0;
import rl2.g0;
import rl2.u;
import rn0.d;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/browser/view/InAppBrowserView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InAppBrowserView extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u[] f45390w = {k0.f80436a.e(new x(InAppBrowserView.class, "shouldShowActionBar", "getShouldShowActionBar()Z", 0))};

    /* renamed from: d, reason: collision with root package name */
    public c f45391d;

    /* renamed from: e, reason: collision with root package name */
    public is1.k0 f45392e;

    /* renamed from: f, reason: collision with root package name */
    public q f45393f;

    /* renamed from: g, reason: collision with root package name */
    public final NestedScrollWebView f45394g;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f45395h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f45396i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltIconButton f45397j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f45398k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltIconButton f45399l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltIconButton f45400m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltIconButton f45401n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltIconButton f45402o;

    /* renamed from: p, reason: collision with root package name */
    public final ProgressBar f45403p;

    /* renamed from: q, reason: collision with root package name */
    public final LegoFloatingBottomActionBar f45404q;

    /* renamed from: r, reason: collision with root package name */
    public a f45405r;

    /* renamed from: s, reason: collision with root package name */
    public final m f45406s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f45407t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f45408u;

    /* renamed from: v, reason: collision with root package name */
    public final v f45409v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppBrowserView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void g(InAppBrowserView inAppBrowserView) {
        NestedScrollWebView nestedScrollWebView = inAppBrowserView.f45394g;
        boolean canGoForward = nestedScrollWebView.canGoForward();
        GestaltIconButton gestaltIconButton = inAppBrowserView.f45400m;
        if (canGoForward) {
            gestaltIconButton.t(to0.v.f118694j);
        } else {
            gestaltIconButton.t(to0.v.f118695k);
        }
        boolean canGoBack = nestedScrollWebView.canGoBack();
        GestaltIconButton gestaltIconButton2 = inAppBrowserView.f45399l;
        if (canGoBack) {
            gestaltIconButton2.t(to0.v.f118696l);
        } else {
            gestaltIconButton2.t(to0.v.f118697m);
        }
    }

    public final void i(boolean z13) {
        this.f45399l.t(new d(z13, 2));
        this.f45402o.t(new d(z13, 3));
        this.f45400m.t(new d(z13, 4));
        this.f45401n.t(new d(z13, 5));
    }

    public final void j(String navigationSource, f30 pin, nl1.d fragment) {
        Intrinsics.checkNotNullParameter(navigationSource, "source");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LegoFloatingBottomActionBar legoFloatingBottomActionBar = this.f45404q;
        if (legoFloatingBottomActionBar == null) {
            Intrinsics.r("floatingBottomActionBar");
            throw null;
        }
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        legoFloatingBottomActionBar.f45455i = navigationSource;
        if (this.f45391d == null) {
            Intrinsics.r("baseGridActionUtils");
            throw null;
        }
        jo1.a baseFragmentType = c.a(fragment);
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        d0 pinalytics = fragment.s7();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        legoFloatingBottomActionBar.f45457k = pinalytics;
        Intrinsics.checkNotNullParameter(pin, "pin");
        legoFloatingBottomActionBar.f45458l = pin;
        Boolean g53 = pin.g5();
        Intrinsics.checkNotNullExpressionValue(g53, "getIsStaleProduct(...)");
        boolean booleanValue = g53.booleanValue();
        GestaltButton gestaltButton = ((Boolean) legoFloatingBottomActionBar.f45451e.getValue()).booleanValue() ? (GestaltButton) legoFloatingBottomActionBar.findViewById(r80.c.save_button_small) : (GestaltButton) legoFloatingBottomActionBar.findViewById(r80.c.save_button_large);
        gestaltButton.d(b.f91718k);
        gestaltButton.e(new h(legoFloatingBottomActionBar, 0));
        if (booleanValue) {
            gestaltButton.d(b.f91719l);
        }
        Intrinsics.checkNotNullExpressionValue(gestaltButton, "apply(...)");
        legoFloatingBottomActionBar.f45456j = gestaltButton;
        View findViewById = legoFloatingBottomActionBar.findViewById(r80.c.lego_closeup_floating_action_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        new p().j((ConstraintLayout) findViewById);
        legoFloatingBottomActionBar.f45453g.setOnClickListener(new lj0.a(legoFloatingBottomActionBar, 16));
        f30 f30Var = legoFloatingBottomActionBar.f45458l;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        if (g0.U(f30Var)) {
            GestaltButton gestaltButton2 = legoFloatingBottomActionBar.f45456j;
            if (gestaltButton2 == null) {
                Intrinsics.r("saveButton");
                throw null;
            }
            Context context = legoFloatingBottomActionBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(gestaltButton2, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            gestaltButton2.d(j.f291n);
        }
        WeakHashMap weakHashMap = v0.f102521a;
        m0.l(legoFloatingBottomActionBar, legoFloatingBottomActionBar.f45454h);
        legoFloatingBottomActionBar.setOutlineProvider(new nj.c(legoFloatingBottomActionBar, 3));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NestedScrollWebView webVw = this.f45394g;
        webVw.setWebChromeClient(null);
        Intrinsics.checkNotNullParameter(webVw, "webVw");
        ViewParent parent = webVw.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webVw);
        }
        webVw.removeAllViews();
        webVw.destroy();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBrowserView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 2, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45406s = new m(1, Boolean.TRUE, this);
        this.f45409v = xk2.m.b(new jh0.d(this, 26));
        View.inflate(getContext(), ps.q.lego_in_app_browser, this);
        View findViewById = findViewById(ps.p.webview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45394g = (NestedScrollWebView) findViewById;
        View findViewById2 = findViewById(r80.c.iab_error_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45395h = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(r80.c.browser_reload_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45397j = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(ps.p.browser_top_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45398k = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(ps.p.backward_browser_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45399l = (GestaltIconButton) findViewById5;
        View findViewById6 = findViewById(ps.p.forward_browser_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45400m = (GestaltIconButton) findViewById6;
        View findViewById7 = findViewById(ps.p.browser_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45401n = (GestaltIconButton) findViewById7;
        View findViewById8 = findViewById(ps.p.browser_refresh_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f45402o = (GestaltIconButton) findViewById8;
        View findViewById9 = findViewById(ps.p.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f45403p = (ProgressBar) findViewById9;
        View findViewById10 = findViewById(ps.p.lego_iab_bottom_action_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f45404q = (LegoFloatingBottomActionBar) findViewById10;
        View findViewById11 = findViewById(ps.p.browser_bar_url);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f45396i = (GestaltText) findViewById11;
    }
}
