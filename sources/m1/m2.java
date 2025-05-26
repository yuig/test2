package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f85455r;

    /* renamed from: s, reason: collision with root package name */
    public int f85456s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f85457t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o2 f85458u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(o2 o2Var, bl2.c cVar) {
        super(2, cVar);
        this.f85458u = o2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m2 m2Var = new m2(this.f85458u, cVar);
        m2Var.f85457t = ((n4.o) obj).f89194a;
        return m2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m2) create(new n4.o(((n4.o) obj).f89194a), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            cl2.a r6 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r11.f85456s
            r1 = 3
            r2 = 2
            r3 = 1
            m1.o2 r4 = r11.f85458u
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            long r0 = r11.f85455r
            long r2 = r11.f85457t
            ue.c.H(r12)
            r9 = r0
            r0 = r12
            goto L76
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            long r2 = r11.f85455r
            long r7 = r11.f85457t
            ue.c.H(r12)
            r0 = r12
            goto L5b
        L2c:
            long r7 = r11.f85457t
            ue.c.H(r12)
            r0 = r12
            goto L45
        L33:
            ue.c.H(r12)
            long r7 = r11.f85457t
            m3.d r0 = r4.f85498f
            r11.f85457t = r7
            r11.f85456s = r3
            java.lang.Object r0 = r0.b(r7, r11)
            if (r0 != r6) goto L45
            return r6
        L45:
            n4.o r0 = (n4.o) r0
            long r9 = r0.f89194a
            long r9 = n4.o.f(r7, r9)
            r11.f85457t = r7
            r11.f85455r = r9
            r11.f85456s = r2
            java.lang.Object r0 = r4.b(r9, r11)
            if (r0 != r6) goto L5a
            return r6
        L5a:
            r2 = r9
        L5b:
            n4.o r0 = (n4.o) r0
            long r9 = r0.f89194a
            m3.d r0 = r4.f85498f
            long r2 = n4.o.f(r2, r9)
            r11.f85457t = r7
            r11.f85455r = r9
            r11.f85456s = r1
            r1 = r2
            r3 = r9
            r5 = r11
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L75
            return r6
        L75:
            r2 = r7
        L76:
            n4.o r0 = (n4.o) r0
            long r0 = r0.f89194a
            long r0 = n4.o.f(r9, r0)
            long r0 = n4.o.f(r2, r0)
            n4.o r2 = new n4.o
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.m2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
