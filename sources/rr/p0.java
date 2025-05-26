package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes.dex */
public final class p0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final lh0.t0 f109811g;

    /* renamed from: h, reason: collision with root package name */
    public String f109812h;

    /* renamed from: i, reason: collision with root package name */
    public String f109813i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(qr.h webhookDeeplinkUtil, lh0.t0 deepLinkExperiments) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(deepLinkExperiments, "deepLinkExperiments");
        this.f109811g = deepLinkExperiments;
    }

    @Override // rr.d0
    public final String a() {
        return (Intrinsics.d("inbox", this.f109812h) || !Intrinsics.d("contact_request", this.f109813i)) ? Intrinsics.d("board_invites", this.f109813i) ? "invite" : "inbox" : "contact_request";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        NavigationImpl w13;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("type");
        this.f109813i = queryParameter;
        if (Intrinsics.d("contact_request", queryParameter)) {
            w13 = Navigation.w1(com.pinterest.screens.g1.g());
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        } else {
            lh0.t0 t0Var = this.f109811g;
            t0Var.getClass();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) t0Var.f83480a;
            w13 = (g1Var.o("android_unified_inbox", "enabled", z3Var) || g1Var.l("android_unified_inbox")) ? Navigation.w1(com.pinterest.screens.g1.o()) : Navigation.w1(com.pinterest.screens.g1.h());
        }
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        this.f109812h = uri.getQueryParameter("tab");
        if (pathSegments.size() != 1) {
            return false;
        }
        String str = pathSegments.get(0);
        if (Intrinsics.d("inbox", str)) {
            return true;
        }
        if (Intrinsics.d("notifications", str)) {
            return Intrinsics.d("inbox", this.f109812h);
        }
        return false;
    }
}
