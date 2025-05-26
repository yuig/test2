package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class i21 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.t6 f6181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Timer f6182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l21 f6183c;

    public i21(l21 l21Var, a.t6 t6Var, Timer timer) {
        this.f6183c = l21Var;
        this.f6181a = t6Var;
        this.f6182b = timer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WebView webView = this.f6183c.f7621b;
        int i13 = ab.e.f1688a;
        if (!bb.k.f22455c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        bb.l.f22459a.createWebView(webView).removeWebMessageListener("omidJsSessionService");
        nr1.a((tr1) ((a.z0) this.f6181a).f196b, true);
        this.f6182b.cancel();
    }
}
