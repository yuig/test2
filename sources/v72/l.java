package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f124443a;

    public l(String sceneViewIdentityKey) {
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        this.f124443a = sceneViewIdentityKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f124443a, ((l) obj).f124443a);
    }

    public final int hashCode() {
        return this.f124443a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DetachedFromWindow(sceneViewIdentityKey="), this.f124443a, ")");
    }
}
