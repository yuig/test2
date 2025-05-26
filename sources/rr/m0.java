package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "homefeed_tuner";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f109723a.m(Navigation.w1(com.pinterest.screens.g1.k()));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null) {
            boolean z13 = pathSegments.size() == 1 && Intrinsics.d(pathSegments.get(0), "edit");
            boolean z14 = pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(0), "homefeed") && Intrinsics.d(pathSegments.get(1), "edit");
            if ((z13 || z14) && this.f109723a.f104943d.e()) {
                return true;
            }
        }
        return false;
    }
}
