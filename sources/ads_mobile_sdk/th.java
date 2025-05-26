package ads_mobile_sdk;

import a.z1;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class th implements a.qe {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f11546a;

    /* renamed from: b, reason: collision with root package name */
    public final mo2.a f11547b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f11548c;

    public th(j0 uiScope, z1 refreshListener) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(refreshListener, "refreshListener");
        this.f11546a = refreshListener;
        this.f11547b = mo2.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [mo2.a] */
    @Override // a.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.sh
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.sh r0 = (ads_mobile_sdk.sh) r0
            int r1 = r0.f11092f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11092f = r1
            goto L18
        L13:
            ads_mobile_sdk.sh r0 = new ads_mobile_sdk.sh
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11090d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11092f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            boolean r8 = r0.f11089c
            mo2.a r1 = r0.f11088b
            ads_mobile_sdk.th r0 = r0.f11087a
            goto L3f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            boolean r8 = r0.f11089c
            mo2.a r1 = r0.f11088b
            ads_mobile_sdk.th r0 = r0.f11087a
        L3f:
            ue.c.H(r9)     // Catch: java.lang.Throwable -> L43
            goto L95
        L43:
            r8 = move-exception
            goto La3
        L45:
            boolean r8 = r0.f11089c
            mo2.a r2 = r0.f11088b
            ads_mobile_sdk.th r5 = r0.f11087a
            ue.c.H(r9)
            r9 = r2
            goto L67
        L50:
            ue.c.H(r9)
            mo2.a r9 = r7.f11547b
            r0.f11087a = r7
            r0.f11088b = r9
            r0.f11089c = r8
            r0.f11092f = r5
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r2 = r9.f(r6, r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r5 = r7
        L67:
            java.lang.Boolean r2 = r5.f11548c     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L93
            r2 = 0
            if (r8 == 0) goto L82
            a.z1 r3 = r5.f11546a     // Catch: java.lang.Throwable -> L7f
            r0.f11087a = r5     // Catch: java.lang.Throwable -> L7f
            r0.f11088b = r9     // Catch: java.lang.Throwable -> L7f
            r0.f11089c = r8     // Catch: java.lang.Throwable -> L7f
            r0.f11092f = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r3.b(r2, r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r1) goto L93
            return r1
        L7f:
            r8 = move-exception
            r1 = r9
            goto La3
        L82:
            a.z1 r4 = r5.f11546a     // Catch: java.lang.Throwable -> L7f
            r0.f11087a = r5     // Catch: java.lang.Throwable -> L7f
            r0.f11088b = r9     // Catch: java.lang.Throwable -> L7f
            r0.f11089c = r8     // Catch: java.lang.Throwable -> L7f
            r0.f11092f = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r1) goto L93
            return r1
        L93:
            r1 = r9
            r0 = r5
        L95:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L43
            r0.f11548c = r8     // Catch: java.lang.Throwable -> L43
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L43
            mo2.c r1 = (mo2.c) r1
            r1.i(r6)
            return r8
        La3:
            mo2.c r1 = (mo2.c) r1
            r1.i(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.th.a(boolean, bl2.c):java.lang.Object");
    }
}
