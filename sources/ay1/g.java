package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final c f20667a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f20668b;

    /* renamed from: c, reason: collision with root package name */
    public final f f20669c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f20670d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f20671e;

    public g(c parentPinDisplayState, c0 rootPinDisplayState, f pinMetricsDisplayState, k0 videoMetricsDisplayState, g0 savedToBoardDisplayState) {
        Intrinsics.checkNotNullParameter(parentPinDisplayState, "parentPinDisplayState");
        Intrinsics.checkNotNullParameter(rootPinDisplayState, "rootPinDisplayState");
        Intrinsics.checkNotNullParameter(pinMetricsDisplayState, "pinMetricsDisplayState");
        Intrinsics.checkNotNullParameter(videoMetricsDisplayState, "videoMetricsDisplayState");
        Intrinsics.checkNotNullParameter(savedToBoardDisplayState, "savedToBoardDisplayState");
        this.f20667a = parentPinDisplayState;
        this.f20668b = rootPinDisplayState;
        this.f20669c = pinMetricsDisplayState;
        this.f20670d = videoMetricsDisplayState;
        this.f20671e = savedToBoardDisplayState;
    }

    public static g e(g gVar, c cVar, c0 c0Var, f fVar, k0 k0Var, g0 g0Var, int i13) {
        if ((i13 & 1) != 0) {
            cVar = gVar.f20667a;
        }
        c parentPinDisplayState = cVar;
        if ((i13 & 2) != 0) {
            c0Var = gVar.f20668b;
        }
        c0 rootPinDisplayState = c0Var;
        if ((i13 & 4) != 0) {
            fVar = gVar.f20669c;
        }
        f pinMetricsDisplayState = fVar;
        if ((i13 & 8) != 0) {
            k0Var = gVar.f20670d;
        }
        k0 videoMetricsDisplayState = k0Var;
        if ((i13 & 16) != 0) {
            g0Var = gVar.f20671e;
        }
        g0 savedToBoardDisplayState = g0Var;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(parentPinDisplayState, "parentPinDisplayState");
        Intrinsics.checkNotNullParameter(rootPinDisplayState, "rootPinDisplayState");
        Intrinsics.checkNotNullParameter(pinMetricsDisplayState, "pinMetricsDisplayState");
        Intrinsics.checkNotNullParameter(videoMetricsDisplayState, "videoMetricsDisplayState");
        Intrinsics.checkNotNullParameter(savedToBoardDisplayState, "savedToBoardDisplayState");
        return new g(parentPinDisplayState, rootPinDisplayState, pinMetricsDisplayState, videoMetricsDisplayState, savedToBoardDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f20667a, gVar.f20667a) && Intrinsics.d(this.f20668b, gVar.f20668b) && Intrinsics.d(this.f20669c, gVar.f20669c) && Intrinsics.d(this.f20670d, gVar.f20670d) && Intrinsics.d(this.f20671e, gVar.f20671e);
    }

    public final int hashCode() {
        return this.f20671e.hashCode() + ((this.f20670d.hashCode() + ((this.f20669c.hashCode() + ((this.f20668b.hashCode() + (this.f20667a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinStatsDisplayState(parentPinDisplayState=" + this.f20667a + ", rootPinDisplayState=" + this.f20668b + ", pinMetricsDisplayState=" + this.f20669c + ", videoMetricsDisplayState=" + this.f20670d + ", savedToBoardDisplayState=" + this.f20671e + ")";
    }
}
