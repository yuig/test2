package rr;

import android.net.Uri;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "story_feed";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String queryParameter = uri.getQueryParameter("request_params");
        NavigationImpl c13 = r41.k.c(r41.k.f106176a, lastPathSegment, null, null, null, 30);
        c13.m0("com.pinterest.EXTRA_PROFILE_TAB", "pins");
        if (queryParameter != null) {
            c13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", queryParameter);
        }
        this.f109723a.m(c13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getHost(), "profile_pins") && uri.getLastPathSegment() != null;
    }
}
