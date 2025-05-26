package androidx.media3.exoplayer.hls;

import a.e;
import a7.i0;
import androidx.lifecycle.n1;
import com.google.android.gms.internal.measurement.q4;
import g8.a;
import g8.d0;
import gs1.b;
import java.util.List;
import l8.f;
import l9.j;
import s7.i;
import t7.c;
import t7.d;
import t7.o;
import v5.x;
import v7.q;

/* loaded from: classes3.dex */
public final class HlsMediaSource$Factory implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f18809a;

    /* renamed from: b, reason: collision with root package name */
    public d f18810b;

    /* renamed from: c, reason: collision with root package name */
    public j f18811c;

    /* renamed from: e, reason: collision with root package name */
    public int f18813e;

    /* renamed from: i, reason: collision with root package name */
    public f f18817i;

    /* renamed from: j, reason: collision with root package name */
    public i f18818j = new i();

    /* renamed from: f, reason: collision with root package name */
    public final x f18814f = new x(22);

    /* renamed from: g, reason: collision with root package name */
    public final e f18815g = v7.c.f124244p;

    /* renamed from: k, reason: collision with root package name */
    public a10.e f18819k = new a10.e();

    /* renamed from: h, reason: collision with root package name */
    public final n1 f18816h = new n1();

    /* renamed from: m, reason: collision with root package name */
    public final int f18821m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final long f18822n = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18820l = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18812d = true;

    public HlsMediaSource$Factory(g7.e eVar) {
        this.f18809a = new c(eVar);
    }

    @Override // g8.d0
    public final void a(j jVar) {
        this.f18811c = jVar;
    }

    @Override // g8.d0
    public final void b(int i13) {
        this.f18813e = i13;
    }

    @Override // g8.d0
    public final void c(f fVar) {
        fVar.getClass();
        this.f18817i = fVar;
    }

    @Override // g8.d0
    public final a d(i0 i0Var) {
        i0Var.f1073b.getClass();
        if (this.f18810b == null) {
            this.f18810b = new d();
        }
        j jVar = this.f18811c;
        if (jVar != null) {
            this.f18810b.f116469a = jVar;
        }
        d dVar = this.f18810b;
        dVar.f116470b = this.f18812d;
        dVar.f116471c = this.f18813e;
        q qVar = this.f18814f;
        List list = i0Var.f1073b.f972d;
        if (!list.isEmpty()) {
            qVar = new q4(16, qVar, list);
        }
        f fVar = this.f18817i;
        k0.a g13 = fVar == null ? null : ((b) fVar).g(i0Var);
        s7.q b13 = this.f18818j.b(i0Var);
        a10.e eVar = this.f18819k;
        this.f18815g.getClass();
        return new o(i0Var, this.f18809a, dVar, this.f18816h, g13, b13, eVar, new v7.c(this.f18809a, eVar, qVar, g13), this.f18822n, this.f18820l, this.f18821m);
    }

    @Override // g8.d0
    public final d0 e(i iVar) {
        bf.b.o(iVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f18818j = iVar;
        return this;
    }

    @Override // g8.d0
    public final void f(boolean z13) {
        this.f18812d = z13;
    }

    @Override // g8.d0
    public final d0 g(a10.e eVar) {
        bf.b.o(eVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f18819k = eVar;
        return this;
    }
}
