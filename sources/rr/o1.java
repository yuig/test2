package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "stela_product_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.G());
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.U(0, pathSegments);
        if (str != null) {
            w13.m0("com.pinterest.EXTRA_PIN_ID", str);
        }
        String queryParameter2 = uri.getQueryParameter("entry_source");
        if (queryParameter2 != null) {
            w13.m0("com.pinterest.EXTRA_ENTRY_SOURCE", queryParameter2);
        }
        w13.Y1("com.pinterest.EXTRA_IS_SHOPPING", uri.getBooleanQueryParameter("is_shopping", false));
        String queryParameter3 = uri.getQueryParameter("crop_source");
        if (queryParameter3 != null) {
            w13.m0("com.pinterest.EXTRA_CROP_SOURCE", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("entry_point");
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.EXTRA_ENTRY_POINT", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("request_params");
        if (queryParameter5 != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", queryParameter5);
        }
        HashMap hashMap = this.f109727e;
        if (hashMap == null || (queryParameter = (String) hashMap.get("com.pinterest.STRUCTURED_FEED_TITLE")) == null) {
            queryParameter = uri.getQueryParameter("full_feed_title");
        }
        if (queryParameter != null) {
            w13.m0("com.pinterest.STRUCTURED_FEED_TITLE", queryParameter);
        }
        String str2 = hashMap != null ? (String) hashMap.get("image_hero") : null;
        if (str2 != null) {
            w13.m0("image_hero", str2);
        }
        if ((hashMap != null ? (String) hashMap.get("show_hero") : null) != null) {
            w13.Y1("show_hero", false);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.d(uri.getHost(), "pin")) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (Intrinsics.d(CollectionsKt.U(1, pathSegments), "visual-shop")) {
                return true;
            }
        }
        return false;
    }
}
