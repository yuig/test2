package rr;

import android.net.Uri;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import com.pinterest.targethandshake.analytics.AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l2 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f109776g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final Object f109777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(qr.h webhookDeeplinkUtil, is1.k0 webViewManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(webViewManager, "webViewManager");
        this.f109777h = webViewManager;
    }

    @Override // rr.d0
    public final String a() {
        switch (this.f109776g) {
            case 0:
                return "event_target_handshake_auth";
            default:
                return "webview";
        }
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        int i13 = this.f109776g;
        qr.h hVar = this.f109723a;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(uri, "uri");
                z82.j jVar = (z82.j) ((z82.b) this.f109777h);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(uri, "uri");
                String queryParameter = uri.getQueryParameter("code");
                String queryParameter2 = uri.getQueryParameter(AnimatedTarget.PROPERTY_STATE);
                String errorCode = uri.getQueryParameter("error");
                ArrayList arrayList = jVar.f141139m;
                y82.h hVar2 = jVar.f141130d;
                if (errorCode != null) {
                    String queryParameter3 = uri.getQueryParameter("error_description");
                    if (queryParameter3 == null) {
                        queryParameter3 = "";
                    }
                    arrayList.add(new d92.m(errorCode, Intrinsics.d(errorCode, "access_denied"), queryParameter3, new u50.k0(m60.x0.oops_something_went_wrong)));
                    y82.i iVar = (y82.i) hVar2;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    iVar.f138080b.getClass();
                    zy.a d03 = m60.f0.d0("deeplink_contains_error", errorCode);
                    iVar.f138079a.g(d03.f143049b, d03.f143050c, d03.f143051d, d03.f143054g);
                    y82.a aVar = iVar.f138081c;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload adsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload = new AdsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload("PIN_HANDSHAKE_WEBVIEW_ERROR", "deeplink_contains_error", errorCode);
                    if (aVar.a()) {
                        wr.c.a(aVar.f138064a, adsTargetAccountLinkingLogger$AdsTargetAccountLinkingErrorPayload, null, null, 14);
                    }
                } else if (queryParameter == null || queryParameter2 == null) {
                    arrayList.add(new d92.m("invalid_uri_params", new u50.k0(m60.x0.oops_something_went_wrong)));
                    ((y82.i) hVar2).b("invalid_uri_params", "");
                } else if (Intrinsics.d(queryParameter2, jVar.f141137k)) {
                    kotlin.jvm.internal.j.z(jVar.f141132f, jVar.f141133g, null, new z82.g(jVar, queryParameter, null), 2);
                } else {
                    arrayList.add(new d92.m("state_mismatch", new u50.k0(m60.x0.oops_something_went_wrong)));
                    ((y82.i) hVar2).b("state_mismatch", "");
                }
                hVar.l(null);
                break;
            default:
                Intrinsics.checkNotNullParameter(uri, "uri");
                hVar.s(uri);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.get(1), "target") == false) goto L25;
     */
    @Override // rr.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(android.net.Uri r8) {
        /*
            r7 = this;
            int r0 = r7.f109776g
            r1 = 0
            r2 = 1
            java.lang.String r3 = "uri"
            switch(r0) {
                case 0: goto L2e;
                default: goto L9;
            }
        L9:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.String r0 = r8.getHost()
            if (r0 == 0) goto L1d
            java.lang.Object r4 = r7.f109777h
            is1.k0 r4 = (is1.k0) r4
            boolean r0 = r4.b(r0)
            if (r0 != r2) goto L1d
            goto L2c
        L1d:
            java.util.Set r0 = qs1.b.f105095a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.String r8 = r8.toString()
            boolean r8 = qs1.b.a(r8)
            if (r8 == 0) goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        L2e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.String r0 = r8.getHost()
            java.lang.String r3 = "target"
            java.lang.String r4 = "connect"
            if (r0 == 0) goto L64
            java.lang.String r5 = "pinterest.com"
            boolean r0 = kotlin.text.StringsKt.E(r0, r5, r1)
            if (r0 != r2) goto L64
            java.util.List r0 = r8.getPathSegments()
            int r5 = r0.size()
            r6 = 2
            if (r5 == r6) goto L4f
            goto L64
        L4f:
            java.lang.Object r5 = r0.get(r1)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r4)
            if (r5 != 0) goto L5a
            goto L64
        L5a:
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r0 != 0) goto L96
        L64:
            java.lang.String r0 = r8.getScheme()
            if (r0 == 0) goto L73
            java.lang.String r5 = "pinterest"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L73
            goto L97
        L73:
            java.lang.String r0 = r8.getHost()
            if (r0 == 0) goto L80
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L80
            goto L97
        L80:
            java.util.List r8 = r8.getPathSegments()
            int r0 = r8.size()
            if (r0 == r2) goto L8b
            goto L97
        L8b:
            java.lang.Object r8 = r8.get(r1)
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r3)
            if (r8 != 0) goto L96
            goto L97
        L96:
            r1 = r2
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.l2.e(android.net.Uri):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(qr.h webhookDeeplinkUtil, z82.b handshakeManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        this.f109777h = handshakeManager;
    }
}
