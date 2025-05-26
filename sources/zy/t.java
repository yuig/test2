package zy;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f143117a;

    public t(z1 impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f143117a = impression;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f143117a, ((t) obj).f143117a);
    }

    public final int hashCode() {
        return this.f143117a.hashCode();
    }

    public final String toString() {
        return "RecordStartedImpression(impression=" + this.f143117a + ")";
    }
}
