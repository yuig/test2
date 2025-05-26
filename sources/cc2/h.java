package cc2;

import h32.f1;
import h32.f3;
import h32.g3;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.z0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f27531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27532b;

    /* renamed from: c, reason: collision with root package name */
    public final at1.d f27533c;

    /* renamed from: d, reason: collision with root package name */
    public g f27534d;

    /* renamed from: e, reason: collision with root package name */
    public String f27535e;

    public h(String videoPath, String pinUid) {
        int i13 = at1.d.f20439o;
        at1.d application = nl.b.e();
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f27531a = videoPath;
        this.f27532b = pinUid;
        this.f27533c = application;
    }

    public final void a(long j13, long j14, f3 eventBuilder, c cVar, i0 i0Var) {
        g gVar;
        Intrinsics.checkNotNullParameter(eventBuilder, "eventBuilder");
        double d2 = (j13 / j14) * 100;
        if (d2 > 100.0d) {
            if (cVar != null) {
                cVar.b(i0Var, f1.VIDEO_INVALID_QUARTILE, this.f27532b, null, null);
                return;
            }
            return;
        }
        f fVar = g.Companion;
        double min = Math.min(d2, 100.0d);
        fVar.getClass();
        g a13 = f.a(min);
        g gVar2 = this.f27534d;
        if (gVar2 != a13) {
            boolean z13 = this.f27533c.f20440e;
            d(cVar, gVar2, a13);
            if (cVar != null) {
                g3 source = eventBuilder.a();
                Intrinsics.checkNotNullParameter(source, "source");
                cVar.f(new g3(source.f67015a, source.f67016b, source.f67017c, source.f67018d, Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), 0L, 0L, source.f67023i, source.f67024j, source.f67025k, source.f67026l, source.f67027m, Integer.valueOf(a13.getTraditionalQuartile()), source.f67029o, source.f67030p, Double.valueOf(a13.getPercentQuartile()), source.f67032r, source.f67033s, source.f67034t, null, source.f67036v, source.f67037w, source.f67038x, source.f67039y, source.f67040z, source.A, source.B), this.f27531a, this.f27532b, i0Var);
                gVar = a13;
            } else {
                gVar = a13;
            }
            this.f27534d = gVar;
        }
    }

    public final void b(long j13, long j14) {
        double d2 = (j13 / j14) * 100;
        if (d2 > 100.0d) {
            return;
        }
        g.Companion.getClass();
        this.f27534d = f.a(d2);
    }

    public final void c(long j13, z0 auxData, f3 latestBuilder, c cVar, i0 i0Var) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        a(j13, j13, latestBuilder, cVar, i0Var);
        d(cVar, null, null);
        if (cVar != null) {
            cVar.b(i0Var, f1.VIDEO_PLAYBACK_COMPLETION, this.f27532b, auxData, null);
        }
    }

    public final void d(c cVar, g gVar, g gVar2) {
        f0 f0Var = vb0.j.f125466a;
        StringBuilder sb3 = new StringBuilder("Pinalytics was null\n            when trying to log quartile old: ");
        sb3.append(gVar);
        sb3.append(" new: ");
        sb3.append(gVar2);
        sb3.append("  for video ");
        f0Var.M(cVar, a.a.p(sb3, this.f27532b, ".\n            The log has been dropped, was this component released?\n            "), tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
    }
}
