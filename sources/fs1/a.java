package fs1;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.webkit.WebView;
import bb.p;
import is1.k0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f62928a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f62929b;

    public a(b bVar, k0 k0Var) {
        this.f62928a = bVar;
        this.f62929b = k0Var;
    }

    public final void a() {
        ViewGroup a13;
        this.f62929b.getClass();
        if (k0.f73618b && (a13 = this.f62928a.a()) != null) {
            int i13 = ds1.b.cedexis_web_view;
            try {
                WebView webView = (WebView) a13.findViewById(i13);
                if (webView == null) {
                    webView = new WebView(a13.getContext());
                    webView.setId(i13);
                    a13.addView(webView);
                }
                new p(webView).g();
            } catch (Resources.NotFoundException unused) {
            }
        }
    }
}
