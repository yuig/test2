package rr;

import android.net.Uri;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "pinterest_picks";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        u70.a aVar = u70.a.HOME;
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRAS_KEY_INITIAL_SELECTED_TAB_LOCATION", com.pinterest.screens.g1.u());
        bundle.putBoolean("com.pinterest.EXTRA_IS_DEEPLINK", true);
        Unit unit = Unit.f80348a;
        qr.h hVar = this.f109723a;
        hVar.p(aVar, bundle);
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (df.j1.f1(uri) && df.j1.W0(uri) && uri.getPathSegments().size() == 2 && n60.o.x(uri, 0, "homefeed") && n60.o.x(uri, 1, "holiday_finds")) {
            return true;
        }
        return df.j1.X0(uri) && uri.getPathSegments().size() == 0 && Intrinsics.d(uri.getHost(), "holiday_finds");
    }
}
