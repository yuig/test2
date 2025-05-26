package rr;

import android.net.Uri;
import com.pinterest.api.model.wy0;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f109748g;

    static {
        new com.google.android.gms.common.api.d(25, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qr.h webhookDeeplinkUtil, b60.b activeUserManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f109748g = activeUserManager;
    }

    public static boolean g(Uri uri) {
        if (uri.getPathSegments().size() == 2 && n60.o.x(uri, 0, "auto_organize")) {
            return n60.o.x(uri, 1, "saved") || n60.o.x(uri, 1, "board");
        }
        return false;
    }

    @Override // rr.d0
    public final String a() {
        return "auto_organize";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        b60.d dVar = (b60.d) this.f109748g;
        boolean i13 = dVar.i();
        qr.h hVar = this.f109723a;
        if (!i13) {
            hVar.q();
            return;
        }
        wy0 f13 = dVar.f();
        if (f13 != null) {
            Boolean g33 = f13.g3();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(g33, bool)) {
                String str = uri.getPathSegments().get(1);
                hVar.p(u70.a.PROFILE, e0.t.j(new Pair("com.pinterest.EXTRA_PROFILE_TAB", Intrinsics.d(str, "board") ? "boards" : Intrinsics.d(str, "saved") ? "saved" : ""), new Pair("EXTRAS_KEY_AUTO_ORG_AT_TOP", bool), new Pair("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", uri.getQueryParameter("source"))));
                return;
            }
        }
        u70.a bottomNavTabType = u70.a.PROFILE;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        sr.f fVar = hVar.f104947h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
        fVar.a(bottomNavTabType, null);
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        String host;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (df.j1.f1(uri)) {
            if (CollectionsKt.L(ie0.a.f72199d, uri.getHost()) && g(uri)) {
                return true;
            }
        } else if (df.j1.X0(uri) && (((host = uri.getHost()) == null || host.length() == 0 || Intrinsics.d(uri.getHost(), "pinterest.com")) && g(uri))) {
            return true;
        }
        return false;
    }
}
