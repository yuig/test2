package cc2;

import h32.c1;
import h32.f1;
import h32.g3;
import h32.i0;
import h32.i3;
import h32.v0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.d1;
import nx.z0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f27508a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f27509b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f27510c;

    public c(d0 pinalytics, z0 z0Var, d1 paramAttacher) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(paramAttacher, "paramAttacher");
        this.f27508a = pinalytics;
        this.f27509b = z0Var;
        this.f27510c = paramAttacher;
    }

    public final v0 a(String str) {
        v0 v0Var = new v0();
        v0Var.G = this.f27510c.c(str);
        return v0Var;
    }

    public final void b(i0 i0Var, f1 eventType, String pinId, z0 z0Var, g3 source) {
        g3 g3Var;
        z0 z0Var2;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        if (z0Var != null && (z0Var2 = this.f27509b) != null) {
            z0Var2.putAll(z0Var);
        }
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            g3Var = new g3(source.f67015a, source.f67016b, source.f67017c, source.f67018d, source.f67019e, source.f67020f, source.f67021g, source.f67022h, source.f67023i, source.f67024j, source.f67025k, source.f67026l, source.f67027m, source.f67028n, source.f67029o, source.f67030p, source.f67031q, source.f67032r, source.f67033s, source.f67034t, source.f67035u, source.f67036v, source.f67037w, source.f67038x, source.f67039y, source.f67040z, source.A, source.B);
        } else {
            g3Var = null;
        }
        d(i0Var, eventType, pinId, new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, g3Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), this.f27509b, a(pinId));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0156, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r2, qc2.c.InvalidVisibility.getTrackingEvent()) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(h32.g3 r69, java.lang.String r70, java.lang.String r71, h32.i0 r72, boolean r73) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cc2.c.c(h32.g3, java.lang.String, java.lang.String, h32.i0, boolean):void");
    }

    public final void d(i0 i0Var, f1 f1Var, String str, c1 c1Var, z0 z0Var, v0 v0Var) {
        this.f27508a.t(i0Var, v0Var, c1Var, f1Var, str, z0Var == null ? null : new HashMap(z0Var), false);
    }

    public final void e(i0 i0Var, z0 auxData, i3 data, String pinId) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Boolean bool = Boolean.FALSE;
        d(i0Var, f1.VIDEO_PLAYBACK_PERFORMANCE, pinId, new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, data, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), auxData, a(pinId));
    }

    public final void f(g3 source, String videoPath, String pinId, i0 i0Var) {
        Intrinsics.checkNotNullParameter(source, "data");
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(source, "source");
        c1 c1Var = new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, new g3(videoPath, source.f67016b, source.f67017c, source.f67018d, source.f67019e, source.f67020f, source.f67021g, source.f67022h, source.f67023i, source.f67024j, source.f67025k, source.f67026l, source.f67027m, source.f67028n, source.f67029o, source.f67030p, source.f67031q, source.f67032r, source.f67033s, source.f67034t, source.f67035u, source.f67036v, source.f67037w, source.f67038x, source.f67039y, source.f67040z, source.A, source.B), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        d(i0Var, f1.VIDEO_SINGLE_QUARTILE, pinId, c1Var, this.f27509b, a(pinId));
    }
}
