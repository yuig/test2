package r1;

import java.util.List;
import q3.c1;

/* loaded from: classes2.dex */
public final class b0 implements m, androidx.compose.foundation.lazy.layout.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f105850a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f105851b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f105852c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105853d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105854e;

    /* renamed from: f, reason: collision with root package name */
    public final n4.k f105855f;

    /* renamed from: g, reason: collision with root package name */
    public final List f105856g;

    /* renamed from: h, reason: collision with root package name */
    public final long f105857h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f105858i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.u f105859j;

    /* renamed from: k, reason: collision with root package name */
    public final int f105860k;

    /* renamed from: l, reason: collision with root package name */
    public final int f105861l;

    /* renamed from: m, reason: collision with root package name */
    public final int f105862m;

    /* renamed from: n, reason: collision with root package name */
    public final int f105863n;

    /* renamed from: o, reason: collision with root package name */
    public int f105864o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public final long f105865p;

    /* renamed from: q, reason: collision with root package name */
    public long f105866q;

    /* renamed from: r, reason: collision with root package name */
    public int f105867r;

    /* renamed from: s, reason: collision with root package name */
    public int f105868s;

    public b0(int i13, Object obj, boolean z13, int i14, int i15, boolean z14, n4.k kVar, int i16, int i17, List list, long j13, Object obj2, androidx.compose.foundation.lazy.layout.u uVar, long j14, int i18, int i19) {
        this.f105850a = i13;
        this.f105851b = obj;
        this.f105852c = z13;
        this.f105853d = i14;
        this.f105854e = z14;
        this.f105855f = kVar;
        this.f105856g = list;
        this.f105857h = j13;
        this.f105858i = obj2;
        this.f105859j = uVar;
        this.f105860k = i18;
        this.f105861l = i19;
        int size = list.size();
        int i23 = 0;
        for (int i24 = 0; i24 < size; i24++) {
            c1 c1Var = (c1) list.get(i24);
            i23 = Math.max(i23, this.f105852c ? c1Var.f102179b : c1Var.f102178a);
        }
        this.f105862m = i23;
        int i25 = i23 + i15;
        this.f105863n = i25 >= 0 ? i25 : 0;
        this.f105865p = this.f105852c ? lb.l0.d(this.f105853d, i23) : lb.l0.d(i23, this.f105853d);
        this.f105866q = 0L;
        this.f105867r = -1;
        this.f105868s = -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int a() {
        return this.f105856g.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int b() {
        return this.f105861l;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int c() {
        return this.f105863n;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object d(int i13) {
        return ((c1) this.f105856g.get(i13)).a();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final long e(int i13) {
        return this.f105866q;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int f() {
        return this.f105860k;
    }

    public final void g(int i13, int i14, int i15, int i16) {
        h(i13, i14, i15, i16, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int getIndex() {
        return this.f105850a;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object getKey() {
        return this.f105851b;
    }

    public final void h(int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z13 = this.f105852c;
        this.f105864o = z13 ? i16 : i15;
        if (!z13) {
            i15 = i16;
        }
        if (z13 && this.f105855f == n4.k.Rtl) {
            i14 = (i15 - i14) - this.f105853d;
        }
        this.f105866q = z13 ? d7.b.a(i14, i13) : d7.b.a(i13, i14);
        this.f105867r = i17;
        this.f105868s = i18;
    }
}
