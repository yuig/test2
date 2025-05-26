package le;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import df.c1;
import df.j1;
import df.k1;
import df.u0;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import t3.s1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: j */
    public static final String f83002j;

    /* renamed from: k */
    public static final String f83003k;

    /* renamed from: l */
    public static final Pattern f83004l;

    /* renamed from: m */
    public static volatile String f83005m;

    /* renamed from: a */
    public final AccessToken f83006a;

    /* renamed from: b */
    public final String f83007b;

    /* renamed from: c */
    public JSONObject f83008c;

    /* renamed from: d */
    public Bundle f83009d;

    /* renamed from: e */
    public Object f83010e;

    /* renamed from: f */
    public final String f83011f;

    /* renamed from: g */
    public x f83012g;

    /* renamed from: h */
    public f0 f83013h;

    /* renamed from: i */
    public boolean f83014i;

    static {
        int i13 = 0;
        String simpleName = a0.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "GraphRequest::class.java.simpleName");
        f83002j = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb3 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            do {
                i13++;
                sb3.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i13 < nextInt);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "buffer.toString()");
        f83003k = sb4;
        f83004l = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public a0(AccessToken accessToken, String str, Bundle bundle, f0 f0Var, x xVar) {
        this.f83006a = accessToken;
        this.f83007b = str;
        this.f83011f = null;
        k(xVar);
        l(f0Var);
        if (bundle != null) {
            this.f83009d = new Bundle(bundle);
        } else {
            this.f83009d = new Bundle();
        }
        this.f83011f = v.e();
    }

    public static String g() {
        String b13 = v.b();
        String c13 = v.c();
        if (b13.length() <= 0 || c13.length() <= 0) {
            return null;
        }
        return b13 + '|' + c13;
    }

    public final void b() {
        Bundle bundle = this.f83009d;
        String f13 = f();
        boolean E = f13 == null ? false : StringsKt.E(f13, "|", false);
        if ((f13 == null || !kotlin.text.z.p(f13, "IG", false) || E || !j()) && (!Intrinsics.d(v.f(), "instagram.com") || (!j()) || E)) {
            String f14 = f();
            if (f14 != null) {
                bundle.putString("access_token", f14);
            }
        } else {
            bundle.putString("access_token", g());
        }
        if (!bundle.containsKey("access_token") && j1.V0(v.c())) {
            Log.w(f83002j, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        v vVar = v.f83104a;
        v.i(g0.GRAPH_API_DEBUG_INFO);
        v.i(g0.GRAPH_API_DEBUG_WARNING);
    }

    public final String c(String str, boolean z13) {
        if (!z13 && this.f83013h == f0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f83009d.keySet()) {
            Object obj = this.f83009d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (wc.b.w(obj)) {
                buildUpon.appendQueryParameter(str2, wc.b.e(obj).toString());
            } else if (this.f83013h != f0.GET) {
                throw new IllegalArgumentException(s1.e(new Object[]{obj.getClass().getSimpleName()}, 1, Locale.US, "Unsupported parameter type for GET request: %s", "java.lang.String.format(locale, format, *args)"));
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final e0 d() {
        Intrinsics.checkNotNullParameter(this, "request");
        a0[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = kotlin.collections.c0.b0(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        ArrayList o13 = wc.b.o(new d0(requests2));
        if (o13.size() == 1) {
            return (e0) o13.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final b0 e() {
        a0[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = kotlin.collections.c0.b0(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        d0 requests3 = new d0(requests2);
        Intrinsics.checkNotNullParameter(requests3, "requests");
        k1.c(requests3);
        b0 b0Var = new b0(requests3);
        b0Var.executeOnExecutor(v.d(), new Void[0]);
        return b0Var;
    }

    public final String f() {
        AccessToken accessToken = this.f83006a;
        if (accessToken != null) {
            if (!this.f83009d.containsKey("access_token")) {
                String f29851e = accessToken.getF29851e();
                u0.f54860d.F(f29851e);
                return f29851e;
            }
        } else if (!this.f83009d.containsKey("access_token")) {
            return g();
        }
        return this.f83009d.getString("access_token");
    }

    public final String h() {
        String d2;
        String str;
        if (this.f83013h == f0.POST && (str = this.f83007b) != null && kotlin.text.z.h(str, "/videos", false)) {
            d2 = c1.d();
        } else {
            int i13 = c1.f54739a;
            String subdomain = v.f();
            Intrinsics.checkNotNullParameter(subdomain, "subdomain");
            d2 = s1.d(new Object[]{subdomain}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String i14 = i(d2);
        b();
        return c(i14, false);
    }

    public final String i(String str) {
        if (Intrinsics.d(v.f(), "instagram.com") && !(!j())) {
            str = c1.b();
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        String str2 = this.f83007b;
        if (!f83004l.matcher(str2).matches()) {
            str2 = s1.d(new Object[]{this.f83011f, str2}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = str2;
        return s1.d(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    public final boolean j() {
        String str = this.f83007b;
        if (str == null) {
            return false;
        }
        StringBuilder sb3 = new StringBuilder("^/?");
        sb3.append(v.b());
        sb3.append("/?.*");
        return this.f83014i || Pattern.matches(sb3.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void k(x xVar) {
        v vVar = v.f83104a;
        v.i(g0.GRAPH_API_DEBUG_INFO);
        v.i(g0.GRAPH_API_DEBUG_WARNING);
        this.f83012g = xVar;
    }

    public final void l(f0 f0Var) {
        if (f0Var == null) {
            f0Var = f0.GET;
        }
        this.f83013h = f0Var;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f83006a;
        if (obj == null) {
            obj = "null";
        }
        sb3.append(obj);
        sb3.append(", graphPath: ");
        sb3.append(this.f83007b);
        sb3.append(", graphObject: ");
        sb3.append(this.f83008c);
        sb3.append(", httpMethod: ");
        sb3.append(this.f83013h);
        sb3.append(", parameters: ");
        sb3.append(this.f83009d);
        sb3.append("}");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb4;
    }
}
