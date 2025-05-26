package um0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements x {

    /* renamed from: a, reason: collision with root package name */
    public final List f122704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122705b;

    public f(ArrayList pins, int i13) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f122704a = pins;
        this.f122705b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f122704a, fVar.f122704a) && this.f122705b == fVar.f122705b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122705b) + (this.f122704a.hashCode() * 31);
    }

    public final String toString() {
        return "PinMoved(pins=" + this.f122704a + ", position=" + this.f122705b + ")";
    }
}
