package vc;

import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class v implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f125579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f125580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ do2.j f125581c;

    public v(j0 j0Var, j0 j0Var2, do2.j jVar) {
        this.f125579a = j0Var;
        this.f125580b = j0Var2;
        this.f125581c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // do2.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(pc.h r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vc.u
            if (r0 == 0) goto L13
            r0 = r8
            vc.u r0 = (vc.u) r0
            int r1 = r0.f125578v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125578v = r1
            goto L18
        L13:
            vc.u r0 = new vc.u
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f125576t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f125578v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L77
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            pc.h r7 = r0.f125575s
            vc.v r0 = r0.f125574r
            ue.c.H(r8)
            goto L67
        L3a:
            ue.c.H(r8)
            kotlin.jvm.internal.j0 r8 = r6.f125579a
            r8.f80434a = r7
            boolean r8 = r7.f99567g
            do2.j r2 = r6.f125581c
            if (r8 == 0) goto L6e
            kotlin.jvm.internal.j0 r8 = r6.f125580b
            java.lang.Object r3 = r8.f80434a
            if (r3 == 0) goto L66
            java.lang.String r3 = "ApolloGraphQL: extra response received after the last one"
            java.io.PrintStream r5 = java.lang.System.out
            r5.println(r3)
            java.lang.Object r8 = r8.f80434a
            kotlin.jvm.internal.Intrinsics.f(r8)
            r0.f125574r = r6
            r0.f125575s = r7
            r0.f125578v = r4
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r6
        L67:
            kotlin.jvm.internal.j0 r8 = r0.f125580b
            r8.f80434a = r7
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L6e:
            r0.f125578v = r3
            java.lang.Object r7 = r2.emit(r7, r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.v.emit(pc.h, bl2.c):java.lang.Object");
    }
}
