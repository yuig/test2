package do2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f55766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f55767b;

    public e1(Function2 function2, kotlin.jvm.internal.j0 j0Var) {
        this.f55766a = function2;
        this.f55767b = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof do2.d1
            if (r0 == 0) goto L13
            r0 = r6
            do2.d1 r0 = (do2.d1) r0
            int r1 = r0.f55756t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55756t = r1
            goto L18
        L13:
            do2.d1 r0 = new do2.d1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f55755s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55756t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f55758v
            do2.e1 r0 = r0.f55754r
            ue.c.H(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            r0.f55754r = r4
            r0.f55758v = r5
            r0.f55756t = r3
            kotlin.jvm.functions.Function2 r6 = r4.f55766a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L51
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L51:
            kotlin.jvm.internal.j0 r6 = r0.f55767b
            r6.f80434a = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.e1.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
