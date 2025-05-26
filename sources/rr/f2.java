package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "board_stl_product_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.c());
        String str = uri.getPathSegments().get(0);
        if (str != null) {
            w13.m0("com.pinterest.EXTRA_PIN_ID", str);
        }
        String queryParameter = uri.getQueryParameter("board_id");
        if (queryParameter != null) {
            w13.m0("com.pinterest.EXTRA_BOARD_ID", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("board_session_id");
        if (queryParameter2 != null) {
            w13.m0("com.pinterest.EXTRA_BOARD_SESSION_ID", queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter("story_id");
        if (queryParameter3 != null) {
            w13.m0("com.pinterest.EXTRA_STORY_ID", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("crop_source");
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.EXTRA_CROP_SOURCE", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("entrypoint");
        if (queryParameter5 != null) {
            w13.m0("com.pinterest.EXTRA_ENTRYPOINT", queryParameter5);
        }
        String queryParameter6 = uri.getQueryParameter("request_params");
        if (queryParameter6 != null) {
            w13.m0("com.pinterest.EXTRA_REQUEST_PARAMS", queryParameter6);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("board_id");
        String queryParameter2 = uri.getQueryParameter("board_session_id");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "board_stl_product_feed") && df.j1.U0((String) CollectionsKt.U(0, pathSegments)) && df.j1.U0(queryParameter2) && df.j1.U0(queryParameter);
    }
}
