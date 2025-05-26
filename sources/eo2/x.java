package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public do2.j f59844r;

    /* renamed from: s, reason: collision with root package name */
    public int f59845s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ co2.b0 f59846t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ do2.j f59847u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kl2.l f59848v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f59849w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ao2.x f59850x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(co2.b0 b0Var, do2.j jVar, kl2.l lVar, Object obj, ao2.x xVar, bl2.c cVar) {
        super(2, cVar);
        this.f59846t = b0Var;
        this.f59847u = jVar;
        this.f59848v = lVar;
        this.f59849w = obj;
        this.f59850x = xVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f59846t, this.f59847u, this.f59848v, this.f59849w, this.f59850x, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((Unit) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f59845s
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            ue.c.H(r7)
            goto L6b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            do2.j r1 = r6.f59844r
            ue.c.H(r7)
            goto L60
        L22:
            ue.c.H(r7)
            co2.t r7 = (co2.t) r7
            java.lang.Object r7 = r7.f28348a
            goto L38
        L2a:
            ue.c.H(r7)
            r6.f59845s = r5
            co2.b0 r7 = r6.f59846t
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L38
            return r0
        L38:
            boolean r1 = r7 instanceof co2.s
            if (r1 == 0) goto L4a
            java.lang.Throwable r7 = co2.t.a(r7)
            if (r7 != 0) goto L49
            kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
            ao2.x r0 = r6.f59850x
            r7.<init>(r0)
        L49:
            throw r7
        L4a:
            fi.b r1 = eo2.j0.f59783a
            if (r7 != r1) goto L4f
            r7 = r2
        L4f:
            do2.j r1 = r6.f59847u
            r6.f59844r = r1
            r6.f59845s = r4
            kl2.l r4 = r6.f59848v
            java.lang.Object r5 = r6.f59849w
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            r6.f59844r = r2
            r6.f59845s = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L6b
            return r0
        L6b:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: eo2.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
