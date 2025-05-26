package bd;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import wo2.m;
import wo2.v;

/* loaded from: classes3.dex */
public final class l implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final wo2.l f22710a;

    /* renamed from: b, reason: collision with root package name */
    public final m f22711b;

    /* renamed from: c, reason: collision with root package name */
    public final m f22712c;

    /* renamed from: d, reason: collision with root package name */
    public int f22713d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22715f;

    /* renamed from: g, reason: collision with root package name */
    public k f22716g;

    /* renamed from: h, reason: collision with root package name */
    public final v f22717h;

    public l(wo2.l source, String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.f22710a = source;
        wo2.j jVar = new wo2.j();
        jVar.r0("--");
        jVar.r0(boundary);
        this.f22711b = jVar.a1(jVar.f130711b);
        wo2.j jVar2 = new wo2.j();
        jVar2.r0("\r\n--");
        jVar2.r0(boundary);
        this.f22712c = jVar2.a1(jVar2.f130711b);
        int i13 = v.f130737d;
        m mVar = m.f130712d;
        this.f22717h = ln2.k.j(f0.h0("\r\n--" + boundary + "--"), f0.h0("\r\n"), f0.h0("--"), f0.h0(" "), f0.h0("\t"));
    }

    public final long a(long j13) {
        m mVar = this.f22712c;
        long b13 = mVar.b();
        wo2.l lVar = this.f22710a;
        lVar.N0(b13);
        long q13 = lVar.l().q(mVar);
        return q13 == -1 ? Math.min(j13, (lVar.l().f130711b - mVar.b()) + 1) : Math.min(j13, q13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22714e) {
            return;
        }
        this.f22714e = true;
        this.f22716g = null;
        this.f22710a.close();
    }
}
