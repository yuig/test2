package nb0;

import java.util.Base64;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rq.e2;
import rq.t4;

/* loaded from: classes5.dex */
public final class t implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a6.h f90324a;

    public t(d6.d dsPref) {
        ob0.b crashReporterProvider = ob0.b.f93977a;
        Intrinsics.checkNotNullParameter(dsPref, "dsPref");
        Intrinsics.checkNotNullParameter(crashReporterProvider, "crashReporterProvider");
        this.f90324a = dsPref;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object o(nb0.t r4, java.lang.String r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof nb0.f
            if (r0 == 0) goto L13
            r0 = r6
            nb0.f r0 = (nb0.f) r0
            int r1 = r0.f90202t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90202t = r1
            goto L18
        L13:
            nb0.f r0 = new nb0.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f90200r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90202t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ue.c.H(r6)
            a6.h r4 = r4.f90324a
            do2.i r4 = r4.getData()
            androidx.slidingpanelayout.widget.c r6 = new androidx.slidingpanelayout.widget.c
            r2 = 5
            r6.<init>(r4, r5, r2)
            r0.f90202t = r3
            java.lang.Object r6 = lb.l0.h0(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L50
            boolean r4 = r6.booleanValue()
            goto L51
        L50:
            r4 = 0
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.o(nb0.t, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object p(nb0.t r4, java.lang.String r5, java.lang.String r6, com.pinterest.encryption.dataEncryptionLibrary.a r7, java.util.Base64.Decoder r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof nb0.h
            if (r0 == 0) goto L13
            r0 = r9
            nb0.h r0 = (nb0.h) r0
            int r1 = r0.f90224x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90224x = r1
            goto L18
        L13:
            nb0.h r0 = new nb0.h
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f90222v
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90224x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Base64$Decoder r8 = r0.f90221u
            com.pinterest.encryption.dataEncryptionLibrary.a r7 = r0.f90220t
            java.lang.String r6 = r0.f90219s
            java.lang.String r5 = r0.f90218r
            ue.c.H(r9)
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            ue.c.H(r9)
            r0.f90218r = r5
            r0.f90219s = r6
            r0.f90220t = r7
            r0.f90221u = r8
            r0.f90224x = r3
            r4.getClass()
            java.lang.Object r9 = u(r4, r5, r6, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L6f
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r9, r6)
            if (r4 == 0) goto L59
            goto L6f
        L59:
            byte[] r4 = r8.decode(r9)
            kotlin.jvm.internal.Intrinsics.f(r4)
            java.lang.String r8 = r7.f(r3, r4, r5)
            if (r8 != 0) goto L6b
            r8 = 0
            java.lang.String r8 = r7.f(r8, r4, r5)
        L6b:
            if (r8 != 0) goto L6e
            goto L6f
        L6e:
            r6 = r8
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.p(nb0.t, java.lang.String, java.lang.String, com.pinterest.encryption.dataEncryptionLibrary.a, java.util.Base64$Decoder, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object q(nb0.t r4, java.lang.String r5, boolean r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof nb0.i
            if (r0 == 0) goto L13
            r0 = r7
            nb0.i r0 = (nb0.i) r0
            int r1 = r0.f90229u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90229u = r1
            goto L18
        L13:
            nb0.i r0 = new nb0.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f90227s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90229u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r6 = r0.f90226r
            ue.c.H(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r7)
            java.lang.String r7 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            d6.g r7 = new d6.g
            r7.<init>(r5)
            r0.f90226r = r6
            r0.f90229u = r3
            java.lang.Object r7 = r4.r(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L51
            boolean r6 = r7.booleanValue()
        L51:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.q(nb0.t, java.lang.String, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(nb0.t r4, java.lang.String r5, int r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof nb0.l
            if (r0 == 0) goto L13
            r0 = r7
            nb0.l r0 = (nb0.l) r0
            int r1 = r0.f90257u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90257u = r1
            goto L18
        L13:
            nb0.l r0 = new nb0.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f90255s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90257u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r6 = r0.f90254r
            ue.c.H(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r7)
            d6.g r5 = d7.b.c0(r5)
            r0.f90254r = r6
            r0.f90257u = r3
            java.lang.Object r7 = r4.r(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L4b
            int r6 = r7.intValue()
        L4b:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.s(nb0.t, java.lang.String, int, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object t(nb0.t r4, java.lang.String r5, long r6, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof nb0.m
            if (r0 == 0) goto L13
            r0 = r8
            nb0.m r0 = (nb0.m) r0
            int r1 = r0.f90269u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90269u = r1
            goto L18
        L13:
            nb0.m r0 = new nb0.m
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f90267s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90269u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r6 = r0.f90266r
            ue.c.H(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r8)
            java.lang.String r8 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            d6.g r8 = new d6.g
            r8.<init>(r5)
            r0.f90266r = r6
            r0.f90269u = r3
            java.lang.Object r8 = r4.r(r8, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L51
            long r6 = r8.longValue()
        L51:
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.t(nb0.t, java.lang.String, long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object u(nb0.t r4, java.lang.String r5, java.lang.String r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof nb0.n
            if (r0 == 0) goto L13
            r0 = r7
            nb0.n r0 = (nb0.n) r0
            int r1 = r0.f90281u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90281u = r1
            goto L18
        L13:
            nb0.n r0 = new nb0.n
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f90279s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90281u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.f90278r
            ue.c.H(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r7)
            d6.g r5 = d7.b.z0(r5)
            r0.f90278r = r6
            r0.f90281u = r3
            java.lang.Object r7 = r4.r(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L48
            goto L49
        L48:
            r6 = r7
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.u(nb0.t, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object v(nb0.t r4, java.lang.String r5, java.util.Set r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof nb0.o
            if (r0 == 0) goto L13
            r0 = r7
            nb0.o r0 = (nb0.o) r0
            int r1 = r0.f90293u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90293u = r1
            goto L18
        L13:
            nb0.o r0 = new nb0.o
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f90291s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90293u
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Set r4 = r0.f90290r
            r6 = r4
            java.util.Set r6 = (java.util.Set) r6
            ue.c.H(r7)
            goto L4f
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r7)
            java.lang.String r7 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            d6.g r7 = new d6.g
            r7.<init>(r5)
            r5 = r6
            java.util.Set r5 = (java.util.Set) r5
            r0.f90290r = r5
            r0.f90293u = r3
            java.lang.Object r7 = r4.r(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L54
            goto L55
        L54:
            r6 = r7
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.v(nb0.t, java.lang.String, java.util.Set, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object x(nb0.t r5, java.lang.String r6, java.lang.String r7, java.lang.Boolean r8, com.pinterest.encryption.dataEncryptionLibrary.a r9, bl2.c r10) {
        /*
            boolean r0 = r10 instanceof nb0.s
            if (r0 == 0) goto L13
            r0 = r10
            nb0.s r0 = (nb0.s) r0
            int r1 = r0.f90323t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90323t = r1
            goto L18
        L13:
            nb0.s r0 = new nb0.s
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f90321r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90323t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r10)
            goto L84
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ue.c.H(r10)
            goto L45
        L36:
            ue.c.H(r10)
            if (r7 != 0) goto L48
            r0.f90323t = r4
            r7 = 0
            java.lang.Object r5 = r5.i(r6, r7, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L48:
            r10 = 0
            if (r8 == 0) goto L4d
            r8 = r4
            goto L4e
        L4d:
            r8 = r10
        L4e:
            boolean r2 = r9.c(r6, r8)
            if (r2 != 0) goto L57
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L57:
            byte[] r7 = r9.g(r6, r7, r8, r4)
            if (r7 == 0) goto L6e
            int r8 = r7.length
            if (r8 != 0) goto L61
            r10 = r4
        L61:
            r8 = r10 ^ 1
            if (r8 == 0) goto L6e
            java.util.Base64$Encoder r8 = java.util.Base64.getEncoder()
            java.lang.String r7 = r8.encodeToString(r7)
            goto L70
        L6e:
            java.lang.String r7 = ""
        L70:
            if (r7 == 0) goto L7b
            int r8 = r7.length()
            if (r8 != 0) goto L7b
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L7b:
            r0.f90323t = r3
            java.lang.Object r5 = r5.i(r6, r7, r0)
            if (r5 != r1) goto L84
            return r1
        L84:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.x(nb0.t, java.lang.String, java.lang.String, java.lang.Boolean, com.pinterest.encryption.dataEncryptionLibrary.a, bl2.c):java.lang.Object");
    }

    @Override // nb0.e
    public final Object a(String str, int i13, bl2.c cVar) {
        return s(this, str, i13, cVar);
    }

    @Override // nb0.e
    public final Object b(String str, String str2, Boolean bool, com.pinterest.encryption.dataEncryptionLibrary.a aVar, int i13, bl2.c cVar) {
        return x(this, str, str2, bool, aVar, cVar);
    }

    @Override // nb0.e
    public final Object c(String str, bl2.c cVar, boolean z13) {
        return q(this, str, z13, cVar);
    }

    @Override // nb0.e
    public final Object d(String str, int i13, bl2.c cVar) {
        return w(new e2(str, i13, 4), cVar);
    }

    @Override // nb0.e
    public final Object e(String str, long j13, bl2.c cVar) {
        return t(this, str, j13, cVar);
    }

    @Override // nb0.e
    public final Object f(String str, long j13, bl2.c cVar) {
        return w(new k1.p(str, j13, 4), cVar);
    }

    @Override // nb0.e
    public final Object g(String str, String str2, int i13, com.pinterest.encryption.dataEncryptionLibrary.a aVar, Base64.Decoder decoder, bl2.c cVar) {
        return p(this, str, str2, aVar, decoder, cVar);
    }

    @Override // nb0.e
    public final Object h(String str, String str2, bl2.c cVar) {
        return u(this, str, str2, cVar);
    }

    @Override // nb0.e
    public final Object i(String str, String str2, bl2.c cVar) {
        return w(new uq.j(str, str2, 1), cVar);
    }

    @Override // nb0.e
    public final Object j(String str, bl2.c cVar) {
        return o(this, str, cVar);
    }

    @Override // nb0.e
    public final Object k(String str, Set set, bl2.c cVar) {
        return v(this, str, set, cVar);
    }

    @Override // nb0.e
    public final Object l(String str, bl2.c cVar, boolean z13) {
        return w(new t4(str, z13, 6), cVar);
    }

    @Override // nb0.e
    public final Object m(String str, Set set, bl2.c cVar) {
        return w(new t80.r(19, str, set), cVar);
    }

    @Override // nb0.e
    public final Object n(String str, bl2.c cVar) {
        Object a13 = this.f90324a.a(new d6.j(new p(str, null), null), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(d6.g r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nb0.k
            if (r0 == 0) goto L13
            r0 = r7
            nb0.k r0 = (nb0.k) r0
            int r1 = r0.f90245u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90245u = r1
            goto L18
        L13:
            nb0.k r0 = new nb0.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f90243s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90245u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            nb0.t r6 = r0.f90242r
            ue.c.H(r7)     // Catch: java.lang.Exception -> L29
            goto L61
        L29:
            r7 = move-exception
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ue.c.H(r7)
            a6.h r7 = r5.f90324a     // Catch: java.lang.Exception -> L4d
            do2.i r7 = r7.getData()     // Catch: java.lang.Exception -> L4d
            androidx.slidingpanelayout.widget.c r2 = new androidx.slidingpanelayout.widget.c     // Catch: java.lang.Exception -> L4d
            r4 = 6
            r2.<init>(r7, r6, r4)     // Catch: java.lang.Exception -> L4d
            r0.f90242r = r5     // Catch: java.lang.Exception -> L4d
            r0.f90245u = r3     // Catch: java.lang.Exception -> L4d
            java.lang.Object r7 = lb.l0.h0(r2, r0)     // Catch: java.lang.Exception -> L4d
            if (r7 != r1) goto L61
            return r1
        L4d:
            r7 = move-exception
            r6 = r5
        L4f:
            r6.getClass()
            ob0.a r6 = ob0.b.f93978b
            r0 = 0
            if (r6 == 0) goto L62
            tb0.p r1 = tb0.p.DATASTORE_PREFERENCES
            tb0.h r6 = (tb0.h) r6
            java.lang.String r2 = "DataStore: error while reading the value"
            r6.q(r7, r2, r1)
            r7 = r0
        L61:
            return r7
        L62:
            java.lang.String r6 = "crashReporter"
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.r(d6.g, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(kotlin.jvm.functions.Function1 r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nb0.q
            if (r0 == 0) goto L13
            r0 = r7
            nb0.q r0 = (nb0.q) r0
            int r1 = r0.f90318u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90318u = r1
            goto L18
        L13:
            nb0.q r0 = new nb0.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f90316s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f90318u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            nb0.t r6 = r0.f90315r
            ue.c.H(r7)     // Catch: java.lang.Exception -> L2a
            goto L67
        L2a:
            r7 = move-exception
            goto L56
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ue.c.H(r7)
            a6.h r7 = r5.f90324a     // Catch: java.lang.Exception -> L54
            nb0.r r2 = new nb0.r     // Catch: java.lang.Exception -> L54
            r2.<init>(r6, r3)     // Catch: java.lang.Exception -> L54
            r0.f90315r = r5     // Catch: java.lang.Exception -> L54
            r0.f90318u = r4     // Catch: java.lang.Exception -> L54
            d6.j r6 = new d6.j     // Catch: java.lang.Exception -> L50
            r6.<init>(r2, r3)     // Catch: java.lang.Exception -> L50
            java.lang.Object r6 = r7.a(r6, r0)     // Catch: java.lang.Exception -> L50
            if (r6 != r1) goto L67
            return r1
        L4e:
            r7 = r6
            goto L52
        L50:
            r6 = move-exception
            goto L4e
        L52:
            r6 = r5
            goto L56
        L54:
            r7 = move-exception
            goto L52
        L56:
            r6.getClass()
            ob0.a r6 = ob0.b.f93978b
            if (r6 == 0) goto L6c
            tb0.p r0 = tb0.p.DATASTORE_PREFERENCES
            tb0.h r6 = (tb0.h) r6
            java.lang.String r1 = "DataStore: error while storing the value"
            r6.q(r7, r1, r0)
            r4 = 0
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L6c:
            java.lang.String r6 = "crashReporter"
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nb0.t.w(kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }
}
