package a2;

import b4.l0;
import b4.m0;
import b4.o;
import b4.q;
import b4.q0;
import java.util.List;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import rl2.g0;
import w1.g1;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public b4.g f388a;

    /* renamed from: b, reason: collision with root package name */
    public q0 f389b;

    /* renamed from: c, reason: collision with root package name */
    public g4.d f390c;

    /* renamed from: d, reason: collision with root package name */
    public int f391d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f392e;

    /* renamed from: f, reason: collision with root package name */
    public int f393f;

    /* renamed from: g, reason: collision with root package name */
    public int f394g;

    /* renamed from: h, reason: collision with root package name */
    public List f395h;

    /* renamed from: i, reason: collision with root package name */
    public b f396i;

    /* renamed from: k, reason: collision with root package name */
    public n4.b f398k;

    /* renamed from: l, reason: collision with root package name */
    public q f399l;

    /* renamed from: m, reason: collision with root package name */
    public n4.k f400m;

    /* renamed from: n, reason: collision with root package name */
    public m0 f401n;

    /* renamed from: j, reason: collision with root package name */
    public long f397j = a.f376a;

    /* renamed from: o, reason: collision with root package name */
    public int f402o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f403p = -1;

    public d(b4.g gVar, q0 q0Var, g4.d dVar, int i13, boolean z13, int i14, int i15, List list) {
        this.f388a = gVar;
        this.f389b = q0Var;
        this.f390c = dVar;
        this.f391d = i13;
        this.f392e = z13;
        this.f393f = i14;
        this.f394g = i15;
        this.f395h = list;
    }

    public final int a(int i13, n4.k kVar) {
        int i14 = this.f402o;
        int i15 = this.f403p;
        if (i13 == i14 && i14 != -1) {
            return i15;
        }
        int o13 = g1.o(b(bs1.c.a(0, i13, 0, Integer.MAX_VALUE), kVar).f21629e);
        this.f402o = i13;
        this.f403p = o13;
        return o13;
    }

    public final o b(long j13, n4.k kVar) {
        q d2 = d(kVar);
        long r13 = r.r(j13, this.f392e, this.f391d, d2.b());
        boolean z13 = this.f392e;
        int i13 = this.f391d;
        int i14 = this.f393f;
        int i15 = 1;
        if (z13 || !s0.B(i13, 2)) {
            if (i14 < 1) {
                i14 = 1;
            }
            i15 = i14;
        }
        return new o(d2, r13, i15, s0.B(this.f391d, 2));
    }

    public final void c(n4.b bVar) {
        long j13;
        n4.b bVar2 = this.f398k;
        if (bVar != null) {
            int i13 = a.f377b;
            j13 = a.a(bVar.b(), bVar.j0());
        } else {
            j13 = a.f376a;
        }
        if (bVar2 == null) {
            this.f398k = bVar;
            this.f397j = j13;
        } else if (bVar == null || this.f397j != j13) {
            this.f398k = bVar;
            this.f397j = j13;
            this.f399l = null;
            this.f401n = null;
            this.f403p = -1;
            this.f402o = -1;
        }
    }

    public final q d(n4.k kVar) {
        q qVar = this.f399l;
        if (qVar == null || kVar != this.f400m || qVar.a()) {
            this.f400m = kVar;
            b4.g gVar = this.f388a;
            q0 f03 = g0.f0(this.f389b, kVar);
            n4.b bVar = this.f398k;
            Intrinsics.f(bVar);
            g4.d dVar = this.f390c;
            List list = this.f395h;
            if (list == null) {
                list = kotlin.collections.q0.f80391a;
            }
            qVar = new q(gVar, f03, list, bVar, dVar);
        }
        this.f399l = qVar;
        return qVar;
    }

    public final m0 e(n4.k kVar, long j13, o oVar) {
        float min = Math.min(oVar.f21625a.b(), oVar.f21628d);
        b4.g gVar = this.f388a;
        q0 q0Var = this.f389b;
        List list = this.f395h;
        if (list == null) {
            list = kotlin.collections.q0.f80391a;
        }
        int i13 = this.f393f;
        boolean z13 = this.f392e;
        int i14 = this.f391d;
        n4.b bVar = this.f398k;
        Intrinsics.f(bVar);
        return new m0(new l0(gVar, q0Var, list, i13, z13, i14, bVar, kVar, this.f390c, j13), oVar, bs1.c.G(j13, lb.l0.d(g1.o(min), g1.o(oVar.f21629e))));
    }
}
