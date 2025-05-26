package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f137839a;

    public r(d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f137839a = params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f137839a, ((r) obj).f137839a);
    }

    public final int hashCode() {
        return this.f137839a.hashCode();
    }

    public final String toString() {
        return "GetShareLink(params=" + this.f137839a + ")";
    }
}
