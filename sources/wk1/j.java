package wk1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import sq0.f0;

/* loaded from: classes5.dex */
public final class j extends eb2.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f130160e;

    /* renamed from: f, reason: collision with root package name */
    public final int f130161f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f130162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f130163h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(wk1.k r2, int r3, int r4, int r5, int r6, sq0.f0 r7) {
        /*
            r1 = this;
            java.lang.String r0 = "dataSourceProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r3 = r3 / 2
            int r6 = r6 / 2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r1.f130163h = r2
            r1.<init>(r3, r4, r3, r5)
            r1.f130160e = r6
            r1.f130161f = r6
            r1.f130162g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk1.j.<init>(wk1.k, int, int, int, int, sq0.f0):void");
    }

    @Override // eb2.a
    public final int a(View view, int i13) {
        sq0.o r13;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f130163h.A4(i13)) {
            return 0;
        }
        f0 f0Var = this.f130162g;
        if (f0Var.a() == 0 || (r13 = f0Var.r(i13)) == null || !((nr0.j) r13.f115027a).e(r13.f115028b)) {
            return 0;
        }
        return super.a(view, i13);
    }

    @Override // eb2.a
    public final int b(View view, int i13) {
        sq0.o r13;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f130163h.A4(i13)) {
            return 0;
        }
        f0 f0Var = this.f130162g;
        if (f0Var.a() == 0 || (r13 = f0Var.r(i13)) == null) {
            return 0;
        }
        nr0.j jVar = (nr0.j) r13.f115027a;
        int i14 = r13.f115028b;
        if (jVar.c3(i14)) {
            return -this.f130160e;
        }
        if (jVar.k2(i14)) {
            return super.b(view, i13);
        }
        return 0;
    }

    @Override // eb2.a
    public final int c(View view, int i13) {
        sq0.o r13;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f130163h.A4(i13)) {
            return 0;
        }
        f0 f0Var = this.f130162g;
        if (f0Var.a() == 0 || (r13 = f0Var.r(i13)) == null) {
            return 0;
        }
        nr0.j jVar = (nr0.j) r13.f115027a;
        int i14 = r13.f115028b;
        if (jVar.c3(i14)) {
            return -this.f130161f;
        }
        if (jVar.f3(i14)) {
            return super.c(view, i13);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (((androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4).f19156f == ((androidx.recyclerview.widget.GridLayoutManager) r5).F) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0047, code lost:
    
        if (((androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams) r4).getF19192f() != false) goto L12;
     */
    @Override // eb2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(android.view.View r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            wk1.k r1 = r8.f130163h
            boolean r2 = r1.A4(r10)
            r3 = 0
            if (r2 == 0) goto Lf
            return r3
        Lf:
            sq0.f0 r2 = r8.f130162g
            int r4 = r2.a()
            if (r4 != 0) goto L18
            return r3
        L18:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            boolean r5 = r4 instanceof androidx.recyclerview.widget.GridLayoutManager.LayoutParams
            r6 = 1
            if (r5 == 0) goto L3d
            androidx.recyclerview.widget.v0 r5 = r1.n8()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"
            androidx.recyclerview.widget.l2 r5 = r5.f19650a
            kotlin.jvm.internal.Intrinsics.g(r5, r7)
            androidx.recyclerview.widget.GridLayoutManager r5 = (androidx.recyclerview.widget.GridLayoutManager) r5
            int r5 = r5.F
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4
            int r4 = r4.f19156f
            if (r4 != r5) goto L3b
        L39:
            r4 = r6
            goto L4a
        L3b:
            r4 = r3
            goto L4a
        L3d:
            boolean r5 = r4 instanceof androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams
            if (r5 == 0) goto L3b
            androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager.LayoutParams) r4
            boolean r4 = r4.getF19192f()
            if (r4 == 0) goto L3b
            goto L39
        L4a:
            if (r4 == 0) goto L4e
            if (r10 == 0) goto L7f
        L4e:
            if (r4 != 0) goto L7e
            int r4 = wk1.k.L0
            int r4 = r1.p8()
            if (r10 >= r4) goto L59
            goto L7e
        L59:
            int r1 = r1.getT0()
            sq0.o r4 = r2.r(r10)
            if (r4 == 0) goto L7e
            sq0.e0 r5 = r4.f115027a
            nr0.j r5 = (nr0.j) r5
            int r4 = r4.f115028b
            if (r4 <= r1) goto L6c
            goto L7e
        L6c:
            boolean r7 = r5.n0(r3)
            if (r7 == 0) goto L75
            if (r10 != 0) goto L7e
            goto L7f
        L75:
            if (r4 < r1) goto L7f
            boolean r1 = r5.n0(r3)
            if (r1 == 0) goto L7e
            goto L7f
        L7e:
            r6 = r3
        L7f:
            sq0.o r10 = r2.r(r10)
            if (r10 == 0) goto L98
            sq0.e0 r1 = r10.f115027a
            nr0.j r1 = (nr0.j) r1
            if (r6 == 0) goto L98
            int r10 = r10.f115028b
            boolean r10 = r1.h(r10)
            if (r10 == 0) goto L98
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r3 = r8.f58247b
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wk1.j.d(android.view.View, int):int");
    }
}
