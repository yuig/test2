package jn;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import df.n1;
import fn.h;
import fn.i;
import hn.g;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.quikkly.android.ui.CameraPreview;
import oi.o6;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public WebView f77075g;

    /* renamed from: h, reason: collision with root package name */
    public Long f77076h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f77077i;

    /* renamed from: j, reason: collision with root package name */
    public final String f77078j;

    public d(String str, String str2, Map map) {
        super(str);
        this.f77076h = null;
        this.f77077i = map;
        this.f77078j = str2;
    }

    @Override // jn.b
    public final void b(i iVar, android.support.v4.media.a aVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((Map) aVar.f15841e);
        for (String str : unmodifiableMap.keySet()) {
            h hVar = (h) unmodifiableMap.get(str);
            hVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            kn.b.b(jSONObject2, "vendorKey", hVar.f62588a);
            kn.b.b(jSONObject2, "resourceUrl", hVar.f62589b.toString());
            kn.b.b(jSONObject2, "verificationParameters", hVar.f62590c);
            kn.b.b(jSONObject, str, jSONObject2);
        }
        c(iVar, aVar, jSONObject);
    }

    @Override // jn.b
    public final void h() {
        super.h();
        new Handler().postDelayed(new o6(this), Math.max(4000 - (this.f77076h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f77076h.longValue(), TimeUnit.NANOSECONDS)), CameraPreview.AUTOFOCUS_INTERVAL_MILLIS));
        this.f77075g = null;
    }

    @Override // jn.b
    public final void k() {
        WebView webView = new WebView(g.f69601b.f69602a);
        this.f77075g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f77075g.getSettings().setAllowContentAccess(false);
        this.f77075g.getSettings().setAllowFileAccess(false);
        this.f77075g.setWebViewClient(new n1(this, 1));
        this.f77070b = new nn.a(this.f77075g);
        WebView webView2 = this.f77075g;
        if (webView2 != null) {
            String str = this.f77078j;
            if (!TextUtils.isEmpty(str)) {
                try {
                    webView2.evaluateJavascript(str, null);
                } catch (IllegalStateException unused) {
                    webView2.loadUrl("javascript: " + str);
                }
            }
        }
        Map map = this.f77077i;
        for (String str2 : map.keySet()) {
            String externalForm = ((h) map.get(str2)).f62589b.toExternalForm();
            WebView webView3 = this.f77075g;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    try {
                        webView3.evaluateJavascript(replace, null);
                    } catch (IllegalStateException unused2) {
                        webView3.loadUrl("javascript: " + replace);
                    }
                }
            }
        }
        this.f77076h = Long.valueOf(System.nanoTime());
    }
}
