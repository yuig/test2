package v72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f124440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124441b;

    public j(String sceneViewIdentityKey, int i13) {
        Intrinsics.checkNotNullParameter(sceneViewIdentityKey, "sceneViewIdentityKey");
        this.f124440a = sceneViewIdentityKey;
        this.f124441b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f124440a, jVar.f124440a) && this.f124441b == jVar.f124441b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124441b) + (this.f124440a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AttachedToWindow(sceneViewIdentityKey=");
        sb3.append(this.f124440a);
        sb3.append(", sceneViewId=");
        return a.a.n(sb3, this.f124441b, ")");
    }
}
