package rf1;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f107880a;

    /* renamed from: b, reason: collision with root package name */
    public final a f107881b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f107882c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f107883d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f107884e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f107885f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f107886g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f107887h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f107888i;

    /* renamed from: j, reason: collision with root package name */
    public final mf1.a f107889j;

    public q0(Function0 presenterPinalyticsProvider, a musicStateProvider, t0 featureDisplay, u0 origin, Function0 eventLogging, Function0 userActionLogging, Map pinFeedbackStateUpdates, boolean z13, boolean z14, mf1.a ideaPinHostView) {
        Intrinsics.checkNotNullParameter(presenterPinalyticsProvider, "presenterPinalyticsProvider");
        Intrinsics.checkNotNullParameter(musicStateProvider, "musicStateProvider");
        Intrinsics.checkNotNullParameter(featureDisplay, "featureDisplay");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(eventLogging, "eventLogging");
        Intrinsics.checkNotNullParameter(userActionLogging, "userActionLogging");
        Intrinsics.checkNotNullParameter(pinFeedbackStateUpdates, "pinFeedbackStateUpdates");
        Intrinsics.checkNotNullParameter(ideaPinHostView, "ideaPinHostView");
        this.f107880a = presenterPinalyticsProvider;
        this.f107881b = musicStateProvider;
        this.f107882c = featureDisplay;
        this.f107883d = origin;
        this.f107884e = eventLogging;
        this.f107885f = userActionLogging;
        this.f107886g = pinFeedbackStateUpdates;
        this.f107887h = z13;
        this.f107888i = z14;
        this.f107889j = ideaPinHostView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f107880a, q0Var.f107880a) && Intrinsics.d(this.f107881b, q0Var.f107881b) && Intrinsics.d(this.f107882c, q0Var.f107882c) && Intrinsics.d(this.f107883d, q0Var.f107883d) && Intrinsics.d(this.f107884e, q0Var.f107884e) && Intrinsics.d(this.f107885f, q0Var.f107885f) && Intrinsics.d(this.f107886g, q0Var.f107886g) && this.f107887h == q0Var.f107887h && this.f107888i == q0Var.f107888i && this.f107889j == q0Var.f107889j;
    }

    public final int hashCode() {
        return this.f107889j.hashCode() + ep.b.e(this.f107888i, ep.b.e(this.f107887h, a.c.e(this.f107886g, d7.g.b(this.f107885f, d7.g.b(this.f107884e, (this.f107883d.hashCode() + ((this.f107882c.hashCode() + ((this.f107881b.hashCode() + (this.f107880a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "StoryPinDisplayPresenterParameters(presenterPinalyticsProvider=" + this.f107880a + ", musicStateProvider=" + this.f107881b + ", featureDisplay=" + this.f107882c + ", origin=" + this.f107883d + ", eventLogging=" + this.f107884e + ", userActionLogging=" + this.f107885f + ", pinFeedbackStateUpdates=" + this.f107886g + ", isInIdeaPinsInCloseupExperiment=" + this.f107887h + ", isStaticImageIdeaPinInPinCloseup=" + this.f107888i + ", ideaPinHostView=" + this.f107889j + ")";
    }
}
