package l1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n3.l0;

/* loaded from: classes2.dex */
public final class f extends dl2.i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public int f81325s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f81326t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f81327u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f81327u = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f81327u, cVar);
        fVar.f81326t = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f81325s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            ue.c.H(r7)
            goto L54
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f81326t
            n3.l0 r1 = (n3.l0) r1
            ue.c.H(r7)
            goto L33
        L20:
            ue.c.H(r7)
            java.lang.Object r7 = r6.f81326t
            r1 = r7
            n3.l0 r1 = (n3.l0) r1
            r6.f81326t = r1
            r6.f81325s = r3
            java.lang.Object r7 = kh2.j1.z(r1, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            n3.q r7 = (n3.q) r7
            r7.a()
            a3.c r3 = new a3.c
            long r4 = r7.f89109c
            r3.<init>(r4)
            kotlin.jvm.functions.Function1 r7 = r6.f81327u
            r7.invoke(r3)
            r7 = 0
            r6.f81326t = r7
            r6.f81325s = r2
            m1.v0 r7 = m1.n3.f85477a
            n3.k r7 = n3.k.Main
            java.lang.Object r7 = m1.n3.e(r1, r7, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            n3.q r7 = (n3.q) r7
            if (r7 == 0) goto L5b
            r7.a()
        L5b:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
