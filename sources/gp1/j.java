package gp1;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qz.t;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static CookieManager f65938a;

    public static final boolean a(String str) {
        HttpUrl httpUrl;
        if (str != null) {
            HttpUrl.f95629k.getClass();
            httpUrl = HttpUrl.Companion.f(str);
        } else {
            httpUrl = null;
        }
        String str2 = httpUrl != null ? httpUrl.f95634d : null;
        String str3 = httpUrl != null ? httpUrl.f95631a : null;
        if ((str2 == null || !Intrinsics.d(str2, "api.pinterest.com")) && !Intrinsics.d(str2, "anket.pinterest.com") && !Intrinsics.d(str2, "anket-dev.pinadmin.com") && !Intrinsics.d(str2, "ads.pinterest.com") && !Intrinsics.d(str2, "analytics.pinterest.com")) {
            if (!Intrinsics.d(str2, "pinterest.com") && !Intrinsics.d(str2, "www.pinterest.com")) {
                return false;
            }
            List pathSegments = httpUrl.f95636f;
            List list = qs1.a.f105093a;
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            if (!(!pathSegments.isEmpty())) {
                return false;
            }
            String lowerCase = ((String) pathSegments.get(0)).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!qs1.a.f105093a.contains(lowerCase)) {
                return false;
            }
        }
        return Intrinsics.d(str3, "https");
    }

    public static final CookieManager b(f30.b apiUtils) {
        Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
        if (f65938a == null) {
            f65938a = new CookieManager(new t(apiUtils), CookiePolicy.ACCEPT_ALL);
        }
        CookieHandler.setDefault(f65938a);
        CookieManager cookieManager = f65938a;
        Intrinsics.f(cookieManager);
        return cookieManager;
    }
}
