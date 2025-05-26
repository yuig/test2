package ads_mobile_sdk;

import ao2.j0;
import bj.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nh1 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f8801a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8802b;

    /* renamed from: c, reason: collision with root package name */
    public final dh1 f8803c;

    /* renamed from: d, reason: collision with root package name */
    public final wi.k f8804d;

    /* renamed from: e, reason: collision with root package name */
    public final cm0 f8805e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8806f;

    public nh1(j0 backgroundScope, n nativeRequest, oh0 flags, dh1 nativeAdSettingsDataStore, wi.k baseRequest, cm0 gmaUtil, int i13) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(nativeAdSettingsDataStore, "nativeAdSettingsDataStore");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.f8801a = backgroundScope;
        this.f8802b = nativeRequest;
        this.f8803c = nativeAdSettingsDataStore;
        this.f8804d = baseRequest;
        this.f8805e = gmaUtil;
        this.f8806f = i13;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.NATIVE_AD;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.lh1
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.lh1 r0 = (ads_mobile_sdk.lh1) r0
            int r1 = r0.f7849g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7849g = r1
            goto L18
        L13:
            ads_mobile_sdk.lh1 r0 = new ads_mobile_sdk.lh1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f7847e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7849g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            ue.c.H(r15)
            goto La3
        L2c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L34:
            long r5 = r0.f7846d
            long r7 = r0.f7845c
            java.lang.String r2 = r0.f7844b
            ads_mobile_sdk.nh1 r9 = r0.f7843a
            ue.c.H(r15)
            goto L69
        L40:
            ue.c.H(r15)
            wi.k r15 = r14.f8804d
            java.lang.String r2 = r15.l()
            if (r2 != 0) goto L4c
            return r3
        L4c:
            ads_mobile_sdk.cm0 r15 = r14.f8805e
            long r6 = r15.a()
            ads_mobile_sdk.dh1 r15 = r14.f8803c
            r0.f7843a = r14
            r0.f7844b = r2
            r0.f7845c = r6
            r0.f7846d = r6
            r0.f7849g = r5
            java.lang.Object r15 = r15.f(r0)
            if (r15 != r1) goto L65
            return r1
        L65:
            r9 = r14
            r12 = r6
            r7 = r12
            r5 = r7
        L69:
            java.lang.Number r15 = (java.lang.Number) r15
            long r10 = r15.longValue()
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 == 0) goto L94
            ao2.j0 r15 = r9.f8801a
            ads_mobile_sdk.mh1 r0 = new ads_mobile_sdk.mh1
            r0.<init>(r9, r7, r3)
            kotlin.coroutines.j r1 = kotlin.coroutines.j.f80412a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            ads_mobile_sdk.et2 r2 = new ads_mobile_sdk.et2
            r2.<init>(r0, r3)
            kotlin.jvm.internal.j.z(r15, r1, r3, r2, r4)
            return r3
        L94:
            ads_mobile_sdk.dh1 r15 = r9.f8803c
            r0.f7843a = r3
            r0.f7844b = r3
            r0.f7849g = r4
            java.lang.Object r15 = r15.a(r2, r0)
            if (r15 != r1) goto La3
            return r1
        La3:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nh1.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r22) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nh1.c(bl2.c):java.lang.Object");
    }
}
