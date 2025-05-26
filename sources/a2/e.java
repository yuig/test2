package a2;

import b4.q0;
import b4.u;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import lb.l0;
import rl2.g0;
import w1.g1;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f404a;

    /* renamed from: b, reason: collision with root package name */
    public q0 f405b;

    /* renamed from: c, reason: collision with root package name */
    public g4.d f406c;

    /* renamed from: d, reason: collision with root package name */
    public int f407d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f408e;

    /* renamed from: f, reason: collision with root package name */
    public int f409f;

    /* renamed from: g, reason: collision with root package name */
    public int f410g;

    /* renamed from: i, reason: collision with root package name */
    public n4.b f412i;

    /* renamed from: j, reason: collision with root package name */
    public b4.b f413j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f414k;

    /* renamed from: m, reason: collision with root package name */
    public b f416m;

    /* renamed from: n, reason: collision with root package name */
    public u f417n;

    /* renamed from: o, reason: collision with root package name */
    public n4.k f418o;

    /* renamed from: h, reason: collision with root package name */
    public long f411h = a.f376a;

    /* renamed from: l, reason: collision with root package name */
    public long f415l = l0.d(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f419p = bs1.c.N(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f420q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f421r = -1;

    public e(String str, q0 q0Var, g4.d dVar, int i13, boolean z13, int i14, int i15) {
        this.f404a = str;
        this.f405b = q0Var;
        this.f406c = dVar;
        this.f407d = i13;
        this.f408e = z13;
        this.f409f = i14;
        this.f410g = i15;
    }

    public final int a(int i13, n4.k kVar) {
        int i14 = this.f420q;
        int i15 = this.f421r;
        if (i13 == i14 && i14 != -1) {
            return i15;
        }
        int o13 = g1.o(b(bs1.c.a(0, i13, 0, Integer.MAX_VALUE), kVar).b());
        this.f420q = i13;
        this.f421r = o13;
        return o13;
    }

    public final b4.b b(long j13, n4.k kVar) {
        int i13;
        u d2 = d(kVar);
        long r13 = r.r(j13, this.f408e, this.f407d, d2.b());
        boolean z13 = this.f408e;
        int i14 = this.f407d;
        int i15 = this.f409f;
        if (z13 || !s0.B(i14, 2)) {
            if (i15 < 1) {
                i15 = 1;
            }
            i13 = i15;
        } else {
            i13 = 1;
        }
        return new b4.b((j4.d) d2, i13, s0.B(this.f407d, 2), r13);
    }

    public final void c(n4.b bVar) {
        long j13;
        n4.b bVar2 = this.f412i;
        if (bVar != null) {
            int i13 = a.f377b;
            j13 = a.a(bVar.b(), bVar.j0());
        } else {
            j13 = a.f376a;
        }
        if (bVar2 == null) {
            this.f412i = bVar;
            this.f411h = j13;
            return;
        }
        if (bVar == null || this.f411h != j13) {
            this.f412i = bVar;
            this.f411h = j13;
            this.f413j = null;
            this.f417n = null;
            this.f418o = null;
            this.f420q = -1;
            this.f421r = -1;
            this.f419p = bs1.c.N(0, 0, 0, 0);
            this.f415l = l0.d(0, 0);
            this.f414k = false;
        }
    }

    public final u d(n4.k kVar) {
        u uVar = this.f417n;
        if (uVar == null || kVar != this.f418o || uVar.a()) {
            this.f418o = kVar;
            String str = this.f404a;
            q0 f03 = g0.f0(this.f405b, kVar);
            n4.b bVar = this.f412i;
            Intrinsics.f(bVar);
            g4.d dVar = this.f406c;
            kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
            uVar = new j4.d(f03, dVar, bVar, str, q0Var, q0Var);
        }
        this.f417n = uVar;
        return uVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb3.append(this.f413j != null ? "<paragraph>" : "null");
        sb3.append(", lastDensity=");
        long j13 = this.f411h;
        int i13 = a.f377b;
        sb3.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j13 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j13 & 4294967295L)) + ')'));
        sb3.append(')');
        return sb3.toString();
    }
}
