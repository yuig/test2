package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x72 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f13536a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y72 f13538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x72(y72 y72Var, bl2.c cVar) {
        super(2, cVar);
        this.f13538c = y72Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x72 x72Var = new x72(this.f13538c, cVar);
        x72Var.f13537b = obj;
        return x72Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x72 x72Var = new x72(this.f13538c, (bl2.c) obj2);
        x72Var.f13537b = (j0) obj;
        return x72Var.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:6:0x002c). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f13536a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.f13537b
            ao2.j0 r1 = (ao2.j0) r1
            ue.c.H(r7)
            goto L2c
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.f13537b
            ao2.j0 r1 = (ao2.j0) r1
            ue.c.H(r7)
            goto L43
        L24:
            ue.c.H(r7)
            java.lang.Object r7 = r6.f13537b
            r1 = r7
            ao2.j0 r1 = (ao2.j0) r1
        L2c:
            boolean r7 = dl2.b.x1(r1)
            if (r7 == 0) goto L50
            ads_mobile_sdk.y72 r7 = r6.f13538c
            long r4 = r7.a()
            r6.f13537b = r1
            r6.f13536a = r3
            java.lang.Object r7 = lb.l0.T(r4, r6)
            if (r7 != r0) goto L43
            return r0
        L43:
            ads_mobile_sdk.y72 r7 = r6.f13538c
            r6.f13537b = r1
            r6.f13536a = r2
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L2c
            return r0
        L50:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x72.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
