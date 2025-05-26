package v41;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class l implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final k22.m f124135a;

    public l(k22.m userService) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f124135a = userService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r21, java.lang.String r22, java.lang.Object r23, o82.d2 r24, bl2.c r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r25
            boolean r3 = r2 instanceof v41.j
            if (r3 == 0) goto L1a
            r3 = r2
            v41.j r3 = (v41.j) r3
            int r4 = r3.f124131t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f124131t = r4
        L18:
            r11 = r3
            goto L20
        L1a:
            v41.j r3 = new v41.j
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r11.f124129r
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r11.f124131t
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            ue.c.H(r2)
            goto L9f
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            ue.c.H(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.pinterest.feature.profile.pins.sep.ProfilePinsPageLoader.ProfilePinsRequestArgs"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            v41.i r1 = (v41.i) r1
            boolean r2 = r1.f124126b
            if (r2 == 0) goto L48
            n00.c r2 = n00.c.PROFILE_ALL_MY_PINS_FIELDS
            goto L4a
        L48:
            n00.c r2 = n00.c.PROFILE_ALL_PINS_FIELDS
        L4a:
            java.util.List r4 = r1.f124127c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r4 = r4.iterator()
        L57:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r4.next()
            r7 = r6
            w31.c r7 = (w31.c) r7
            r7.getClass()
            x31.q r7 = x31.q.Toggleable
            r12.add(r6)
            goto L57
        L6d:
            v41.k r18 = v41.k.f124133k
            r16 = 0
            r17 = 0
            java.lang.String r13 = ","
            r14 = 0
            r15 = 0
            r19 = 30
            java.lang.String r4 = kotlin.collections.CollectionsKt.Z(r12, r13, r14, r15, r16, r17, r18, r19)
            int r6 = r4.length()
            if (r6 != 0) goto L85
            java.lang.String r4 = ""
        L85:
            r6 = r4
            java.lang.String r8 = n00.b.a(r2)
            java.lang.String r9 = java.lang.String.valueOf(r21)
            r11.f124131t = r5
            java.lang.String r5 = r1.f124128d
            java.lang.String r7 = ""
            k22.m r4 = r0.f124135a
            r10 = r22
            java.lang.Object r2 = r4.p(r5, r6, r7, r8, r9, r10, r11)
            if (r2 != r3) goto L9f
            return r3
        L9f:
            com.pinterest.api.adapter.coroutine.NetworkResponse r2 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r2
            v41.k r1 = v41.k.f124132j
            com.pinterest.api.adapter.coroutine.NetworkResponse r1 = kh2.k3.y1(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v41.l.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
