package np1;

import android.net.Uri;
import android.webkit.CookieManager;
import ao2.f0;
import ao2.j0;
import ao2.v0;
import com.pinterest.handshake.model.IHandshakeRemoteDataSource;
import com.pinterest.handshake.ui.webview.HandshakeWebView;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.o1;
import lh0.z0;
import lh0.z3;
import m60.x0;
import mp1.l;
import qp1.p;
import u50.k0;
import u50.r;

/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final rp1.d f91789a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandshakeRemoteDataSource f91790b;

    /* renamed from: c, reason: collision with root package name */
    public final lv.a f91791c;

    /* renamed from: d, reason: collision with root package name */
    public final l f91792d;

    /* renamed from: e, reason: collision with root package name */
    public final o1 f91793e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f91794f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f91795g;

    /* renamed from: h, reason: collision with root package name */
    public String f91796h;

    /* renamed from: i, reason: collision with root package name */
    public String f91797i;

    /* renamed from: j, reason: collision with root package name */
    public String f91798j;

    /* renamed from: k, reason: collision with root package name */
    public String f91799k;

    /* renamed from: l, reason: collision with root package name */
    public r f91800l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f91801m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91802n;

    public i(rp1.d handshakeCookieManager, IHandshakeRemoteDataSource handshakeRemoteDataSource, lv.a adsQuarantine, l handshakeAnalytics, o1 experiment, j0 scope) {
        ko2.f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(handshakeCookieManager, "handshakeCookieManager");
        Intrinsics.checkNotNullParameter(handshakeRemoteDataSource, "handshakeRemoteDataSource");
        Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
        Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f91789a = handshakeCookieManager;
        this.f91790b = handshakeRemoteDataSource;
        this.f91791c = adsQuarantine;
        this.f91792d = handshakeAnalytics;
        this.f91793e = experiment;
        this.f91794f = scope;
        this.f91795g = ioDispatcher;
        this.f91801m = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof np1.c
            if (r0 == 0) goto L13
            r0 = r5
            np1.c r0 = (np1.c) r0
            int r1 = r0.f91770u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91770u = r1
            goto L18
        L13:
            np1.c r0 = new np1.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f91768s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f91770u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            np1.i r0 = r0.f91767r
            ue.c.H(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            r0.f91767r = r4
            r0.f91770u = r3
            com.pinterest.handshake.model.IHandshakeRemoteDataSource r5 = r4.f91790b
            java.lang.Object r5 = r5.getToken(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            java.lang.String r5 = (java.lang.String) r5
            r0.f91797i = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.i.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof np1.d
            if (r0 == 0) goto L13
            r0 = r8
            np1.d r0 = (np1.d) r0
            int r1 = r0.f91774u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91774u = r1
            goto L18
        L13:
            np1.d r0 = new np1.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f91772s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f91774u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            np1.i r0 = r0.f91771r
            ue.c.H(r8)
            goto L51
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            ue.c.H(r8)
            java.lang.String r2 = r7.f91796h
            if (r2 == 0) goto L43
            com.pinterest.handshake.model.models.HandshakeDataConnect r8 = new com.pinterest.handshake.model.models.HandshakeDataConnect
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r8
        L43:
            r0.f91771r = r7
            r0.f91774u = r3
            com.pinterest.handshake.model.IHandshakeRemoteDataSource r8 = r7.f91790b
            java.lang.Object r8 = r8.getApiKey(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r0 = r7
        L51:
            com.pinterest.handshake.model.models.HandshakeDataConnect r8 = (com.pinterest.handshake.model.models.HandshakeDataConnect) r8
            if (r8 == 0) goto L5a
            java.lang.String r1 = r8.getApiKey()
            goto L5b
        L5a:
            r1 = 0
        L5b:
            r0.f91796h = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.i.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Comparable c(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof np1.e
            if (r0 == 0) goto L13
            r0 = r5
            np1.e r0 = (np1.e) r0
            int r1 = r0.f91778u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91778u = r1
            goto L18
        L13:
            np1.e r0 = new np1.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f91776s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f91778u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            np1.i r0 = r0.f91775r
            ue.c.H(r5)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            boolean r5 = r4.f()
            if (r5 == 0) goto L41
            gb0.c r5 = gb0.c.UNIVERSAL_DEEP_LINK
            int r5 = r5.value()
            goto L47
        L41:
            gb0.c r5 = gb0.c.HTTPS_PROXY_TO_MOBILE_DEEP_LINK
            int r5 = r5.value()
        L47:
            r0.f91775r = r4
            r0.f91778u = r3
            com.pinterest.handshake.model.IHandshakeRemoteDataSource r2 = r4.f91790b
            java.lang.Object r5 = r2.getLoginUrl(r5, r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            r0 = r4
        L55:
            android.net.Uri r5 = (android.net.Uri) r5
            r1 = 0
            if (r5 == 0) goto L5f
            java.lang.String r2 = r5.toString()
            goto L60
        L5f:
            r2 = r1
        L60:
            r0.f91798j = r2
            if (r5 == 0) goto L6b
            java.lang.String r1 = "state"
            java.lang.String r1 = r5.getQueryParameter(r1)
        L6b:
            r0.f91799k = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.i.c(bl2.c):java.lang.Comparable");
    }

    public final void d(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter(AnimatedTarget.PROPERTY_STATE);
        String queryParameter3 = uri.getQueryParameter("error");
        ArrayList arrayList = this.f91801m;
        if (queryParameter3 != null) {
            boolean f13 = f();
            boolean d2 = Intrinsics.d(queryParameter3, "access_denied");
            String queryParameter4 = uri.getQueryParameter("error_description");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            arrayList.add(new p(f13, queryParameter3, d2, queryParameter4, new k0(x0.oops_something_went_wrong)));
            return;
        }
        if (queryParameter == null || queryParameter2 == null) {
            arrayList.add(new p(new k0(x0.oops_something_went_wrong)));
        } else if (!Intrinsics.d(queryParameter2, this.f91799k)) {
            arrayList.add(new p(new k0(x0.oops_something_went_wrong)));
        } else {
            kotlin.jvm.internal.j.z(this.f91794f, this.f91795g, null, new f(this, queryParameter, null), 2);
        }
    }

    public final void e(HandshakeWebView handshakeWebView) {
        Intrinsics.checkNotNullParameter(handshakeWebView, "webView");
        rp1.d dVar = this.f91789a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(handshakeWebView, "handshakeWebView");
        lv.a aVar = dVar.f109059a;
        aVar.getClass();
        boolean a13 = lv.a.a();
        LinkedHashSet linkedHashSet = dVar.f109067i;
        String str = dVar.f109062d;
        if (a13) {
            CookieManager b13 = dVar.b();
            b13.setAcceptCookie(true);
            b13.setAcceptThirdPartyCookies(handshakeWebView.f49729c, true);
            StringBuilder sb3 = new StringBuilder();
            String str2 = dVar.f109065g;
            sb3.append(str2);
            sb3.append("=ANDROID; secure");
            b13.setCookie(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            String str3 = dVar.f109066h;
            sb4.append(str3);
            sb4.append("=");
            sb4.append(dVar.f109060b);
            sb4.append("; secure");
            b13.setCookie(str, sb4.toString());
            linkedHashSet.add(str2);
            linkedHashSet.add(str3);
        }
        String str4 = this.f91796h;
        if (str4 != null) {
            dVar.c(str4);
        }
        String accessToken = this.f91797i;
        if (accessToken != null) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            aVar.getClass();
            if (lv.a.a()) {
                CookieManager b14 = dVar.b();
                StringBuilder sb5 = new StringBuilder();
                String str5 = dVar.f109064f;
                b14.setCookie(str, a.a.q(sb5, str5, "=", accessToken, "; secure; httponly"));
                linkedHashSet.add(str5);
            }
        }
    }

    public final boolean f() {
        z3 activate = a4.f83298b;
        o1 o1Var = this.f91793e;
        o1Var.getClass();
        Intrinsics.checkNotNullParameter("enabled", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        z0 z0Var = o1Var.f83447a;
        if (!((g1) z0Var).o("android_ad_handshake_a2b", "enabled", activate)) {
            Intrinsics.checkNotNullParameter("employees", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((g1) z0Var).o("android_ad_handshake_a2b", "employees", activate)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof np1.h
            if (r0 == 0) goto L13
            r0 = r5
            np1.h r0 = (np1.h) r0
            int r1 = r0.f91788u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91788u = r1
            goto L18
        L13:
            np1.h r0 = new np1.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f91786s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f91788u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            np1.i r0 = r0.f91785r
            ue.c.H(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            r0.f91785r = r4
            r0.f91788u = r3
            com.pinterest.handshake.model.IHandshakeRemoteDataSource r5 = r4.f91790b
            java.lang.Object r5 = r5.deleteToken(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L5b
            rp1.d r1 = r0.f91789a
            r1.a()
            r1 = 0
            r0.f91796h = r1
            r0.f91797i = r1
            r0.f91798j = r1
            r0.f91799k = r1
            r1 = 0
            r0.f91802n = r1
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.i.g(bl2.c):java.lang.Object");
    }

    public final String toString() {
        String str = this.f91796h;
        String str2 = this.f91797i;
        return a.a.q(a.a.w("HandshakeManager(apiToken=", str, ", accessToken=", str2, ", loginUrl="), this.f91798j, ", loginUrlCodeChallenge=", this.f91799k, ")");
    }
}
