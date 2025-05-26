package a8;

import a.a4;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class f implements l8.u {

    /* renamed from: a, reason: collision with root package name */
    public final int f1311a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f1312b;

    /* renamed from: c, reason: collision with root package name */
    public final v f1313c;

    /* renamed from: d, reason: collision with root package name */
    public final q8.u f1314d;

    /* renamed from: f, reason: collision with root package name */
    public final d f1316f;

    /* renamed from: g, reason: collision with root package name */
    public e f1317g;

    /* renamed from: h, reason: collision with root package name */
    public g f1318h;

    /* renamed from: i, reason: collision with root package name */
    public q8.o f1319i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f1320j;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f1322l;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f1315e = d7.n0.n(null);

    /* renamed from: k, reason: collision with root package name */
    public volatile long f1321k = -9223372036854775807L;

    public f(int i13, c0 c0Var, v vVar, t tVar, d dVar) {
        this.f1311a = i13;
        this.f1312b = c0Var;
        this.f1313c = vVar;
        this.f1314d = tVar;
        this.f1316f = dVar;
    }

    public final void a(long j13, long j14) {
        this.f1321k = j13;
        this.f1322l = j14;
    }

    public final void b(int i13) {
        g gVar = this.f1318h;
        gVar.getClass();
        if (gVar.f1333h) {
            return;
        }
        this.f1318h.f1335j = i13;
    }

    public final void c(long j13) {
        if (j13 != -9223372036854775807L) {
            g gVar = this.f1318h;
            gVar.getClass();
            if (gVar.f1333h) {
                return;
            }
            this.f1318h.f1334i = j13;
        }
    }

    @Override // l8.u
    public final void h() {
        if (this.f1320j) {
            this.f1320j = false;
        }
        try {
            if (this.f1317g == null) {
                e a13 = this.f1316f.a(this.f1311a);
                this.f1317g = a13;
                this.f1315e.post(new a4(this, a13.a(), this.f1317g, 24));
                e eVar = this.f1317g;
                eVar.getClass();
                this.f1319i = new q8.o(eVar, 0L, -1L);
                g gVar = new g(this.f1312b.f1308a, this.f1311a);
                this.f1318h = gVar;
                gVar.f(this.f1314d);
            }
            while (!this.f1320j) {
                if (this.f1321k != -9223372036854775807L) {
                    g gVar2 = this.f1318h;
                    gVar2.getClass();
                    gVar2.b(this.f1322l, this.f1321k);
                    this.f1321k = -9223372036854775807L;
                }
                g gVar3 = this.f1318h;
                gVar3.getClass();
                q8.o oVar = this.f1319i;
                oVar.getClass();
                if (gVar3.d(oVar, new q8.c0(0)) == -1) {
                    break;
                }
            }
            this.f1320j = false;
            e eVar2 = this.f1317g;
            eVar2.getClass();
            if (eVar2.j()) {
                lb.l0.H(this.f1317g);
                this.f1317g = null;
            }
        } catch (Throwable th3) {
            e eVar3 = this.f1317g;
            eVar3.getClass();
            if (eVar3.j()) {
                lb.l0.H(this.f1317g);
                this.f1317g = null;
            }
            throw th3;
        }
    }

    @Override // l8.u
    public final void o() {
        this.f1320j = true;
    }
}
