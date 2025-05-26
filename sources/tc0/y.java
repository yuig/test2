package tc0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final j f117358a;

    /* renamed from: b, reason: collision with root package name */
    public final List f117359b;

    public y(j headerDisplayState, List examples) {
        Intrinsics.checkNotNullParameter(headerDisplayState, "headerDisplayState");
        Intrinsics.checkNotNullParameter(examples, "examples");
        this.f117358a = headerDisplayState;
        this.f117359b = examples;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f117358a, yVar.f117358a) && Intrinsics.d(this.f117359b, yVar.f117359b);
    }

    public final int hashCode() {
        return this.f117359b.hashCode() + (this.f117358a.hashCode() * 31);
    }

    public final String toString() {
        return "GeneralComponentDisplayState(headerDisplayState=" + this.f117358a + ", examples=" + this.f117359b + ")";
    }
}
