package o90;

import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class e implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final o12.a f93790a;

    public e(o12.a collageService) {
        Intrinsics.checkNotNullParameter(collageService, "collageService");
        this.f93790a = collageService;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r6, java.lang.String r7, java.lang.Object r8, o82.d2 r9, bl2.c r10) {
        /*
            r5 = this;
            boolean r9 = r10 instanceof o90.d
            if (r9 == 0) goto L13
            r9 = r10
            o90.d r9 = (o90.d) r9
            int r0 = r9.f93789v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r9.f93789v = r0
            goto L18
        L13:
            o90.d r9 = new o90.d
            r9.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r9.f93787t
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f93789v
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            o90.k r6 = r9.f93786s
            o90.e r7 = r9.f93785r
            ue.c.H(r10)
            goto L82
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ue.c.H(r10)
            boolean r10 = r8 instanceof o90.k
            r1 = 0
            if (r10 == 0) goto L3f
            r10 = r8
            o90.k r10 = (o90.k) r10
            goto L40
        L3f:
            r10 = r1
        L40:
            if (r10 != 0) goto L5d
            xz.a r6 = new xz.a
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            if (r8 == 0) goto L50
            java.lang.Class r8 = r8.getClass()
            java.lang.String r1 = r8.getSimpleName()
        L50:
            java.lang.String r8 = "Invalid args: "
            java.lang.String r8 = a.a.j(r8, r1)
            r7.<init>(r8)
            r6.<init>(r7)
            return r6
        L5d:
            java.lang.String r8 = o90.j.f93809a
            m90.e0 r8 = r10.f93811a
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            o90.h r3 = new o90.h
            r3.<init>(r8, r1, r2)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r9.f93785r = r5
            r9.f93786s = r10
            r9.f93789v = r2
            o12.a r8 = r5.f93790a
            java.lang.Object r6 = r3.c(r8, r6, r7, r9)
            if (r6 != r0) goto L7e
            return r0
        L7e:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L82:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            t80.r r8 = new t80.r
            r9 = 10
            r8.<init>(r9, r6, r7)
            com.pinterest.api.adapter.coroutine.NetworkResponse r6 = kh2.k3.y1(r10, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.e.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
