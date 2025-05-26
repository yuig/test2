package rr;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.z3;

/* loaded from: classes.dex */
public final class k0 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final lh0.t0 f109769g;

    /* renamed from: h, reason: collision with root package name */
    public final np1.j f109770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(qr.h webhookDeeplinkUtil, lh0.t0 experiments, np1.j handshakeManager) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        this.f109769g = experiments;
        this.f109770h = handshakeManager;
    }

    @Override // rr.d0
    public final String a() {
        return "event_amazon_handshake_auth";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        lh0.t0 t0Var = this.f109769g;
        t0Var.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) t0Var.f83480a;
        boolean z13 = g1Var.o("android_ad_handshake_a2b", "enabled", z3Var) || g1Var.l("android_ad_handshake_a2b");
        qr.h hVar = this.f109723a;
        if (!z13) {
            hVar.l(null);
        } else {
            ((np1.i) this.f109770h).d(uri);
            hVar.l(null);
        }
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        if (host == null || !StringsKt.E(host, "pinterest.com", false)) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() == 2 && Intrinsics.d(pathSegments.get(0), "connect_udl") && Intrinsics.d(pathSegments.get(1), "amazon_udl");
    }
}
