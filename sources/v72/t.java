package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f124452a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124453b;

    public t(String sceneViewIdentityKey, int i13) {
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        this.f124452a = sceneViewIdentityKey;
        this.f124453b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f124452a, tVar.f124452a) && this.f124453b == tVar.f124453b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124453b) + (this.f124452a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RegisterSceneView(sceneViewIdentityKey=");
        sb3.append(this.f124452a);
        sb3.append(", sceneViewId=");
        return a.a.n(sb3, this.f124453b, ")");
    }
}
