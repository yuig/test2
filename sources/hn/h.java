package hn;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f69603a = new h();

    public static void b(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
        }
    }

    public final void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            sb3.append("if(window.omidBridge!==undefined){omidBridge.");
            sb3.append(str);
            sb3.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "null";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb3.append('\"');
                                sb3.append(obj);
                                sb3.append('\"');
                            }
                        } else {
                            sb3.append(obj2);
                        }
                        sb3.append(",");
                    }
                    sb3.append(obj);
                    sb3.append(",");
                }
                sb3.setLength(sb3.length() - 1);
            }
            sb3.append(")}");
            String sb4 = sb3.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                b(webView, sb4);
            } else {
                handler.post(new s.f((Object) this, (Object) webView, sb4, 21));
            }
        }
    }
}
