package rr;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class p1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "secure_login";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String host;
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean contains = uri.getPathSegments().contains("login");
        qr.h hVar = this.f109723a;
        if (!contains && !uri.getPathSegments().contains("autologin")) {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(uri, "uri");
            sr.k kVar = hVar.f104952m;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(uri, "uri");
            us1.a aVar = kVar.f115075a;
            Activity context = aVar.getContext();
            lu1.c cVar = (lu1.c) kVar.f115076b;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uri, "uri");
            context.startActivity(cVar.c(context, uri, null));
            aVar.g();
            return;
        }
        if (!this.f109725c && !uri.getPathSegments().contains("autologin")) {
            try {
                Bundle bundle = new Bundle();
                if (uri.getQueryParameter("next") != null) {
                    bundle.putParcelable("com.pinterest.EXTRA_MAGIC_LINK", uri);
                }
                hVar.n(bundle);
                return;
            } catch (Exception e13) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.o(p1.class.getSimpleName(), e13);
                hVar.l(null);
                return;
            }
        }
        String queryParameter = uri.getQueryParameter("next");
        if (queryParameter != null && queryParameter.length() != 0) {
            try {
                Uri uri2 = Uri.parse(queryParameter);
                if (uri2 != null && (((host = uri2.getHost()) == null || !ie0.a.f72198c.contains(host)) && !StringsKt.E(queryParameter, "//pinterest.com", false) && !StringsKt.E(queryParameter, "//www.pinterest.com", false))) {
                    Pattern pattern = p5.c.f98857a;
                    String lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    uri2 = Uri.parse(pattern.matcher(lowerCase).find() ? "https://www.pinterest.com" : "https://www.pinterest.com".concat(queryParameter));
                }
                if (uri2 != null) {
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(uri2, "uri");
                    hVar.f104941b.s(uri2, null);
                    return;
                }
            } catch (RuntimeException unused) {
                hVar.l(null);
            }
        }
        hVar.l(null);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Set set = ie0.a.f72199d;
        if (!CollectionsKt.L(set, uri.getHost())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (!CollectionsKt.L(set, uri.getHost()) || pathSegments.size() != 1 || !pathSegments.contains("login")) {
            List<String> pathSegments2 = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
            if ((!CollectionsKt.L(set, uri.getHost()) || pathSegments2.size() != 1 || !pathSegments2.contains("login") || !TextUtils.equals(uri.getQueryParameter("message"), "reactivate")) && !uri.getPathSegments().contains("secure")) {
                return false;
            }
        }
        return true;
    }
}
