package dy0;

import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56546r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f56547s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f56548t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q1 f56549u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q1 f56550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i13, q1 q1Var, q1 q1Var2, q1 q1Var3, bl2.c cVar) {
        super(2, cVar);
        this.f56547s = i13;
        this.f56548t = q1Var;
        this.f56549u = q1Var2;
        this.f56550v = q1Var3;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f56547s, this.f56548t, this.f56549u, this.f56550v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r12.f56546r
            r2 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            r4 = 3
            r5 = 2
            r6 = 1
            int r7 = r12.f56547s
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L26
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            ue.c.H(r13)
            goto L83
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            ue.c.H(r13)
            goto L65
        L26:
            ue.c.H(r13)
            goto L47
        L2a:
            ue.c.H(r13)
            zn2.a r13 = zn2.b.f142311b
            zn2.d r13 = zn2.d.MILLISECONDS
            long r8 = dl2.b.P2(r7, r13)
            r10 = 4588807732320345784(0x3faeb851eb851eb8, double:0.06)
            long r8 = zn2.b.l(r10, r8)
            r12.f56546r = r6
            java.lang.Object r13 = lb.l0.T(r8, r12)
            if (r13 != r0) goto L47
            return r0
        L47:
            j1.y r13 = dy0.i0.f56582a
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            i2.q1 r1 = r12.f56548t
            r1.setValue(r13)
            zn2.a r13 = zn2.b.f142311b
            zn2.d r13 = zn2.d.MILLISECONDS
            long r8 = dl2.b.P2(r7, r13)
            long r8 = zn2.b.l(r2, r8)
            r12.f56546r = r5
            java.lang.Object r13 = lb.l0.T(r8, r12)
            if (r13 != r0) goto L65
            return r0
        L65:
            j1.y r13 = dy0.i0.f56582a
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            i2.q1 r1 = r12.f56549u
            r1.setValue(r13)
            zn2.a r13 = zn2.b.f142311b
            zn2.d r13 = zn2.d.MILLISECONDS
            long r5 = dl2.b.P2(r7, r13)
            long r1 = zn2.b.l(r2, r5)
            r12.f56546r = r4
            java.lang.Object r13 = lb.l0.T(r1, r12)
            if (r13 != r0) goto L83
            return r0
        L83:
            j1.y r13 = dy0.i0.f56582a
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            i2.q1 r0 = r12.f56550v
            r0.setValue(r13)
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
