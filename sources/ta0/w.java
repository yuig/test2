package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final String f116920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116921b;

    public w(String collageId) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f116920a = collageId;
        this.f116921b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f116920a, wVar.f116920a) && Intrinsics.d(this.f116921b, wVar.f116921b);
    }

    public final int hashCode() {
        int hashCode = this.f116920a.hashCode() * 31;
        String str = this.f116921b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DownloadFromId(collageId=");
        sb3.append(this.f116920a);
        sb3.append(", imageDownloadUrl=");
        return a.a.p(sb3, this.f116921b, ")");
    }
}
