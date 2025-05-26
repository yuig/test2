package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public abstract class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f85477a = new v0(2, null);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(n3.l0 r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof m1.r2
            if (r0 == 0) goto L13
            r0 = r9
            m1.r2 r0 = (m1.r2) r0
            int r1 = r0.f85551t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85551t = r1
            goto L18
        L13:
            m1.r2 r0 = new m1.r2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f85550s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85551t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n3.l0 r8 = r0.f85549r
            ue.c.H(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ue.c.H(r9)
        L34:
            r0.f85549r = r8
            r0.f85551t = r3
            n3.k r9 = n3.k.Main
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L41
            goto L71
        L41:
            n3.j r9 = (n3.j) r9
            java.util.List r2 = r9.f89070a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4b:
            if (r6 >= r4) goto L59
            java.lang.Object r7 = r2.get(r6)
            n3.q r7 = (n3.q) r7
            r7.a()
            int r6 = r6 + 1
            goto L4b
        L59:
            java.util.List r9 = r9.f89070a
            int r2 = r9.size()
        L5f:
            if (r5 >= r2) goto L6f
            java.lang.Object r4 = r9.get(r5)
            n3.q r4 = (n3.q) r4
            boolean r4 = r4.f89110d
            if (r4 == 0) goto L6c
            goto L34
        L6c:
            int r5 = r5 + 1
            goto L5f
        L6f:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.n3.a(n3.l0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(n3.l0 r10, boolean r11, n3.k r12, bl2.c r13) {
        /*
            boolean r0 = r13 instanceof m1.p2
            if (r0 == 0) goto L13
            r0 = r13
            m1.p2 r0 = (m1.p2) r0
            int r1 = r0.f85519v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85519v = r1
            goto L18
        L13:
            m1.p2 r0 = new m1.p2
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f85518u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85519v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.f85517t
            n3.k r11 = r0.f85516s
            n3.l0 r12 = r0.f85515r
            ue.c.H(r13)
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L4b
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            ue.c.H(r13)
        L3c:
            r0.f85515r = r10
            r0.f85516s = r12
            r0.f85517t = r11
            r0.f85519v = r3
            java.lang.Object r13 = r10.a(r12, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            n3.j r13 = (n3.j) r13
            java.util.List r2 = r13.f89070a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L55:
            if (r6 >= r4) goto L78
            java.lang.Object r7 = r2.get(r6)
            n3.q r7 = (n3.q) r7
            if (r11 == 0) goto L6e
            boolean r8 = r7.m()
            if (r8 != 0) goto L3c
            boolean r8 = r7.f89114h
            if (r8 != 0) goto L3c
            boolean r7 = r7.f89110d
            if (r7 == 0) goto L3c
            goto L75
        L6e:
            boolean r7 = c0.d.s(r7)
            if (r7 != 0) goto L75
            goto L3c
        L75:
            int r6 = r6 + 1
            goto L55
        L78:
            java.util.List r10 = r13.f89070a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.n3.b(n3.l0, boolean, n3.k, bl2.c):java.lang.Object");
    }

    public static Object d(n3.w wVar, al1.j jVar, f2.a0 a0Var, Function1 function1, bl2.c cVar, int i13) {
        al1.j jVar2 = (i13 & 2) != 0 ? null : jVar;
        kl2.l lVar = a0Var;
        if ((i13 & 4) != 0) {
            lVar = f85477a;
        }
        Object O = dl2.b.O(new l3(wVar, null, jVar2, null, (i13 & 8) != 0 ? null : function1, lVar), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r0 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r9 >= r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r10 = (n3.q) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r10.m() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (c0.d.f2(r10, r8.f89088f.f89105w, r8.c()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r0 = n3.k.Final;
        r1.f85459r = r8;
        r1.f85460s = r3;
        r1.f85462u = 2;
        r0 = r8.a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(n3.l0 r17, n3.k r18, bl2.c r19) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.n3.e(n3.l0, n3.k, bl2.c):java.lang.Object");
    }
}
