package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends d0 {
    @Override // rr.d0
    public final String a() {
        return "about_board_recommendations";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f109723a.m(Navigation.w1(com.pinterest.screens.g1.a()));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "about_board_recommendations");
    }
}
