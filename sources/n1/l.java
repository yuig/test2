package n1;

import ql2.s;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final float f88914a = 400;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(m1.m1 r13, float r14, j1.o r15, j1.a0 r16, n1.d r17, bl2.c r18) {
        /*
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof n1.i
            if (r2 == 0) goto L16
            r2 = r1
            n1.i r2 = (n1.i) r2
            int r3 = r2.f88902v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f88902v = r3
            goto L1b
        L16:
            n1.i r2 = new n1.i
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f88901u
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r2.f88902v
            r5 = 1
            if (r4 == 0) goto L38
            if (r4 != r5) goto L30
            float r0 = r2.f88898r
            kotlin.jvm.internal.g0 r3 = r2.f88900t
            j1.o r2 = r2.f88899s
            ue.c.H(r1)
            goto L74
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            ue.c.H(r1)
            kotlin.jvm.internal.g0 r1 = new kotlin.jvm.internal.g0
            r1.<init>()
            java.lang.Object r4 = r15.b()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L51
            r4 = r5
            goto L52
        L51:
            r4 = 0
        L52:
            r4 = r4 ^ r5
            n1.j r12 = new n1.j
            r11 = 0
            r6 = r12
            r7 = r14
            r8 = r1
            r9 = r13
            r10 = r17
            r6.<init>(r7, r8, r9, r10, r11)
            r2.f88899s = r0
            r2.f88900t = r1
            r6 = r14
            r2.f88898r = r6
            r2.f88902v = r5
            r5 = r16
            java.lang.Object r2 = j1.e.f(r15, r5, r4, r12, r2)
            if (r2 != r3) goto L71
            goto L82
        L71:
            r2 = r0
            r3 = r1
            r0 = r6
        L74:
            n1.a r1 = new n1.a
            float r3 = r3.f80425a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r1.<init>(r3, r2)
            r3 = r1
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.l.a(m1.m1, float, j1.o, j1.a0, n1.d, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(m1.m1 r17, float r18, float r19, j1.o r20, j1.n r21, n1.d r22, bl2.c r23) {
        /*
            r0 = r18
            r1 = r23
            boolean r2 = r1 instanceof n1.k
            if (r2 == 0) goto L18
            r2 = r1
            n1.k r2 = (n1.k) r2
            int r3 = r2.f88913w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f88913w = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            n1.k r2 = new n1.k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f88912v
            cl2.a r2 = cl2.a.COROUTINE_SUSPENDED
            int r3 = r8.f88913w
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            float r0 = r8.f88909s
            float r2 = r8.f88908r
            kotlin.jvm.internal.g0 r3 = r8.f88911u
            j1.o r4 = r8.f88910t
            ue.c.H(r1)
            r11 = r0
            r0 = r2
            r10 = r4
            goto L96
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            ue.c.H(r1)
            kotlin.jvm.internal.g0 r1 = new kotlin.jvm.internal.g0
            r1.<init>()
            java.lang.Object r3 = r20.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r7 = r3.floatValue()
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r0)
            java.lang.Object r3 = r20.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L68
            r3 = r4
            goto L69
        L68:
            r3 = 0
        L69:
            r6 = r3 ^ 1
            n1.j r16 = new n1.j
            r15 = 1
            r10 = r16
            r11 = r19
            r12 = r1
            r13 = r17
            r14 = r22
            r10.<init>(r11, r12, r13, r14, r15)
            r10 = r20
            r8.f88910t = r10
            r8.f88911u = r1
            r8.f88908r = r0
            r8.f88909s = r7
            r8.f88913w = r4
            r3 = r20
            r4 = r5
            r5 = r21
            r11 = r7
            r7 = r16
            java.lang.Object r3 = j1.e.g(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L95
            goto Lb7
        L95:
            r3 = r1
        L96:
            java.lang.Object r1 = r10.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = c(r1, r11)
            n1.a r2 = new n1.a
            float r3 = r3.f80425a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            j1.o r0 = j1.e.l(r10, r9, r1, r0)
            r2.<init>(r3, r0)
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.l.b(m1.m1, float, float, j1.o, j1.n, n1.d, bl2.c):java.lang.Object");
    }

    public static final float c(float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return f14 > 0.0f ? s.c(f13, f14) : s.a(f13, f14);
    }
}
