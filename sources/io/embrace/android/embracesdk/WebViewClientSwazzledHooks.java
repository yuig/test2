package io.embrace.android.embracesdk;

import android.graphics.Bitmap;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class WebViewClientSwazzledHooks {
    private WebViewClientSwazzledHooks() {
    }

    public static void _preOnPageStarted(WebView webView, String str, Bitmap bitmap) {
        Embrace.getInstance().logWebView(str);
    }
}
