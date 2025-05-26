package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f122690a;

    public b1(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f122690a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f122690a, ((b1) obj).f122690a);
    }

    public final int hashCode() {
        return this.f122690a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinVMState(id="), this.f122690a, ")");
    }
}
