package rr;

import android.net.Uri;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class l1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109775g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(qr.h webhookDeeplinkUtil, b60.b activeUserManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f109775g = activeUserManager;
    }

    public static boolean g(Uri uri) {
        return (uri.getQueryParameter("cluster_id") == null || uri.getQueryParameter("pin_count") == null || uri.getQueryParameter("cluster_title") == null || uri.getQueryParameter("repin_id") == null) ? false : true;
    }

    @Override // rr.d0
    public final String a() {
        return "auto_organize";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(uri, "uri");
        b60.d dVar = (b60.d) this.f109775g;
        boolean i13 = dVar.i();
        qr.h hVar = this.f109723a;
        if (!i13) {
            hVar.q();
            return;
        }
        wy0 f13 = dVar.f();
        if (f13 == null || !Intrinsics.d(f13.g3(), Boolean.TRUE)) {
            hVar.q();
            return;
        }
        String queryParameter = uri.getQueryParameter("cluster_id");
        String queryParameter2 = uri.getQueryParameter("pin_count");
        int intValue = (queryParameter2 == null || (intOrNull = StringsKt.toIntOrNull(queryParameter2)) == null) ? 0 : intOrNull.intValue();
        String queryParameter3 = uri.getQueryParameter("cluster_title");
        String queryParameter4 = uri.getQueryParameter("repin_id");
        String queryParameter5 = uri.getQueryParameter("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.z());
        w13.m0("com.pinterest.EXTRA_CLUSTER_ID", queryParameter);
        w13.m0("com.pinterest.EXTRA_BOARD_NAME", queryParameter3);
        w13.m0("com.pinterest.EXTRA_AUTO_ORGANIZE_VIEW_TYPE", "ORGANIZE_BOARDLESS_PINS");
        w13.z(intValue, "moved_pin_count");
        w13.m0("repin_id", queryParameter4);
        w13.m0("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", queryParameter5);
        hVar.r(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (df.j1.f1(uri)) {
            if (uri.getPathSegments().size() == 1 && n60.o.x(uri, 0, "refine_your_board") && g(uri)) {
                return true;
            }
        } else if (df.j1.X0(uri) && Intrinsics.d(uri.getHost(), "refine_your_board") && g(uri)) {
            return true;
        }
        return false;
    }
}
