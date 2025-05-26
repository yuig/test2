package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7570a;

    public l(Map actionHandlers) {
        Intrinsics.checkNotNullParameter(actionHandlers, "actionHandlers");
        this.f7570a = actionHandlers;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ye2 r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.k
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.k r0 = (ads_mobile_sdk.k) r0
            int r1 = r0.f7029e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7029e = r1
            goto L18
        L13:
            ads_mobile_sdk.k r0 = new ads_mobile_sdk.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f7027c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7029e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r7 = r0.f7026b
            ads_mobile_sdk.l r2 = r0.f7025a
            ue.c.H(r8)
            goto L3d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ue.c.H(r8)
            java.util.List r7 = r7.f14213c
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L66
            java.lang.Object r8 = r7.next()
            ads_mobile_sdk.we2 r8 = (ads_mobile_sdk.we2) r8
            nm.u r4 = r8.f13015b
            if (r4 == 0) goto L3d
            java.util.Map r5 = r2.f7570a
            java.lang.String r8 = r8.f13014a
            java.lang.Object r8 = r5.get(r8)
            a.s8 r8 = (a.s8) r8
            if (r8 == 0) goto L3d
            r0.f7025a = r2
            r0.f7026b = r7
            r0.f7029e = r3
            java.lang.Object r8 = r8.a(r4, r0)
            if (r8 != r1) goto L3d
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.l.a(ads_mobile_sdk.ye2, bl2.c):java.lang.Object");
    }
}
