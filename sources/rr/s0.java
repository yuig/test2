package rr;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final rd.j f109850g;

    /* renamed from: h, reason: collision with root package name */
    public final vy.m f109851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(qr.h webhookDeeplinkUtil, rd.j inviteCodeRedeemer, vy.m analyticsApi) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(inviteCodeRedeemer, "inviteCodeRedeemer");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f109850g = inviteCodeRedeemer;
        this.f109851h = analyticsApi;
    }

    @Override // rr.d0
    public final String a() {
        return "invited";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        String str;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String inviteCode = uri.getQueryParameter("invite_code");
        Intrinsics.f(inviteCode);
        HashMap auxData = ep.b.o("invite_code", inviteCode);
        auxData.put("full_url", uri.toString());
        h32.f1 eventType = h32.f1.INVITE_APP_LAND;
        qr.h hVar = this.f109723a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        tb.c cVar = hVar.f104946g;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        ((nx.d0) cVar.f116959a).g(eventType, null, auxData, false);
        boolean z13 = this.f109725c;
        if (z13) {
            str = "handleinvite_code_deeplink_auth";
        } else {
            if (z13) {
                throw new NoWhenBranchMatchedException();
            }
            str = "handleinvite_code_deeplink_unauth";
        }
        vy.m mVar = this.f109851h;
        mVar.a(str);
        mVar.a("invite_code_redemption_called");
        r0 onSuccess = new r0(this, 0);
        r0 onFailure = new r0(this, 1);
        rd.j jVar = this.f109850g;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        p30.v vVar = new p30.v(inviteCode);
        oc.c cVar2 = (oc.c) ((bf2.b) ((se2.a) jVar.f107506b)).get();
        if (cVar2 != null) {
            nl.b.q(com.bumptech.glide.d.u0(cVar2.a(vVar)).r(tk2.e.f118017c), new t0(0, inviteCode, onSuccess), new t0(1, inviteCode, onFailure));
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return (((pathSegments.isEmpty() ^ true) && n60.o.x(uri, 0, "community")) || (queryParameter = uri.getQueryParameter("invite_code")) == null || kotlin.text.z.j(queryParameter)) ? false : true;
    }
}
