package ads_mobile_sdk;

import a.r2;
import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kh2.g0;

/* loaded from: classes2.dex */
public final class l21 {

    /* renamed from: a, reason: collision with root package name */
    public final rv1 f7620a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f7621b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7622c;

    /* renamed from: d, reason: collision with root package name */
    public r2 f7623d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7624e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final yh0 f7625f = new yh0();

    public l21(rv1 rv1Var, WebView webView, boolean z13) {
        if (!a.ng.f126a.f12616a) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        if (rv1Var == null) {
            throw new IllegalArgumentException("Partner is null");
        }
        if (webView == null) {
            throw new IllegalArgumentException("WebView is null");
        }
        this.f7620a = rv1Var;
        this.f7621b = webView;
        this.f7622c = z13;
        if (z13) {
            a(webView);
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        r2 r2Var = this.f7623d;
        if ((r2Var == null ? null : (View) r2Var.get()) == view) {
            return;
        }
        Iterator it = this.f7624e.values().iterator();
        while (it.hasNext()) {
            ((a.e9) it.next()).a(view);
        }
        this.f7623d = new r2(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        r3 b13;
        ts tsVar = ts.f11652b;
        fr0 fr0Var = fr0.f5246b;
        lu1 lu1Var = lu1.f7984c;
        q3 a13 = q3.a(tsVar, fr0Var, lu1Var, lu1Var, false);
        if (this.f7622c) {
            b13 = r3.a(this.f7620a, this.f7621b, null, null);
        } else {
            b13 = r3.b(this.f7620a, this.f7621b, null, null);
        }
        t3 t3Var = new t3(a13, b13, str);
        this.f7624e.put(str, t3Var);
        r2 r2Var = this.f7623d;
        t3Var.a(r2Var != null ? (View) r2Var.get() : null);
        Iterator it = this.f7625f.f14246a.iterator();
        while (it.hasNext()) {
            wh0 wh0Var = (wh0) it.next();
            View view = (View) wh0Var.f13039a.get();
            xh0 xh0Var = wh0Var.f13041c;
            String str2 = wh0Var.f13042d;
            if (!t3Var.f11331f) {
                t3Var.f11327b.a(view, xh0Var, str2);
            }
        }
        t3Var.b();
    }

    public final void a() {
        if (g0.f0("WEB_MESSAGE_LISTENER")) {
            WebView webView = this.f7621b;
            int i13 = ab.e.f1688a;
            bb.b bVar = bb.k.f22455c;
            if (bVar.b()) {
                bb.m mVar = bb.l.f22459a;
                mVar.createWebView(webView).removeWebMessageListener("omidJsSessionService");
                j21 j21Var = new j21(this);
                WebView webView2 = this.f7621b;
                HashSet hashSet = new HashSet(Arrays.asList("*"));
                if (bVar.b()) {
                    mVar.createWebView(webView2).addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), new lp2.a(new t5.e(j21Var, 25)));
                    return;
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }
}
