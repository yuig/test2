package kx;

import com.pinterest.repository.pin.PinService;
import kotlin.jvm.internal.Intrinsics;
import lb0.g;
import lb0.o;
import m60.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f81049a;

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f81050b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81051c;

    /* renamed from: d, reason: collision with root package name */
    public final jx.a f81052d;

    /* renamed from: e, reason: collision with root package name */
    public final o f81053e;

    /* renamed from: f, reason: collision with root package name */
    public final PinService f81054f;

    /* renamed from: g, reason: collision with root package name */
    public final nm.o f81055g;

    public b(e applicationInfoProvider, pb0.a clock, g diskCache, jx.a adsConfigAnalytics, o userPreferences, PinService pinService) {
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(adsConfigAnalytics, "adsConfigAnalytics");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        this.f81049a = applicationInfoProvider;
        this.f81050b = clock;
        this.f81051c = diskCache;
        this.f81052d = adsConfigAnalytics;
        this.f81053e = userPreferences;
        this.f81054f = pinService;
        this.f81055g = new nm.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kx.a
            if (r0 == 0) goto L13
            r0 = r8
            kx.a r0 = (kx.a) r0
            int r1 = r0.f81048u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81048u = r1
            goto L18
        L13:
            kx.a r0 = new kx.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f81046s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f81048u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kx.b r0 = r0.f81045r
            ue.c.H(r8)
            goto L42
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            ue.c.H(r8)
            r0.f81045r = r7
            r0.f81048u = r3
            com.pinterest.repository.pin.PinService r8 = r7.f81054f
            java.lang.Object r8 = r8.getThirdPartyAdConfigSuspend(r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r0 = r7
        L42:
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r8
            boolean r1 = kh2.k3.s1(r8)
            r2 = 0
            r4 = 0
            if (r1 == 0) goto La9
            java.lang.Object r8 = kh2.k3.f0(r8)
            com.pinterest.api.model.xs0 r8 = (com.pinterest.api.model.xs0) r8
            if (r8 == 0) goto Lbf
            lb0.g r1 = r0.f81051c
            nm.o r2 = r0.f81055g
            java.lang.String r2 = r2.k(r8)
            r1.getClass()
            java.io.File r1 = new java.io.File
            java.lang.String r5 = "THIRD_PARTY_AD_CONFIG"
            java.lang.String r3 = lb0.g.c(r5, r3)
            r1.<init>(r3)
            com.bumptech.glide.d.D0(r1, r2)
            pb0.a r1 = r0.f81050b
            pb0.g r1 = (pb0.g) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            com.pinterest.api.model.bt0 r3 = r8.f()
            if (r3 == 0) goto L83
            java.lang.Integer r3 = r3.y()
            goto L87
        L83:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L87:
            int r3 = r3.intValue()
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            long r3 = r3 + r1
            lb0.o r1 = r0.f81053e
            lb0.b r1 = (lb0.b) r1
            java.lang.String r2 = "PREF_THIRD_PARTY_AD_CONFIG_EXPIRY_MS"
            r1.m(r2, r3)
            m60.e r0 = r0.f81049a
            m60.d r0 = (m60.d) r0
            r0.b()
            r0 = 13198010(0xc962ba, float:1.8494351E-38)
            java.lang.String r2 = "PREF_THIRD_PARTY_AD_CONFIG_LAST_APP_VERSION"
            r1.l(r2, r0)
            return r8
        La9:
            jx.a r8 = r0.f81052d
            r8.getClass()
            h32.f1 r0 = h32.f1.GMA_SDK_QUARANTINE_FAILED
            java.lang.String r1 = "fail_reason"
            java.lang.String r3 = "configuration_request_failed"
            java.util.HashMap r1 = ep.b.o(r1, r3)
            kotlin.Unit r3 = kotlin.Unit.f80348a
            nx.d0 r8 = r8.f77675a
            r8.g(r0, r2, r1, r4)
        Lbf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.b.a(bl2.c):java.lang.Object");
    }
}
