package km0;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class g implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final e12.d f80187a;

    public g(e12.d boardService) {
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        this.f80187a = boardService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r7, java.lang.String r8, java.lang.Object r9, o82.d2 r10, bl2.c r11) {
        /*
            r6 = this;
            boolean r10 = r11 instanceof km0.f
            if (r10 == 0) goto L13
            r10 = r11
            km0.f r10 = (km0.f) r10
            int r0 = r10.f80186u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.f80186u = r0
            goto L18
        L13:
            km0.f r10 = new km0.f
            r10.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r10.f80184s
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f80186u
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            km0.e r7 = r10.f80183r
            ue.c.H(r11)
            goto L93
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ue.c.H(r11)
            boolean r11 = r9 instanceof km0.e
            r1 = 0
            if (r11 == 0) goto L3d
            km0.e r9 = (km0.e) r9
            goto L3e
        L3d:
            r9 = r1
        L3e:
            if (r9 == 0) goto La9
            java.lang.String r11 = r9.f80180a
            boolean r3 = kotlin.text.z.j(r11)
            r3 = r3 ^ r2
            if (r3 == 0) goto L4a
            goto L4b
        L4a:
            r11 = r1
        L4b:
            if (r11 == 0) goto La1
            qz.f0 r3 = new qz.f0
            r3.<init>()
            n00.c r4 = n00.c.BOARD_SECTION_DETAILED
            java.lang.String r4 = n00.b.a(r4)
            java.lang.String r5 = "fields"
            r3.e(r5, r4)
            java.lang.String r4 = "page_size"
            r3.c(r7, r4)
            java.lang.String r7 = "include_stories"
            java.lang.String r4 = "true"
            r3.e(r7, r4)
            java.lang.String r7 = "board_session_id"
            java.lang.String r4 = r9.f80181b
            r3.e(r7, r4)
            java.lang.String r7 = r3.toString()
            if (r8 == 0) goto L7f
            boolean r3 = kotlin.text.z.j(r8)
            if (r3 == 0) goto L7d
            goto L7f
        L7d:
            r3 = 0
            goto L80
        L7f:
            r3 = r2
        L80:
            r3 = r3 ^ r2
            if (r3 == 0) goto L84
            goto L85
        L84:
            r8 = r1
        L85:
            r10.f80183r = r9
            r10.f80186u = r2
            e12.d r1 = r6.f80187a
            java.lang.Object r11 = r1.G(r11, r7, r8, r10)
            if (r11 != r0) goto L92
            return r0
        L92:
            r7 = r9
        L93:
            com.pinterest.api.adapter.coroutine.NetworkResponse r11 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r11
            kl0.t r8 = new kl0.t
            r9 = 9
            r8.<init>(r7, r9)
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = kh2.k3.y1(r11, r8)
            return r7
        La1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Invalid board ID"
            r7.<init>(r8)
            throw r7
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Invalid arguments"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: km0.g.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
