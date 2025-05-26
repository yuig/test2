package n1;

import j1.a0;
import kotlin.jvm.internal.Intrinsics;
import m1.o3;
import m1.p1;

/* loaded from: classes2.dex */
public final class h implements o3 {

    /* renamed from: a, reason: collision with root package name */
    public final b f88894a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f88895b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.n f88896c;

    /* renamed from: d, reason: collision with root package name */
    public final p1 f88897d = androidx.compose.foundation.gestures.a.f17143b;

    public h(b bVar, a0 a0Var, j1.n nVar) {
        this.f88894a = bVar;
        this.f88895b = a0Var;
        this.f88896c = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(n1.h r7, m1.m1 r8, float r9, float r10, n1.d r11, bl2.c r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof n1.g
            if (r0 == 0) goto L17
            r0 = r12
            n1.g r0 = (n1.g) r0
            int r1 = r0.f88893t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f88893t = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            n1.g r0 = new n1.g
            r0.<init>(r7, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.f88891r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f88893t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ue.c.H(r12)
            goto Lbd
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ue.c.H(r12)
            float r12 = java.lang.Math.abs(r9)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L42
            goto L4a
        L42:
            float r12 = java.lang.Math.abs(r10)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L51
        L4a:
            j1.o r7 = j1.e.b(r9, r10)
        L4e:
            r0 = r7
            goto Lc2
        L51:
            r6.f88893t = r2
            j1.p2 r12 = j1.q2.f74205a
            j1.x2 r12 = new j1.x2
            j1.a0 r3 = r7.f88895b
            j1.j0 r4 = r3.f73970a
            r12.<init>(r4)
            j1.p r4 = new j1.p
            r4.<init>(r1)
            j1.p r1 = new j1.p
            r1.<init>(r10)
            j1.t r12 = r12.a(r4, r1)
            j1.p r12 = (j1.p) r12
            float r12 = r12.f74189a
            float r12 = java.lang.Math.abs(r12)
            float r1 = java.lang.Math.abs(r9)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 < 0) goto L84
            androidx.appcompat.widget.q r7 = new androidx.appcompat.widget.q
            r12 = 0
            r7.<init>(r3, r12)
            r1 = r7
            goto L8c
        L84:
            androidx.appcompat.widget.q r12 = new androidx.appcompat.widget.q
            j1.n r7 = r7.f88896c
            r12.<init>(r7, r2)
            r1 = r12
        L8c:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r9)
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            int r10 = r1.f16668a
            switch(r10) {
                case 0: goto Lab;
                default: goto L9b;
            }
        L9b:
            float r3 = r7.floatValue()
            float r4 = r9.floatValue()
            r2 = r8
            r5 = r11
            java.lang.Object r7 = r1.y(r2, r3, r4, r5, r6)
        La9:
            r12 = r7
            goto Lba
        Lab:
            float r3 = r7.floatValue()
            float r4 = r9.floatValue()
            r2 = r8
            r5 = r11
            java.lang.Object r7 = r1.y(r2, r3, r4, r5, r6)
            goto La9
        Lba:
            if (r12 != r0) goto Lbd
            goto Lc2
        Lbd:
            n1.a r12 = (n1.a) r12
            j1.o r7 = r12.f88871b
            goto L4e
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.b(n1.h, m1.m1, float, float, n1.d, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(m1.j2 r11, float r12, kotlin.jvm.functions.Function1 r13, bl2.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof n1.c
            if (r0 == 0) goto L13
            r0 = r14
            n1.c r0 = (n1.c) r0
            int r1 = r0.f88878u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88878u = r1
            goto L18
        L13:
            n1.c r0 = new n1.c
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f88876s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f88878u
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.functions.Function1 r11 = r0.f88875r
            r13 = r11
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            ue.c.H(r14)
            goto L4f
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            ue.c.H(r14)
            m1.p1 r14 = r10.f88897d
            n1.e r2 = new n1.e
            r8 = 0
            r4 = r2
            r5 = r12
            r6 = r11
            r7 = r10
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f88875r = r13
            r0.f88878u = r3
            java.lang.Object r14 = kotlin.jvm.internal.j.M(r0, r14, r2)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            n1.a r14 = (n1.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.c(m1.j2, float, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(m1.j2 r5, float r6, kotlin.jvm.functions.Function1 r7, bl2.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof n1.f
            if (r0 == 0) goto L13
            r0 = r8
            n1.f r0 = (n1.f) r0
            int r1 = r0.f88890t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88890t = r1
            goto L18
        L13:
            n1.f r0 = new n1.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f88888r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f88890t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ue.c.H(r8)
            r0.f88890t = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            n1.a r8 = (n1.a) r8
            java.lang.Object r5 = r8.f88870a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L57
        L4b:
            j1.o r5 = r8.f88871b
            java.lang.Object r5 = r5.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L57:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.d(m1.j2, float, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(hVar.f88896c, this.f88896c) && Intrinsics.d(hVar.f88895b, this.f88895b) && Intrinsics.d(hVar.f88894a, this.f88894a);
    }

    public final int hashCode() {
        return this.f88894a.hashCode() + ((this.f88895b.hashCode() + (this.f88896c.hashCode() * 31)) * 31);
    }
}
