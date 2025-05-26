package av0;

import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kg.a {

    /* renamed from: f, reason: collision with root package name */
    public final u0 f20516f;

    public o(u0 buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f20516f = buttonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f20516f == ((o) obj).f20516f;
    }

    public final int hashCode() {
        return this.f20516f.hashCode();
    }

    public final String toString() {
        return "OnSaveDraftTapped(buttonType=" + this.f20516f + ")";
    }
}
