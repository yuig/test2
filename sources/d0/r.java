package d0;

import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import c0.e0;
import c0.f0;
import c0.n0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f53542a;

    /* renamed from: b, reason: collision with root package name */
    public e f53543b;

    /* renamed from: c, reason: collision with root package name */
    public o f53544c;

    /* renamed from: d, reason: collision with root package name */
    public gc.c f53545d;

    /* renamed from: e, reason: collision with root package name */
    public kp.n f53546e;

    /* renamed from: f, reason: collision with root package name */
    public kp.n f53547f;

    /* renamed from: g, reason: collision with root package name */
    public kp.n f53548g;

    /* renamed from: h, reason: collision with root package name */
    public o f53549h;

    /* renamed from: i, reason: collision with root package name */
    public o f53550i;

    /* renamed from: j, reason: collision with root package name */
    public kp.n f53551j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.camera.core.impl.r f53552k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f53553l;

    public r(Executor executor) {
        androidx.camera.core.impl.r rVar = i0.a.f70646a;
        if (i0.a.f70646a.b(LowMemoryQuirk.class) != null) {
            this.f53542a = new f0.j(executor);
        } else {
            this.f53542a = executor;
        }
        this.f53552k = rVar;
        this.f53553l = rVar.a(IncorrectJpegMetadataQuirk.class);
    }

    public final l0.b a(l0.b bVar, int i13) {
        com.bumptech.glide.d.v(null, bp1.h.u(bVar.f81196c));
        return (l0.b) this.f53546e.J(new a((l0.b) this.f53548g.J(bVar), i13));
    }

    public final n0 b(f fVar) {
        l0.b bVar = (l0.b) this.f53544c.g(fVar);
        if ((bVar.f81196c == 35 || this.f53553l) && this.f53543b.f53509d == 256) {
            bVar = (l0.b) this.f53550i.g((l0.b) this.f53545d.F(new c(bVar, fVar.f53510a.f53558e)));
        }
        return (n0) this.f53549h.g(bVar);
    }

    public final f0 c(f fVar) {
        int i13 = this.f53543b.f53509d;
        com.bumptech.glide.d.g("On-disk capture only support JPEG and JPEG/R output formats. Output format: " + i13, bp1.h.u(i13));
        l0.b bVar = (l0.b) this.f53544c.g(fVar);
        gc.c cVar = this.f53545d;
        s sVar = fVar.f53510a;
        l0.b bVar2 = (l0.b) cVar.F(new c(bVar, sVar.f53558e));
        if (e0.u.b(bVar2.f81198e, bVar2.f81197d)) {
            bVar2 = a(bVar2, sVar.f53558e);
        }
        kp.n nVar = this.f53547f;
        e0 e0Var = sVar.f53555b;
        Objects.requireNonNull(e0Var);
        return (f0) nVar.J(new d(bVar2, e0Var));
    }
}
