package n7;

import a7.b1;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f89406a;

    /* renamed from: b, reason: collision with root package name */
    public int f89407b;

    /* renamed from: c, reason: collision with root package name */
    public long f89408c;

    /* renamed from: d, reason: collision with root package name */
    public final g8.e0 f89409d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89410e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f89411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f89412g;

    public d0(e0 e0Var, String str, int i13, g8.e0 e0Var2) {
        this.f89412g = e0Var;
        this.f89406a = str;
        this.f89407b = i13;
        this.f89408c = e0Var2 == null ? -1L : e0Var2.f64236d;
        if (e0Var2 == null || !e0Var2.b()) {
            return;
        }
        this.f89409d = e0Var2;
    }

    public final boolean c(int i13, g8.e0 e0Var) {
        if (e0Var == null) {
            return i13 == this.f89407b;
        }
        long j13 = e0Var.f64236d;
        g8.e0 e0Var2 = this.f89409d;
        return e0Var2 == null ? !e0Var.b() && j13 == this.f89408c : j13 == e0Var2.f64236d && e0Var.f64234b == e0Var2.f64234b && e0Var.f64235c == e0Var2.f64235c;
    }

    public final boolean d(b bVar) {
        g8.e0 e0Var = bVar.f89381d;
        if (e0Var == null) {
            return this.f89407b != bVar.f89380c;
        }
        long j13 = this.f89408c;
        if (j13 == -1) {
            return false;
        }
        if (e0Var.f64236d > j13) {
            return true;
        }
        g8.e0 e0Var2 = this.f89409d;
        if (e0Var2 == null) {
            return false;
        }
        b1 b1Var = bVar.f89379b;
        int b13 = b1Var.b(e0Var.f64233a);
        int b14 = b1Var.b(e0Var2.f64233a);
        if (e0Var.f64236d < e0Var2.f64236d || b13 < b14) {
            return false;
        }
        if (b13 > b14) {
            return true;
        }
        boolean b15 = e0Var.b();
        int i13 = e0Var2.f64234b;
        if (!b15) {
            int i14 = e0Var.f64237e;
            return i14 == -1 || i14 > i13;
        }
        int i15 = e0Var.f64234b;
        if (i15 > i13) {
            return true;
        }
        if (i15 == i13) {
            if (e0Var.f64235c > e0Var2.f64235c) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i13, g8.e0 e0Var) {
        if (this.f89408c == -1 && i13 == this.f89407b && e0Var != null) {
            long a13 = e0.a(this.f89412g);
            long j13 = e0Var.f64236d;
            if (j13 >= a13) {
                this.f89408c = j13;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.p()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(a7.b1 r7, a7.b1 r8) {
        /*
            r6 = this;
            int r0 = r6.f89407b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.p()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            n7.e0 r1 = r6.f89412g
            a7.a1 r4 = r1.f89420a
            r7.o(r0, r4)
            a7.a1 r0 = r1.f89420a
            int r4 = r0.f942n
        L1c:
            int r5 = r0.f943o
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            a7.z0 r7 = r1.f89421b
            a7.z0 r7 = r8.g(r5, r7, r2)
            int r0 = r7.f1253c
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = r3
        L37:
            r6.f89407b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            g8.e0 r7 = r6.f89409d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f64233a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4b
            r2 = r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.d0.f(a7.b1, a7.b1):boolean");
    }
}
