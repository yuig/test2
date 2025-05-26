package sm0;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class l implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final e12.d f113267a;

    public l(e12.d boardService) {
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        this.f113267a = boardService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r7, java.lang.String r8, java.lang.Object r9, o82.d2 r10, bl2.c r11) {
        /*
            r6 = this;
            boolean r10 = r11 instanceof sm0.k
            if (r10 == 0) goto L14
            r10 = r11
            sm0.k r10 = (sm0.k) r10
            int r0 = r10.f113266u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r10.f113266u = r0
        L12:
            r5 = r10
            goto L1a
        L14:
            sm0.k r10 = new sm0.k
            r10.<init>(r6, r11)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f113264s
            cl2.a r11 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r5.f113266u
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            sm0.j r7 = r5.f113263r
            ue.c.H(r10)
            goto L79
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ue.c.H(r10)
            boolean r10 = r9 instanceof sm0.j
            r0 = 0
            if (r10 == 0) goto L3e
            sm0.j r9 = (sm0.j) r9
            goto L3f
        L3e:
            r9 = r0
        L3f:
            if (r9 == 0) goto L8f
            java.lang.String r10 = r9.f113261a
            boolean r2 = kotlin.text.z.j(r10)
            r2 = r2 ^ r1
            if (r2 == 0) goto L4b
            goto L4c
        L4b:
            r10 = r0
        L4c:
            if (r10 == 0) goto L87
            n00.c r2 = n00.c.BOARD_NEW_IDEAS
            java.lang.String r2 = n00.b.a(r2)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            if (r8 == 0) goto L63
            boolean r7 = kotlin.text.z.j(r8)
            if (r7 == 0) goto L61
            goto L63
        L61:
            r7 = 0
            goto L64
        L63:
            r7 = r1
        L64:
            r7 = r7 ^ r1
            if (r7 == 0) goto L69
            r4 = r8
            goto L6a
        L69:
            r4 = r0
        L6a:
            r5.f113263r = r9
            r5.f113266u = r1
            e12.d r0 = r6.f113267a
            r1 = r10
            java.lang.Object r10 = r0.H(r1, r2, r3, r4, r5)
            if (r10 != r11) goto L78
            return r11
        L78:
            r7 = r9
        L79:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            kl0.t r8 = new kl0.t
            r9 = 15
            r8.<init>(r7, r9)
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = kh2.k3.y1(r10, r8)
            return r7
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Invalid board ID"
            r7.<init>(r8)
            throw r7
        L8f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Invalid arguments"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sm0.l.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
