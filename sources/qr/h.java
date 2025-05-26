package qr;

import android.net.Uri;
import android.os.Bundle;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import h32.a4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.u0;
import lh0.z0;
import rr.c0;
import so.m4;
import so.n4;
import so.q4;
import so.r4;
import so.r8;
import so.s8;
import so.t4;
import so.u4;
import so.v4;
import so.w4;
import sr.o;
import sr.p;
import sr.q;

/* loaded from: classes.dex */
public final class h implements sr.a, sr.b, o, p, q {

    /* renamed from: a, reason: collision with root package name */
    public final us1.a f104940a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f104941b;

    /* renamed from: c, reason: collision with root package name */
    public final o f104942c;

    /* renamed from: d, reason: collision with root package name */
    public final p f104943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr.d f104944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sr.e f104945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tb.c f104946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sr.f f104947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tb.e f104948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sr.g f104949j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sr.g f104950k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sr.f f104951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sr.k f104952m;

    public h(us1.a activity, c0 deeplinkInitializer, o todayWebhookDeeplinkUtil, p userWebhookDeeplinkUtil, tb.c loggingWebhookDeeplinkUtil, t4 boardWebhookDeeplinkUtil, m4 navigationWebhookDeeplinkUtil, u4 notificationWebhookDeeplinkUtil, v4 pinWebhookDeeplinkUtil, w4 productWebhookDeeplinkUtil, n4 coreWebhookDeeplinkUtilFactory, r4 searchWebhookDeeplinkUtilFactory, q4 webviewWebhookDeeplinkUtilFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deeplinkInitializer, "deeplinkInitializer");
        Intrinsics.checkNotNullParameter(todayWebhookDeeplinkUtil, "todayWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(userWebhookDeeplinkUtil, "userWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(loggingWebhookDeeplinkUtil, "loggingWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(boardWebhookDeeplinkUtil, "boardWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(navigationWebhookDeeplinkUtil, "navigationWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(notificationWebhookDeeplinkUtil, "notificationWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(pinWebhookDeeplinkUtil, "pinWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(productWebhookDeeplinkUtil, "productWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(coreWebhookDeeplinkUtilFactory, "coreWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(searchWebhookDeeplinkUtilFactory, "searchWebhookDeeplinkUtilFactory");
        Intrinsics.checkNotNullParameter(webviewWebhookDeeplinkUtilFactory, "webviewWebhookDeeplinkUtilFactory");
        this.f104940a = activity;
        this.f104941b = deeplinkInitializer;
        this.f104942c = todayWebhookDeeplinkUtil;
        this.f104943d = userWebhookDeeplinkUtil;
        r8 r8Var = boardWebhookDeeplinkUtil.f114631a;
        vy.m mVar = (vy.m) r8Var.f114090a.M1.get();
        lu1.b bVar = (lu1.b) r8Var.f114090a.f113961v5.get();
        s8 s8Var = r8Var.f114091b;
        s8Var.getClass();
        this.f104944e = new sr.d(activity, mVar, bVar, new u0((z0) s8Var.f114255d.D0.get()), s8Var.e5());
        this.f104945f = coreWebhookDeeplinkUtilFactory.a(activity);
        this.f104946g = loggingWebhookDeeplinkUtil;
        this.f104947h = navigationWebhookDeeplinkUtil.a(activity);
        lu1.b baseActivityHelper = (lu1.b) notificationWebhookDeeplinkUtil.f114647a.f114090a.f113961v5.get();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        tb.e eVar = new tb.e();
        eVar.f116963a = activity;
        eVar.f116964b = baseActivityHelper;
        this.f104948i = eVar;
        r8 r8Var2 = pinWebhookDeeplinkUtil.f114669a;
        this.f104949j = new sr.g(activity, (lu1.b) r8Var2.f114090a.f113961v5.get(), (vy.m) r8Var2.f114090a.M1.get());
        r8 r8Var3 = productWebhookDeeplinkUtil.f114684a;
        this.f104950k = new sr.g(activity, (vy.m) r8Var3.f114090a.M1.get(), (lu1.b) r8Var3.f114090a.f113961v5.get());
        r8 r8Var4 = searchWebhookDeeplinkUtilFactory.f114087a;
        this.f104951l = new sr.f(activity, s8.g(r8Var4.f114091b), (m4) r8Var4.f114091b.Uc.get());
        this.f104952m = new sr.k(activity, (lu1.b) webviewWebhookDeeplinkUtilFactory.f114069a.f114090a.f113961v5.get());
    }

    @Override // sr.p
    public final void a(boolean z13) {
        this.f104943d.a(z13);
    }

    @Override // sr.o, sr.p
    public final void clear() {
        this.f104943d.clear();
        this.f104942c.clear();
    }

    @Override // sr.o
    public final void d(String articleId, String str, Integer num, a4 a4Var, String str2) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.f104942c.d(articleId, str, num, a4Var, str2);
    }

    @Override // sr.p
    public final boolean e() {
        return this.f104943d.e();
    }

    @Override // sr.p
    public final boolean f() {
        return this.f104943d.f();
    }

    @Override // sr.q
    public final void g(String url, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f104952m.g(url, z13, z14);
    }

    @Override // sr.p
    public final void j(Uri uri, List segments, String str, boolean z13, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f104943d.j(uri, segments, str, z13, str2);
    }

    @Override // sr.p
    public final boolean k() {
        return this.f104943d.k();
    }

    public final void l(Bundle bundle) {
        this.f104947h.b(bundle);
    }

    public final void m(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f104947h.d(navigation);
    }

    public final void n(Bundle bundle) {
        this.f104945f.a(bundle);
    }

    public final void o(String boardId, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f104944e.a(boardId, false, z14, z15, z16);
    }

    public final void p(u70.a tabType, Bundle extras) {
        Intrinsics.checkNotNullParameter(tabType, "tabType");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f104947h.f(tabType, extras);
    }

    public final void q() {
        this.f104945f.f115049a.g();
    }

    public final void r(NavigationImpl navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        sr.f fVar = this.f104947h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        fVar.c(navigation);
    }

    public final void s(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        sr.k kVar = this.f104952m;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        q.b(kVar, uri2, false, 6);
    }

    public final boolean t(Bundle bundle) {
        return this.f104947h.g(bundle);
    }
}
