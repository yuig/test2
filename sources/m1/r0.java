package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f85544r;

    /* renamed from: s, reason: collision with root package name */
    public int f85545s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85546t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f85547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t0 f85548v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kotlin.jvm.internal.j0 j0Var, t0 t0Var, bl2.c cVar) {
        super(2, cVar);
        this.f85547u = j0Var;
        this.f85548v = t0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r0 r0Var = new r0(this.f85547u, this.f85548v, cVar);
        r0Var.f85546t = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((Function1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f85545s
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            kotlin.jvm.internal.j0 r1 = r6.f85544r
            java.lang.Object r3 = r6.f85546t
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            ue.c.H(r7)
            goto L50
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            ue.c.H(r7)
            java.lang.Object r7 = r6.f85546t
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r3 = r7
        L23:
            kotlin.jvm.internal.j0 r1 = r6.f85547u
            java.lang.Object r7 = r1.f80434a
            boolean r4 = r7 instanceof m1.y
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof m1.v
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof m1.w
            r5 = 0
            if (r4 == 0) goto L37
            m1.w r7 = (m1.w) r7
            goto L38
        L37:
            r7 = r5
        L38:
            if (r7 == 0) goto L3d
            r3.invoke(r7)
        L3d:
            m1.t0 r7 = r6.f85548v
            co2.q r7 = r7.f85582t
            if (r7 == 0) goto L53
            r6.f85546t = r3
            r6.f85544r = r1
            r6.f85545s = r2
            java.lang.Object r7 = r7.p(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = r7
            m1.z r5 = (m1.z) r5
        L53:
            r1.f80434a = r5
            goto L23
        L56:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
