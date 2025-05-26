package r90;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class j implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final o12.a f106879a;

    public j(o12.a collageService) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        this.f106879a = collageService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r7, java.lang.String r8, java.lang.Object r9, o82.d2 r10, bl2.c r11) {
        /*
            r6 = this;
            boolean r10 = r11 instanceof r90.i
            if (r10 == 0) goto L14
            r10 = r11
            r90.i r10 = (r90.i) r10
            int r0 = r10.f106878t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r10.f106878t = r0
        L12:
            r5 = r10
            goto L1a
        L14:
            r90.i r10 = new r90.i
            r10.<init>(r6, r11)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f106876r
            cl2.a r11 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r5.f106878t
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            ue.c.H(r10)
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ue.c.H(r10)
            java.lang.String r10 = "null cannot be cast to non-null type com.pinterest.collage.cutoutpicker.closeup.sep.RelatedContentRequestArgs"
            kotlin.jvm.internal.Intrinsics.g(r9, r10)
            r90.k r9 = (r90.k) r9
            n00.c r10 = n00.c.BASE_PIN_FEED
            java.lang.String r2 = n00.b.a(r10)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r5.f106878t = r1
            o12.a r0 = r6.f106879a
            java.lang.String r1 = r9.f106880a
            r4 = r8
            java.lang.Object r10 = r0.a(r1, r2, r3, r4, r5)
            if (r10 != r11) goto L53
            return r11
        L53:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            r90.a r7 = r90.a.f106861k
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = kh2.k3.y1(r10, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r90.j.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
