package rr;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u extends d0 {
    public static Bundle g(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Bundle bundle = new Bundle();
        for (String str : uri.getQueryParameterNames()) {
            bundle.putString(str, uri.getQueryParameter(str));
        }
        return bundle;
    }

    @Override // rr.d0
    public final String a() {
        return "business";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        boolean d2 = Intrinsics.d(pathSegments.get(1), "create");
        qr.h hVar = this.f109723a;
        if (d2) {
            if (!hVar.f104943d.e()) {
                hVar.s(uri);
                return;
            }
            Intrinsics.checkNotNullParameter(uri, "uri");
            sr.k kVar = hVar.f104952m;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(uri, "uri");
            us1.a aVar = kVar.f115075a;
            Activity context = aVar.getContext();
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            ((lu1.c) kVar.f115076b).u(uri2, context);
            aVar.g();
            return;
        }
        if (Intrinsics.d(pathSegments.get(1), "convert")) {
            if (hVar.f104943d.e()) {
                hVar.m(Navigation.w1(com.pinterest.screens.g1.E()));
                return;
            } else {
                hVar.t(null);
                return;
            }
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        sr.k kVar2 = hVar.f104952m;
        kVar2.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        us1.a aVar2 = kVar2.f115075a;
        Activity context2 = aVar2.getContext();
        String uri3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        ((lu1.c) kVar2.f115076b).u(uri3, context2);
        aVar2.g();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2 || !Intrinsics.d(pathSegments.get(0), "business")) {
            return false;
        }
        if (Intrinsics.d(pathSegments.get(1), "create") || Intrinsics.d(pathSegments.get(1), "convert")) {
            return true;
        }
        if (Intrinsics.d(pathSegments.get(1), "offer")) {
            qr.h hVar = this.f109723a;
            if (hVar.f104943d.e() && hVar.k()) {
                Bundle g13 = g(uri);
                if (!g13.isEmpty() && g13.containsKey("offer_key")) {
                    return true;
                }
            }
        }
        return false;
    }
}
