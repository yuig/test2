package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w2 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f85617s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85618t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f85619u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kl2.l f85620v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f85621w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j1 f85622x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(ao2.j0 j0Var, kl2.l lVar, Function1 function1, j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85619u = j0Var;
        this.f85620v = lVar;
        this.f85621w = function1;
        this.f85622x = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w2 w2Var = new w2(this.f85619u, this.f85620v, this.f85621w, this.f85622x, cVar);
        w2Var.f85618t = obj;
        return w2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w2) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r9.f85617s
            ao2.j0 r2 = r9.f85619u
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            m1.j1 r7 = r9.f85622x
            if (r1 == 0) goto L26
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            ue.c.H(r10)
            goto L61
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f85618t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r10)
            goto L41
        L26:
            ue.c.H(r10)
            java.lang.Object r10 = r9.f85618t
            r1 = r10
            n3.l0 r1 = (n3.l0) r1
            m1.s2 r10 = new m1.s2
            r10.<init>(r7, r4)
            kotlin.jvm.internal.j.z(r2, r4, r4, r10, r3)
            r9.f85618t = r1
            r9.f85617s = r6
            java.lang.Object r10 = m1.n3.c(r1, r9, r3)
            if (r10 != r0) goto L41
            return r0
        L41:
            n3.q r10 = (n3.q) r10
            r10.a()
            m1.v0 r6 = m1.n3.f85477a
            kl2.l r8 = r9.f85620v
            if (r8 == r6) goto L54
            m1.t2 r6 = new m1.t2
            r6.<init>(r8, r7, r10, r4)
            kotlin.jvm.internal.j.z(r2, r4, r4, r6, r3)
        L54:
            r9.f85618t = r4
            r9.f85617s = r5
            n3.k r10 = n3.k.Main
            java.lang.Object r10 = m1.n3.e(r1, r10, r9)
            if (r10 != r0) goto L61
            return r0
        L61:
            n3.q r10 = (n3.q) r10
            if (r10 != 0) goto L6e
            m1.u2 r10 = new m1.u2
            r10.<init>(r7, r4)
            kotlin.jvm.internal.j.z(r2, r4, r4, r10, r3)
            goto L87
        L6e:
            r10.a()
            m1.v2 r0 = new m1.v2
            r0.<init>(r7, r4)
            kotlin.jvm.internal.j.z(r2, r4, r4, r0, r3)
            kotlin.jvm.functions.Function1 r0 = r9.f85621w
            if (r0 == 0) goto L87
            a3.c r1 = new a3.c
            long r2 = r10.f89109c
            r1.<init>(r2)
            r0.invoke(r1)
        L87:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.w2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
