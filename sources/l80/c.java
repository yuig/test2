package l80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f82109a;

    public c(a apiClientService) {
        Intrinsics.checkNotNullParameter(apiClientService, "apiClientService");
        this.f82109a = apiClientService;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, bl2.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof l80.b
            if (r0 == 0) goto L14
            r0 = r12
            l80.b r0 = (l80.b) r0
            int r1 = r0.f82108t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f82108t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            l80.b r0 = new l80.b
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f82106r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f82108t
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ue.c.H(r12)
            goto L43
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ue.c.H(r12)
            r6.f82108t = r2
            l80.a r1 = r7.f82109a
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L43
            return r0
        L43:
            com.pinterest.api.adapter.coroutine.NetworkResponse r12 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r12
            boolean r8 = r12 instanceof xz.a
            if (r8 == 0) goto L72
            xz.a r12 = (xz.a) r12
            java.lang.Throwable r8 = r12.f136204a
            boolean r9 = r8 instanceof com.pinterest.error.NetworkResponseError
            r10 = 0
            if (r9 == 0) goto L6c
            l80.d r9 = new l80.d
            java.lang.String r11 = "null cannot be cast to non-null type com.pinterest.error.NetworkResponseError"
            kotlin.jvm.internal.Intrinsics.g(r8, r11)
            r11 = r8
            com.pinterest.error.NetworkResponseError r11 = (com.pinterest.error.NetworkResponseError) r11
            v.f1 r11 = r11.f45043a
            if (r11 == 0) goto L68
            int r10 = r11.f123449b
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            r10 = r11
        L68:
            r9.<init>(r8, r10)
            goto L71
        L6c:
            l80.d r9 = new l80.d
            r9.<init>(r8, r10)
        L71:
            return r9
        L72:
            boolean r8 = r12 instanceof xz.b
            if (r8 == 0) goto L82
            l80.e r8 = new l80.e
            xz.b r12 = (xz.b) r12
            java.lang.Object r9 = r12.f136205a
            com.pinterest.api.model.b1 r9 = (com.pinterest.api.model.b1) r9
            r8.<init>(r9)
            return r8
        L82:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l80.c.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }
}
