package androidx.media3.exoplayer.dash;

import a7.i0;
import a7.v;
import android.net.Uri;
import androidx.lifecycle.n1;
import g7.e;
import g8.d0;
import gs1.b;
import java.util.List;
import l8.f;
import l8.y;
import l9.j;
import p7.a;
import p7.m;
import q7.c;
import s7.i;
import s7.q;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f18799a;

    /* renamed from: b, reason: collision with root package name */
    public final e f18800b;

    /* renamed from: c, reason: collision with root package name */
    public f f18801c;

    /* renamed from: d, reason: collision with root package name */
    public i f18802d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f18803e;

    /* renamed from: f, reason: collision with root package name */
    public a10.e f18804f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18805g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18806h;

    public DashMediaSource$Factory(e eVar) {
        this(new m(eVar), eVar);
    }

    @Override // g8.d0
    public final void a(j jVar) {
        jVar.getClass();
        o5.a aVar = (o5.a) ((m) this.f18799a).f99008c;
        aVar.getClass();
        aVar.f92886c = jVar;
    }

    @Override // g8.d0
    public final void b(int i13) {
        ((o5.a) ((m) this.f18799a).f99008c).f92885b = i13;
    }

    @Override // g8.d0
    public final void c(f fVar) {
        fVar.getClass();
        this.f18801c = fVar;
    }

    @Override // g8.d0
    public final g8.a d(i0 i0Var) {
        i0Var.f1073b.getClass();
        y eVar = new q7.e();
        List list = i0Var.f1073b.f972d;
        y iVar = !list.isEmpty() ? new sp2.i(15, eVar, list) : eVar;
        f fVar = this.f18801c;
        k0.a g13 = fVar == null ? null : ((b) fVar).g(i0Var);
        q b13 = this.f18802d.b(i0Var);
        a10.e eVar2 = this.f18804f;
        return new p7.j(i0Var, null, this.f18800b, iVar, this.f18799a, this.f18803e, g13, b13, eVar2, this.f18805g, this.f18806h);
    }

    @Override // g8.d0
    public final d0 e(i iVar) {
        bf.b.o(iVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f18802d = iVar;
        return this;
    }

    @Override // g8.d0
    public final void f(boolean z13) {
        ((o5.a) ((m) this.f18799a).f99008c).f92884a = z13;
    }

    @Override // g8.d0
    public final d0 g(a10.e eVar) {
        bf.b.o(eVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f18804f = eVar;
        return this;
    }

    public final p7.j h(i0 i0Var, c cVar) {
        bf.b.i(!cVar.f102607d);
        v a13 = i0Var.a();
        a13.f1219c = "application/dash+xml";
        if (i0Var.f1073b == null) {
            a13.f1218b = Uri.EMPTY;
        }
        i0 a14 = a13.a();
        f fVar = this.f18801c;
        return new p7.j(a14, cVar, null, null, this.f18799a, this.f18803e, fVar == null ? null : ((b) fVar).g(a14), this.f18802d.b(a14), this.f18804f, this.f18805g, this.f18806h);
    }

    public DashMediaSource$Factory(m mVar, e eVar) {
        this.f18799a = mVar;
        this.f18800b = eVar;
        this.f18802d = new i();
        this.f18804f = new a10.e();
        this.f18805g = 30000L;
        this.f18806h = 5000000L;
        this.f18803e = new n1();
        ((o5.a) mVar.f99008c).f92884a = true;
    }
}
