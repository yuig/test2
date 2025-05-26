package c2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f24786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f24787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f24788c;

    public h(kotlin.jvm.internal.j0 j0Var, ao2.j0 j0Var2, Function2 function2) {
        this.f24786a = j0Var;
        this.f24787b = j0Var2;
        this.f24788c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof c2.g
            if (r0 == 0) goto L13
            r0 = r8
            c2.g r0 = (c2.g) r0
            int r1 = r0.f24744w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24744w = r1
            goto L18
        L13:
            c2.g r0 = new c2.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f24742u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f24744w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ao2.o1 r7 = r0.f24741t
            ao2.o1 r7 = (ao2.o1) r7
            java.lang.Object r7 = r0.f24740s
            c2.h r0 = r0.f24739r
            ue.c.H(r8)
            goto L5d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ue.c.H(r8)
            kotlin.jvm.internal.j0 r8 = r6.f24786a
            java.lang.Object r8 = r8.f80434a
            ao2.o1 r8 = (ao2.o1) r8
            if (r8 == 0) goto L5c
            androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
            r2.<init>()
            r8.cancel(r2)
            r0.f24739r = r6
            r0.f24740s = r7
            r2 = r8
            ao2.o1 r2 = (ao2.o1) r2
            r0.f24741t = r2
            r0.f24744w = r3
            java.lang.Object r8 = r8.join(r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            r0 = r6
        L5d:
            kotlin.jvm.internal.j0 r8 = r0.f24786a
            ao2.l0 r1 = ao2.l0.UNDISPATCHED
            c2.f r2 = new c2.f
            kotlin.jvm.functions.Function2 r4 = r0.f24788c
            ao2.j0 r0 = r0.f24787b
            r5 = 0
            r2.<init>(r4, r7, r0, r5)
            ao2.k2 r7 = kotlin.jvm.internal.j.z(r0, r5, r1, r2, r3)
            r8.f80434a = r7
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.h.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
