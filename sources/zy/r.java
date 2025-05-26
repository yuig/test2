package zy;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f143115a;

    public r(z1 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f143115a = impression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f143115a, ((r) obj).f143115a);
    }

    public final int hashCode() {
        return this.f143115a.hashCode();
    }

    public final String toString() {
        return "RecordEndedImpression(impression=" + this.f143115a + ")";
    }
}
