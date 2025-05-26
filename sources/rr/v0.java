package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final gv1.f f109865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(qr.h webhookDeeplinkUtil, gv1.f notificationsExperimentHelper) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(notificationsExperimentHelper, "notificationsExperimentHelper");
        this.f109865g = notificationsExperimentHelper;
    }

    @Override // rr.d0
    public final String a() {
        return "news_hub";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        qr.h hVar = this.f109723a;
        if (!hVar.f104943d.e()) {
            hVar.n(null);
        }
        String str = uri.getPathSegments().get(1);
        if (!hVar.f104943d.e() || str == null) {
            return;
        }
        if (((Boolean) this.f109865g.a("2025-02-10", "android_notif_landing_back_button_hf").f80346a).booleanValue()) {
            hVar.p(u70.a.NOTIFICATIONS, e0.t.j(new Pair("com.pinterest.EXTRA_NOTIF_NEWS_ID", str), new Pair("com.pinterest.EXTRA_IS_DEEPLINK", Boolean.TRUE)));
            hVar.q();
        } else {
            NavigationImpl z03 = Navigation.z0(com.pinterest.screens.g1.n(), str);
            Intrinsics.checkNotNullExpressionValue(z03, "create(...)");
            hVar.m(z03);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() < 2 || !Intrinsics.d("news_hub", pathSegments.get(0))) {
            return false;
        }
        return (this.f109723a.f104943d.e() && pathSegments.get(1) == null) ? false : true;
    }
}
