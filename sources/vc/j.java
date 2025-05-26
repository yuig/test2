package vc;

import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class j implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ do2.j f125535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f125536c;

    public /* synthetic */ j(do2.j jVar, j0 j0Var, int i13) {
        this.f125534a = i13;
        this.f125535b = jVar;
        this.f125536c = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r9, bl2.c r10) {
        /*
            r8 = this;
            int r0 = r8.f125534a
            do2.j r1 = r8.f125535b
            kotlin.jvm.internal.j0 r2 = r8.f125536c
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case 0: goto L5d;
                default: goto Le;
            }
        Le:
            boolean r0 = r10 instanceof yc.r
            if (r0 == 0) goto L1f
            r0 = r10
            yc.r r0 = (yc.r) r0
            int r6 = r0.f138665s
            r7 = r6 & r5
            if (r7 == 0) goto L1f
            int r6 = r6 - r5
            r0.f138665s = r6
            goto L24
        L1f:
            yc.r r0 = new yc.r
            r0.<init>(r8, r10)
        L24:
            java.lang.Object r10 = r0.f138664r
            cl2.a r5 = cl2.a.COROUTINE_SUSPENDED
            int r6 = r0.f138665s
            if (r6 == 0) goto L38
            if (r6 != r4) goto L32
            ue.c.H(r10)
            goto L5a
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L38:
            ue.c.H(r10)
            r10 = r9
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r2 = r2.f80434a
            if (r2 == 0) goto L51
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r10 = kotlin.collections.CollectionsKt.X(r10, r2)
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r4
            if (r10 == 0) goto L5a
        L51:
            r0.f138665s = r4
            java.lang.Object r9 = r1.emit(r9, r0)
            if (r9 != r5) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f80348a
        L5c:
            return r5
        L5d:
            boolean r0 = r10 instanceof vc.i
            if (r0 == 0) goto L6e
            r0 = r10
            vc.i r0 = (vc.i) r0
            int r6 = r0.f125532s
            r7 = r6 & r5
            if (r7 == 0) goto L6e
            int r6 = r6 - r5
            r0.f125532s = r6
            goto L73
        L6e:
            vc.i r0 = new vc.i
            r0.<init>(r8, r10)
        L73:
            java.lang.Object r10 = r0.f125531r
            cl2.a r5 = cl2.a.COROUTINE_SUSPENDED
            int r6 = r0.f125532s
            if (r6 == 0) goto L87
            if (r6 != r4) goto L81
            ue.c.H(r10)
            goto Lba
        L81:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
            throw r9
        L87:
            ue.c.H(r10)
            pc.h r9 = (pc.h) r9
            pc.g r10 = r9.b()
            vc.d r9 = d7.b.M(r9)
            kotlin.jvm.internal.Intrinsics.f(r9)
            vc.c r9 = r9.e()
            java.lang.Object r2 = r2.f80434a
            boolean r3 = r2 instanceof com.apollographql.apollo3.exception.CacheMissException
            if (r3 == 0) goto La3
            com.apollographql.apollo3.exception.CacheMissException r2 = (com.apollographql.apollo3.exception.CacheMissException) r2
        La3:
            r9.getClass()
            vc.d r9 = r9.a()
            d7.b.l(r10, r9)
            pc.h r9 = r10.b()
            r0.f125532s = r4
            java.lang.Object r9 = r1.emit(r9, r0)
            if (r9 != r5) goto Lba
            goto Lbc
        Lba:
            kotlin.Unit r5 = kotlin.Unit.f80348a
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.j.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
