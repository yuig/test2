package androidx.fragment.app;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18308a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18312e;

    public /* synthetic */ e(Context context, m7.l0 l0Var, n7.q0 q0Var, boolean z13) {
        this.f18310c = context;
        this.f18309b = z13;
        this.f18311d = l0Var;
        this.f18312e = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlaybackSession createPlaybackSession;
        n7.h0 h0Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        boolean equals;
        switch (this.f18308a) {
            case 0:
                z1 z1Var = (z1) this.f18310c;
                z1 z1Var2 = (z1) this.f18311d;
                g1.g lastInViews = (g1.g) this.f18312e;
                Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
                h1.a(z1Var.f18510c, z1Var2.f18510c, this.f18309b, lastInViews);
                return;
            default:
                Context context = (Context) this.f18310c;
                boolean z13 = this.f18309b;
                m7.l0 l0Var = (m7.l0) this.f18311d;
                n7.q0 q0Var = (n7.q0) this.f18312e;
                MediaMetricsManager b13 = d7.l0.b(context.getSystemService("media_metrics"));
                if (b13 == null) {
                    h0Var = null;
                } else {
                    createPlaybackSession = b13.createPlaybackSession();
                    h0Var = new n7.h0(context, createPlaybackSession);
                }
                if (h0Var == null) {
                    d7.u.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z13) {
                    l0Var.f0(h0Var);
                }
                sessionId = h0Var.f89438d.getSessionId();
                synchronized (q0Var) {
                    n7.p0 p0Var = q0Var.f89566b;
                    p0Var.getClass();
                    LogSessionId logSessionId2 = p0Var.f89560a;
                    logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
                    equals = logSessionId2.equals(logSessionId);
                    bf.b.t(equals);
                    p0Var.f89560a = sessionId;
                }
                return;
        }
    }

    public /* synthetic */ e(z1 z1Var, z1 z1Var2, boolean z13, g1.g gVar) {
        this.f18310c = z1Var;
        this.f18311d = z1Var2;
        this.f18309b = z13;
        this.f18312e = gVar;
    }
}
