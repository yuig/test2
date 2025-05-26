package rr;

import android.net.Uri;
import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends d0 {
    @Override // rr.d0
    public final String a() {
        return "analytics";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        qr.h hVar = this.f109723a;
        if (!hVar.f104943d.e()) {
            hVar.t(null);
            return;
        }
        if (!hVar.f104943d.k()) {
            hVar.s(uri);
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 0 || Intrinsics.d(pathSegments.get(0), "overview")) {
            ScreenLocation l13 = com.pinterest.screens.g1.l();
            Bundle bundle = new Bundle();
            bundle.putInt("com.pinterest.EXTRA_ANALYTICS_SCREEN_TAB_POSITION", 0);
            hVar.m(Navigation.v1(l13, bundle));
            return;
        }
        if (!Intrinsics.d(pathSegments.get(0), "audience_insights")) {
            hVar.s(uri);
            return;
        }
        ScreenLocation l14 = com.pinterest.screens.g1.l();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("com.pinterest.EXTRA_ANALYTICS_SCREEN_TAB_POSITION", 1);
        hVar.m(Navigation.v1(l14, bundle2));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getHost(), "analytics.pinterest.com");
    }
}
