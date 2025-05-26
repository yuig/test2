package k8;

import a7.c1;
import android.text.TextUtils;
import d7.n0;
import java.util.Objects;
import pk.d3;
import pk.j0;
import pk.s2;
import pk.t2;

/* loaded from: classes.dex */
public final class f extends o implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f78506e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f78507f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78508g;

    /* renamed from: h, reason: collision with root package name */
    public final j f78509h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78510i;

    /* renamed from: j, reason: collision with root package name */
    public final int f78511j;

    /* renamed from: k, reason: collision with root package name */
    public final int f78512k;

    /* renamed from: l, reason: collision with root package name */
    public final int f78513l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f78514m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f78515n;

    /* renamed from: o, reason: collision with root package name */
    public final int f78516o;

    /* renamed from: p, reason: collision with root package name */
    public final int f78517p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f78518q;

    /* renamed from: r, reason: collision with root package name */
    public final int f78519r;

    /* renamed from: s, reason: collision with root package name */
    public final int f78520s;

    /* renamed from: t, reason: collision with root package name */
    public final int f78521t;

    /* renamed from: u, reason: collision with root package name */
    public final int f78522u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f78523v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f78524w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f78525x;

    public f(int i13, c1 c1Var, int i14, j jVar, int i15, boolean z13, e eVar, int i16) {
        super(i13, i14, c1Var);
        int i17;
        int i18;
        int i19;
        boolean z14;
        this.f78509h = jVar;
        int i23 = jVar.P ? 24 : 16;
        int i24 = 1;
        int i25 = 0;
        this.f78514m = jVar.L && (i16 & i23) != 0;
        this.f78508g = q.s(this.f78545d.f18754d);
        this.f78510i = m7.h.p(i15, false);
        int i26 = 0;
        while (true) {
            pk.c1 c1Var2 = jVar.f1042p;
            i17 = Integer.MAX_VALUE;
            if (i26 >= c1Var2.size()) {
                i18 = 0;
                i26 = Integer.MAX_VALUE;
                break;
            } else {
                i18 = q.n(this.f78545d, (String) c1Var2.get(i26), false);
                if (i18 > 0) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        this.f78512k = i26;
        this.f78511j = i18;
        this.f78513l = q.j(this.f78545d.f18756f, jVar.f1043q);
        androidx.media3.common.b bVar = this.f78545d;
        int i27 = bVar.f18756f;
        this.f78515n = i27 == 0 || (i27 & 1) != 0;
        this.f78518q = (bVar.f18755e & 1) != 0;
        this.f78525x = q.l(bVar);
        androidx.media3.common.b bVar2 = this.f78545d;
        int i28 = bVar2.E;
        this.f78519r = i28;
        this.f78520s = bVar2.F;
        int i29 = bVar2.f18760j;
        this.f78521t = i29;
        this.f78507f = (i29 == -1 || i29 <= jVar.f1045s) && (i28 == -1 || i28 <= jVar.f1044r) && eVar.apply(bVar2);
        String[] J2 = n0.J();
        int i33 = 0;
        while (true) {
            if (i33 >= J2.length) {
                i19 = 0;
                i33 = Integer.MAX_VALUE;
                break;
            } else {
                i19 = q.n(this.f78545d, J2[i33], false);
                if (i19 > 0) {
                    break;
                } else {
                    i33++;
                }
            }
        }
        this.f78516o = i33;
        this.f78517p = i19;
        int i34 = 0;
        while (true) {
            pk.c1 c1Var3 = jVar.f1046t;
            if (i34 < c1Var3.size()) {
                String str = this.f78545d.f18765o;
                if (str != null && str.equals(c1Var3.get(i34))) {
                    i17 = i34;
                    break;
                }
                i34++;
            } else {
                break;
            }
        }
        this.f78522u = i17;
        this.f78523v = m7.h.i(i15) == 128;
        this.f78524w = m7.h.k(i15) == 64;
        j jVar2 = this.f78509h;
        if (m7.h.p(i15, jVar2.R) && ((z14 = this.f78507f) || jVar2.K)) {
            jVar2.f1047u.getClass();
            if (m7.h.p(i15, false) && z14 && this.f78545d.f18760j != -1 && !jVar2.C && !jVar2.B && ((jVar2.T || !z13) && (i23 & i15) != 0)) {
                i24 = 2;
            }
            i25 = i24;
        }
        this.f78506e = i25;
    }

    @Override // k8.o
    public final int a() {
        return this.f78506e;
    }

    @Override // k8.o
    public final boolean b(o oVar) {
        int i13;
        String str;
        int i14;
        f fVar = (f) oVar;
        j jVar = this.f78509h;
        boolean z13 = jVar.N;
        androidx.media3.common.b bVar = fVar.f78545d;
        androidx.media3.common.b bVar2 = this.f78545d;
        if ((z13 || ((i14 = bVar2.E) != -1 && i14 == bVar.E)) && ((this.f78514m || ((str = bVar2.f18765o) != null && TextUtils.equals(str, bVar.f18765o))) && (jVar.M || ((i13 = bVar2.F) != -1 && i13 == bVar.F)))) {
            if (!jVar.O) {
                if (this.f78523v != fVar.f78523v || this.f78524w != fVar.f78524w) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z13 = this.f78510i;
        boolean z14 = this.f78507f;
        t2 a13 = (z14 && z13) ? q.f78564j : q.f78564j.a();
        j0 c13 = j0.f100432a.c(z13, fVar.f78510i);
        Integer valueOf = Integer.valueOf(this.f78512k);
        Integer valueOf2 = Integer.valueOf(fVar.f78512k);
        s2.f100480a.getClass();
        d3 d3Var = d3.f100381a;
        j0 b13 = c13.b(valueOf, valueOf2, d3Var).a(this.f78511j, fVar.f78511j).a(this.f78513l, fVar.f78513l).c(this.f78518q, fVar.f78518q).c(this.f78515n, fVar.f78515n).b(Integer.valueOf(this.f78516o), Integer.valueOf(fVar.f78516o), d3Var).a(this.f78517p, fVar.f78517p).c(z14, fVar.f78507f).b(Integer.valueOf(this.f78522u), Integer.valueOf(fVar.f78522u), d3Var);
        boolean z15 = this.f78509h.B;
        int i13 = this.f78521t;
        int i14 = fVar.f78521t;
        if (z15) {
            b13 = b13.b(Integer.valueOf(i13), Integer.valueOf(i14), q.f78564j.a());
        }
        j0 b14 = b13.c(this.f78523v, fVar.f78523v).c(this.f78524w, fVar.f78524w).c(this.f78525x, fVar.f78525x).b(Integer.valueOf(this.f78519r), Integer.valueOf(fVar.f78519r), a13).b(Integer.valueOf(this.f78520s), Integer.valueOf(fVar.f78520s), a13);
        if (Objects.equals(this.f78508g, fVar.f78508g)) {
            b14 = b14.b(Integer.valueOf(i13), Integer.valueOf(i14), a13);
        }
        return b14.e();
    }
}
