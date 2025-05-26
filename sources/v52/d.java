package v52;

import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.h;
import qz.i;
import u50.r;
import u52.r0;

/* loaded from: classes4.dex */
public final class d implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final i f124178a;

    /* renamed from: b, reason: collision with root package name */
    public final i12.d f124179b;

    public d(i pinsFetcher, i12.d templateRepository) {
        Intrinsics.checkNotNullParameter(pinsFetcher, "pinsFetcher");
        Intrinsics.checkNotNullParameter(templateRepository, "templateRepository");
        this.f124178a = pinsFetcher;
        this.f124179b = templateRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(v52.d r4, u52.p0 r5, bl2.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof v52.a
            if (r0 == 0) goto L16
            r0 = r6
            v52.a r0 = (v52.a) r0
            int r1 = r0.f124169t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f124169t = r1
            goto L1b
        L16:
            v52.a r0 = new v52.a
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f124167r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f124169t
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            ue.c.H(r6)
            java.lang.String r6 = r5.f120725a
            r0.f124169t = r3
            int r5 = r5.f120726b
            r2 = 25
            qz.i r4 = r4.f124178a
            java.lang.Object r6 = r4.b(r6, r5, r2, r0)
            if (r6 != r1) goto L46
            goto L71
        L46:
            com.pinterest.api.adapter.coroutine.NetworkResponse r6 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r6
            boolean r4 = r6 instanceof xz.b
            if (r4 == 0) goto L5b
            u52.i0 r4 = new u52.i0
            xz.b r6 = (xz.b) r6
            java.lang.Object r5 = r6.f136205a
            qz.j r5 = (qz.j) r5
            java.util.List r5 = r5.f105410a
            r4.<init>(r5)
        L59:
            r1 = r4
            goto L71
        L5b:
            boolean r4 = r6 instanceof xz.a
            if (r4 == 0) goto L72
            u52.j0 r4 = new u52.j0
            xz.a r6 = (xz.a) r6
            java.lang.Throwable r5 = r6.f136204a
            java.lang.String r5 = r5.getMessage()
            if (r5 != 0) goto L6d
            java.lang.String r5 = ""
        L6d:
            r4.<init>(r5)
            goto L59
        L71:
            return r1
        L72:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v52.d.j(v52.d, u52.p0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(v52.d r7, u52.q0 r8, bl2.c r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v52.d.k(v52.d, u52.q0, bl2.c):java.lang.Object");
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        r0 request = (r0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ko2.f fVar = v0.f20219a;
        j.z(scope, ko2.e.f80326c, null, new c(request, this, eventIntake, null), 2);
    }
}
