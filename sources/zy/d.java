package zy;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f143063a;

    public d(z1 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f143063a = impression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f143063a, ((d) obj).f143063a);
    }

    public final int hashCode() {
        return this.f143063a.hashCode();
    }

    public final String toString() {
        return "EndImpression(impression=" + this.f143063a + ")";
    }
}
