package com.pinterest.ads.feature.owc.view.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.view.NestedScrollWebView;
import cu.i;
import fu.a;
import fu.c;
import is1.k0;
import kh2.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li0.b;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import ps.p;
import ps.q;
import to0.e;
import to0.u;
import to0.w;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/core/AdsBrowserBottomSheet;", "Lcu/i;", "Lcom/pinterest/ads/feature/owc/view/base/BaseAdsBottomSheetBehavior;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class AdsBrowserBottomSheet extends i {

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f35365q;

    /* renamed from: r, reason: collision with root package name */
    public final InAppBrowserView f35366r;

    /* renamed from: s, reason: collision with root package name */
    public String f35367s;

    /* renamed from: t, reason: collision with root package name */
    public final BaseAdsBottomSheetBehavior f35368t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsBrowserBottomSheet(Context context, AttributeSet attributeSet, int i13, boolean z13) {
        super(context, attributeSet, i13, z13);
        NestedScrollWebView nestedScrollWebView;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!m2.u1(context2)) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Intrinsics.checkNotNullParameter(context3, "context");
            InAppBrowserView inAppBrowserView = new InAppBrowserView(context3, null);
            inAppBrowserView.setId(p.opaque_one_tap_in_app_browser_view);
            inAppBrowserView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            inAppBrowserView.i(true);
            a aVar = new a(this);
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            inAppBrowserView.f45405r = aVar;
            inAppBrowserView.setAlpha(0.0f);
            this.f35366r = inAppBrowserView;
            addView(inAppBrowserView);
            InAppBrowserView inAppBrowserView2 = this.f35366r;
            this.f35365q = inAppBrowserView2 != null ? (GestaltText) inAppBrowserView2.findViewById(p.browser_bar_url) : null;
        }
        InAppBrowserView inAppBrowserView3 = this.f35366r;
        this.f35367s = (inAppBrowserView3 == null || (nestedScrollWebView = inAppBrowserView3.f45394g) == null) ? null : nestedScrollWebView.getUrl();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        BaseAdsBottomSheetBehavior baseAdsBottomSheetBehavior = new BaseAdsBottomSheetBehavior(context4, null, this.f53199a);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        if (m2.u1(context5)) {
            baseAdsBottomSheetBehavior.f35311l0 = false;
        }
        this.f35368t = baseAdsBottomSheetBehavior;
    }

    @Override // cu.i
    public void Z(float f13) {
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView != null) {
            inAppBrowserView.setAlpha(f13);
        }
        InAppBrowserView inAppBrowserView2 = this.f35366r;
        LinearLayout linearLayout = inAppBrowserView2 != null ? inAppBrowserView2.f45398k : null;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setAlpha(f13);
    }

    /* renamed from: d0, reason: from getter */
    public final String getF35367s() {
        return this.f35367s;
    }

    @Override // cu.i
    /* renamed from: g, reason: from getter */
    public BaseAdsBottomSheetBehavior getF35368t() {
        return this.f35368t;
    }

    public final void g0(b adsWebViewClient, li0.a adsWebChromeClient) {
        Intrinsics.checkNotNullParameter(adsWebViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(adsWebChromeClient, "webChromeClient");
        final InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView != null) {
            Intrinsics.checkNotNullParameter(adsWebViewClient, "adsWebViewClient");
            Intrinsics.checkNotNullParameter(adsWebChromeClient, "adsWebChromeClient");
            if (inAppBrowserView.f45392e == null) {
                Intrinsics.r("webViewManager");
                throw null;
            }
            NestedScrollWebView nestedScrollWebView = inAppBrowserView.f45394g;
            final int i13 = 0;
            k0.a(nestedScrollWebView, false);
            nestedScrollWebView.setWebViewClient(new u(i13, inAppBrowserView, adsWebViewClient));
            nestedScrollWebView.f52708i = (w) inAppBrowserView.f45409v.getValue();
            nestedScrollWebView.setWebChromeClient(new e(adsWebViewClient, inAppBrowserView, adsWebChromeClient));
            inAppBrowserView.f45399l.u(new gm1.a() { // from class: to0.s
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i14 = i13;
                    InAppBrowserView this$0 = inAppBrowserView;
                    switch (i14) {
                        case 0:
                            rl2.u[] uVarArr = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoBack()) {
                                this$0.f45394g.goBack();
                                return;
                            }
                            return;
                        case 1:
                            rl2.u[] uVarArr2 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoForward()) {
                                this$0.f45394g.goForward();
                                return;
                            }
                            return;
                        case 2:
                            rl2.u[] uVarArr3 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                fu.a aVar = this$0.f45405r;
                                if (aVar != null) {
                                    aVar.f62942a.b();
                                    return;
                                } else {
                                    Intrinsics.r("browserListener");
                                    throw null;
                                }
                            }
                            return;
                        case 3:
                            rl2.u[] uVarArr4 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.f45394g.reload();
                                return;
                            }
                            return;
                        default:
                            rl2.u[] uVarArr5 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f45394g.reload();
                            return;
                    }
                }
            });
            final int i14 = 1;
            inAppBrowserView.f45400m.u(new gm1.a() { // from class: to0.s
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i14;
                    InAppBrowserView this$0 = inAppBrowserView;
                    switch (i142) {
                        case 0:
                            rl2.u[] uVarArr = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoBack()) {
                                this$0.f45394g.goBack();
                                return;
                            }
                            return;
                        case 1:
                            rl2.u[] uVarArr2 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoForward()) {
                                this$0.f45394g.goForward();
                                return;
                            }
                            return;
                        case 2:
                            rl2.u[] uVarArr3 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                fu.a aVar = this$0.f45405r;
                                if (aVar != null) {
                                    aVar.f62942a.b();
                                    return;
                                } else {
                                    Intrinsics.r("browserListener");
                                    throw null;
                                }
                            }
                            return;
                        case 3:
                            rl2.u[] uVarArr4 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.f45394g.reload();
                                return;
                            }
                            return;
                        default:
                            rl2.u[] uVarArr5 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f45394g.reload();
                            return;
                    }
                }
            });
            final int i15 = 2;
            inAppBrowserView.f45401n.u(new gm1.a() { // from class: to0.s
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i15;
                    InAppBrowserView this$0 = inAppBrowserView;
                    switch (i142) {
                        case 0:
                            rl2.u[] uVarArr = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoBack()) {
                                this$0.f45394g.goBack();
                                return;
                            }
                            return;
                        case 1:
                            rl2.u[] uVarArr2 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoForward()) {
                                this$0.f45394g.goForward();
                                return;
                            }
                            return;
                        case 2:
                            rl2.u[] uVarArr3 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                fu.a aVar = this$0.f45405r;
                                if (aVar != null) {
                                    aVar.f62942a.b();
                                    return;
                                } else {
                                    Intrinsics.r("browserListener");
                                    throw null;
                                }
                            }
                            return;
                        case 3:
                            rl2.u[] uVarArr4 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.f45394g.reload();
                                return;
                            }
                            return;
                        default:
                            rl2.u[] uVarArr5 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f45394g.reload();
                            return;
                    }
                }
            });
            final int i16 = 3;
            inAppBrowserView.f45402o.u(new gm1.a() { // from class: to0.s
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i16;
                    InAppBrowserView this$0 = inAppBrowserView;
                    switch (i142) {
                        case 0:
                            rl2.u[] uVarArr = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoBack()) {
                                this$0.f45394g.goBack();
                                return;
                            }
                            return;
                        case 1:
                            rl2.u[] uVarArr2 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoForward()) {
                                this$0.f45394g.goForward();
                                return;
                            }
                            return;
                        case 2:
                            rl2.u[] uVarArr3 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                fu.a aVar = this$0.f45405r;
                                if (aVar != null) {
                                    aVar.f62942a.b();
                                    return;
                                } else {
                                    Intrinsics.r("browserListener");
                                    throw null;
                                }
                            }
                            return;
                        case 3:
                            rl2.u[] uVarArr4 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.f45394g.reload();
                                return;
                            }
                            return;
                        default:
                            rl2.u[] uVarArr5 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f45394g.reload();
                            return;
                    }
                }
            });
            final int i17 = 4;
            inAppBrowserView.f45397j.u(new gm1.a() { // from class: to0.s
                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i142 = i17;
                    InAppBrowserView this$0 = inAppBrowserView;
                    switch (i142) {
                        case 0:
                            rl2.u[] uVarArr = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoBack()) {
                                this$0.f45394g.goBack();
                                return;
                            }
                            return;
                        case 1:
                            rl2.u[] uVarArr2 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if ((it instanceof om1.l) && this$0.f45394g.canGoForward()) {
                                this$0.f45394g.goForward();
                                return;
                            }
                            return;
                        case 2:
                            rl2.u[] uVarArr3 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                fu.a aVar = this$0.f45405r;
                                if (aVar != null) {
                                    aVar.f62942a.b();
                                    return;
                                } else {
                                    Intrinsics.r("browserListener");
                                    throw null;
                                }
                            }
                            return;
                        case 3:
                            rl2.u[] uVarArr4 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it instanceof om1.l) {
                                this$0.f45394g.reload();
                                return;
                            }
                            return;
                        default:
                            rl2.u[] uVarArr5 = InAppBrowserView.f45390w;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.f45394g.reload();
                            return;
                    }
                }
            });
            nestedScrollWebView.f52707h = ViewConfiguration.get(inAppBrowserView.getContext()).getScaledTouchSlop();
        }
    }

    @Override // cu.i
    public int k() {
        return q.ads_closeup_browser_bottom_sheet;
    }

    public final boolean k0() {
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView == null) {
            return true;
        }
        NestedScrollWebView nestedScrollWebView = inAppBrowserView.f45394g;
        if (!nestedScrollWebView.canGoBack()) {
            return true;
        }
        nestedScrollWebView.goBack();
        return false;
    }

    @Override // cu.i
    public void o() {
        c cVar;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!m2.u1(context)) {
            e();
            return;
        }
        cu.a aVar = this.f53211m;
        if (aVar == null || (cVar = ((BaseAdsScrollingModule) aVar).f35327n0) == null) {
            return;
        }
        cVar.d5();
    }

    public final void o0(String str) {
        GestaltText gestaltText = this.f35365q;
        if (gestaltText != null) {
            a0.p(gestaltText, String.valueOf(str));
        }
    }

    public final void r0(String url) {
        this.f35367s = url;
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView != null) {
            inAppBrowserView.f45408u = true;
        }
        if (url == null || inAppBrowserView == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (URLUtil.isValidUrl(url)) {
            inAppBrowserView.f45394g.loadUrl(url);
            return;
        }
        a0.p(inAppBrowserView.f45396i, url);
        bs1.c.X0(inAppBrowserView.f45394g);
        LegoFloatingBottomActionBar legoFloatingBottomActionBar = inAppBrowserView.f45404q;
        if (legoFloatingBottomActionBar == null) {
            Intrinsics.r("floatingBottomActionBar");
            throw null;
        }
        bs1.c.X0(legoFloatingBottomActionBar);
        bs1.c.U1(inAppBrowserView.f45395h);
    }

    @Override // cu.i
    public void x() {
        i().i(fu.b.f62943i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsBrowserBottomSheet(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsBrowserBottomSheet(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
