package m3;

import androidx.activity.a0;
import ao2.j0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public g f85726a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f85727b = new a0(this, 8);

    /* renamed from: c, reason: collision with root package name */
    public j0 f85728c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, bl2.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof m3.b
            if (r0 == 0) goto L14
            r0 = r12
            m3.b r0 = (m3.b) r0
            int r1 = r0.f85722t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f85722t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            m3.b r0 = new m3.b
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f85720r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f85722t
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ue.c.H(r12)
            goto L51
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            ue.c.H(r12)
            m3.g r12 = r7.f85726a
            r1 = 0
            if (r12 == 0) goto L44
            boolean r3 = r12.f120054m
            if (r3 == 0) goto L44
            s3.j2 r12 = kh2.b0.g0(r12)
            r1 = r12
            m3.g r1 = (m3.g) r1
        L44:
            if (r1 == 0) goto L58
            r6.f85722t = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.y0(r2, r4, r6)
            if (r12 != r0) goto L51
            return r0
        L51:
            n4.o r12 = (n4.o) r12
            long r8 = r12.j()
            goto L5a
        L58:
            r8 = 0
        L5a:
            n4.o r8 = n4.o.a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.d.a(long, long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r6, bl2.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m3.c
            if (r0 == 0) goto L13
            r0 = r8
            m3.c r0 = (m3.c) r0
            int r1 = r0.f85725t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85725t = r1
            goto L18
        L13:
            m3.c r0 = new m3.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f85723r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f85725t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            ue.c.H(r8)
            m3.g r8 = r5.f85726a
            r2 = 0
            if (r8 == 0) goto L42
            boolean r4 = r8.f120054m
            if (r4 == 0) goto L42
            s3.j2 r8 = kh2.b0.g0(r8)
            r2 = r8
            m3.g r2 = (m3.g) r2
        L42:
            if (r2 == 0) goto L54
            r0.f85725t = r3
            java.lang.Object r8 = r2.L(r6, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            n4.o r8 = (n4.o) r8
            long r6 = r8.j()
            goto L56
        L54:
            r6 = 0
        L56:
            n4.o r6 = n4.o.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.d.b(long, bl2.c):java.lang.Object");
    }

    public final j0 c() {
        j0 j0Var = (j0) this.f85727b.invoke();
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
