package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ky2 extends wb0 implements a.l8 {

    /* renamed from: c, reason: collision with root package name */
    public final mo2.a f7563c;

    /* renamed from: d, reason: collision with root package name */
    public hy2 f7564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky2(j0 uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f7563c = mo2.d.a();
    }

    @Override // a.l8
    public final Object a(hy2 hy2Var, bl2.c cVar) {
        return a(this, hy2Var, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0060, LOOP:0: B:20:0x0070->B:22:0x0076, LOOP_END, TryCatch #0 {all -> 0x0060, blocks: (B:11:0x004e, B:13:0x0052, B:15:0x0058, B:19:0x0062, B:20:0x0070, B:22:0x0076, B:24:0x00ad), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ky2 r11, ads_mobile_sdk.hy2 r12, bl2.c r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.iy2
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.iy2 r0 = (ads_mobile_sdk.iy2) r0
            int r1 = r0.f6590f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6590f = r1
            goto L18
        L13:
            ads_mobile_sdk.iy2 r0 = new ads_mobile_sdk.iy2
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f6588d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6590f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            mo2.a r11 = r0.f6587c
            ads_mobile_sdk.hy2 r12 = r0.f6586b
            ads_mobile_sdk.ky2 r0 = r0.f6585a
            ue.c.H(r13)
            r13 = r11
            r11 = r0
            goto L4e
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            ue.c.H(r13)
            mo2.a r13 = r11.f7563c
            r0.f6585a = r11
            r0.f6586b = r12
            r0.f6587c = r13
            r0.f6590f = r4
            mo2.c r13 = (mo2.c) r13
            java.lang.Object r0 = r13.f(r3, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            ads_mobile_sdk.hy2 r0 = r11.f7564d     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L62
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r12, r0)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L62
            kotlin.Unit r11 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L60
            mo2.c r13 = (mo2.c) r13
            r13.i(r3)
            return r11
        L60:
            r11 = move-exception
            goto Lb5
        L62:
            r11.f7564d = r12     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "onViewabilityEvent"
            java.util.Map r1 = r11.f12972b     // Catch: java.lang.Throwable -> L60
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L60
        L70:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L60
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L60
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L60
            java.lang.Object r7 = r2.getValue()     // Catch: java.lang.Throwable -> L60
            ao2.j0 r2 = r11.f12971a     // Catch: java.lang.Throwable -> L60
            ads_mobile_sdk.jy2 r10 = new ads_mobile_sdk.jy2     // Catch: java.lang.Throwable -> L60
            r8 = 0
            r4 = r10
            r5 = r0
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L60
            kotlin.coroutines.j r4 = kotlin.coroutines.j.f80412a     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r5)     // Catch: java.lang.Throwable -> L60
            ads_mobile_sdk.et2 r5 = new ads_mobile_sdk.et2     // Catch: java.lang.Throwable -> L60
            r5.<init>(r10, r3)     // Catch: java.lang.Throwable -> L60
            r6 = 2
            kotlin.jvm.internal.j.z(r2, r4, r3, r5, r6)     // Catch: java.lang.Throwable -> L60
            goto L70
        Lad:
            kotlin.Unit r11 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L60
            mo2.c r13 = (mo2.c) r13
            r13.i(r3)
            return r11
        Lb5:
            mo2.c r13 = (mo2.c) r13
            r13.i(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ky2.a(ads_mobile_sdk.ky2, ads_mobile_sdk.hy2, bl2.c):java.lang.Object");
    }
}
