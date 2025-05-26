package is1;

import android.webkit.WebSettings;
import android.webkit.WebView;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f73618b;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.x f73619a;

    public k0(androidx.appcompat.widget.x deepLinkLogging) {
        Intrinsics.checkNotNullParameter(deepLinkLogging, "deepLinkLogging");
        this.f73619a = deepLinkLogging;
    }

    public static void a(WebView webVw, boolean z13) {
        Intrinsics.checkNotNullParameter(webVw, "webVw");
        WebSettings settings = webVw.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(z13);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(settings.getUserAgentString() + " [Pinterest/Android]");
        settings.setSupportMultipleWindows(true);
    }

    public final boolean b(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (j1.I0(host) && !kotlin.text.z.i(host, "pinterest.com", true) && !kotlin.text.z.i(host, "ads.pinterest.com", true) && !kotlin.text.z.i(host, "analytics.pinterest.com", true) && !kotlin.text.z.i(host, "pin.it", true)) {
            String[] strArr = (String[]) StringsKt.V(host, new char[]{'.'}).toArray(new String[0]);
            if ((strArr.length != 3 && strArr.length != 4) || (!kotlin.text.z.i(strArr[0], "www", true) && strArr[0].length() != 2)) {
                this.f73619a.v("webview");
                return true;
            }
        }
        return false;
    }
}
