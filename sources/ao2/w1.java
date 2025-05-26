package ao2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w1 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public f2 f20225s;

    /* renamed from: t, reason: collision with root package name */
    public ho2.l f20226t;

    /* renamed from: u, reason: collision with root package name */
    public int f20227u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20228v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a2 f20229w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(bl2.c cVar, a2 a2Var) {
        super(2, cVar);
        this.f20229w = a2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w1 w1Var = new w1(cVar, this.f20229w);
        w1Var.f20228v = obj;
        return w1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((yn2.p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006c -> B:6:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007f -> B:6:0x0082). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f20227u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            ho2.l r1 = r6.f20226t
            ao2.f2 r3 = r6.f20225s
            java.lang.Object r4 = r6.f20228v
            yn2.p r4 = (yn2.p) r4
            ue.c.H(r7)
            goto L82
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            ue.c.H(r7)
            goto L87
        L24:
            ue.c.H(r7)
            java.lang.Object r7 = r6.f20228v
            yn2.p r7 = (yn2.p) r7
            ao2.a2 r1 = r6.f20229w
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = ao2.a2.f20111a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof ao2.t
            if (r4 == 0) goto L47
            ao2.t r1 = (ao2.t) r1
            ao2.u r1 = r1.f20206e
            r6.f20227u = r3
            cl2.a r7 = r7.b(r1, r6)
            if (r7 != r0) goto L87
            return r0
        L47:
            boolean r3 = r1 instanceof ao2.l1
            if (r3 == 0) goto L87
            ao2.l1 r1 = (ao2.l1) r1
            ao2.f2 r1 = r1.b()
            if (r1 == 0) goto L87
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = ho2.l.f69770a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)
            ho2.l r3 = (ho2.l) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L64:
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r7 != 0) goto L87
            boolean r7 = r1 instanceof ao2.t
            if (r7 == 0) goto L82
            r7 = r1
            ao2.t r7 = (ao2.t) r7
            r6.f20228v = r4
            r6.f20225s = r3
            r6.f20226t = r1
            r6.f20227u = r2
            ao2.u r7 = r7.f20206e
            cl2.a r7 = r4.b(r7, r6)
            if (r7 != r0) goto L82
            return r0
        L82:
            ho2.l r1 = r1.f()
            goto L64
        L87:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ao2.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
