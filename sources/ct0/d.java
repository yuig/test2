package ct0;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class d implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final u12.e f53140a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53142c;

    public d(u12.e interestsService, boolean z13, boolean z14, int i13) {
        z13 = (i13 & 2) != 0 ? true : z13;
        z14 = (i13 & 4) != 0 ? false : z14;
        Intrinsics.checkNotNullParameter(interestsService, "interestsService");
        this.f53140a = interestsService;
        this.f53141b = z13;
        this.f53142c = z14;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, java.lang.String r9, java.lang.Object r10, o82.d2 r11, bl2.c r12) {
        /*
            r7 = this;
            boolean r10 = r12 instanceof ct0.b
            if (r10 == 0) goto L14
            r10 = r12
            ct0.b r10 = (ct0.b) r10
            int r11 = r10.f53136u
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r11 & r0
            if (r1 == 0) goto L14
            int r11 = r11 - r0
            r10.f53136u = r11
        L12:
            r6 = r10
            goto L1a
        L14:
            ct0.b r10 = new ct0.b
            r10.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f53134s
            cl2.a r11 = cl2.a.COROUTINE_SUSPENDED
            int r12 = r6.f53136u
            r0 = 2
            r1 = 1
            if (r12 == 0) goto L3a
            if (r12 == r1) goto L34
            if (r12 != r0) goto L2c
            ue.c.H(r10)
            goto L7b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            ct0.d r8 = r6.f53133r
            ue.c.H(r10)
            goto L5e
        L3a:
            ue.c.H(r10)
            n00.c r10 = n00.c.INTEREST_FOLLOWED_FEED
            java.lang.String r3 = n00.b.a(r10)
            boolean r10 = r7.f53141b
            if (r10 == 0) goto L6c
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r6.f53133r = r7
            r6.f53136u = r1
            java.lang.String r1 = "100"
            java.lang.String r2 = "nux"
            u12.e r0 = r7.f53140a
            r5 = r9
            java.lang.Object r10 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r11) goto L5d
            return r11
        L5d:
            r8 = r7
        L5e:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            lq0.f1 r9 = new lq0.f1
            r11 = 18
            r9.<init>(r8, r11)
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = kh2.k3.y1(r10, r9)
            return r8
        L6c:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r6.f53136u = r0
            u12.e r10 = r7.f53140a
            java.lang.Object r10 = r10.b(r3, r8, r9, r6)
            if (r10 != r11) goto L7b
            return r11
        L7b:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            ct0.c r8 = ct0.c.f53137j
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = kh2.k3.y1(r10, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ct0.d.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
