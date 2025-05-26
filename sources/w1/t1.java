package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t1 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public n3.q f127514s;

    /* renamed from: t, reason: collision with root package name */
    public int f127515t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f127516u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y1 f127517v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127517v = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t1 t1Var = new t1(this.f127517v, cVar);
        t1Var.f127516u = obj;
        return t1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t1) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r12.f127515t
            r2 = 1
            r3 = 2
            w1.y1 r4 = r12.f127517v
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            n3.q r1 = r12.f127514s
            java.lang.Object r2 = r12.f127516u
            n3.l0 r2 = (n3.l0) r2
            ue.c.H(r13)
            goto L53
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f127516u
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r13)
            goto L3b
        L28:
            ue.c.H(r13)
            java.lang.Object r13 = r12.f127516u
            r1 = r13
            n3.l0 r1 = (n3.l0) r1
            r12.f127516u = r1
            r12.f127515t = r2
            java.lang.Object r13 = m1.n3.c(r1, r12, r3)
            if (r13 != r0) goto L3b
            return r0
        L3b:
            n3.q r13 = (n3.q) r13
            long r5 = r13.f89109c
            r4.a()
            r2 = r1
            r1 = r13
        L44:
            r12.f127516u = r2
            r12.f127514s = r1
            r12.f127515t = r3
            n3.k r13 = n3.k.Main
            java.lang.Object r13 = r2.a(r13, r12)
            if (r13 != r0) goto L53
            return r0
        L53:
            n3.j r13 = (n3.j) r13
            java.util.List r13 = r13.f89070a
            int r5 = r13.size()
            r6 = 0
        L5c:
            if (r6 >= r5) goto L76
            java.lang.Object r7 = r13.get(r6)
            n3.q r7 = (n3.q) r7
            long r8 = r7.f89107a
            long r10 = r1.f89107a
            boolean r8 = n3.p.a(r8, r10)
            if (r8 == 0) goto L73
            boolean r7 = r7.f89110d
            if (r7 == 0) goto L73
            goto L44
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r4.d()
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.t1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
