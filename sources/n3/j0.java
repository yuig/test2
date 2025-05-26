package n3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f89074r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f89075s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0 f89076t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j13, l0 l0Var, bl2.c cVar) {
        super(2, cVar);
        this.f89075s = j13;
        this.f89076t = l0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j0(this.f89075s, this.f89076t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r10.f89074r
            r2 = 1
            long r4 = r10.f89075s
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            ue.c.H(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            ue.c.H(r11)
            goto L2e
        L20:
            ue.c.H(r11)
            long r8 = r4 - r2
            r10.f89074r = r7
            java.lang.Object r11 = lb.l0.S(r8, r10)
            if (r11 != r0) goto L2e
            return r0
        L2e:
            r10.f89074r = r6
            java.lang.Object r11 = lb.l0.S(r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            n3.l0 r11 = r10.f89076t
            ao2.m r11 = r11.f89085c
            if (r11 == 0) goto L4b
            xk2.q r0 = xk2.s.f135225b
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r0.<init>(r4)
            xk2.r r0 = ue.c.m(r0)
            r11.resumeWith(r0)
        L4b:
            kotlin.Unit r11 = kotlin.Unit.f80348a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
