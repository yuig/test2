package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class x31 {

    /* renamed from: a */
    public final Map f13458a;

    public x31(Map modifiers) {
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        this.f13458a = modifiers;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.ce r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.w31
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.w31 r0 = (ads_mobile_sdk.w31) r0
            int r1 = r0.f12847e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12847e = r1
            goto L18
        L13:
            ads_mobile_sdk.w31 r0 = new ads_mobile_sdk.w31
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12845c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12847e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r8 = r0.f12844b
            java.lang.Object r2 = r0.f12843a
            ue.c.H(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ue.c.H(r9)
            java.util.Map r9 = r7.f13458a
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r2 = r8
            r8 = r9
        L42:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L7f
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r4 = r9.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r9.getValue()
            a.q4 r9 = (a.q4) r9
            ok.e0 r5 = ads_mobile_sdk.gk0.f5596a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Configuring JsContext with modifier ["
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = "]"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ads_mobile_sdk.gk0.c(r4)
            r0.f12843a = r2
            r0.f12844b = r8
            r0.f12847e = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L42
            return r1
        L7f:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x31.a(a.ce, bl2.c):java.lang.Object");
    }
}
