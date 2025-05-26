package ke;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final String f79280a = a.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    public final int f79281b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f79282c = 14290;

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String format = String.format(Locale.getDefault(), "cedexis.start(%d,%d,%d,%d);", Integer.valueOf(this.f79281b), Integer.valueOf(this.f79282c), 2, 3);
        String format2 = String.format("Detected version: %d", Integer.valueOf(Build.VERSION.SDK_INT));
        String str2 = this.f79280a;
        Log.d(str2, format2);
        try {
            Log.d(str2, "Using evaluateJavascript; start command=".concat(format));
            webView.evaluateJavascript("console.log('sending cedexis commands');", null);
            webView.evaluateJavascript(format, null);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return !Uri.parse(str).getHost().equals("radar.cedexis.com");
    }
}
