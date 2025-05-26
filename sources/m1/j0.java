package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85383r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85384s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t0 f85385t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n3.w f85386u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kl2.l f85387v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f85388w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f85389x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f85390y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Function2 f85391z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(t0 t0Var, n3.w wVar, kl2.l lVar, Function1 function1, Function0 function0, Function0 function02, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f85385t = t0Var;
        this.f85386u = wVar;
        this.f85387v = lVar;
        this.f85388w = function1;
        this.f85389x = function0;
        this.f85390y = function02;
        this.f85391z = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j0 j0Var = new j0(this.f85385t, this.f85386u, this.f85387v, this.f85388w, this.f85389x, this.f85390y, this.f85391z, cVar);
        j0Var.f85384s = obj;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r14.f85383r
            m1.t0 r2 = r14.f85385t
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r14.f85384s
            ao2.j0 r0 = (ao2.j0) r0
            ue.c.H(r15)     // Catch: java.util.concurrent.CancellationException -> L13
            goto L65
        L13:
            r15 = move-exception
            goto L56
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            ue.c.H(r15)
            java.lang.Object r15 = r14.f85384s
            ao2.j0 r15 = (ao2.j0) r15
            m1.f1 r7 = r2.f85578p     // Catch: java.util.concurrent.CancellationException -> L54
            n3.w r1 = r14.f85386u     // Catch: java.util.concurrent.CancellationException -> L54
            kl2.l r8 = r14.f85387v     // Catch: java.util.concurrent.CancellationException -> L54
            kotlin.jvm.functions.Function1 r11 = r14.f85388w     // Catch: java.util.concurrent.CancellationException -> L54
            kotlin.jvm.functions.Function0 r10 = r14.f85389x     // Catch: java.util.concurrent.CancellationException -> L54
            kotlin.jvm.functions.Function0 r5 = r14.f85390y     // Catch: java.util.concurrent.CancellationException -> L54
            kotlin.jvm.functions.Function2 r9 = r14.f85391z     // Catch: java.util.concurrent.CancellationException -> L54
            r14.f85384s = r15     // Catch: java.util.concurrent.CancellationException -> L54
            r14.f85383r = r3     // Catch: java.util.concurrent.CancellationException -> L54
            float r3 = m1.i0.f85372a     // Catch: java.util.concurrent.CancellationException -> L54
            kotlin.jvm.internal.i0 r6 = new kotlin.jvm.internal.i0     // Catch: java.util.concurrent.CancellationException -> L54
            r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L54
            m1.g0 r3 = new m1.g0     // Catch: java.util.concurrent.CancellationException -> L54
            r12 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L54
            java.lang.Object r1 = kh2.u2.w(r1, r3, r14)     // Catch: java.util.concurrent.CancellationException -> L54
            if (r1 != r0) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r1 = kotlin.Unit.f80348a     // Catch: java.util.concurrent.CancellationException -> L54
        L4d:
            if (r1 != r0) goto L65
            return r0
        L50:
            r13 = r0
            r0 = r15
            r15 = r13
            goto L56
        L54:
            r0 = move-exception
            goto L50
        L56:
            co2.q r1 = r2.f85582t
            if (r1 == 0) goto L5f
            m1.v r2 = m1.v.f85605a
            r1.g(r2)
        L5f:
            boolean r0 = dl2.b.x1(r0)
            if (r0 == 0) goto L68
        L65:
            kotlin.Unit r15 = kotlin.Unit.f80348a
            return r15
        L68:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
