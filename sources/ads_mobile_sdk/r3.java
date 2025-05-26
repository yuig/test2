package ads_mobile_sdk;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final rv1 f10423a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f10424b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10425c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10426d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final String f10427e = null;

    /* renamed from: f, reason: collision with root package name */
    public final String f10428f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10429g;

    /* renamed from: h, reason: collision with root package name */
    public final s3 f10430h;

    public r3(rv1 rv1Var, WebView webView, String str, String str2, s3 s3Var) {
        this.f10423a = rv1Var;
        this.f10424b = webView;
        this.f10430h = s3Var;
        this.f10429g = str;
        this.f10428f = str2;
    }

    public static r3 a(rv1 rv1Var, WebView webView, String str, String str2) {
        if (rv1Var == null) {
            throw new IllegalArgumentException("Partner is null");
        }
        if (webView == null) {
            throw new IllegalArgumentException("WebView is null");
        }
        if (str2 == null || str2.length() <= 256) {
            return new r3(rv1Var, webView, str, str2, s3.f10908b);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public static r3 b(rv1 rv1Var, WebView webView, String str, String str2) {
        if (rv1Var == null) {
            throw new IllegalArgumentException("Partner is null");
        }
        if (webView == null) {
            throw new IllegalArgumentException("WebView is null");
        }
        if (str2 == null || str2.length() <= 256) {
            return new r3(rv1Var, webView, str, str2, s3.f10909c);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public final String c() {
        return this.f10427e;
    }

    public final WebView d() {
        return this.f10424b;
    }

    public final s3 a() {
        return this.f10430h;
    }

    public final Map b() {
        return Collections.unmodifiableMap(this.f10426d);
    }
}
