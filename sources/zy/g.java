package zy;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f143074a;

    public g(z1 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f143074a = impression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f143074a, ((g) obj).f143074a);
    }

    public final int hashCode() {
        return this.f143074a.hashCode();
    }

    public final String toString() {
        return "StartImpression(impression=" + this.f143074a + ")";
    }
}
