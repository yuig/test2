package pu0;

import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public final j f101386a;

    public f(j viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f101386a = viewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f101386a, ((f) obj).f101386a);
    }

    public final int hashCode() {
        return this.f101386a.hashCode();
    }

    public final String toString() {
        return "StartDraggerUpdateInProgress(viewModel=" + this.f101386a + ")";
    }

    public final j y0() {
        return this.f101386a;
    }
}
