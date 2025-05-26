package dc2;

import ac2.m0;
import android.util.SizeF;
import androidx.media3.exoplayer.ExoPlayer;
import bc2.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import k8.y;
import kotlin.jvm.internal.Intrinsics;
import m60.b0;
import m7.l0;
import pk.a0;

/* loaded from: classes2.dex */
public final class g implements hc2.m {

    /* renamed from: a, reason: collision with root package name */
    public final ExoPlayer f54407a;

    /* renamed from: b, reason: collision with root package name */
    public final ic2.d f54408b;

    /* renamed from: c, reason: collision with root package name */
    public String f54409c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54410d;

    /* renamed from: e, reason: collision with root package name */
    public final hc2.g f54411e;

    /* renamed from: f, reason: collision with root package name */
    public final xj2.c f54412f;

    public g(ExoPlayer player, ic2.c listener, b0 backgroundDetector, hc2.g fastDashConfig) {
        Intrinsics.checkNotNullParameter(player, "exoPlayer");
        Intrinsics.checkNotNullParameter(listener, "exoListener");
        Intrinsics.checkNotNullParameter(backgroundDetector, "backgroundDetector");
        Intrinsics.checkNotNullParameter(fastDashConfig, "fastDashConfig");
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f54407a = player;
        this.f54408b = listener;
        this.f54409c = "-";
        this.f54410d = false;
        this.f54411e = fastDashConfig;
        this.f54412f = m0.c(player, new f(listener, 0), new f(listener, 1), new f(listener, 2), backgroundDetector, 0L, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
        l0 l0Var = (l0) player;
        listener.f72114a = Integer.valueOf(l0Var.L());
        listener.f72115b = Boolean.valueOf(l0Var.z());
        l0Var.f0(listener);
        if (l0Var.L() == 3) {
            l0Var.L0();
            if (l0Var.S != null) {
                SizeF dimensions = new SizeF(r2.f18772v, r2.f18773w);
                long duration = l0Var.getDuration();
                long X = l0Var.X();
                Intrinsics.checkNotNullParameter(dimensions, "dimensions");
                listener.f72109c.I(dimensions, duration, X);
            }
            long X2 = l0Var.X();
            boolean z13 = l0Var.z();
            int L = l0Var.L();
            listener.f72109c.r(L, z13, X2, listener.f72112f.f72105f, new ic2.b(L, z13, listener, X2));
        }
    }

    public final void c(float f13, a0 a0Var, boolean z13, boolean z14, q videoTracks, boolean z15) {
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        l0 l0Var = (l0) this.f54407a;
        l0Var.L0();
        y yVar = l0Var.f86269j;
        Intrinsics.g(yVar, "null cannot be cast to non-null type androidx.media3.exoplayer.trackselection.DefaultTrackSelector");
        k8.q qVar = (k8.q) yVar;
        dl2.b.W2(qVar, z13);
        if (a0Var == null) {
            return;
        }
        k8.j a13 = qVar.a();
        a13.getClass();
        k8.i iVar = new k8.i(a13);
        Intrinsics.checkNotNullExpressionValue(iVar, "buildUponParameters(...)");
        iVar.f997d = ((ec2.g) a0Var).f58451f;
        if (z14) {
            int S0 = a0Var.S0(f13);
            int R0 = a0Var.R0(f13);
            a7.f fVar = m0.f1992a;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            if (S0 > 0 || R0 > 0) {
                int i13 = S0 <= 640 ? S0 : 640;
                iVar.f994a = i13;
                iVar.f995b = (R0 * i13) / S0;
            }
        } else {
            int S02 = a0Var.S0(f13);
            int R02 = a0Var.R0(f13);
            iVar.f994a = S02;
            iVar.f995b = R02;
        }
        bc2.c cVar = videoTracks.f22673b.f22667d;
        Integer valueOf = cVar != null ? Integer.valueOf(cVar.f22648a) : null;
        int S03 = a0Var.S0(f13);
        if (valueOf == null || valueOf.intValue() <= S03 || !z15) {
            iVar.F = !r7.f58452g;
        } else {
            iVar.F = true;
        }
        qVar.i(new k8.j(iVar));
    }
}
