package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "pinterestlens";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.e());
        if (uri.getPathSegments().size() == 1 && n60.o.x(uri, 0, "room_repaint")) {
            String queryParameter = uri.getQueryParameter("source");
            if (queryParameter == null) {
                queryParameter = "unknown";
            }
            w13.m0("extra_room_repaint_source", queryParameter);
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return Intrinsics.d(pathSegments.get(0), "pinterestlens") || Intrinsics.d(pathSegments.get(0), "room_repaint");
        }
        return false;
    }
}
