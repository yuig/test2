package xa0;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class h implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final o12.a f134405a;

    public h(o12.a collageService) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        this.f134405a = collageService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r9, java.lang.String r10, java.lang.Object r11, o82.d2 r12, bl2.c r13) {
        /*
            r8 = this;
            boolean r12 = r13 instanceof xa0.g
            if (r12 == 0) goto L14
            r12 = r13
            xa0.g r12 = (xa0.g) r12
            int r0 = r12.f134404u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r12.f134404u = r0
        L12:
            r7 = r12
            goto L1a
        L14:
            xa0.g r12 = new xa0.g
            r12.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f134402s
            cl2.a r13 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r7.f134404u
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            xa0.k r9 = r7.f134401r
            ue.c.H(r12)
            goto L55
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            ue.c.H(r12)
            java.lang.String r12 = "null cannot be cast to non-null type com.pinterest.collagesCoreLibrary.feed.CollageFeedRequestArgs"
            kotlin.jvm.internal.Intrinsics.g(r11, r12)
            xa0.k r11 = (xa0.k) r11
            r7.f134401r = r11
            r7.f134404u = r1
            boolean r3 = r11.f134410c
            java.lang.String r4 = r11.f134413f
            o12.a r0 = r8.f134405a
            boolean r1 = r11.f134408a
            boolean r2 = r11.f134409b
            r5 = r9
            r6 = r10
            java.lang.Object r12 = r0.i(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r13) goto L54
            return r13
        L54:
            r9 = r11
        L55:
            com.pinterest.api.adapter.coroutine.NetworkResponse r12 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r12
            ra0.l0 r10 = new ra0.l0
            r11 = 5
            r10.<init>(r9, r11)
            com.pinterest.api.adapter.coroutine.NetworkResponse r9 = kh2.k3.y1(r12, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xa0.h.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
