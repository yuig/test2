package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final b22.l f61032a;

    public w(b22.l viewType) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f61032a = viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f61032a == ((w) obj).f61032a;
    }

    public final int hashCode() {
        return this.f61032a.hashCode();
    }

    public final String toString() {
        return "ViewTypeLoaded(viewType=" + this.f61032a + ")";
    }
}
