package vc1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import va1.m1;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f125599j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m1 f125600k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, m1 m1Var, int i13) {
        super(1);
        this.f125598i = i13;
        this.f125599j = dVar;
        this.f125600k = m1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r11 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Throwable r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f125598i
            r3 = 1
            va1.m1 r4 = r0.f125600k
            r5 = 0
            vc1.d r6 = r0.f125599j
            switch(r2) {
                case 0: goto L26;
                default: goto Lf;
            }
        Lf:
            yk1.n r2 = r6.getViewIfBound()
            tc1.b r2 = (tc1.b) r2
            if (r2 == 0) goto L22
            if (r1 == 0) goto L1d
            java.lang.String r5 = r18.getMessage()
        L1d:
            wc1.e r2 = (wc1.e) r2
            r2.W8(r5)
        L22:
            r6.z3(r4, r3)
            return
        L26:
            nx.d0 r7 = r6.getPinalytics()
            h32.f1 r8 = h32.f1.LOGIN_OPTION_ENABLED_FAILURE
            h32.u0 r9 = h32.u0.GPLUS_CONNECT
            kotlin.jvm.internal.Intrinsics.f(r18)
            boolean r2 = r1 instanceof com.pinterest.error.NetworkResponseError
            r15 = 0
            java.lang.String r10 = "fail_reason"
            if (r2 == 0) goto L7e
            r2 = r1
            com.pinterest.error.NetworkResponseError r2 = (com.pinterest.error.NetworkResponseError) r2
            v.f1 r2 = r2.f45043a
            if (r2 == 0) goto L4a
            qz.d r11 = kh2.k3.M(r2)
            if (r11 == 0) goto L4a
            java.lang.String r11 = r11.e()
            goto L4b
        L4a:
            r11 = r5
        L4b:
            if (r11 == 0) goto L57
            int r12 = r11.length()
            if (r12 <= 0) goto L54
            goto L55
        L54:
            r11 = r5
        L55:
            if (r11 != 0) goto L5b
        L57:
            java.lang.String r11 = r18.toString()
        L5b:
            r12 = 2
            kotlin.Pair[] r12 = new kotlin.Pair[r12]
            kotlin.Pair r13 = new kotlin.Pair
            r13.<init>(r10, r11)
            r12[r15] = r13
            if (r2 == 0) goto L6a
            int r2 = r2.f123449b
            goto L6b
        L6a:
            r2 = -1
        L6b:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.String r11 = "api_error_code"
            r10.<init>(r11, r2)
            r12[r3] = r10
            nx.d r2 = bs1.c.p(r12)
        L7c:
            r12 = r2
            goto L90
        L7e:
            java.lang.String r2 = r18.toString()
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r10, r2)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r3}
            nx.d r2 = bs1.c.p(r2)
            goto L7c
        L90:
            r13 = 0
            r16 = 476(0x1dc, float:6.67E-43)
            r10 = 0
            r11 = 0
            r14 = 0
            r2 = 0
            r3 = r15
            r15 = r2
            nx.d0.D(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r1 instanceof com.pinterest.identity.core.error.UnauthException
            if (r2 == 0) goto La8
            com.pinterest.identity.authentication.c r2 = r6.f125605e
            com.pinterest.identity.authentication.a r2 = (com.pinterest.identity.authentication.a) r2
            r2.a(r3, r1)
            goto Ld5
        La8:
            boolean r2 = r1 instanceof com.pinterest.error.ServerError
            if (r2 == 0) goto Lc8
            yk1.n r2 = r6.getViewIfBound()
            tc1.b r2 = (tc1.b) r2
            if (r2 == 0) goto Ld5
            com.pinterest.error.ServerError r1 = (com.pinterest.error.ServerError) r1
            v.f1 r1 = r1.f45043a
            if (r1 == 0) goto Lc2
            qz.d r1 = kh2.k3.M(r1)
            if (r1 == 0) goto Lc2
            java.lang.String r5 = r1.f105384d
        Lc2:
            wc1.e r2 = (wc1.e) r2
            r2.W8(r5)
            goto Ld5
        Lc8:
            yk1.n r1 = r6.getViewIfBound()
            tc1.b r1 = (tc1.b) r1
            if (r1 == 0) goto Ld5
            wc1.e r1 = (wc1.e) r1
            r1.W8(r5)
        Ld5:
            r6.z3(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vc1.c.b(java.lang.Throwable):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f125598i) {
            case 0:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
