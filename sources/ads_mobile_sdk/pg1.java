package ads_mobile_sdk;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;

/* loaded from: classes2.dex */
public final class pg1 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rg1 f9675a;

    public pg1(rg1 rg1Var) {
        this.f9675a = rg1Var;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
        if (((WebView) this.f9675a.f12300b.get()) == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            rg1 rg1Var = this.f9675a;
            rg1Var.getClass();
            rg1Var.f12300b = new a.m3(null);
        }
        webView.destroy();
        return true;
    }
}
