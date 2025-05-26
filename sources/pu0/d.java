package pu0;

import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public final j f101384a;

    public d(j viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f101384a = viewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f101384a, ((d) obj).f101384a);
    }

    public final int hashCode() {
        return this.f101384a.hashCode();
    }

    public final String toString() {
        return "OverlayViewUpdated(viewModel=" + this.f101384a + ")";
    }

    public final j y0() {
        return this.f101384a;
    }
}
