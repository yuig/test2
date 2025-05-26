package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f124447a;

    public q(String sceneViewIdentityKey) {
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        this.f124447a = sceneViewIdentityKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f124447a, ((q) obj).f124447a);
    }

    public final int hashCode() {
        return this.f124447a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DisableAutoPlayStateObservation(sceneViewIdentityKey="), this.f124447a, ")");
    }
}
