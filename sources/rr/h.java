package rr;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends d0 {
    @Override // rr.d0
    public final String a() {
        return "automagical_board";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "automagical_board")) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            str = (String) CollectionsKt.U(0, pathSegments);
        } else {
            List<String> pathSegments2 = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
            str = (String) CollectionsKt.U(1, pathSegments2);
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        this.f109723a.o(str2, false, df.j1.T0(uri), false, true);
        this.f109723a.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getPathSegments().size() == 2 && n60.o.x(uri, 0, "for-you")) {
            return true;
        }
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "automagical_board");
    }
}
