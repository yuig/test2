package h72;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f67967r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f67968s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, bl2.c cVar) {
        super(2, cVar);
        this.f67968s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f67968s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f67967r
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            h72.l r6 = r7.f67968s
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            ue.c.H(r8)
            goto L75
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            ue.c.H(r8)
            goto L5a
        L22:
            ue.c.H(r8)
            goto L3b
        L26:
            ue.c.H(r8)
            r7.f67967r = r5
            n72.a r8 = r6.f67991f
            ao2.f0 r8 = r8.f89707c
            h72.g r1 = new h72.g
            r1.<init>(r6, r2)
            java.lang.Object r8 = kotlin.jvm.internal.j.M(r7, r8, r1)
            if (r8 != r0) goto L3b
            return r0
        L3b:
            java.util.List r8 = (java.util.List) r8
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L48
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L83
        L48:
            r7.f67967r = r4
            n72.a r8 = r6.f67991f
            ao2.f0 r8 = r8.f89707c
            h72.e r1 = new h72.e
            r1.<init>(r6, r2)
            java.lang.Object r8 = kotlin.jvm.internal.j.M(r7, r8, r1)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L63
            return r2
        L63:
            r7.f67967r = r3
            n72.a r8 = r6.f67991f
            ao2.f0 r8 = r8.f89707c
            h72.g r1 = new h72.g
            r1.<init>(r6, r2)
            java.lang.Object r8 = kotlin.jvm.internal.j.M(r7, r8, r1)
            if (r8 != r0) goto L75
            return r0
        L75:
            java.util.List r8 = (java.util.List) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L84
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83
            goto L84
        L83:
            return r8
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h72.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
