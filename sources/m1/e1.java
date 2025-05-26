package m1;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class e1 extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f85324s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85325t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f85326u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function2 f85327v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(bl2.c cVar, CoroutineContext coroutineContext, Function2 function2) {
        super(2, cVar);
        this.f85326u = coroutineContext;
        this.f85327v = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e1 e1Var = new e1(cVar, this.f85326u, this.f85327v);
        e1Var.f85325t = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, n3.l0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f85324s
            kotlin.coroutines.CoroutineContext r2 = r8.f85326u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r1 = r8.f85325t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f85325t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L5e
        L2c:
            java.lang.Object r1 = r8.f85325t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            ue.c.H(r9)
            java.lang.Object r9 = r8.f85325t
            n3.l0 r9 = (n3.l0) r9
        L3b:
            boolean r1 = ao2.m0.S(r2)
            if (r1 == 0) goto L70
            kotlin.jvm.functions.Function2 r1 = r8.f85327v     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f85325t = r9     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f85324s = r5     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r1 != r0) goto L4e
            return r0
        L4e:
            r1 = r9
        L4f:
            r8.f85325t = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f85324s = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = kh2.u2.v(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            return r0
        L5a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L5e:
            boolean r6 = ao2.m0.S(r2)
            if (r6 == 0) goto L6f
            r8.f85325t = r1
            r8.f85324s = r3
            java.lang.Object r9 = kh2.u2.v(r1, r8)
            if (r9 != r0) goto L28
            return r0
        L6f:
            throw r9
        L70:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
