package gx1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class h extends r {

    /* renamed from: f, reason: collision with root package name */
    public final e f66304f;

    public h(e viewData) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        this.f66304f = viewData;
    }

    public final e A0() {
        return this.f66304f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f66304f, ((h) obj).f66304f);
    }

    public final int hashCode() {
        return this.f66304f.hashCode();
    }

    public final String toString() {
        return "Success(viewData=" + this.f66304f + ")";
    }
}
