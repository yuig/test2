package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public final class g implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f19409a;

    /* renamed from: b, reason: collision with root package name */
    public int f19410b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19411c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f19412d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f19413e = null;

    public g(g1 g1Var) {
        this.f19409a = g1Var;
    }

    public final void a() {
        int i13 = this.f19410b;
        if (i13 == 0) {
            return;
        }
        g1 g1Var = this.f19409a;
        if (i13 == 1) {
            g1Var.j(this.f19411c, this.f19412d);
        } else if (i13 == 2) {
            g1Var.m(this.f19411c, this.f19412d);
        } else if (i13 == 3) {
            g1Var.p(this.f19411c, this.f19413e, this.f19412d);
        }
        this.f19413e = null;
        this.f19410b = 0;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void j(int i13, int i14) {
        int i15;
        if (this.f19410b == 1 && i13 >= (i15 = this.f19411c)) {
            int i16 = this.f19412d;
            if (i13 <= i15 + i16) {
                this.f19412d = i16 + i14;
                this.f19411c = Math.min(i13, i15);
                return;
            }
        }
        a();
        this.f19411c = i13;
        this.f19412d = i14;
        this.f19410b = 1;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void m(int i13, int i14) {
        int i15;
        if (this.f19410b == 2 && (i15 = this.f19411c) >= i13 && i15 <= i13 + i14) {
            this.f19412d += i14;
            this.f19411c = i13;
        } else {
            a();
            this.f19411c = i13;
            this.f19412d = i14;
            this.f19410b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.g1
    public final void p(int i13, Object obj, int i14) {
        int i15;
        if (this.f19410b == 3) {
            int i16 = this.f19411c;
            int i17 = this.f19412d;
            if (i13 <= i16 + i17 && (i15 = i13 + i14) >= i16 && this.f19413e == obj) {
                this.f19411c = Math.min(i13, i16);
                this.f19412d = Math.max(i17 + i16, i15) - this.f19411c;
                return;
            }
        }
        a();
        this.f19411c = i13;
        this.f19412d = i14;
        this.f19413e = obj;
        this.f19410b = 3;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void q(int i13, int i14) {
        a();
        this.f19409a.q(i13, i14);
    }
}
