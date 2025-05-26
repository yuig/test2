package rr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "pw";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Map params = kotlin.collections.z0.g(new Pair("username", uri.getPathSegments().get(1)), new Pair("expiration", String.valueOf(uri.getQueryParameter("e"))), new Pair("token", String.valueOf(uri.getQueryParameter("t"))));
        qr.h hVar = this.f109723a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        sr.e eVar = hVar.f104945f;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        us1.a aVar = eVar.f115049a;
        Activity activity = aVar.getContext();
        lu1.c cVar = (lu1.c) eVar.f115051c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Intent b13 = cVar.f84972b.b(applicationContext, lu1.a.AUTHENTICATION_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_CREATE_PASSWORD", true);
        b13.putExtra("com.pinterest.EXTRA_USERNAME", (String) params.get("username"));
        b13.putExtra("com.pinterest.EXTRA_PASSWORD_EXPIRATION", (String) params.get("expiration"));
        b13.putExtra("com.pinterest.EXTRA_PASSWORD_TOKEN", (String) params.get("token"));
        activity.startActivity(b13);
        aVar.g();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return uri.getPathSegments().size() >= 2 && Intrinsics.d("pw", uri.getPathSegments().get(0));
    }
}
