package zs0;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class c implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142753a;

    /* renamed from: b, reason: collision with root package name */
    public final b22.a f142754b;

    public c(b22.a pinService, int i13) {
        this.f142753a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinService, "userService");
            this.f142754b = pinService;
        } else {
            Intrinsics.checkNotNullParameter(pinService, "pinService");
            this.f142754b = pinService;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r10, java.lang.String r11, java.lang.Object r12, o82.d2 r13, bl2.c r14) {
        /*
            r9 = this;
            int r13 = r9.f142753a
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r13) {
                case 0: goto L68;
                default: goto La;
            }
        La:
            boolean r13 = r14 instanceof et0.b
            if (r13 == 0) goto L1c
            r13 = r14
            et0.b r13 = (et0.b) r13
            int r3 = r13.f60020t
            r4 = r3 & r2
            if (r4 == 0) goto L1c
            int r3 = r3 - r2
            r13.f60020t = r3
        L1a:
            r7 = r13
            goto L22
        L1c:
            et0.b r13 = new et0.b
            r13.<init>(r9, r14)
            goto L1a
        L22:
            java.lang.Object r13 = r7.f60018r
            cl2.a r14 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r7.f60020t
            if (r2 == 0) goto L36
            if (r2 != r1) goto L30
            ue.c.H(r13)
            goto L5f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r0)
            throw r10
        L36:
            ue.c.H(r13)
            boolean r13 = r12 instanceof et0.a
            r0 = 0
            if (r13 == 0) goto L41
            et0.a r12 = (et0.a) r12
            goto L42
        L41:
            r12 = r0
        L42:
            if (r12 == 0) goto L48
            java.lang.String r12 = r12.f60017a
            r6 = r12
            goto L49
        L48:
            r6 = r0
        L49:
            n00.c r12 = n00.c.HOMEFEED_TUNER_PIN_ACTIVITY_FIELDS
            java.lang.String r3 = n00.b.a(r12)
            java.lang.String r4 = java.lang.String.valueOf(r10)
            r7.f60020t = r1
            b22.a r2 = r9.f142754b
            r5 = r11
            java.lang.Object r13 = r2.b(r3, r4, r5, r6, r7)
            if (r13 != r14) goto L5f
            goto L67
        L5f:
            com.pinterest.api.adapter.coroutine.NetworkResponse r13 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r13
            et0.c r10 = et0.c.f60021i
            com.pinterest.api.adapter.coroutine.NetworkResponse r14 = kh2.k3.y1(r13, r10)
        L67:
            return r14
        L68:
            boolean r12 = r14 instanceof zs0.a
            if (r12 == 0) goto L7a
            r12 = r14
            zs0.a r12 = (zs0.a) r12
            int r13 = r12.f142751t
            r3 = r13 & r2
            if (r3 == 0) goto L7a
            int r13 = r13 - r2
            r12.f142751t = r13
        L78:
            r8 = r12
            goto L80
        L7a:
            zs0.a r12 = new zs0.a
            r12.<init>(r9, r14)
            goto L78
        L80:
            java.lang.Object r12 = r8.f142749r
            cl2.a r13 = cl2.a.COROUTINE_SUSPENDED
            int r14 = r8.f142751t
            if (r14 == 0) goto L94
            if (r14 != r1) goto L8e
            ue.c.H(r12)
            goto Lb5
        L8e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r0)
            throw r10
        L94:
            ue.c.H(r12)
            n00.c r12 = n00.c.HOMEFEED_TUNER_BOARD_RECOMMENDATIONS_FIELDS
            java.lang.String r3 = n00.b.a(r12)
            java.lang.String r4 = java.lang.String.valueOf(r10)
            x02.x r10 = x02.x.ALL_BOARDS_FILTER
            java.lang.String r6 = r10.getValue()
            r8.f142751t = r1
            b22.a r2 = r9.f142754b
            java.lang.String r7 = "last_pinned_to"
            r5 = r11
            java.lang.Object r12 = r2.a(r3, r4, r5, r6, r7, r8)
            if (r12 != r13) goto Lb5
            goto Lbd
        Lb5:
            com.pinterest.api.adapter.coroutine.NetworkResponse r12 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r12
            zs0.b r10 = zs0.b.f142752i
            com.pinterest.api.adapter.coroutine.NetworkResponse r13 = kh2.k3.y1(r12, r10)
        Lbd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zs0.c.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
