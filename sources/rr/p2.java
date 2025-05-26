package rr;

import android.net.Uri;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p2 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109814g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.d0 f109815h;

    /* renamed from: i, reason: collision with root package name */
    public final c91.e f109816i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(qr.h webhookDeeplinkUtil, b60.b activeUserManager, nx.d0 d0Var, c91.e eVar) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f109814g = activeUserManager;
        this.f109815h = d0Var;
        this.f109816i = eVar;
    }

    @Override // rr.d0
    public final String a() {
        return "virtual_try_on";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        c91.e eVar;
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        boolean e03 = com.bumptech.glide.d.e0(uri, pathSegments);
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.J());
        w13.z(e03 ? f42.i.SEARCH.getValue() : f42.i.DEEP_LINKING.getValue(), "com.pinterest.EXTRA_VIRTUAL_TRY_ON_SOURCE_TYPE");
        String queryParameter = uri.getQueryParameter("pin_id");
        if (queryParameter != null) {
            w13.m0("com.pinterest.EXTRA_PIN_ID", queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("source_query");
        if (queryParameter2 != null) {
            w13.m0("com.pinterest.EXTRA_SOURCE_QUERY", queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter("skin_tone_filter");
        if (queryParameter3 != null) {
            w13.m0("com.pinterest.EXTRA_SKIN_TONE_FILTER", queryParameter3);
        }
        String queryParameter4 = uri.getQueryParameter("category");
        if (queryParameter4 != null) {
            w13.m0("com.pinterest.EXTRA_DEEPLINK_SELECTED_MAKEUP_CATEGORY", queryParameter4);
        }
        String queryParameter5 = uri.getQueryParameter("query_pin");
        if (queryParameter5 != null) {
            w13.m0("com.pinterest.EXTRA_PIN_ID", queryParameter5);
        }
        nx.d0 d0Var = this.f109815h;
        qr.h hVar = this.f109723a;
        if (d0Var == null || (eVar = this.f109816i) == null) {
            hVar.m(w13);
        } else if (bs1.c.c1(hVar.f104940a.getContext())) {
            eVar.a(bs1.c.k0(hVar.f104940a.getContext()), d0Var).a(new zp.j0(12, this, w13), null, c91.a.f26973a);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        wy0 f13 = ((b60.d) this.f109814g).f();
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        boolean e03 = com.bumptech.glide.d.e0(uri, pathSegments);
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        boolean z13 = pathSegments.size() == 1 && f13 != null && (Intrinsics.d("US", f13.G2()) || Intrinsics.d("GB", f13.G2())) && Intrinsics.d("pinterestlenstryon", pathSegments.get(0));
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        return e03 || z13 || (pathSegments.size() == 2 && Intrinsics.d("visual_search", uri.getHost()) && Intrinsics.d("virtual_try_on", pathSegments.get(0)));
    }
}
