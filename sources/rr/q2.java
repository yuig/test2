package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "stela_product_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.K());
        String str = uri.getPathSegments().get(0);
        if (str != null) {
            w13.m0("com.pinterest.EXTRA_PIN_ID", str);
        }
        String queryParameter = uri.getQueryParameter("cropbox_dimensions");
        if (queryParameter != null) {
            w13.m0("com.pinterest.EXTRA_CROPBOX_DIMENSIONS", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("crop_source");
        if (queryParameter2 != null) {
            w13.m0("com.pinterest.EXTRA_CROP_SOURCE", queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter("entry_source");
        if (queryParameter3 != null) {
            w13.m0("com.pinterest.EXTRA_ENTRY_SOURCE", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("full_feed_title");
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.EXTRA_TITLE", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("request_params");
        if (queryParameter5 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", queryParameter5);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return uri.getPathSegments().size() == 1 && Intrinsics.d(uri.getHost(), "stela_product_feed");
    }
}
