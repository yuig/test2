package to0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import df.j1;
import ey.e5;
import h32.f1;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.HashMap;
import kh2.k3;
import m60.x0;
import nt.c2;
import nx.d0;
import q8.m0;

/* loaded from: classes5.dex */
public final class d extends WebViewClient {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f118641d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro0.e f118642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f118643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f118644c;

    public d(g gVar, ro0.g gVar2, WebView webView) {
        this.f118644c = gVar;
        this.f118642a = gVar2;
        this.f118643b = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z13) {
        Uri parse = Uri.parse(str);
        if (parse.getQuery() == null || !parse.getQuery().equals("dismissWebview=true")) {
            super.doUpdateVisitedHistory(webView, str, z13);
        } else {
            this.f118644c.dismiss();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ro0.e eVar = this.f118642a;
        eVar.getClass();
        new e5(1).i();
        eVar.f108947h = true;
        if (eVar.f108941b != null) {
            qo0.a aVar = (qo0.a) eVar.f139226a;
            long currentTimeMillis = System.currentTimeMillis() - eVar.f108941b.longValue();
            String b13 = eVar.f108959t.b();
            aVar.getClass();
            HashMap hashMap = new HashMap(aVar.f104523i);
            hashMap.put("url", str);
            hashMap.put("is_promoted_pin", String.valueOf(aVar.f104522h));
            f1 f1Var = f1.SAVE_BROWSER_URL_NAVIGATE;
            String str2 = aVar.f122380b;
            d0 d0Var = aVar.f122379a;
            d0Var.g(f1Var, str2, hashMap, false);
            HashMap hashMap2 = new HashMap(aVar.f104523i);
            hashMap2.put("url", str);
            hashMap2.put("page_load_finished", String.valueOf(currentTimeMillis));
            hashMap2.put("connection_type", b13);
            hashMap2.put("is_promoted_pin", String.valueOf(aVar.f104522h));
            d0Var.g(f1.URL_LOAD_FINISHED, aVar.f122380b, hashMap2, false);
        }
        g gVar = (g) ((po0.d) eVar.getView());
        k3.R1(gVar.f118655i0, false);
        gVar.f118655i0.setProgress(0);
        gVar.e8();
        if (eVar.f108948i) {
            eVar.s3();
            eVar.f108948i = false;
            if (eVar.f108951l.f100887n || pk.a0.x0(str)) {
                return;
            }
            gVar.c8(x0.loading_pins_webpage, j1.k0(str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        ro0.e eVar = this.f118642a;
        po0.d dVar = (po0.d) eVar.getView();
        if (eVar.G3(str)) {
            eVar.f108941b = null;
            ((g) dVar).dismiss();
            return;
        }
        qo0.a aVar = (qo0.a) eVar.f139226a;
        aVar.getClass();
        HashMap hashMap = new HashMap(aVar.f104523i);
        hashMap.put("url", str);
        hashMap.put("is_promoted_pin", String.valueOf(aVar.f104522h));
        f1 f1Var = f1.LOAD_URL;
        String str2 = aVar.f122380b;
        d0 d0Var = aVar.f122379a;
        d0Var.g(f1Var, str2, hashMap, false);
        d0Var.g(f1.URL_LOAD_STARTED, aVar.f122380b, hashMap, false);
        eVar.f108941b = Long.valueOf(System.currentTimeMillis());
        if (eVar.F3(str)) {
            g gVar = (g) dVar;
            gVar.d8(str);
            ne0.b bVar = new ne0.b(gVar, 1);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                gVar.f118659m0.post(bVar);
                return;
            } else {
                bVar.run();
                return;
            }
        }
        g gVar2 = (g) dVar;
        k3.R1(gVar2.f118655i0, true);
        eVar.f108947h = false;
        eVar.f108944e = 0;
        gVar2.e8();
        if (str == null || str.equals(eVar.f108943d)) {
            return;
        }
        eVar.f108943d = str;
        eVar.f108950k++;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i13, String str, String str2) {
        this.f118642a.z3(i13, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            String uri = webResourceRequest.getUrl().toString();
            this.f118642a.z3(webResourceResponse.getStatusCode(), uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if ("http".equals(webResourceRequest.getUrl().getScheme())) {
            WebView webView2 = this.f118643b;
            webView2.post(new c2(webView2, 21));
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ro0.e eVar = this.f118642a;
        eVar.getClass();
        if (str != null && str.startsWith("https://ads.pinterest.com/") && str.contains("/billing/simplest/?success=true")) {
            m60.u.f85943a.d(new m0(true));
            ((g) ((po0.d) eVar.getView())).dismiss();
        }
        return eVar.G3(str);
    }
}
