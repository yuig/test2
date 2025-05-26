package androidx.compose.foundation.gestures;

import k1.e2;
import m1.c1;
import m1.e;
import m1.f1;
import m1.h2;
import m1.p1;
import m1.q1;
import m1.r1;
import o1.l;
import u2.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f17142a = new q1();

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f17143b = new p1();

    /* renamed from: c, reason: collision with root package name */
    public static final r1 f17144c = new r1();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(m1.o2 r11, long r12, bl2.c r14) {
        /*
            boolean r0 = r14 instanceof m1.s1
            if (r0 == 0) goto L13
            r0 = r14
            m1.s1 r0 = (m1.s1) r0
            int r1 = r0.f85568u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85568u = r1
            goto L18
        L13:
            m1.s1 r0 = new m1.s1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f85567t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85568u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.g0 r11 = r0.f85566s
            m1.o2 r12 = r0.f85565r
            ue.c.H(r14)
            r14 = r11
            r11 = r12
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            ue.c.H(r14)
            kotlin.jvm.internal.g0 r14 = new kotlin.jvm.internal.g0
            r14.<init>()
            k1.v1 r2 = k1.v1.Default
            m1.u1 r10 = new m1.u1
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f85565r = r11
            r0.f85566s = r14
            r0.f85568u = r3
            java.lang.Object r12 = r11.e(r2, r10, r0)
            if (r12 != r1) goto L56
            goto L61
        L56:
            float r12 = r14.f80425a
            long r11 = r11.g(r12)
            a3.c r1 = new a3.c
            r1.<init>(r11)
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(m1.o2, long, bl2.c):java.lang.Object");
    }

    public static final q b(q qVar, h2 h2Var, f1 f1Var, e2 e2Var, boolean z13, boolean z14, c1 c1Var, l lVar, e eVar) {
        return qVar.j(new ScrollableElement(e2Var, eVar, c1Var, f1Var, h2Var, lVar, z13, z14));
    }
}
