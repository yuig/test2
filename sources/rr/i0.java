package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "unified_related_product_pins";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.t());
        w13.m0("com.pinterest.EXTRA_PIN_ID", uri.getLastPathSegment());
        w13.Y1("com.pinterest.EXTRA_IS_DEEPLINK", true);
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        return (!Intrinsics.d(host, "flashlight_closeup") || lastPathSegment == null || lastPathSegment.length() == 0) ? false : true;
    }
}
