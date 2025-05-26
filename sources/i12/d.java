package i12;

import dl1.a0;
import dl1.l;
import dl1.p;
import dl1.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p localDataSource, a0 remoteDataSource, z persistencePolicy, gl1.d repositorySchedulerPolicy) {
        super(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a0(java.lang.String r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i12.c
            if (r0 == 0) goto L13
            r0 = r6
            i12.c r0 = (i12.c) r0
            int r1 = r0.f71065v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71065v = r1
            goto L18
        L13:
            i12.c r0 = new i12.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f71063t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f71065v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f71062s
            i12.d r0 = r0.f71061r
            ue.c.H(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            r0.f71061r = r4
            r0.f71062s = r5
            r0.f71065v = r3
            java.lang.String r6 = ""
            uj2.q r6 = r4.P(r6)
            java.lang.Object r6 = kh2.j.q(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            com.pinterest.api.model.ua r6 = (com.pinterest.api.model.ua) r6
            r1 = 0
            if (r6 == 0) goto L52
            java.util.List r6 = r6.f42485a
            goto L53
        L52:
            r6 = r1
        L53:
            if (r6 == 0) goto L77
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.pinterest.api.model.ta r3 = (com.pinterest.api.model.ta) r3
            java.lang.String r3 = r3.getId()
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r5)
            if (r3 == 0) goto L5b
            goto L74
        L73:
            r2 = r1
        L74:
            com.pinterest.api.model.ta r2 = (com.pinterest.api.model.ta) r2
            goto L78
        L77:
            r2 = r1
        L78:
            if (r2 == 0) goto Lea
            r0.getClass()
            com.pinterest.api.model.ps0 r5 = r2.u()
            java.util.List r5 = r5.h()
            java.lang.String r6 = "getTimelineObjects(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.g0.q(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L9b:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r5.next()
            com.pinterest.api.model.pu0 r0 = (com.pinterest.api.model.pu0) r0
            r0.getClass()
            com.pinterest.api.model.mu0 r3 = new com.pinterest.api.model.mu0
            r3.<init>(r0, r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.b(r0)
            com.pinterest.api.model.pu0 r0 = r3.a()
            r6.add(r0)
            goto L9b
        Lc3:
            com.pinterest.api.model.ps0 r5 = r2.u()
            r5.getClass()
            com.pinterest.api.model.ms0 r0 = new com.pinterest.api.model.ms0
            r0.<init>(r5, r1)
            r0.b(r6)
            com.pinterest.api.model.ps0 r5 = r0.a()
            java.lang.String r6 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            com.pinterest.api.model.sa r0 = new com.pinterest.api.model.sa
            r0.<init>(r2, r1)
            r0.b(r5)
            com.pinterest.api.model.ta r1 = r0.a()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
        Lea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i12.d.a0(java.lang.String, bl2.c):java.lang.Object");
    }
}
