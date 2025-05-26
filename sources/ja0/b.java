package ja0;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class b implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final o12.a f75292a;

    public b(o12.a collageService) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        this.f75292a = collageService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r8, java.lang.String r9, java.lang.Object r10, o82.d2 r11, bl2.c r12) {
        /*
            r7 = this;
            boolean r11 = r12 instanceof ja0.a
            if (r11 == 0) goto L14
            r11 = r12
            ja0.a r11 = (ja0.a) r11
            int r0 = r11.f75291u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r11.f75291u = r0
        L12:
            r6 = r11
            goto L1a
        L14:
            ja0.a r11 = new ja0.a
            r11.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f75289s
            cl2.a r12 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r6.f75291u
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            ja0.b r8 = r6.f75288r
            ue.c.H(r11)
            goto L5e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ue.c.H(r11)
            java.lang.String r11 = "null cannot be cast to non-null type com.pinterest.collage.remix.sep.RemixBrowseRequestArgs"
            kotlin.jvm.internal.Intrinsics.g(r10, r11)
            ja0.c r10 = (ja0.c) r10
            za0.d r11 = r10.f75293a
            int r2 = r11.getValue()
            n00.c r11 = n00.c.COLLAGE_REMIX_FEED
            java.lang.String r3 = n00.b.a(r11)
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r6.f75288r = r7
            r6.f75291u = r1
            o12.a r0 = r7.f75292a
            boolean r1 = r10.f75294b
            r5 = r9
            java.lang.Object r11 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r11 != r12) goto L5d
            return r12
        L5d:
            r8 = r7
        L5e:
            com.pinterest.api.adapter.coroutine.NetworkResponse r11 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r11
            p90.n0 r9 = new p90.n0
            r10 = 24
            r9.<init>(r8, r10)
            com.pinterest.api.adapter.coroutine.NetworkResponse r8 = kh2.k3.y1(r11, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ja0.b.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
