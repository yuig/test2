package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "pin_or_spin";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String str = (String) CollectionsKt.U(pathSegments.indexOf("pin_or_spin") + 1, pathSegments);
        if (str == null) {
            return;
        }
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.v());
        w13.m0("com.pinterest.EXTRA_PIN_OR_SPIN", str);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String host = uri.getHost();
        Intrinsics.f(pathSegments);
        return (pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(0), "pin_or_spin")) || (Intrinsics.d(host, "pin_or_spin") && pathSegments.size() == 1);
    }
}
