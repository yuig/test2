package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ij1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f6426a;

    public ij1(n1 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.f6426a = adEventEmitter;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // a.cd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r5, java.util.Map r6, bl2.c r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof ads_mobile_sdk.hj1
            if (r5 == 0) goto L13
            r5 = r7
            ads_mobile_sdk.hj1 r5 = (ads_mobile_sdk.hj1) r5
            int r0 = r5.f5996e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f5996e = r0
            goto L18
        L13:
            ads_mobile_sdk.hj1 r5 = new ads_mobile_sdk.hj1
            r5.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r5.f5994c
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r5.f5996e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ue.c.H(r7)
            goto L6f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.util.Map r6 = r5.f5993b
            ads_mobile_sdk.ij1 r1 = r5.f5992a
            ue.c.H(r7)
            goto L4d
        L3a:
            ue.c.H(r7)
            ads_mobile_sdk.n1 r7 = r4.f6426a
            r5.f5992a = r4
            r5.f5993b = r6
            r5.f5996e = r3
            java.lang.Object r7 = r7.l(r5)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r1 = r4
        L4d:
            java.lang.String r7 = "sccg"
            java.lang.Object r6 = r6.get(r7)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L72
            int r6 = r6.length()
            if (r6 != 0) goto L5f
            goto L72
        L5f:
            ads_mobile_sdk.n1 r6 = r1.f6426a
            r7 = 0
            r5.f5992a = r7
            r5.f5993b = r7
            r5.f5996e = r2
            kotlin.Unit r5 = r6.e(r5)
            if (r5 != r0) goto L6f
            return r0
        L6f:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L72:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ij1.a(ads_mobile_sdk.ym0, java.util.Map, bl2.c):java.lang.Object");
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NATIVE_CLICK_RECORDED;
    }
}
