package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class w0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "notifications";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("tab");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.o());
        w13.Y1("com.pinterest.EXTRA_IS_DEEPLINK", true);
        if (queryParameter != null && !kotlin.text.z.j(queryParameter)) {
            w13.m0("TAB", StringsKt.i0(queryParameter).toString());
        }
        u70.a bottomNavTabType = u70.a.NOTIFICATIONS;
        qr.h hVar = this.f109723a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        sr.f fVar = hVar.f104947h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        fVar.a(bottomNavTabType, null);
        hVar.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return !Intrinsics.d(uri.getHost(), "ads.pinterest.com") && uri.getPathSegments().size() == 1 && Intrinsics.d(uri.getLastPathSegment(), "notifications");
    }
}
