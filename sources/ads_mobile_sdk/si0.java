package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class si0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi0 f11115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(wi0 wi0Var, bl2.c cVar) {
        super(2, cVar);
        this.f11115b = wi0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new si0(this.f11115b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new si0(this.f11115b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f11114a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            ue.c.H(r8)
            goto L6f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            ue.c.H(r8)
            goto L64
        L1f:
            ue.c.H(r8)
            goto L46
        L23:
            ue.c.H(r8)
            ads_mobile_sdk.wi0 r8 = r7.f11115b
            ads_mobile_sdk.oh0 r8 = r8.f13050e
            r8.getClass()
            zn2.a r1 = zn2.b.f142311b
            zn2.d r1 = zn2.d.MILLISECONDS
            r5 = 3000(0xbb8, float:4.204E-42)
            long r5 = dl2.b.P2(r5, r1)
            java.lang.String r1 = "gads:timeout_for_show_call_succeed:ms"
            long r5 = r8.a(r5, r1)
            r7.f11114a = r4
            java.lang.Object r8 = lb.l0.T(r5, r7)
            if (r8 != r0) goto L46
            return r0
        L46:
            ads_mobile_sdk.wi0 r8 = r7.f11115b
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.f13057l
            boolean r8 = r8.get()
            if (r8 == 0) goto L53
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        L53:
            java.lang.String r8 = "Full screen Activity took too long to start."
            r1 = 0
            ads_mobile_sdk.gk0.d(r8, r1)
            ads_mobile_sdk.wi0 r8 = r7.f11115b
            r7.f11114a = r3
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto L64
            return r0
        L64:
            ads_mobile_sdk.wi0 r8 = r7.f11115b
            r7.f11114a = r2
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L6f
            return r0
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.si0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
