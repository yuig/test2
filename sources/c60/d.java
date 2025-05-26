package c60;

import android.content.SharedPreferences;
import com.pinterest.api.model.wy0;
import df.j1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.n;
import nm.s;
import nm.u;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f26513a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f26514b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final v f26515c = m.b(c.f26512i);

    /* renamed from: d, reason: collision with root package name */
    public static a f26516d;

    public static final String a() {
        a aVar = f26516d;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public static final boolean b() {
        String a13 = a();
        return !(a13 == null || a13.length() == 0);
    }

    public static boolean c(OkHttpClient httpClient, String apiHost, String userAgent) {
        String str;
        String d2;
        String d13;
        String str2;
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        a aVar = f26516d;
        if (aVar == null || (str = aVar.f26509c) == null) {
            return false;
        }
        FormBody.Builder builder = new FormBody.Builder(0);
        builder.a("refresh_token", str);
        FormBody formBody = new FormBody(builder.f95616b, builder.f95617c);
        Request.Builder builder2 = new Request.Builder();
        String format = String.format("https://%s/v3/tokens/refresh/", Arrays.copyOf(new Object[]{apiHost}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        builder2.j(format);
        Object value = f26515c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        builder2.d("Authorization", "Basic " + ((String) value));
        builder2.d("User-Agent", userAgent);
        builder2.g(formBody);
        Response e13 = httpClient.newCall(builder2.b()).e();
        if (e13.f95723d != 200) {
            return false;
        }
        vd0.c cVar = null;
        ResponseBody responseBody = e13.f95726g;
        s v13 = j1.p1(responseBody != null ? responseBody.string() : null).i().v("data");
        if (v13 != null && (v13 instanceof u)) {
            cVar = new vd0.c((u) v13);
        }
        if (cVar == null || (d2 = cVar.d("access_token")) == null || (d13 = cVar.d("refresh_token")) == null) {
            return false;
        }
        a aVar2 = f26516d;
        if (aVar2 == null || (str2 = aVar2.f26507a) == null) {
            str2 = "";
        }
        d(new a(str2, d2, d13));
        return true;
    }

    public static void d(a accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        synchronized (f26514b) {
            f26516d = accessToken;
            e(accessToken);
            Unit unit = Unit.f80348a;
        }
    }

    public static void e(a authToken) {
        String userUid;
        lb0.b bVar = (lb0.b) n.f82725d.a();
        bVar.n("PREF_ACCESSTOKEN", authToken.f26507a);
        String str = authToken.f26508b;
        if (str != null) {
            bVar.n("PREF_V5_ACCESS_TOKEN", str);
        }
        String str2 = authToken.f26509c;
        if (str2 != null) {
            bVar.n("PREF_V5_REFRESH_TOKEN", str2);
        }
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 == null || (userUid = f13.getUid()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        SharedPreferences a13 = a60.a.a(null);
        String string = a13.getString(userUid, null);
        if (string != null) {
            u i13 = j1.p1(string).i();
            i13.u("PREF_ACCESSTOKEN", authToken.f26507a);
            i13.u("PREF_V5_ACCESS_TOKEN", str);
            i13.u("PREF_V5_REFRESH_TOKEN", str2);
            a13.edit().putString(userUid, i13.toString()).apply();
        }
    }
}
