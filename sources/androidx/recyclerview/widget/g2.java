package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public y1 f19419a = null;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19420b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public long f19421c = 120;

    /* renamed from: d, reason: collision with root package name */
    public long f19422d = 120;

    /* renamed from: e, reason: collision with root package name */
    public long f19423e = 250;

    /* renamed from: f, reason: collision with root package name */
    public long f19424f = 250;

    public static int e(y2 y2Var) {
        int i13 = y2Var.f19726j;
        int i14 = i13 & 14;
        if (y2Var.t()) {
            return 4;
        }
        if ((i13 & 4) != 0) {
            return i14;
        }
        int i15 = y2Var.f19720d;
        int j13 = y2Var.j();
        return (i15 == -1 || j13 == -1 || i15 == j13) ? i14 : i14 | 2048;
    }

    public abstract boolean a(y2 y2Var, f2 f2Var, f2 f2Var2);

    public abstract boolean b(y2 y2Var, y2 y2Var2, f2 f2Var, f2 f2Var2);

    public abstract boolean c(y2 y2Var, f2 f2Var, f2 f2Var2);

    public abstract boolean d(y2 y2Var, f2 f2Var, f2 f2Var2);

    public abstract boolean f(y2 y2Var);

    public boolean g(y2 y2Var, List list) {
        return f(y2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.recyclerview.widget.y2 r10) {
        /*
            r9 = this;
            androidx.recyclerview.widget.y1 r0 = r9.f19419a
            if (r0 == 0) goto L94
            r1 = 1
            r10.a0(r1)
            androidx.recyclerview.widget.y2 r2 = r10.f19724h
            r3 = 0
            if (r2 == 0) goto L13
            androidx.recyclerview.widget.y2 r2 = r10.f19725i
            if (r2 != 0) goto L13
            r10.f19724h = r3
        L13:
            r10.f19725i = r3
            int r2 = r10.f19726j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L94
        L1d:
            java.lang.Object r0 = r0.f19715a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.e3()
            androidx.recyclerview.widget.i r2 = r0.f19226f
            androidx.recyclerview.widget.h r3 = r2.f19442b
            androidx.recyclerview.widget.y1 r4 = r2.f19441a
            int r5 = r2.f19444d
            r6 = 0
            android.view.View r7 = r10.f19717a
            if (r5 != r1) goto L3f
            android.view.View r1 = r2.f19445e
            if (r1 != r7) goto L37
        L35:
            r1 = r6
            goto L6a
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L3f:
            r8 = 2
            if (r5 == r8) goto L8c
            r2.f19444d = r8     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r4.f19715a     // Catch: java.lang.Throwable -> L55
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5     // Catch: java.lang.Throwable -> L55
            int r5 = r5.indexOfChild(r7)     // Catch: java.lang.Throwable -> L55
            r8 = -1
            if (r5 != r8) goto L57
            r2.l(r7)     // Catch: java.lang.Throwable -> L55
        L52:
            r2.f19444d = r6
            goto L6a
        L55:
            r10 = move-exception
            goto L89
        L57:
            boolean r8 = r3.d(r5)     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L67
            r3.f(r5)     // Catch: java.lang.Throwable -> L55
            r2.l(r7)     // Catch: java.lang.Throwable -> L55
            r4.o(r5)     // Catch: java.lang.Throwable -> L55
            goto L52
        L67:
            r2.f19444d = r6
            goto L35
        L6a:
            if (r1 == 0) goto L78
            androidx.recyclerview.widget.y2 r2 = androidx.recyclerview.widget.RecyclerView.w1(r7)
            androidx.recyclerview.widget.q2 r3 = r0.f19220c
            r3.p(r2)
            r3.m(r2)
        L78:
            r2 = r1 ^ 1
            r0.g3(r2)
            if (r1 != 0) goto L94
            boolean r10 = r10.L()
            if (r10 == 0) goto L94
            r0.removeDetachedView(r7, r6)
            goto L94
        L89:
            r2.f19444d = r6
            throw r10
        L8c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g2.h(androidx.recyclerview.widget.y2):void");
    }

    public final void i() {
        ArrayList arrayList = this.f19420b;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((yq0.s) arrayList.get(i13)).a();
        }
        arrayList.clear();
    }

    public abstract void j(y2 y2Var);

    public abstract void k();

    public abstract boolean l();

    public abstract void m();
}
