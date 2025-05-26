package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "shopping_list";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("request_params");
        String queryParameter2 = uri.getQueryParameter("shop_source");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.L());
        w13.m0("com.pinterest.EXTRA_USER_ID", "me");
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
        return (!Intrinsics.d(uri.getHost(), "wishlist") || (list = uri.getPathSegments()) == null || list.isEmpty()) ? false : true;
    }
}
