package br1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbr1/d;", "Lmf0/f;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d extends mf0.f {

    /* renamed from: c0, reason: collision with root package name */
    public qz.d f23773c0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            super.onViewCreated(r5, r6)
            qz.d r5 = r4.f23773c0
            java.lang.String r6 = "response"
            r0 = 0
            if (r5 == 0) goto Lde
            java.lang.String r1 = r5.f105384d
            int r2 = r5.f105387g
            r3 = 1
            if (r2 == r3) goto L46
            switch(r2) {
                case 90: goto L42;
                case 91: goto L3a;
                case 92: goto L32;
                default: goto L19;
            }
        L19:
            if (r1 == 0) goto L26
            boolean r5 = kotlin.text.z.j(r1)
            r5 = r5 ^ r3
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = r0
        L24:
            if (r1 != 0) goto La7
        L26:
            qz.d r5 = r4.f23773c0
            if (r5 == 0) goto L2e
            java.lang.String r1 = r5.f105384d
            goto La7
        L2e:
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r0
        L32:
            int r5 = m60.x0.signup_username_taken_error
            java.lang.String r1 = r4.getString(r5)
            goto La7
        L3a:
            int r5 = m60.x0.signup_email_taken_error
            java.lang.String r1 = r4.getString(r5)
            goto La7
        L42:
            java.lang.String r1 = r5.f105385e
            goto La7
        L46:
            java.lang.Object r5 = r5.f105381a
            boolean r6 = r5 instanceof vd0.c
            if (r6 == 0) goto L4f
            vd0.c r5 = (vd0.c) r5
            goto L50
        L4f:
            r5 = r0
        L50:
            if (r5 == 0) goto La7
            java.lang.String r6 = ""
            java.lang.String r2 = "param_name"
            java.lang.String r5 = r5.o(r2, r6)
            java.lang.String r6 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            int r6 = r5.hashCode()
            r2 = -265713450(0xfffffffff02988d6, float:-2.0987356E29)
            if (r6 == r2) goto L93
            r2 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r6 == r2) goto L83
            r2 = 1216985755(0x4889ba9b, float:282068.84)
            if (r6 == r2) goto L73
            goto L9b
        L73:
            java.lang.String r6 = "password"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7c
            goto L9b
        L7c:
            int r5 = m60.x0.invalid_password_too_short
            java.lang.String r5 = r4.getString(r5)
            goto La3
        L83:
            java.lang.String r6 = "email"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L8c
            goto L9b
        L8c:
            int r5 = a62.e.please_enter_a_valid_email
            java.lang.String r5 = r4.getString(r5)
            goto La3
        L93:
            java.lang.String r6 = "username"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L9d
        L9b:
            r5 = r1
            goto La3
        L9d:
            int r5 = m60.x0.signup_username_invalid
            java.lang.String r5 = r4.getString(r5)
        La3:
            if (r5 != 0) goto La6
            goto La7
        La6:
            r1 = r5
        La7:
            int r5 = m60.x0.almost_there
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r6 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r4.h7(r5)
            if (r1 != 0) goto Lc0
            int r5 = m60.x0.login_generic_fail
            java.lang.String r1 = r4.getString(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
        Lc0:
            r4.d7(r1)
            int r5 = m60.x0.try_again
            java.lang.String r5 = r4.getString(r5)
            r4.R = r5
            r4.S = r0
            r4.m7()
            int r5 = m60.x0.cancel
            java.lang.String r5 = r4.getString(r5)
            r4.T = r5
            r4.U = r0
            r4.l7()
            return
        Lde:
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.d.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
