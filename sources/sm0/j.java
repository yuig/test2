package sm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f113261a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.m f113262b;

    public j(String boardId, wa2.m featureConfig) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f113261a = boardId;
        this.f113262b = featureConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f113261a, jVar.f113261a) && Intrinsics.d(this.f113262b, jVar.f113262b);
    }

    public final int hashCode() {
        return this.f113262b.hashCode() + (this.f113261a.hashCode() * 31);
    }

    public final String toString() {
        return "MoreIdeasPageLoaderArgs(boardId=" + this.f113261a + ", featureConfig=" + this.f113262b + ")";
    }
}
