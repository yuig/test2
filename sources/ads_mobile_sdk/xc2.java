package ads_mobile_sdk;

import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xc2 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f13602a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional f13603b;

    /* renamed from: c, reason: collision with root package name */
    public final pc2 f13604c;

    /* renamed from: d, reason: collision with root package name */
    public final h92 f13605d;

    /* renamed from: e, reason: collision with root package name */
    public final wi.k f13606e;

    /* renamed from: f, reason: collision with root package name */
    public final List f13607f;

    public xc2(oh0 flags, Optional optionalBannerRequest, Optional optionalSignalRequest, pc2 rtbAdapterSignalCollector, h92 requestType, wi.k adRequest) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(optionalBannerRequest, "optionalBannerRequest");
        Intrinsics.checkNotNullParameter(optionalSignalRequest, "optionalSignalRequest");
        Intrinsics.checkNotNullParameter(rtbAdapterSignalCollector, "rtbAdapterSignalCollector");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.f13602a = optionalBannerRequest;
        this.f13603b = optionalSignalRequest;
        this.f13604c = rtbAdapterSignalCollector;
        this.f13605d = requestType;
        this.f13606e = adRequest;
        this.f13607f = flags.i0();
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.RTB_SIGNAL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.wc2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wc2 r0 = (ads_mobile_sdk.wc2) r0
            int r1 = r0.f12987c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12987c = r1
            goto L18
        L13:
            ads_mobile_sdk.wc2 r0 = new ads_mobile_sdk.wc2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12985a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12987c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r7)
            goto L7c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            ue.c.H(r7)
            java.util.Optional r7 = r6.f13603b
            java.lang.Object r7 = kh2.m2.U0(r7)
            dj.e r7 = (dj.e) r7
            if (r7 == 0) goto L5b
            java.util.List r2 = r6.f13607f
            ads_mobile_sdk.nl0 r7 = r7.f55121l
            int r7 = r7.a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L5b
            ads_mobile_sdk.pk0 r7 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.tc2 r0 = new ads_mobile_sdk.tc2
            kotlin.collections.q0 r1 = kotlin.collections.q0.f80391a
            r0.<init>(r1)
            r7.<init>(r0)
            return r7
        L5b:
            java.util.Optional r7 = r6.f13602a
            java.lang.Object r7 = kh2.m2.U0(r7)
            vi.d r7 = (vi.d) r7
            if (r7 == 0) goto L6a
            vi.a r7 = r7.k()
            goto L6b
        L6a:
            r7 = 0
        L6b:
            ads_mobile_sdk.h92 r2 = r6.f13605d
            java.lang.String r2 = r2.f5908a
            ads_mobile_sdk.pc2 r4 = r6.f13604c
            wi.k r5 = r6.f13606e
            r0.f12987c = r3
            java.lang.Object r7 = r4.a(r7, r2, r5, r0)
            if (r7 != r1) goto L7c
            return r1
        L7c:
            java.util.List r7 = (java.util.List) r7
            ads_mobile_sdk.tc2 r0 = new ads_mobile_sdk.tc2
            r0.<init>(r7)
            ads_mobile_sdk.pk0 r7 = new ads_mobile_sdk.pk0
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xc2.c(bl2.c):java.lang.Object");
    }
}
