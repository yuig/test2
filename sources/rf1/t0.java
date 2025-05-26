package rf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final sf1.u0 f107903a;

    /* renamed from: b, reason: collision with root package name */
    public final tf1.b f107904b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107905c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f107906d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107907e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f107908f;

    public t0(sf1.u0 primaryActionType, tf1.b pageProgression, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(primaryActionType, "primaryActionType");
        Intrinsics.checkNotNullParameter(pageProgression, "pageProgression");
        this.f107903a = primaryActionType;
        this.f107904b = pageProgression;
        this.f107905c = z13;
        this.f107906d = z14;
        this.f107907e = z15;
        this.f107908f = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f107903a == t0Var.f107903a && this.f107904b == t0Var.f107904b && this.f107905c == t0Var.f107905c && this.f107906d == t0Var.f107906d && this.f107907e == t0Var.f107907e && this.f107908f == t0Var.f107908f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107908f) + ep.b.e(this.f107907e, ep.b.e(this.f107906d, ep.b.e(this.f107905c, (this.f107904b.hashCode() + (this.f107903a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinFeatureDisplay(primaryActionType=");
        sb3.append(this.f107903a);
        sb3.append(", pageProgression=");
        sb3.append(this.f107904b);
        sb3.append(", allowStats=");
        sb3.append(this.f107905c);
        sb3.append(", allowExperienceEducation=");
        sb3.append(this.f107906d);
        sb3.append(", allowHide=");
        sb3.append(this.f107907e);
        sb3.append(", allowSwipeToRelated=");
        return a.a.r(sb3, this.f107908f, ")");
    }
}
