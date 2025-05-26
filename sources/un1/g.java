package un1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends j {

    /* renamed from: b, reason: collision with root package name */
    public final f f122884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f ellipsisMode) {
        super(ellipsisMode);
        Intrinsics.checkNotNullParameter(ellipsisMode, "ellipsisMode");
        this.f122884b = ellipsisMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f122884b, ((g) obj).f122884b);
    }

    public final int hashCode() {
        return this.f122884b.hashCode();
    }

    public final String toString() {
        return "Always(ellipsisMode=" + this.f122884b + ")";
    }
}
