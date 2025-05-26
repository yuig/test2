package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public Object f127267r;

    /* renamed from: s, reason: collision with root package name */
    public int f127268s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127269t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f127270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1.l f127271v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2.q1 q1Var, long j13, o1.l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f127269t = q1Var;
        this.f127270u = j13;
        this.f127271v = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g2(this.f127269t, this.f127270u, this.f127271v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f127268s
            o1.l r2 = r8.f127271v
            r3 = 2
            r4 = 1
            i2.q1 r5 = r8.f127269t
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r8.f127267r
            o1.n r0 = (o1.n) r0
            ue.c.H(r9)
            goto L5f
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.f127267r
            i2.q1 r1 = (i2.q1) r1
            ue.c.H(r9)
            goto L46
        L28:
            ue.c.H(r9)
            java.lang.Object r9 = r5.getValue()
            o1.n r9 = (o1.n) r9
            if (r9 == 0) goto L4a
            o1.m r1 = new o1.m
            r1.<init>(r9)
            if (r2 == 0) goto L45
            r8.f127267r = r5
            r8.f127268s = r4
            java.lang.Object r9 = r2.a(r1, r8)
            if (r9 != r0) goto L45
            return r0
        L45:
            r1 = r5
        L46:
            r9 = 0
            r1.setValue(r9)
        L4a:
            o1.n r9 = new o1.n
            long r6 = r8.f127270u
            r9.<init>(r6)
            if (r2 == 0) goto L60
            r8.f127267r = r9
            r8.f127268s = r3
            java.lang.Object r1 = r2.a(r9, r8)
            if (r1 != r0) goto L5e
            return r0
        L5e:
            r0 = r9
        L5f:
            r9 = r0
        L60:
            r5.setValue(r9)
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
