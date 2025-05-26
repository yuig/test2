package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;

/* loaded from: classes3.dex */
public final class e extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public k f19956a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f19957b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f19958c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f19959d;

    /* renamed from: e, reason: collision with root package name */
    public int f19960e;

    /* renamed from: f, reason: collision with root package name */
    public int f19961f;

    /* renamed from: g, reason: collision with root package name */
    public final r9.d f19962g;

    /* renamed from: h, reason: collision with root package name */
    public int f19963h;

    /* renamed from: i, reason: collision with root package name */
    public int f19964i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19965j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19966k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19967l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19968m;

    public e(ViewPager2 viewPager2) {
        this.f19957b = viewPager2;
        p pVar = viewPager2.f19930j;
        this.f19958c = pVar;
        this.f19959d = (LinearLayoutManager) pVar.f19242n;
        this.f19962g = new r9.d();
        n();
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        int i14 = this.f19960e;
        boolean z13 = true;
        if (!(i14 == 1 && this.f19961f == 1) && i13 == 1) {
            o(false);
            return;
        }
        if ((i14 == 1 || i14 == 4) && i13 == 2) {
            if (this.f19966k) {
                m(2);
                this.f19965j = true;
                return;
            }
            return;
        }
        if (i14 != 1 && i14 != 4) {
            z13 = false;
        }
        r9.d dVar = this.f19962g;
        if (z13 && i13 == 0) {
            p();
            if (!this.f19966k) {
                int i15 = dVar.f106812a;
                if (i15 != -1) {
                    k(i15, 0.0f, 0);
                }
            } else if (dVar.f106814c == 0) {
                int i16 = this.f19963h;
                int i17 = dVar.f106812a;
                if (i16 != i17) {
                    l(i17);
                }
            }
            m(0);
            n();
        }
        if (this.f19960e == 2 && i13 == 0 && this.f19967l) {
            p();
            if (dVar.f106814c == 0) {
                int i18 = this.f19964i;
                int i19 = dVar.f106812a;
                if (i18 != i19) {
                    if (i19 == -1) {
                        i19 = 0;
                    }
                    l(i19);
                }
                m(0);
                n();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r6 < 0) == (r4.f19957b.f19927g.Q() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.recyclerview.widget.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f19966k = r5
            r4.p()
            boolean r0 = r4.f19965j
            r9.d r1 = r4.f19962g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L3c
            r4.f19965j = r3
            if (r7 > 0) goto L28
            if (r7 != 0) goto L30
            if (r6 >= 0) goto L18
            r6 = r5
            goto L19
        L18:
            r6 = r3
        L19:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f19957b
            androidx.viewpager2.widget.j r7 = r7.f19927g
            int r7 = r7.Q()
            if (r7 != r5) goto L25
            r7 = r5
            goto L26
        L25:
            r7 = r3
        L26:
            if (r6 != r7) goto L30
        L28:
            int r6 = r1.f106814c
            if (r6 == 0) goto L30
            int r6 = r1.f106812a
            int r6 = r6 + r5
            goto L32
        L30:
            int r6 = r1.f106812a
        L32:
            r4.f19964i = r6
            int r7 = r4.f19963h
            if (r7 == r6) goto L48
            r4.l(r6)
            goto L48
        L3c:
            int r6 = r4.f19960e
            if (r6 != 0) goto L48
            int r6 = r1.f106812a
            if (r6 != r2) goto L45
            r6 = r3
        L45:
            r4.l(r6)
        L48:
            int r6 = r1.f106812a
            if (r6 != r2) goto L4d
            r6 = r3
        L4d:
            float r7 = r1.f106813b
            int r0 = r1.f106814c
            r4.k(r6, r7, r0)
            int r6 = r1.f106812a
            int r7 = r4.f19964i
            if (r6 == r7) goto L5c
            if (r7 != r2) goto L6a
        L5c:
            int r6 = r1.f106814c
            if (r6 != 0) goto L6a
            int r6 = r4.f19961f
            if (r6 == r5) goto L6a
            r4.m(r3)
            r4.n()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.j(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void k(int i13, float f13, int i14) {
        k kVar = this.f19956a;
        if (kVar != null) {
            kVar.b(i13, f13, i14);
        }
    }

    public final void l(int i13) {
        k kVar = this.f19956a;
        if (kVar != null) {
            kVar.c(i13);
        }
    }

    public final void m(int i13) {
        if ((this.f19960e == 3 && this.f19961f == 0) || this.f19961f == i13) {
            return;
        }
        this.f19961f = i13;
        k kVar = this.f19956a;
        if (kVar != null) {
            kVar.a(i13);
        }
    }

    public final void n() {
        this.f19960e = 0;
        this.f19961f = 0;
        r9.d dVar = this.f19962g;
        dVar.f106812a = -1;
        dVar.f106813b = 0.0f;
        dVar.f106814c = 0;
        this.f19963h = -1;
        this.f19964i = -1;
        this.f19965j = false;
        this.f19966k = false;
        this.f19968m = false;
        this.f19967l = false;
    }

    public final void o(boolean z13) {
        this.f19968m = z13;
        this.f19960e = z13 ? 4 : 1;
        int i13 = this.f19964i;
        if (i13 != -1) {
            this.f19963h = i13;
            this.f19964i = -1;
        } else if (this.f19963h == -1) {
            this.f19963h = this.f19959d.k1();
        }
        m(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        r1 = r0.E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        if (r3 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        if (androidx.viewpager2.widget.a.a(r0.D(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        r1 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
    
        throw new java.lang.IllegalStateException(a.a.d("Page can only be offset by a positive amount, not by ", r2.f106814c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        if (r7[r4 - 1][1] >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0136, code lost:
    
        if (r0.E() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.p():void");
    }
}
