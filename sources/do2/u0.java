package do2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f55961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f55962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f55963c;

    public u0(kotlin.jvm.internal.f0 f0Var, j jVar, Function2 function2) {
        this.f55961a = f0Var;
        this.f55962b = jVar;
        this.f55963c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof do2.t0
            if (r0 == 0) goto L13
            r0 = r8
            do2.t0 r0 = (do2.t0) r0
            int r1 = r0.f55950v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55950v = r1
            goto L18
        L13:
            do2.t0 r0 = new do2.t0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f55948t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55950v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ue.c.H(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f55947s
            do2.u0 r2 = r0.f55946r
            ue.c.H(r8)
            goto L68
        L3d:
            ue.c.H(r8)
            goto L55
        L41:
            ue.c.H(r8)
            kotlin.jvm.internal.f0 r8 = r6.f55961a
            boolean r8 = r8.f80424a
            if (r8 == 0) goto L58
            r0.f55950v = r5
            do2.j r8 = r6.f55962b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L58:
            r0.f55946r = r6
            r0.f55947s = r7
            r0.f55950v = r4
            kotlin.jvm.functions.Function2 r8 = r6.f55963c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            kotlin.jvm.internal.f0 r8 = r2.f55961a
            r8.f80424a = r5
            r8 = 0
            r0.f55946r = r8
            r0.f55947s = r8
            r0.f55950v = r3
            do2.j r8 = r2.f55962b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L87:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.u0.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
