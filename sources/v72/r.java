package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f124448a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124449b;

    public r(String sceneViewIdentityKey, boolean z13) {
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        this.f124448a = sceneViewIdentityKey;
        this.f124449b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f124448a, rVar.f124448a) && this.f124449b == rVar.f124449b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124449b) + (this.f124448a.hashCode() * 31);
    }

    public final String toString() {
        return "EnableAutoPlayStateObservation(sceneViewIdentityKey=" + this.f124448a + ", shouldIgnoreVideoPlayback=" + this.f124449b + ")";
    }
}
