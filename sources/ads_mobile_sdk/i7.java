package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i7 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final z6 f6270a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6271b;

    public i7(oh0 flags, z6 adapterInitializer) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        this.f6270a = adapterInitializer;
        this.f6271b = flags.N();
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.ADAPTER_VERSIONS;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // a.t5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.h7
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.h7 r0 = (ads_mobile_sdk.h7) r0
            int r1 = r0.f5869d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5869d = r1
            goto L18
        L13:
            ads_mobile_sdk.h7 r0 = new ads_mobile_sdk.h7
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5867b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5869d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.i7 r0 = r0.f5866a
            ue.c.H(r7)
            goto L4f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            ue.c.H(r7)
            java.util.List r7 = r6.f6271b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Lb1
            ads_mobile_sdk.z6 r7 = r6.f6270a
            r0.f5866a = r6
            r0.f5869d = r3
            monitor-enter(r7)
            boolean r0 = r7.f14654l     // Catch: java.lang.Throwable -> Lae
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r7 = r0
            r0 = r6
        L4f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L58
            goto Lb1
        L58:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            ads_mobile_sdk.z6 r1 = r0.f6270a
            java.util.Map r1 = r1.a()
            java.util.List r0 = r0.f6271b
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.get(r2)
            kotlin.Pair r3 = (kotlin.Pair) r3
            if (r3 == 0) goto L89
            java.lang.Object r3 = r3.f80346a
            xi.b r3 = (xi.b) r3
            if (r3 == 0) goto L89
            xi.a r3 = r3.getInitializationState()
            if (r3 != 0) goto L8b
        L89:
            xi.a r3 = xi.a.NOT_STARTED
        L8b:
            java.lang.Object r4 = r1.get(r2)
            kotlin.Pair r4 = (kotlin.Pair) r4
            if (r4 == 0) goto L98
            java.lang.Object r4 = r4.f80347b
            aj.c r4 = (aj.c) r4
            goto L99
        L98:
            r4 = 0
        L99:
            xi.a r5 = xi.a.COMPLETE
            if (r3 != r5) goto L69
            if (r4 == 0) goto L69
            r7.put(r2, r4)
            goto L69
        La3:
            ads_mobile_sdk.pk0 r0 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.g7 r1 = new ads_mobile_sdk.g7
            r1.<init>(r7)
            r0.<init>(r1)
            return r0
        Lae:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Lb1:
            ads_mobile_sdk.pk0 r7 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.g7 r0 = new ads_mobile_sdk.g7
            kotlin.collections.r0 r1 = kotlin.collections.z0.d()
            r0.<init>(r1)
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.i7.c(bl2.c):java.lang.Object");
    }
}
