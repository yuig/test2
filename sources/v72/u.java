package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f124454a;

    public u(String sceneViewIdentityKey) {
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        this.f124454a = sceneViewIdentityKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f124454a, ((u) obj).f124454a);
    }

    public final int hashCode() {
        return this.f124454a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UnregisterSceneView(sceneViewIdentityKey="), this.f124454a, ")");
    }
}
