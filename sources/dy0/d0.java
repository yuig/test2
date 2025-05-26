package dy0;

import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56553r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f56554s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f56555t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i13, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f56554s = i13;
        this.f56555t = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f56554s, this.f56555t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r13.f56553r
            r2 = 4594932627813569659(0x3fc47ae147ae147b, double:0.16)
            r4 = 3
            r5 = 2
            r6 = 1
            i2.q1 r7 = r13.f56555t
            int r8 = r13.f56554s
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            ue.c.H(r14)
            goto L81
        L1c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L24:
            ue.c.H(r14)
            goto L65
        L28:
            ue.c.H(r14)
            goto L49
        L2c:
            ue.c.H(r14)
            zn2.a r14 = zn2.b.f142311b
            zn2.d r14 = zn2.d.MILLISECONDS
            long r9 = dl2.b.P2(r8, r14)
            r11 = 4599436227440940155(0x3fd47ae147ae147b, double:0.32)
            long r9 = zn2.b.l(r11, r9)
            r13.f56553r = r6
            java.lang.Object r14 = lb.l0.T(r9, r13)
            if (r14 != r0) goto L49
            return r0
        L49:
            dy0.p0 r14 = dy0.p0.PIN_3_FOCUS
            j1.y r1 = dy0.i0.f56582a
            r7.setValue(r14)
            zn2.a r14 = zn2.b.f142311b
            zn2.d r14 = zn2.d.MILLISECONDS
            long r9 = dl2.b.P2(r8, r14)
            long r9 = zn2.b.l(r2, r9)
            r13.f56553r = r5
            java.lang.Object r14 = lb.l0.T(r9, r13)
            if (r14 != r0) goto L65
            return r0
        L65:
            dy0.p0 r14 = dy0.p0.PIN_2_FOCUS
            j1.y r1 = dy0.i0.f56582a
            r7.setValue(r14)
            zn2.a r14 = zn2.b.f142311b
            zn2.d r14 = zn2.d.MILLISECONDS
            long r5 = dl2.b.P2(r8, r14)
            long r1 = zn2.b.l(r2, r5)
            r13.f56553r = r4
            java.lang.Object r14 = lb.l0.T(r1, r13)
            if (r14 != r0) goto L81
            return r0
        L81:
            dy0.p0 r14 = dy0.p0.PIN_1_FOCUS
            j1.y r0 = dy0.i0.f56582a
            r7.setValue(r14)
            kotlin.Unit r14 = kotlin.Unit.f80348a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
