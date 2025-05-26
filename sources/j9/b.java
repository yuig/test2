package j9;

import d7.d0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f74952a;

    /* renamed from: b, reason: collision with root package name */
    public int f74953b;

    /* renamed from: c, reason: collision with root package name */
    public int f74954c;

    /* renamed from: d, reason: collision with root package name */
    public long f74955d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74956e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f74957f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f74958g;

    /* renamed from: h, reason: collision with root package name */
    public int f74959h;

    /* renamed from: i, reason: collision with root package name */
    public int f74960i;

    public b(d0 d0Var, d0 d0Var2, boolean z13) {
        this.f74958g = d0Var;
        this.f74957f = d0Var2;
        this.f74956e = z13;
        d0Var2.K(12);
        this.f74952a = d0Var2.C();
        d0Var.K(12);
        this.f74960i = d0Var.C();
        tb.f.A("first_chunk must be 1", d0Var.k() == 1);
        this.f74953b = -1;
    }

    public final boolean a() {
        int i13 = this.f74953b + 1;
        this.f74953b = i13;
        if (i13 == this.f74952a) {
            return false;
        }
        boolean z13 = this.f74956e;
        d0 d0Var = this.f74957f;
        this.f74955d = z13 ? d0Var.D() : d0Var.A();
        if (this.f74953b == this.f74959h) {
            d0 d0Var2 = this.f74958g;
            this.f74954c = d0Var2.C();
            d0Var2.L(4);
            int i14 = this.f74960i - 1;
            this.f74960i = i14;
            this.f74959h = i14 > 0 ? d0Var2.C() - 1 : -1;
        }
        return true;
    }
}
