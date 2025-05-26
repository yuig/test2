package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "reports_and_violations";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.F());
        w13.z(Intrinsics.d(uri.getEncodedFragment(), "reports") ? 1 : 0, "com.pinterest.rvc_section");
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments != null && pathSegments.size() > 0 && Intrinsics.d(pathSegments.get(0), "reports-and-violations") && CollectionsKt.L(kotlin.collections.f0.j("account", "reports"), uri.getEncodedFragment());
    }
}
