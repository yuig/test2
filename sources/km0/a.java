package km0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import lm0.c1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80167a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80169c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f80170d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f80171e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80172f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80173g;

    public a(String boardId, String boardSessionId, String storyRequestParams, wa2.m featureConfig, c1 pinFilter, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(pinFilter, "pinFilter");
        this.f80167a = boardId;
        this.f80168b = boardSessionId;
        this.f80169c = storyRequestParams;
        this.f80170d = featureConfig;
        this.f80171e = pinFilter;
        this.f80172f = i13;
        this.f80173g = z13;
    }

    public static a a(a aVar, wa2.m mVar, c1 c1Var, int i13, boolean z13, int i14) {
        if ((i14 & 8) != 0) {
            mVar = aVar.f80170d;
        }
        wa2.m featureConfig = mVar;
        if ((i14 & 16) != 0) {
            c1Var = aVar.f80171e;
        }
        c1 pinFilter = c1Var;
        if ((i14 & 32) != 0) {
            i13 = aVar.f80172f;
        }
        int i15 = i13;
        if ((i14 & 64) != 0) {
            z13 = aVar.f80173g;
        }
        String boardId = aVar.f80167a;
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        String boardSessionId = aVar.f80168b;
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        String storyRequestParams = aVar.f80169c;
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(pinFilter, "pinFilter");
        return new a(boardId, boardSessionId, storyRequestParams, featureConfig, pinFilter, i15, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f80167a, aVar.f80167a) && Intrinsics.d(this.f80168b, aVar.f80168b) && Intrinsics.d(this.f80169c, aVar.f80169c) && Intrinsics.d(this.f80170d, aVar.f80170d) && this.f80171e == aVar.f80171e && this.f80172f == aVar.f80172f && this.f80173g == aVar.f80173g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80173g) + ep.b.b(this.f80172f, (this.f80171e.hashCode() + ((this.f80170d.hashCode() + cb.d(this.f80169c, cb.d(this.f80168b, this.f80167a.hashCode() * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllSavesBoardPinsPageLoaderArgs(boardId=");
        sb3.append(this.f80167a);
        sb3.append(", boardSessionId=");
        sb3.append(this.f80168b);
        sb3.append(", storyRequestParams=");
        sb3.append(this.f80169c);
        sb3.append(", featureConfig=");
        sb3.append(this.f80170d);
        sb3.append(", pinFilter=");
        sb3.append(this.f80171e);
        sb3.append(", pinViewType=");
        sb3.append(this.f80172f);
        sb3.append(", selectedOnLoad=");
        return a.a.r(sb3, this.f80173g, ")");
    }
}
