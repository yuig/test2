package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends d0 {
    static {
        new com.google.android.gms.common.api.d(24, 0);
    }

    @Override // rr.d0
    public final String a() {
        return "article";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl z03 = uri.getPathSegments().size() > 2 ? Navigation.z0(com.pinterest.screens.g1.d(), uri.getPathSegments().get(2)) : Navigation.z0(com.pinterest.screens.g1.d(), uri.getPathSegments().get(1));
        String queryParameter = uri.getQueryParameter("request_params");
        String queryParameter2 = uri.getQueryParameter("shop_source");
        if (queryParameter != null) {
            z03.m0("request_params", queryParameter);
        }
        if (queryParameter2 != null) {
            z03.m0("shop_source", queryParameter2);
        }
        this.f109723a.m(z03);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() > 2 && Intrinsics.d(pathSegments.get(0), "discover") && Intrinsics.d(pathSegments.get(1), "article")) {
            String str = pathSegments.get(2);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            if (str.length() > 0) {
                return true;
            }
        }
        if (pathSegments.size() == 2 && Intrinsics.d(uri.getHost(), "discover") && Intrinsics.d(pathSegments.get(0), "article")) {
            String str2 = pathSegments.get(1);
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            if (str2.length() > 0 && Intrinsics.d(uri.getScheme(), "pinterest")) {
                return true;
            }
        }
        return false;
    }
}
