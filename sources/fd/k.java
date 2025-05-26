package fd;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f61776r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f61777s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f61778t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, bl2.c cVar) {
        super(2, cVar);
        this.f61778t = yVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k kVar = new k(this.f61778t, cVar);
        kVar.f61777s = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f61776r
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r6.f61777s
            java.io.Closeable r0 = (java.io.Closeable) r0
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L12
            goto L33
        L12:
            r7 = move-exception
            goto L38
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            ue.c.H(r7)
            java.lang.Object r7 = r6.f61777s
            ao2.j0 r7 = (ao2.j0) r7
            fd.y r1 = r6.f61778t
            bd.c r4 = r1.f61837j
            r6.f61777s = r4     // Catch: java.lang.Throwable -> L36
            r6.f61776r = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = fd.y.b(r1, r7, r6)     // Catch: java.lang.Throwable -> L36
            if (r7 != r0) goto L32
            return r0
        L32:
            r0 = r4
        L33:
            kotlin.Unit r7 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L12
            goto L3b
        L36:
            r7 = move-exception
            r0 = r4
        L38:
            r5 = r3
            r3 = r7
            r7 = r5
        L3b:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.lang.Throwable -> L41
            goto L49
        L41:
            r0 = move-exception
            if (r3 != 0) goto L46
            r3 = r0
            goto L49
        L46:
            xk2.f.a(r3, r0)
        L49:
            if (r3 != 0) goto L51
            kotlin.jvm.internal.Intrinsics.f(r7)
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L51:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
