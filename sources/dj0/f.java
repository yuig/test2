package dj0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import wa2.m;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f55133a;

    /* renamed from: b, reason: collision with root package name */
    public final m f55134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55135c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55136d;

    public f(String boardId, m featureConfig, String boardSessionId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        this.f55133a = boardId;
        this.f55134b = featureConfig;
        this.f55135c = boardSessionId;
        this.f55136d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f55133a, fVar.f55133a) && Intrinsics.d(this.f55134b, fVar.f55134b) && Intrinsics.d(this.f55135c, fVar.f55135c) && Intrinsics.d(this.f55136d, fVar.f55136d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f55135c, (this.f55134b.hashCode() + (this.f55133a.hashCode() * 31)) * 31, 31);
        String str = this.f55136d;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutomagicalBoardPinsPageLoaderArgs(boardId=");
        sb3.append(this.f55133a);
        sb3.append(", featureConfig=");
        sb3.append(this.f55134b);
        sb3.append(", boardSessionId=");
        sb3.append(this.f55135c);
        sb3.append(", storyRequestParams=");
        return a.a.p(sb3, this.f55136d, ")");
    }
}
