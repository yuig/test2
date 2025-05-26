package cc2;

import h32.f3;
import h32.g3;
import h32.i0;
import h32.k4;
import h32.r3;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f27541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27542b;

    /* renamed from: c, reason: collision with root package name */
    public final bc2.m f27543c;

    /* renamed from: d, reason: collision with root package name */
    public g3 f27544d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27545e;

    public p(String videoPath, String pinUid, bc2.m mVar) {
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f27541a = videoPath;
        this.f27542b = pinUid;
        this.f27543c = mVar;
        nc2.h hVar = nc2.h.f90405a;
        this.f27545e = nc2.h.a(pinUid).f90410b;
    }

    public final f3 a(f3 f3Var, long j13, long j14) {
        Long l13;
        Long l14;
        f3 f3Var2 = new f3(f3Var.a());
        g3 g3Var = this.f27544d;
        f3Var2.f66987e = Long.valueOf((g3Var == null || (l14 = g3Var.f67020f) == null) ? 0L : l14.longValue());
        f3Var2.f66988f = Long.valueOf(j14);
        g3 g3Var2 = this.f27544d;
        f3Var2.f66989g = Long.valueOf((g3Var2 == null || (l13 = g3Var2.f67022h) == null) ? this.f27545e : l13.longValue());
        f3Var2.f66990h = Long.valueOf(j13);
        return f3Var2;
    }

    public final void b(g3 g3Var, c cVar, i0 i0Var) {
        d(cVar, g3Var);
        if (cVar != null) {
            cVar.c(g3Var, this.f27541a, this.f27542b, i0Var, this.f27543c == bc2.m.GRID);
        }
    }

    public final void c(r3 r3Var, long j13, long j14, f3 latestBuilder, c cVar, i0 i0Var) {
        Intrinsics.checkNotNullParameter(latestBuilder, "latestBuilder");
        Objects.toString(r3Var);
        f3 a13 = a(latestBuilder, j13, j14);
        a13.f66997o = r3Var;
        a13.f67003u = k4.WATCHTIME_PLAYSTATE;
        g3 a14 = a13.a();
        b(a14, cVar, i0Var);
        this.f27544d = a14;
    }

    public final void d(c cVar, g3 g3Var) {
        vb0.j.f125466a.M(cVar, "Pinalytics was null\n            when trying to log " + (g3Var != null ? g3Var.f67035u : null) + " for video " + this.f27542b + ". The log has been dropped,\n            was this component released?\n            ", tb0.p.ANALYTICS_OVERVIEW, new Object[0]);
    }
}
