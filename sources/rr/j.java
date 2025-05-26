package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends d0 {
    @Override // rr.d0
    public final String a() {
        return "board_auto_collages_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.b());
        String queryParameter = uri.getQueryParameter("board_id");
        if (queryParameter != null) {
            w13.m0("com.pinterest.EXTRA_BOARD_ID", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("module_id");
        if (queryParameter2 != null) {
            w13.m0("com.pinterest.EXTRA_MODULE_ID", queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter("request_params");
        if (queryParameter3 != null) {
            w13.m0("com.pinterest.EXTRA_REQUEST_PARAMS", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("full_feed_title");
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.EXTRA_SHOP_TOOL_TITLE", queryParameter4);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "board_auto_collages") && df.j1.U0(uri.getQueryParameter("board_id"));
    }
}
