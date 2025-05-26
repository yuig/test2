package rr;

import android.net.Uri;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109873g;

    /* renamed from: h, reason: collision with root package name */
    public final k22.m f109874h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qr.h webhookDeeplinkUtil, b60.b activeUserManager, k22.m userService) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f109873g = activeUserManager;
        this.f109874h = userService;
    }

    @Override // rr.d0
    public final String a() {
        return "creator_hub";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        xj2.c cVar;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        List<String> pathSegments = uri.getPathSegments();
        boolean d2 = Intrinsics.d(host, "creator_hub");
        qr.h hVar = this.f109723a;
        if (d2) {
            NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.i());
            Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
            hVar.m(w13);
            return;
        }
        Intrinsics.f(pathSegments);
        if ((!pathSegments.isEmpty()) && Intrinsics.d(pathSegments.get(0), "creator_hub")) {
            if (!Intrinsics.d((String) CollectionsKt.U(1, pathSegments), "_partnerships")) {
                NavigationImpl w14 = Navigation.w1(com.pinterest.screens.g1.i());
                Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
                hVar.m(w14);
                return;
            }
            wy0 f13 = ((b60.d) this.f109873g).f();
            if (f13 != null) {
                String uid = f13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                cVar = this.f109874h.w(uid, n00.b.a(n00.c.USER_OPTED_IN_TO_PAID_PARTNERSHIPS_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new ir.h(25, new tq.a0(this, 8)), new ir.h(26, k.f109759o));
            } else {
                cVar = null;
            }
            if (cVar == null) {
                hVar.l(null);
            }
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (Intrinsics.d(uri.getHost(), "creator_hub")) {
            return true;
        }
        Intrinsics.f(pathSegments);
        return (pathSegments.isEmpty() ^ true) && Intrinsics.d(pathSegments.get(0), "creator_hub");
    }
}
