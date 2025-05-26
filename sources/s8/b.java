package s8;

import d7.d0;
import d7.n0;
import l9.j;
import l9.m;
import org.chromium.net.y;
import q8.s;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f111416a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.d f111417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111418c;

    /* renamed from: d, reason: collision with root package name */
    public final j f111419d;

    /* renamed from: e, reason: collision with root package name */
    public int f111420e;

    /* renamed from: f, reason: collision with root package name */
    public u f111421f;

    /* renamed from: g, reason: collision with root package name */
    public c f111422g;

    /* renamed from: h, reason: collision with root package name */
    public long f111423h;

    /* renamed from: i, reason: collision with root package name */
    public e[] f111424i;

    /* renamed from: j, reason: collision with root package name */
    public long f111425j;

    /* renamed from: k, reason: collision with root package name */
    public e f111426k;

    /* renamed from: l, reason: collision with root package name */
    public int f111427l;

    /* renamed from: m, reason: collision with root package name */
    public long f111428m;

    /* renamed from: n, reason: collision with root package name */
    public long f111429n;

    /* renamed from: o, reason: collision with root package name */
    public int f111430o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f111431p;

    public b(int i13, j jVar) {
        this.f111419d = jVar;
        this.f111418c = (i13 & 1) == 0;
        this.f111416a = new d0(12);
        this.f111417b = new q8.d();
        this.f111421f = new y();
        this.f111424i = new e[0];
        this.f111428m = -1L;
        this.f111429n = -1L;
        this.f111427l = -1;
        this.f111423h = -9223372036854775807L;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f111425j = -1L;
        this.f111426k = null;
        for (e eVar : this.f111424i) {
            if (eVar.f111451k == 0) {
                eVar.f111449i = 0;
            } else {
                eVar.f111449i = eVar.f111454n[n0.e(eVar.f111453m, j13, true)];
            }
        }
        if (j13 != 0) {
            this.f111420e = 6;
        } else if (this.f111424i.length == 0) {
            this.f111420e = 0;
        } else {
            this.f111420e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r20, q8.c0 r21) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.b.d(q8.t, q8.c0):int");
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f111420e = 0;
        if (this.f111418c) {
            uVar = new m(uVar, this.f111419d);
        }
        this.f111421f = uVar;
        this.f111425j = -1L;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        d0 d0Var = this.f111416a;
        tVar.s(d0Var.f53806a, 0, 12);
        d0Var.K(0);
        if (d0Var.m() != 1179011410) {
            return false;
        }
        d0Var.L(4);
        return d0Var.m() == 541677121;
    }
}
