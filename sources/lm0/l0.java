package lm0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f83878a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f83879b;

    /* renamed from: c, reason: collision with root package name */
    public final zo.c f83880c;

    public l0(List eligibleFilters, c1 currentPinsFilter, zo.c currentViewType) {
        Intrinsics.checkNotNullParameter(eligibleFilters, "eligibleFilters");
        Intrinsics.checkNotNullParameter(currentPinsFilter, "currentPinsFilter");
        Intrinsics.checkNotNullParameter(currentViewType, "currentViewType");
        this.f83878a = eligibleFilters;
        this.f83879b = currentPinsFilter;
        this.f83880c = currentViewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f83878a, l0Var.f83878a) && this.f83879b == l0Var.f83879b && this.f83880c == l0Var.f83880c;
    }

    public final int hashCode() {
        return this.f83880c.hashCode() + ((this.f83879b.hashCode() + (this.f83878a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LaunchViewOptions(eligibleFilters=" + this.f83878a + ", currentPinsFilter=" + this.f83879b + ", currentViewType=" + this.f83880c + ")";
    }
}
