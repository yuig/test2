package ads_mobile_sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class fr1 {

    /* renamed from: a, reason: collision with root package name */
    public static final fr1 f5252a = new fr1();

    public final void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            sb3.append("if(window.omidBridge!==undefined){omidBridge.");
            sb3.append(str);
            sb3.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb3.append("null");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb3.append(obj2);
                        } else {
                            sb3.append('\"');
                            sb3.append(obj2);
                            sb3.append('\"');
                        }
                    } else {
                        sb3.append(obj);
                    }
                    sb3.append(",");
                }
                sb3.setLength(sb3.length() - 1);
            }
            sb3.append(")}");
            String sb4 = sb3.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                a(webView, sb4);
            } else {
                handler.post(new er1(this, webView, sb4));
            }
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (Exception e13) {
            e13.getMessage();
        }
    }
}
