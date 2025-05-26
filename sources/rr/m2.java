package rr;

import android.net.Uri;
import android.os.Bundle;
import h32.a4;
import h32.y3;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m2 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "today-articles";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        a4 a4Var;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(uri, "uri");
        HashMap hashMap = this.f109727e;
        if (hashMap == null || (str3 = (String) hashMap.get("view_param_type")) == null || (a4Var = a4.valueOf(str3)) == null) {
            HashMap hashMap2 = this.f109727e;
            if (hashMap2 == null || (str = (String) hashMap2.get("com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER")) == null) {
                a4Var = null;
            } else {
                y3 y3Var = a4.Companion;
                int parseInt = Integer.parseInt(str);
                y3Var.getClass();
                a4Var = y3.a(parseInt);
                if (a4Var == null) {
                    a4Var = a4.STRUCTURED_FEED_DEFAULT_VIEW_PARAMETER_TYPE;
                }
            }
        }
        HashMap hashMap3 = this.f109727e;
        Integer valueOf = (hashMap3 == null || (str2 = (String) hashMap3.get("selected_index")) == null) ? null : Integer.valueOf(Integer.parseInt(str2));
        HashMap hashMap4 = this.f109727e;
        String str4 = hashMap4 != null ? (String) hashMap4.get("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS") : null;
        int size = uri.getPathSegments().size();
        qr.h hVar = this.f109723a;
        if (size == 2) {
            String str5 = uri.getPathSegments().get(1);
            Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
            hVar.d(str5, this.f109726d, valueOf, a4Var, str4);
        }
        if (uri.getPathSegments().size() == 4) {
            if (n60.o.x(uri, 1, "popular")) {
                u70.a aVar = u70.a.HOME;
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRAS_KEY_INITIAL_SELECTED_TAB_LOCATION", com.pinterest.screens.g1.H());
                Unit unit = Unit.f80348a;
                hVar.p(aVar, bundle);
                hVar.q();
            }
            String str6 = uri.getPathSegments().get(3);
            Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
            hVar.d(str6, this.f109726d, valueOf, a4Var, null);
        }
        if (Intrinsics.d(uri.getHost(), "today_article_feed") && uri.getPathSegments().size() == 1) {
            String str7 = uri.getPathSegments().get(0);
            Intrinsics.checkNotNullExpressionValue(str7, "get(...)");
            hVar.d(str7, this.f109726d, valueOf, a4Var, null);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getPathSegments().size() == 2 && n60.o.x(uri, 0, "today-articles")) {
            return true;
        }
        if (uri.getPathSegments().size() == 4 && n60.o.x(uri, 0, "today")) {
            return true;
        }
        return Intrinsics.d(uri.getHost(), "today_article_feed") && uri.getPathSegments().size() == 1;
    }
}
