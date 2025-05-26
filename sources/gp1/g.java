package gp1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f65932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65933b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65934c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65935d;

    public g(String originPinId, String originBoardId, String newSavedPinId) {
        Intrinsics.checkNotNullParameter(originPinId, "originPinId");
        Intrinsics.checkNotNullParameter(originBoardId, "originBoardId");
        Intrinsics.checkNotNullParameter(newSavedPinId, "newSavedPinId");
        this.f65932a = originPinId;
        this.f65933b = originBoardId;
        this.f65934c = newSavedPinId;
        this.f65935d = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f65932a, gVar.f65932a) && Intrinsics.d(this.f65933b, gVar.f65933b) && Intrinsics.d(this.f65934c, gVar.f65934c) && this.f65935d == gVar.f65935d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65935d) + cb.d(this.f65934c, cb.d(this.f65933b, this.f65932a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MovingPinInfo(originPinId=");
        sb3.append(this.f65932a);
        sb3.append(", originBoardId=");
        sb3.append(this.f65933b);
        sb3.append(", newSavedPinId=");
        sb3.append(this.f65934c);
        sb3.append(", isStructuredFeed=");
        return a.a.r(sb3, this.f65935d, ")");
    }
}
