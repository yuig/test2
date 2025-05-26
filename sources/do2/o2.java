package do2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class o2 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public int f55887r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ j f55888s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f55889t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q2 f55890u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, bl2.c cVar) {
        super(3, cVar);
        this.f55890u = q2Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        o2 o2Var = new o2(this.f55890u, (bl2.c) obj3);
        o2Var.f55888s = (j) obj;
        o2Var.f55889t = intValue;
        return o2Var.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f55887r
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            do2.q2 r7 = r10.f55890u
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            do2.j r1 = r10.f55888s
            ue.c.H(r11)
            goto L7f
        L26:
            do2.j r1 = r10.f55888s
            ue.c.H(r11)
            goto L70
        L2c:
            do2.j r1 = r10.f55888s
            ue.c.H(r11)
            goto L59
        L32:
            ue.c.H(r11)
            goto L8d
        L36:
            ue.c.H(r11)
            do2.j r1 = r10.f55888s
            int r11 = r10.f55889t
            if (r11 <= 0) goto L4a
            do2.i2 r11 = do2.i2.START
            r10.f55887r = r6
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L8d
            return r0
        L4a:
            long r8 = do2.q2.c(r7)
            r10.f55888s = r1
            r10.f55887r = r5
            java.lang.Object r11 = lb.l0.S(r8, r10)
            if (r11 != r0) goto L59
            return r0
        L59:
            long r5 = do2.q2.b(r7)
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L7f
            do2.i2 r11 = do2.i2.STOP
            r10.f55888s = r1
            r10.f55887r = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L70
            return r0
        L70:
            long r4 = do2.q2.b(r7)
            r10.f55888s = r1
            r10.f55887r = r3
            java.lang.Object r11 = lb.l0.S(r4, r10)
            if (r11 != r0) goto L7f
            return r0
        L7f:
            do2.i2 r11 = do2.i2.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r10.f55888s = r3
            r10.f55887r = r2
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L8d
            return r0
        L8d:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.o2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
