package sa0;

import kotlin.jvm.internal.Intrinsics;
import r72.n1;

/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f112194a;

    public u(String shuffleAssetId) {
        Intrinsics.checkNotNullParameter(shuffleAssetId, "shuffleAssetId");
        this.f112194a = shuffleAssetId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        String str = ((u) obj).f112194a;
        int i13 = n1.f106581a;
        return Intrinsics.d(this.f112194a, str);
    }

    public final int hashCode() {
        int i13 = n1.f106581a;
        return this.f112194a.hashCode();
    }

    public final String toString() {
        int i13 = n1.f106581a;
        return a.a.k("CutoutRepinPrepFinished(shuffleAssetId=", a.a.p(new StringBuilder("ShuffleAssetId(value="), this.f112194a, ")"), ")");
    }
}
