package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "recently_viewed_products";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "me";
        }
        String v13 = pp2.a.v(lastPathSegment);
        String queryParameter = uri.getQueryParameter("request_params");
        String queryParameter2 = uri.getQueryParameter("shop_source");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.M());
        w13.m0("api_endpoint", v13);
        w13.m0("com.pinterest.EXTRA_USER_ID", lastPathSegment);
        w13.m0("module_source", "module_recently_viewed_products");
        w13.m0("com.pinterest.EXTRA_WISHLIST_FEED_TYPE", "wishlist_recently_viewed_feed");
        if (queryParameter != null) {
            w13.m0("request_params", queryParameter);
        }
        if (queryParameter2 != null) {
            w13.m0("shop_source", queryParameter2);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        List<String> list;
        Intrinsics.checkNotNullParameter(uri, "uri");
        return (!Intrinsics.d(uri.getHost(), "recently_viewed_products") || (list = uri.getPathSegments()) == null || list.isEmpty()) ? false : true;
    }
}
