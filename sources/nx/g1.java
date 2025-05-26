package nx;

import java.io.IOException;
import java.net.ConnectException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class g1 implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f92398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92399b;

    public g1(String apiHost, String trkHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(trkHost, "trkHost");
        this.f92398a = apiHost;
        this.f92399b = trkHost;
    }

    public static boolean b(String str) {
        String str2;
        Regex regex = new Regex("net::ERR_CONNECTION_REFUSED");
        kotlin.text.j b13 = new Regex("ErrorCode=(\\d+)").b(0, str);
        Integer intOrNull = (b13 == null || (str2 = (String) CollectionsKt.U(1, b13.b())) == null) ? null : StringsKt.toIntOrNull(str2);
        return regex.a(str) && intOrNull != null && intOrNull.intValue() == 7;
    }

    public final Request a(Request request) {
        HttpUrl httpUrl = request.f95700a;
        String str = httpUrl.f95639i;
        List j13 = kotlin.collections.f0.j("v3/callback/ping", "v3/callback/event");
        if ((j13 instanceof Collection) && j13.isEmpty()) {
            return request;
        }
        Iterator it = j13.iterator();
        while (it.hasNext()) {
            if (StringsKt.E(str, (String) it.next(), false)) {
                String str2 = httpUrl.f95634d;
                String str3 = this.f92399b;
                if (Intrinsics.d(str2, str3)) {
                    str = kotlin.text.z.n(str, str3, this.f92398a);
                }
                Request.Builder b13 = request.b();
                b13.j(str);
                b13.a("X-Pinterest-Trk-Fallback", "true");
                return b13.b();
            }
        }
        return request;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request f95974e = chain.getF95974e();
        if (!Intrinsics.d(f95974e.f95700a.f95634d, this.f92399b)) {
            return chain.b(f95974e);
        }
        try {
            return chain.b(f95974e);
        } catch (Exception e13) {
            if (e13 instanceof ConnectException) {
                return chain.b(a(f95974e));
            }
            if (e13 instanceof IOException) {
                String message = e13.getMessage();
                if (message == null) {
                    message = "";
                }
                if (b(message)) {
                    return chain.b(a(f95974e));
                }
            }
            throw e13;
        }
    }
}
