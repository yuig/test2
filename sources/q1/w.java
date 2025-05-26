package q1;

import java.util.List;
import q3.b1;
import q3.c1;

/* loaded from: classes2.dex */
public final class w implements j, androidx.compose.foundation.lazy.layout.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102017a;

    /* renamed from: b, reason: collision with root package name */
    public final List f102018b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f102019c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.c f102020d;

    /* renamed from: e, reason: collision with root package name */
    public final u2.d f102021e;

    /* renamed from: f, reason: collision with root package name */
    public final n4.k f102022f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f102023g;

    /* renamed from: h, reason: collision with root package name */
    public final int f102024h;

    /* renamed from: i, reason: collision with root package name */
    public final long f102025i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f102026j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f102027k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.u f102028l;

    /* renamed from: m, reason: collision with root package name */
    public int f102029m;

    /* renamed from: n, reason: collision with root package name */
    public final int f102030n;

    /* renamed from: o, reason: collision with root package name */
    public final int f102031o;

    /* renamed from: p, reason: collision with root package name */
    public final int f102032p;

    /* renamed from: q, reason: collision with root package name */
    public int f102033q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f102034r;

    public w(int i13, List list, boolean z13, u2.c cVar, u2.d dVar, n4.k kVar, boolean z14, int i14, int i15, int i16, long j13, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.u uVar, long j14) {
        this.f102017a = i13;
        this.f102018b = list;
        this.f102019c = z13;
        this.f102020d = cVar;
        this.f102021e = dVar;
        this.f102022f = kVar;
        this.f102023g = z14;
        this.f102024h = i16;
        this.f102025i = j13;
        this.f102026j = obj;
        this.f102027k = obj2;
        this.f102028l = uVar;
        int size = list.size();
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            c1 c1Var = (c1) list.get(i19);
            boolean z15 = this.f102019c;
            i17 += z15 ? c1Var.f102179b : c1Var.f102178a;
            i18 = Math.max(i18, !z15 ? c1Var.f102179b : c1Var.f102178a);
        }
        this.f102030n = i17;
        int i23 = i17 + this.f102024h;
        this.f102031o = i23 >= 0 ? i23 : 0;
        this.f102032p = i18;
        this.f102034r = new int[this.f102018b.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int a() {
        return this.f102018b.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int b() {
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int c() {
        return this.f102031o;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object d(int i13) {
        return ((c1) this.f102018b.get(i13)).a();
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final long e(int i13) {
        int i14 = i13 * 2;
        int[] iArr = this.f102034r;
        return d7.b.a(iArr[i14], iArr[i14 + 1]);
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int f() {
        return 0;
    }

    public final void g(b1 b1Var) {
        if (this.f102033q == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List list = this.f102018b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) list.get(i13);
            boolean z13 = this.f102019c;
            if (z13) {
                int i14 = c1Var.f102179b;
            } else {
                int i15 = c1Var.f102178a;
            }
            long e13 = e(i13);
            this.f102028l.a(i13, this.f102026j);
            if (this.f102023g) {
                e13 = d7.b.a(z13 ? (int) (e13 >> 32) : (this.f102033q - ((int) (e13 >> 32))) - (z13 ? c1Var.f102179b : c1Var.f102178a), z13 ? (this.f102033q - ((int) (e13 & 4294967295L))) - (z13 ? c1Var.f102179b : c1Var.f102178a) : (int) (e13 & 4294967295L));
            }
            long c13 = n4.h.c(e13, this.f102025i);
            if (z13) {
                b1.j(b1Var, c1Var, c13);
            } else {
                b1.h(b1Var, c1Var, c13);
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final int getIndex() {
        return this.f102017a;
    }

    @Override // androidx.compose.foundation.lazy.layout.e0
    public final Object getKey() {
        return this.f102026j;
    }

    public final void h(int i13, int i14, int i15) {
        int i16;
        this.f102029m = i13;
        boolean z13 = this.f102019c;
        this.f102033q = z13 ? i15 : i14;
        List list = this.f102018b;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            c1 c1Var = (c1) list.get(i17);
            int i18 = i17 * 2;
            int[] iArr = this.f102034r;
            if (z13) {
                u2.c cVar = this.f102020d;
                if (cVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i18] = ((u2.g) cVar).a(c1Var.f102178a, i14, this.f102022f);
                iArr[i18 + 1] = i13;
                i16 = c1Var.f102179b;
            } else {
                iArr[i18] = i13;
                int i19 = i18 + 1;
                u2.d dVar = this.f102021e;
                if (dVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr[i19] = ((u2.h) dVar).a(c1Var.f102179b, i15);
                i16 = c1Var.f102178a;
            }
            i13 += i16;
        }
    }
}
