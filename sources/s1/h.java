package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class h extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public n3.q f110439s;

    /* renamed from: t, reason: collision with root package name */
    public n3.q f110440t;

    /* renamed from: u, reason: collision with root package name */
    public int f110441u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f110442v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f110443w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o0 o0Var, bl2.c cVar) {
        super(2, cVar);
        this.f110443w = o0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h hVar = new h(this.f110443w, cVar);
        hVar.f110442v = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0065 -> B:6:0x0068). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r11.f110441u
            r2 = 1
            s1.o0 r3 = r11.f110443w
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L23
            if (r1 != r4) goto L1b
            n3.q r1 = r11.f110440t
            n3.q r2 = r11.f110439s
            java.lang.Object r6 = r11.f110442v
            n3.l0 r6 = (n3.l0) r6
            ue.c.H(r12)
            goto L68
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r1 = r11.f110442v
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r12)
            goto L40
        L2b:
            ue.c.H(r12)
            java.lang.Object r12 = r11.f110442v
            r1 = r12
            n3.l0 r1 = (n3.l0) r1
            n3.k r12 = n3.k.Initial
            r11.f110442v = r1
            r11.f110441u = r2
            java.lang.Object r12 = m1.n3.b(r1, r5, r12, r11)
            if (r12 != r0) goto L40
            return r0
        L40:
            n3.q r12 = (n3.q) r12
            r3.getClass()
            a3.c r2 = new a3.c
            r6 = 0
            r2.<init>(r6)
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r3.f110491a
            r6.setValue(r2)
            r2 = 0
            r6 = r1
            r1 = r2
            r2 = r12
        L55:
            if (r1 != 0) goto L8d
            n3.k r12 = n3.k.Initial
            r11.f110442v = r6
            r11.f110439s = r2
            r11.f110440t = r1
            r11.f110441u = r4
            java.lang.Object r12 = r6.a(r12, r11)
            if (r12 != r0) goto L68
            return r0
        L68:
            n3.j r12 = (n3.j) r12
            java.util.List r7 = r12.f89070a
            int r8 = r7.size()
            r9 = r5
        L71:
            if (r9 >= r8) goto L83
            java.lang.Object r10 = r7.get(r9)
            n3.q r10 = (n3.q) r10
            boolean r10 = c0.d.t(r10)
            if (r10 != 0) goto L80
            goto L55
        L80:
            int r9 = r9 + 1
            goto L71
        L83:
            java.util.List r12 = r12.f89070a
            java.lang.Object r12 = r12.get(r5)
            r1 = r12
            n3.q r1 = (n3.q) r1
            goto L55
        L8d:
            long r4 = r2.f89109c
            long r0 = r1.f89109c
            long r0 = a3.c.g(r0, r4)
            r3.getClass()
            a3.c r12 = new a3.c
            r12.<init>(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r3.f110491a
            r0.setValue(r12)
            kotlin.Unit r12 = kotlin.Unit.f80348a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
