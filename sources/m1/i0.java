package m1;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f85372a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (c0.d.x2(r7) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0057 -> B:10:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(long r12, n3.l0 r14, bl2.c r15) {
        /*
            boolean r0 = r15 instanceof m1.a0
            if (r0 == 0) goto L13
            r0 = r15
            m1.a0 r0 = (m1.a0) r0
            int r1 = r0.f85280u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85280u = r1
            goto L18
        L13:
            m1.a0 r0 = new m1.a0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f85279t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85280u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.i0 r12 = r0.f85278s
            n3.l0 r13 = r0.f85277r
            ue.c.H(r15)
            r14 = r13
            goto L5a
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            ue.c.H(r15)
            n3.o0 r15 = r14.f89088f
            n3.j r15 = r15.f89101s
            boolean r15 = d(r15, r12)
            if (r15 == 0) goto L43
            return r4
        L43:
            kotlin.jvm.internal.i0 r15 = new kotlin.jvm.internal.i0
            r15.<init>()
            r15.f80432a = r12
            r12 = r15
        L4b:
            r0.f85277r = r14
            r0.f85278s = r12
            r0.f85280u = r3
            n3.k r13 = n3.k.Main
            java.lang.Object r15 = r14.a(r13, r0)
            if (r15 != r1) goto L5a
            return r1
        L5a:
            n3.j r15 = (n3.j) r15
            java.util.List r13 = r15.f89070a
            int r2 = r13.size()
            r5 = 0
            r6 = r5
        L64:
            if (r6 >= r2) goto L7b
            java.lang.Object r7 = r13.get(r6)
            r8 = r7
            n3.q r8 = (n3.q) r8
            long r8 = r8.f89107a
            long r10 = r12.f80432a
            boolean r8 = n3.p.a(r8, r10)
            if (r8 == 0) goto L78
            goto L7c
        L78:
            int r6 = r6 + 1
            goto L64
        L7b:
            r7 = r4
        L7c:
            n3.q r7 = (n3.q) r7
            if (r7 != 0) goto L82
            r7 = r4
            goto Lb0
        L82:
            boolean r13 = c0.d.u(r7)
            if (r13 == 0) goto Laa
            java.util.List r13 = r15.f89070a
            int r15 = r13.size()
        L8e:
            if (r5 >= r15) goto L9f
            java.lang.Object r2 = r13.get(r5)
            r6 = r2
            n3.q r6 = (n3.q) r6
            boolean r6 = r6.f89110d
            if (r6 == 0) goto L9c
            goto La0
        L9c:
            int r5 = r5 + 1
            goto L8e
        L9f:
            r2 = r4
        La0:
            n3.q r2 = (n3.q) r2
            if (r2 != 0) goto La5
            goto Lb0
        La5:
            long r5 = r2.f89107a
            r12.f80432a = r5
            goto L4b
        Laa:
            boolean r13 = c0.d.x2(r7)
            if (r13 == 0) goto L4b
        Lb0:
            if (r7 == 0) goto Lb9
            boolean r12 = r7.m()
            if (r12 != 0) goto Lb9
            r4 = r7
        Lb9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.a(long, n3.l0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(long r9, n3.l0 r11, bl2.c r12) {
        /*
            boolean r0 = r12 instanceof m1.b0
            if (r0 == 0) goto L13
            r0 = r12
            m1.b0 r0 = (m1.b0) r0
            int r1 = r0.f85294u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85294u = r1
            goto L18
        L13:
            m1.b0 r0 = new m1.b0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f85293t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85294u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.j0 r9 = r0.f85292s
            n3.q r10 = r0.f85291r
            ue.c.H(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            goto L99
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ue.c.H(r12)
            n3.o0 r12 = r11.f89088f
            n3.j r12 = r12.f89101s
            boolean r12 = d(r12, r9)
            if (r12 == 0) goto L43
            return r4
        L43:
            n3.o0 r12 = r11.f89088f
            n3.j r12 = r12.f89101s
            java.util.List r12 = r12.f89070a
            int r2 = r12.size()
            r5 = 0
        L4e:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            n3.q r7 = (n3.q) r7
            long r7 = r7.f89107a
            boolean r7 = n3.p.a(r7, r9)
            if (r7 == 0) goto L60
            goto L64
        L60:
            int r5 = r5 + 1
            goto L4e
        L63:
            r6 = r4
        L64:
            r10 = r6
            n3.q r10 = (n3.q) r10
            if (r10 != 0) goto L6a
            return r4
        L6a:
            kotlin.jvm.internal.j0 r9 = new kotlin.jvm.internal.j0
            r9.<init>()
            kotlin.jvm.internal.j0 r12 = new kotlin.jvm.internal.j0
            r12.<init>()
            r12.f80434a = r10
            t3.e4 r2 = r11.d()
            long r5 = r2.b()
            m1.c0 r2 = new m1.c0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r2.<init>(r12, r9, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r0.f85291r = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r0.f85292s = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            r0.f85294u = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            java.lang.Object r9 = r11.l(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L90
            if (r9 != r1) goto L99
            return r1
        L90:
            java.lang.Object r9 = r9.f80434a
            n3.q r9 = (n3.q) r9
            if (r9 != 0) goto L98
            r4 = r10
            goto L99
        L98:
            r4 = r9
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.b(long, n3.l0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(n3.l0 r4, long r5, kotlin.jvm.functions.Function1 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof m1.h0
            if (r0 == 0) goto L13
            r0 = r8
            m1.h0 r0 = (m1.h0) r0
            int r1 = r0.f85364u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85364u = r1
            goto L18
        L13:
            m1.h0 r0 = new m1.h0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f85363t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85364u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.functions.Function1 r4 = r0.f85362s
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            n3.l0 r5 = r0.f85361r
            ue.c.H(r8)
            r7 = r4
            r4 = r5
            goto L4a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            ue.c.H(r8)
        L3a:
            r0.f85361r = r4
            r8 = r7
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.f85362s = r8
            r0.f85364u = r3
            java.lang.Object r8 = a(r5, r4, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            n3.q r8 = (n3.q) r8
            if (r8 != 0) goto L51
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L51:
            boolean r5 = c0.d.u(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L5a:
            r7.invoke(r8)
            long r5 = r8.f89107a
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.i0.c(n3.l0, long, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }

    public static final boolean d(n3.j jVar, long j13) {
        Object obj;
        List list = jVar.f89070a;
        int size = list.size();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (n3.p.a(((n3.q) obj).f89107a, j13)) {
                break;
            }
            i13++;
        }
        n3.q qVar = (n3.q) obj;
        if (qVar != null && qVar.f89110d) {
            z13 = true;
        }
        return true ^ z13;
    }
}
