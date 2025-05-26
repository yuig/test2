package a;

import ads_mobile_sdk.ks2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface j3 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object a(a.j3 r4, java.lang.String r5, ads_mobile_sdk.tq1 r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.es2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.es2 r0 = (ads_mobile_sdk.es2) r0
            int r1 = r0.f4939e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4939e = r1
            goto L18
        L13:
            ads_mobile_sdk.es2 r0 = new ads_mobile_sdk.es2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f4937c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4939e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r5 = r0.f4936b
            a.j3 r4 = r0.f4935a
            ue.c.H(r7)     // Catch: java.lang.Exception -> L2b
            goto L4b
        L2b:
            r6 = move-exception
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ue.c.H(r7)
            r0.f4935a = r4     // Catch: java.lang.Exception -> L2b
            r0.f4936b = r5     // Catch: java.lang.Exception -> L2b
            r0.f4939e = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L4b
            return r1
        L45:
            ads_mobile_sdk.ks2 r4 = (ads_mobile_sdk.ks2) r4
            r4.a(r5, r6)
            r7 = 0
        L4b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j3.a(a.j3, java.lang.String, ads_mobile_sdk.tq1, bl2.c):java.lang.Object");
    }

    default Object b(Function0 block, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke();
        } catch (Exception e13) {
            ((ks2) this).a(label, e13);
            return null;
        }
    }
}
