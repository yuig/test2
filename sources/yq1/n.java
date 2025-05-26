package yq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f139921r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f139922s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f139922s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f139922s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f139921r
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            ue.c.H(r7)
            goto L72
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            ue.c.H(r7)
            r6.f139921r = r2
            int r7 = yq1.q.f139945o0
            yq1.q r7 = r6.f139922s
            b60.b r1 = r7.getActiveUserManager()
            b60.d r1 = (b60.d) r1
            boolean r1 = r1.i()
            r2 = 0
            if (r1 != 0) goto L55
            lh0.y1 r1 = r7.f139950g0
            if (r1 == 0) goto L4f
            lh0.z3 r3 = lh0.a4.f83298b
            lh0.z0 r1 = r1.f83514a
            lh0.g1 r1 = (lh0.g1) r1
            java.lang.String r4 = "android_unauth_experiment_loading"
            java.lang.String r5 = "enabled"
            boolean r3 = r1.o(r4, r5, r3)
            if (r3 != 0) goto L45
            boolean r1 = r1.l(r4)
            if (r1 == 0) goto L55
        L45:
            java.lang.Object r7 = r7.Z7(r6)
            if (r7 != r0) goto L4c
            goto L6f
        L4c:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            goto L6f
        L4f:
            java.lang.String r7 = "experiments"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r2
        L55:
            lh0.g1 r7 = r7.f139949f0
            if (r7 == 0) goto L75
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f83369u
            boolean r7 = r7.get()
            if (r7 != 0) goto L6d
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = lb.l0.S(r1, r6)
            if (r7 != r0) goto L6a
            goto L6f
        L6a:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            goto L6f
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        L6f:
            if (r7 != r0) goto L72
            return r0
        L72:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L75:
            java.lang.String r7 = "experimentsManager"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
