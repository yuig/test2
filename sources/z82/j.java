package z82;

import android.webkit.CookieManager;
import ao2.f0;
import ao2.j0;
import ao2.v0;
import com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import lh0.g4;
import u50.r;

/* loaded from: classes2.dex */
public final class j implements b {

    /* renamed from: n, reason: collision with root package name */
    public static final b92.a f141126n = new b92.a(null, false);

    /* renamed from: a, reason: collision with root package name */
    public final e92.d f141127a;

    /* renamed from: b, reason: collision with root package name */
    public final a92.a f141128b;

    /* renamed from: c, reason: collision with root package name */
    public final lv.a f141129c;

    /* renamed from: d, reason: collision with root package name */
    public final y82.h f141130d;

    /* renamed from: e, reason: collision with root package name */
    public final g4 f141131e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f141132f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f141133g;

    /* renamed from: h, reason: collision with root package name */
    public String f141134h;

    /* renamed from: i, reason: collision with root package name */
    public b92.a f141135i;

    /* renamed from: j, reason: collision with root package name */
    public String f141136j;

    /* renamed from: k, reason: collision with root package name */
    public String f141137k;

    /* renamed from: l, reason: collision with root package name */
    public r f141138l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f141139m;

    public j(e92.d handshakeCookieManager, a92.a handshakeRemoteDataSource, lv.a adsQuarantine, y82.h handshakeAnalytics, g4 experiment, j0 scope) {
        ko2.f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(handshakeCookieManager, "handshakeCookieManager");
        Intrinsics.checkNotNullParameter(handshakeRemoteDataSource, "handshakeRemoteDataSource");
        Intrinsics.checkNotNullParameter(adsQuarantine, "adsQuarantine");
        Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f141127a = handshakeCookieManager;
        this.f141128b = handshakeRemoteDataSource;
        this.f141129c = adsQuarantine;
        this.f141130d = handshakeAnalytics;
        this.f141131e = experiment;
        this.f141132f = scope;
        this.f141133g = ioDispatcher;
        this.f141135i = f141126n;
        this.f141139m = new ArrayList();
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
            boolean r0 = r5 instanceof z82.d
            if (r0 == 0) goto L13
            r0 = r5
            z82.d r0 = (z82.d) r0
            int r1 = r0.f141108u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141108u = r1
            goto L18
        L13:
            z82.d r0 = new z82.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f141106s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f141108u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z82.j r0 = r0.f141105r
            ue.c.H(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            r0.f141105r = r4
            r0.f141108u = r3
            a92.a r5 = r4.f141128b
            a92.h r5 = (a92.h) r5
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            java.lang.String r5 = (java.lang.String) r5
            b92.a r1 = new b92.a
            r2 = 0
            r1.<init>(r5, r2)
            r0.f141135i = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z82.j.a(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof z82.e
            if (r0 == 0) goto L13
            r0 = r6
            z82.e r0 = (z82.e) r0
            int r1 = r0.f141112u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141112u = r1
            goto L18
        L13:
            z82.e r0 = new z82.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f141110s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f141112u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            z82.j r0 = r0.f141109r
            ue.c.H(r6)
            goto L50
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ue.c.H(r6)
            java.lang.String r6 = r5.f141134h
            if (r6 == 0) goto L40
            b92.b r0 = new b92.b
            r1 = 6
            r0.<init>(r6, r3, r1)
            return r0
        L40:
            r0.f141109r = r5
            r0.f141112u = r4
            a92.a r6 = r5.f141128b
            a92.h r6 = (a92.h) r6
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r5
        L50:
            b92.b r6 = (b92.b) r6
            if (r6 == 0) goto L56
            java.lang.String r3 = r6.f22249b
        L56:
            r0.f141134h = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z82.j.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        r11 = kotlin.text.StringsKt__StringsKt.split$default(r11, new java.lang.String[]{"; "}, false, 0, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Comparable c(bl2.c r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z82.j.c(bl2.c):java.lang.Comparable");
    }

    public final void d(TargetHandshakeWebView handshakeWebView, boolean z13) {
        Intrinsics.checkNotNullParameter(handshakeWebView, "webView");
        e92.d dVar = this.f141127a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(handshakeWebView, "handshakeWebView");
        lv.a aVar = dVar.f57919a;
        aVar.getClass();
        boolean a13 = lv.a.a();
        LinkedHashSet linkedHashSet = dVar.f57924f;
        if (a13) {
            if (z13) {
                dVar.a();
            }
            CookieManager b13 = dVar.b();
            b13.setAcceptCookie(true);
            b13.setAcceptThirdPartyCookies(handshakeWebView.f52190c, true);
            b13.setCookie("https://.target.com", "session-aa-os-name=ANDROID; secure");
            b13.setCookie("https://.target.com", "session-aa-os-version=" + dVar.f57920b + "; secure");
            linkedHashSet.add("session-aa-os-name");
            linkedHashSet.add("session-aa-os-version");
        }
        String str = this.f141134h;
        if (str != null) {
            dVar.d(str);
        }
        String accessToken = this.f141135i.f22246a;
        if (accessToken != null) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            aVar.getClass();
            if (lv.a.a()) {
                dVar.b().setCookie("https://.target.com", a.a.l(dVar.f57922d, "=", accessToken, "; secure; httponly"));
                linkedHashSet.add(dVar.f57922d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z82.i
            if (r0 == 0) goto L13
            r0 = r5
            z82.i r0 = (z82.i) r0
            int r1 = r0.f141125u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141125u = r1
            goto L18
        L13:
            z82.i r0 = new z82.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f141123s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f141125u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z82.j r0 = r0.f141122r
            ue.c.H(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            r0.f141122r = r4
            r0.f141125u = r3
            a92.a r5 = r4.f141128b
            a92.h r5 = (a92.h) r5
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
            if (r1 == 0) goto L5c
            e92.d r1 = r0.f141127a
            r1.a()
            r1 = 0
            r0.f141134h = r1
            b92.a r2 = z82.j.f141126n
            r0.f141135i = r2
            r0.f141136j = r1
            r0.f141137k = r1
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z82.j.e(bl2.c):java.lang.Object");
    }

    public final String toString() {
        String str = this.f141134h;
        b92.a aVar = this.f141135i;
        String str2 = this.f141136j;
        String str3 = this.f141137k;
        StringBuilder sb3 = new StringBuilder("HandshakeManager(apiToken=");
        sb3.append(str);
        sb3.append(", accessToken=");
        sb3.append(aVar);
        sb3.append(", loginUrl=");
        return a.a.q(sb3, str2, ", loginUrlCodeChallenge=", str3, ")");
    }
}
