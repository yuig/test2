package pu0;

import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public final j f101383a;

    public c(j viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f101383a = viewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f101383a, ((c) obj).f101383a);
    }

    public final int hashCode() {
        return this.f101383a.hashCode();
    }

    public final String toString() {
        return "EndDraggerUpdateInProgress(viewModel=" + this.f101383a + ")";
    }

    public final j y0() {
        return this.f101383a;
    }
}
