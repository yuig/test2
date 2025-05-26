package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f46205a;

    /* renamed from: b, reason: collision with root package name */
    public final float f46206b;

    public j0(View view, float f13) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f46205a = view;
        this.f46206b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f46205a, j0Var.f46205a) && Float.compare(this.f46206b, j0Var.f46206b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46206b) + (this.f46205a.hashCode() * 31);
    }

    public final String toString() {
        return "IdeaPinGestureGuideline(view=" + this.f46205a + ", position=" + this.f46206b + ")";
    }
}
