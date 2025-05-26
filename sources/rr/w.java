package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends d0 {
    @Override // rr.d0
    public final String a() {
        return "collage_composer";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.f());
        w13.z(d32.c.DEEPLINK.getValue(), "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE");
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.d(uri.getScheme(), "pinterest") ? CollectionsKt.L(kotlin.collections.f0.j("collage_composer", "shuffle_composer"), uri.getHost()) : uri.getPathSegments().size() >= 2 && n60.o.x(uri, 0, "collages") && n60.o.x(uri, 1, "composer");
    }
}
