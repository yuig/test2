package cn0;

import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public a f28094r;

    /* renamed from: s, reason: collision with root package name */
    public int f28095s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f28096t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n9.d f28097u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n9.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f28097u = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f28097u, cVar);
        qVar.f28096t = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:5:0x0059). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f28095s
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            cn0.a r1 = r8.f28094r
            java.lang.Object r3 = r8.f28096t
            co2.z r3 = (co2.z) r3
            ue.c.H(r9)
            goto L59
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            ue.c.H(r9)
            java.lang.Object r9 = r8.f28096t
            co2.z r9 = (co2.z) r9
            r3 = r9
        L23:
            n9.d r9 = r8.f28097u
            java.lang.Object r1 = r9.f89954d
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1
            r1.lock()
            int r4 = r9.f89953c     // Catch: java.lang.Throwable -> L60
            int r5 = r9.f89952b     // Catch: java.lang.Throwable -> L60
            if (r4 >= r5) goto L34
            r4 = r2
            goto L35
        L34:
            r4 = 0
        L35:
            cn0.a r6 = new cn0.a     // Catch: java.lang.Throwable -> L60
            int r7 = r5 + 1
            r9.f89952b = r7     // Catch: java.lang.Throwable -> L60
            int r9 = r9.f89951a     // Catch: java.lang.Throwable -> L60
            r6.<init>(r5, r9, r4)     // Catch: java.lang.Throwable -> L60
            r1.unlock()
            r6.toString()
            r8.f28096t = r3
            r8.f28094r = r6
            r8.f28095s = r2
            r9 = r3
            co2.y r9 = (co2.y) r9
            co2.q r9 = r9.f28359d
            java.lang.Object r9 = r9.o(r6, r8)
            if (r9 != r0) goto L58
            return r0
        L58:
            r1 = r6
        L59:
            boolean r9 = r1.f28041c
            if (r9 == 0) goto L23
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        L60:
            r9 = move-exception
            r1.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
