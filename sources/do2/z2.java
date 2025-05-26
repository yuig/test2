package do2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z2 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f56023a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f56024b;

    public z2(b2 b2Var, fd.s sVar) {
        this.f56023a = b2Var;
        this.f56024b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(do2.j r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof do2.y2
            if (r0 == 0) goto L13
            r0 = r6
            do2.y2 r0 = (do2.y2) r0
            int r1 = r0.f56014t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56014t = r1
            goto L18
        L13:
            do2.y2 r0 = new do2.y2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f56012r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f56014t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            ue.c.H(r6)
            goto L44
        L2f:
            ue.c.H(r6)
            do2.x2 r6 = new do2.x2
            kotlin.jvm.functions.Function2 r2 = r4.f56024b
            r6.<init>(r5, r2)
            r0.f56014t = r3
            do2.b2 r5 = r4.f56023a
            java.lang.Object r5 = r5.collect(r6, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.z2.collect(do2.j, bl2.c):java.lang.Object");
    }
}
