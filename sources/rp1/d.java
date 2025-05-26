package rp1;

import android.webkit.CookieManager;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import nx.r0;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final lv.a f109059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f109060b;

    /* renamed from: c, reason: collision with root package name */
    public final k f109061c;

    /* renamed from: d, reason: collision with root package name */
    public final String f109062d;

    /* renamed from: e, reason: collision with root package name */
    public final String f109063e;

    /* renamed from: f, reason: collision with root package name */
    public final String f109064f;

    /* renamed from: g, reason: collision with root package name */
    public final String f109065g;

    /* renamed from: h, reason: collision with root package name */
    public final String f109066h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f109067i;

    public d(lv.a adsQuarantine, int i13) {
        Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
        c cookieManagerDelegate = c.f109058i;
        Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
        Intrinsics.checkNotNullParameter(cookieManagerDelegate, "cookieManagerDelegate");
        this.f109059a = adsQuarantine;
        this.f109060b = i13;
        this.f109061c = m.a(n.NONE, new r0(this, 22));
        this.f109062d = "https://web.shop-external.amazon/";
        this.f109063e = "x-aa-api-key";
        this.f109064f = "x-aa-customer-token";
        this.f109065g = "session-aa-os-name";
        this.f109066h = "session-aa-os-version";
        this.f109067i = new LinkedHashSet();
    }

    public final void a() {
        this.f109059a.getClass();
        if (lv.a.a()) {
            CookieManager b13 = b();
            String p13 = a.a.p(new StringBuilder(), this.f109063e, "=; Max-Age=-1");
            String str = this.f109062d;
            b13.setCookie(str, p13);
            b().setCookie(str, this.f109064f + "=; Max-Age=-1");
            b().setCookie(str, this.f109065g + "=; Max-Age=-1");
            b().setCookie(str, this.f109066h + "=; Max-Age=-1");
            this.f109067i.clear();
        }
    }

    public final CookieManager b() {
        return (CookieManager) this.f109061c.getValue();
    }

    public final void c(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f109059a.getClass();
        if (lv.a.a()) {
            CookieManager b13 = b();
            StringBuilder sb3 = new StringBuilder();
            String str = this.f109063e;
            b13.setCookie(this.f109062d, a.a.q(sb3, str, "=", apiKey, "; secure; httponly"));
            this.f109067i.add(str);
        }
    }
}
