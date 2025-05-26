package androidx.media3.exoplayer.smoothstreaming;

import a7.i0;
import androidx.lifecycle.n1;
import d8.a;
import d8.d;
import g7.e;
import g8.d0;
import gs1.b;
import java.util.List;
import l8.f;
import l8.y;
import l9.j;
import s7.i;
import s7.q;

/* loaded from: classes3.dex */
public final class SsMediaSource$Factory implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f18843a;

    /* renamed from: b, reason: collision with root package name */
    public final e f18844b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f18845c;

    /* renamed from: d, reason: collision with root package name */
    public f f18846d;

    /* renamed from: e, reason: collision with root package name */
    public i f18847e;

    /* renamed from: f, reason: collision with root package name */
    public a10.e f18848f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18849g;

    public SsMediaSource$Factory(e eVar) {
        a aVar = new a(eVar);
        this.f18843a = aVar;
        this.f18844b = eVar;
        this.f18847e = new i();
        this.f18848f = new a10.e();
        this.f18849g = 30000L;
        this.f18845c = new n1();
        aVar.f53943c = true;
    }

    @Override // g8.d0
    public final void a(j jVar) {
        jVar.getClass();
        ((a) this.f18843a).f53942b = jVar;
    }

    @Override // g8.d0
    public final void c(f fVar) {
        fVar.getClass();
        this.f18846d = fVar;
    }

    @Override // g8.d0
    public final g8.a d(i0 i0Var) {
        i0Var.f1073b.getClass();
        t5.e eVar = new t5.e(11);
        List list = i0Var.f1073b.f972d;
        y iVar = !list.isEmpty() ? new sp2.i(15, eVar, list) : eVar;
        f fVar = this.f18846d;
        k0.a g13 = fVar == null ? null : ((b) fVar).g(i0Var);
        q b13 = this.f18847e.b(i0Var);
        a10.e eVar2 = this.f18848f;
        return new d8.f(i0Var, this.f18844b, iVar, this.f18843a, this.f18845c, g13, b13, eVar2, this.f18849g);
    }

    @Override // g8.d0
    public final d0 e(i iVar) {
        bf.b.o(iVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f18847e = iVar;
        return this;
    }

    @Override // g8.d0
    public final void f(boolean z13) {
        ((a) this.f18843a).f53943c = z13;
    }

    @Override // g8.d0
    public final d0 g(a10.e eVar) {
        bf.b.o(eVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f18848f = eVar;
        return this;
    }
}
