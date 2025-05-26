package ads_mobile_sdk;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class er1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f4927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr1 f4929c;

    public er1(fr1 fr1Var, WebView webView, String str) {
        this.f4929c = fr1Var;
        this.f4927a = webView;
        this.f4928b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fr1 fr1Var = this.f4929c;
        WebView webView = this.f4927a;
        String str = this.f4928b;
        fr1Var.getClass();
        fr1.a(webView, str);
    }
}
