package rr;

import android.net.Uri;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qr.h webhookDeeplinkUtil, b60.b activeUserManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f109749g = activeUserManager;
    }

    @Override // rr.d0
    public final String a() {
        return "followers";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        wy0 f13 = ((b60.d) this.f109749g).f();
        qr.h hVar = this.f109723a;
        if (f13 != null) {
            Integer V2 = f13.V2();
            Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
            if (V2.intValue() > 0) {
                NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.w());
                w13.m0("com.pinterest.EXTRA_USER_ID", f13.getUid());
                w13.Y1("com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", true);
                String o13 = f13.o();
                if (o13 != null) {
                    w13.m0("com.pinterest.node_id", o13);
                }
                hVar.m(w13);
                return;
            }
        }
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!((b60.d) this.f109749g).i()) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && scheme.hashCode() == -1034342 && scheme.equals("pinterest")) {
            return Intrinsics.d(uri.getHost(), "user_followers");
        }
        Intrinsics.checkNotNullExpressionValue(uri.getPathSegments(), "getPathSegments(...)");
        if (!(!r0.isEmpty())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d(CollectionsKt.firstOrNull(pathSegments), "user_followers");
    }
}
