package rr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f109771h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final h12.a f109772g;

    static {
        new com.google.android.gms.common.api.d(26, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qr.h webhookDeeplinkUtil, h12.a boardInviteApi) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        this.f109772g = boardInviteApi;
    }

    @Override // rr.d0
    public final String a() {
        return "board_collaborator";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        String V = df.j1.V("%s/%s", pathSegments.get(0), pathSegments.get(1));
        qr.h hVar = this.f109723a;
        if (hVar.f104943d.e()) {
            hVar.o(V, false, false, true, false);
            return;
        }
        sr.d dVar = hVar.f104944e;
        dVar.f115045b.a("unauth_board_deeplink");
        Context context = kb0.a.f79058b;
        Intent i13 = ((lu1.c) dVar.f115046c).i(m60.f0.W());
        i13.putExtra("com.pinterest.EXTRA_BOARD_ID", V);
        i13.putExtra("com.pinterest.EXTRA_CONTEXTUAL_LOGIN", uri.toString());
        dVar.f115044a.startActivity(i13);
        hVar.q();
        this.f109772g.a().r(tk2.e.f118017c).o(new ir.h(17, k.f109754j), new ir.h(18, k.f109755k));
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() < 3) {
            return false;
        }
        return Intrinsics.d(pathSegments.get(2), "invite") || Intrinsics.d(pathSegments.get(2), "group");
    }
}
