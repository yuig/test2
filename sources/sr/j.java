package sr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pinterest.api.model.wy0;
import j1.p0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import rr.n0;
import so.m4;
import so.n4;
import so.q4;
import so.r4;
import so.r8;
import so.s8;
import x02.x2;

/* loaded from: classes.dex */
public final class j implements p, q, b {

    /* renamed from: a, reason: collision with root package name */
    public final us1.a f115065a;

    /* renamed from: b, reason: collision with root package name */
    public final lu1.b f115066b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f115067c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f115068d;

    /* renamed from: e, reason: collision with root package name */
    public final vy.m f115069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f115070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f115071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f115072h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f115073i;

    /* renamed from: j, reason: collision with root package name */
    public kk2.l f115074j;

    public j(us1.a activity, lu1.b baseActivityHelper, b60.b activeUserManager, x2 userRepository, vy.m analyticsApi, m4 navigationWebhookDeeplinkUtilFactory, q4 webhookDeeplinkUtilFactory, n4 coreWebhookDeeplinkUtilFactory, r4 searchWebhookDeeplinkUtilFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(navigationWebhookDeeplinkUtilFactory, "navigationWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtilFactory, "webhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(coreWebhookDeeplinkUtilFactory, "coreWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(searchWebhookDeeplinkUtilFactory, "searchWebhookDeeplinkUtilFactory");
        this.f115065a = activity;
        this.f115066b = baseActivityHelper;
        this.f115067c = activeUserManager;
        this.f115068d = userRepository;
        this.f115069e = analyticsApi;
        this.f115070f = navigationWebhookDeeplinkUtilFactory.a(activity);
        r8 r8Var = searchWebhookDeeplinkUtilFactory.f114087a;
        new f(activity, s8.g(r8Var.f114091b), (m4) r8Var.f114091b.Uc.get());
        this.f115071g = new k(activity, (lu1.b) webhookDeeplinkUtilFactory.f114069a.f114090a.f113961v5.get());
        this.f115072h = coreWebhookDeeplinkUtilFactory.a(activity);
    }

    @Override // sr.p
    public final void a(boolean z13) {
        this.f115073i = z13;
    }

    @Override // sr.p
    public final void clear() {
        kk2.l lVar = this.f115074j;
        if (lVar != null) {
            lVar.dispose();
            this.f115074j = null;
        }
    }

    @Override // sr.p
    public final boolean e() {
        return ((b60.d) this.f115067c).i();
    }

    @Override // sr.p
    public final boolean f() {
        return this.f115073i;
    }

    @Override // sr.q
    public final void g(String url, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f115071g.g(url, z13, z14);
    }

    @Override // sr.p
    public final void j(Uri uri, List segments, String str, boolean z13, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(segments, "segments");
        String str3 = (String) segments.get(0);
        if (z13) {
            this.f115074j = (kk2.l) this.f115068d.Q(str3).H(tk2.e.f118017c).A(wj2.c.a()).s().o(new n0(10, new p0(this, uri, segments, str2, 5)), new n0(11, new p0(this, str3, str, uri, 6)));
            return;
        }
        this.f115069e.a("unauth_pin_deeplink");
        Context context = kb0.a.f79058b;
        Intent i13 = ((lu1.c) this.f115066b).i(f0.W());
        i13.putExtra("com.pinterest.EXTRA_USER_ID", str3);
        this.f115065a.startActivity(i13);
        this.f115072h.f115049a.g();
    }

    @Override // sr.p
    public final boolean k() {
        wy0 f13 = ((b60.d) this.f115067c).f();
        if (f13 != null) {
            Boolean G3 = f13.G3();
            Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
            if (G3.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
