package rr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pinterest.api.model.gw;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final x02.x0 f109784g;

    /* renamed from: h, reason: collision with root package name */
    public final gw f109785h;

    /* renamed from: i, reason: collision with root package name */
    public final g70.h f109786i;

    static {
        new com.google.android.gms.common.api.d(27, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qr.h webhookDeeplinkUtil, x02.x0 boardRepository, gw modelHelper, g70.h boardNavigator) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f109784g = boardRepository;
        this.f109785h = modelHelper;
        this.f109786i = boardNavigator;
    }

    @Override // rr.d0
    public final String a() {
        return "invited";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h("Board DL Uri: " + uri);
        String queryParameter = uri.getQueryParameter("board_id");
        qr.h hVar = this.f109723a;
        if (hVar.f104943d.e() && queryParameter != null) {
            List<String> pathSegments = uri.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            this.f109784g.L(queryParameter).s().p(new qr.d(uri, pathSegments, this.f109726d, this.f109785h, this.f109723a, this.f109786i));
            return;
        }
        sr.d dVar = hVar.f104944e;
        dVar.f115045b.a("unauth_board_deeplink");
        Context context = kb0.a.f79058b;
        Intent i13 = ((lu1.c) dVar.f115046c).i(m60.f0.W());
        i13.putExtra("com.pinterest.EXTRA_BOARD_ID", queryParameter);
        i13.putExtra("com.pinterest.EXTRA_CONTEXTUAL_LOGIN", uri.toString());
        dVar.f115044a.startActivity(i13);
        hVar.q();
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return (pathSegments.isEmpty() ^ true) && n60.o.x(uri, 0, "invited") && (queryParameter = uri.getQueryParameter("inviter_user_id")) != null && !kotlin.text.z.j(queryParameter);
    }
}
