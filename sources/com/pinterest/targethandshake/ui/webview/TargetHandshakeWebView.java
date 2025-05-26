package com.pinterest.targethandshake.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import fo1.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/targethandshake/ui/webview/TargetHandshakeWebView;", "Landroid/widget/FrameLayout;", "", "targetHandshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TargetHandshakeWebView extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final List f52187g = f0.j("www-partners.target", "target.com");

    /* renamed from: a, reason: collision with root package name */
    public final String f52188a;

    /* renamed from: b, reason: collision with root package name */
    public final a f52189b;

    /* renamed from: c, reason: collision with root package name */
    public final WebView f52190c;

    /* renamed from: d, reason: collision with root package name */
    public final ProgressBar f52191d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52192e;

    /* renamed from: f, reason: collision with root package name */
    public String f52193f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TargetHandshakeWebView(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
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
            java.lang.String r2 = "TargetAccountLinkingInterfaceHandler"
            r1.f52188a = r2
            java.lang.String r2 = ""
            r1.f52193f = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r4)
            int r3 = x82.d.target_handshake_webview
            r4 = 1
            r2.inflate(r3, r1, r4)
            int r2 = x82.c.webview
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            r1.f52190c = r2
            int r2 = x82.c.webview_progress_bar
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1.f52191d = r2
            int r2 = x82.c.toolbar
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            fo1.a r2 = (fo1.a) r2
            r1.f52189b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final void a() {
        WebView webView = this.f52190c;
        webView.stopLoading();
        webView.setWebChromeClient(null);
        webView.removeJavascriptInterface(this.f52188a);
    }

    public final void b(String url, String title, Map map) {
        Unit unit;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f52193f = title;
        WebView webView = this.f52190c;
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

    public final void c() {
        this.f52190c.goBack();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetHandshakeWebView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetHandshakeWebView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
