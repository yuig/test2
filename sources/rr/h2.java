package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "board_stl_product_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.c());
        String queryParameter = uri.getQueryParameter("board_id");
        if (queryParameter != null) {
            w13.m0("com.pinterest.EXTRA_BOARD_ID", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("board_session_id");
        if (queryParameter2 != null) {
            w13.m0("com.pinterest.EXTRA_BOARD_SESSION_ID", queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter("request_params");
        if (queryParameter3 != null) {
            w13.m0("com.pinterest.EXTRA_REQUEST_PARAMS", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("title");
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.EXTRA_SHOP_TOOL_TITLE", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("subtitle");
        if (queryParameter5 != null) {
            w13.m0("com.pinterest.EXTRA_SHOP_TOOL_SUBTITLE", queryParameter5);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "board_shop_tool_lp") && df.j1.U0(uri.getQueryParameter("board_id"));
    }
}
