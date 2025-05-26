package rr;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final y f109863g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f109864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qr.h webhookDeeplinkUtil, y searchHandler) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(searchHandler, "searchHandler");
        this.f109863g = searchHandler;
    }

    @Override // rr.d0
    public final String a() {
        return "categories";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String str = uri.getPathSegments().get(1);
        String str2 = str;
        if (Intrinsics.d(str2, "home")) {
            this.f109723a.t(null);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(str, "apply(...)");
        g(uri, str2);
        this.f109863g.c(h());
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() >= 2 && Intrinsics.d(pathSegments.get(0), "categories")) {
            String str = pathSegments.get(1);
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                if (Intrinsics.d(str2, "home")) {
                    return true;
                }
                Intrinsics.checkNotNullExpressionValue(str, "apply(...)");
                g(uri, str2);
                return this.f109863g.e(h());
            }
        }
        return false;
    }

    public final void g(Uri uri, String str) {
        Uri build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("search").appendQueryParameter("q", str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        Intrinsics.checkNotNullParameter(build, "<set-?>");
        this.f109864h = build;
    }

    public final Uri h() {
        Uri uri = this.f109864h;
        if (uri != null) {
            return uri;
        }
        Intrinsics.r("searchUri");
        throw null;
    }
}
