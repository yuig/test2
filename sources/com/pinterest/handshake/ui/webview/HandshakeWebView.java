package com.pinterest.handshake.ui.webview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import fo1.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import l82.c;
import m60.x0;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import rp1.b;
import to0.u;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/handshake/ui/webview/HandshakeWebView;", "Landroid/widget/FrameLayout;", "", "org/chromium/net/y", "handshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HandshakeWebView extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final List f49726g = f0.j("shop-external.amazon", "amazon.com");

    /* renamed from: a, reason: collision with root package name */
    public final String f49727a;

    /* renamed from: b, reason: collision with root package name */
    public final a f49728b;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f49729c;

    /* renamed from: d, reason: collision with root package name */
    public final ProgressBar f49730d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49731e;

    /* renamed from: f, reason: collision with root package name */
    public String f49732f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HandshakeWebView(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1.<init>(r4, r5, r2, r0)
            java.lang.String r2 = "AmazonShopExternalInterfaceHandler"
            r1.f49727a = r2
            java.lang.String r2 = ""
            r1.f49732f = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r4)
            int r3 = sp1.d.handshake_webview
            r4 = 1
            r2.inflate(r3, r1, r4)
            int r2 = sp1.c.webview
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            r1.f49729c = r2
            int r2 = sp1.c.webview_progress_bar
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1.f49730d = r2
            int r2 = sp1.c.toolbar
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            fo1.a r2 = (fo1.a) r2
            r1.f49728b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.handshake.ui.webview.HandshakeWebView.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final void a() {
        WebView webView = this.f49729c;
        webView.stopLoading();
        webView.setWebChromeClient(null);
        webView.removeJavascriptInterface(this.f49727a);
    }

    public final void b(b amazonJSInterface, c eventIntake) {
        Intrinsics.checkNotNullParameter(amazonJSInterface, "amazonJSInterface");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        q qVar = q.ARROW_BACK;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable f03 = bs1.c.f0(this, qVar.drawableRes(context, dl2.b.f1(context2)), Integer.valueOf(eo1.b.color_themed_text_default), null, 4);
        String string = getContext().getResources().getString(x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) this.f49728b;
        gestaltToolbarImpl.T(f03, string);
        gestaltToolbarImpl.N(1);
        int i13 = 0;
        gestaltToolbarImpl.f49713m = new qp1.b(eventIntake, i13);
        u uVar = new u(1, this, eventIntake);
        WebView webView = this.f49729c;
        webView.setWebViewClient(uVar);
        webView.setWebChromeClient(new qp1.c(this, i13));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSafeBrowsingEnabled(true);
        webView.addJavascriptInterface(amazonJSInterface, this.f49727a);
    }

    public final void c(String url, String title, Map map) {
        Unit unit;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f49732f = title;
        WebView webView = this.f49729c;
        if (map != null) {
            webView.loadUrl(url, map);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            webView.loadUrl(url);
        }
    }

    public final void d() {
        this.f49729c.reload();
    }

    public final void e() {
        this.f49729c.goBack();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandshakeWebView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandshakeWebView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
