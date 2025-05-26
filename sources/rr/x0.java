package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "offsite";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Unit unit;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("url");
        qr.h hVar = this.f109723a;
        if (queryParameter != null) {
            hVar.g(queryParameter, false, true);
            hVar.q();
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.j());
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            hVar.m(w13);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments != null && pathSegments.size() == 1 && Intrinsics.d(pathSegments.get(0), "offsite");
    }
}
