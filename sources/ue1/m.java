package ue1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f122034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122035b = false;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f122036c;

    /* renamed from: d, reason: collision with root package name */
    public final re1.r f122037d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f122038e;

    public m(int i13, boolean z13, re1.r rVar, boolean z14) {
        this.f122034a = i13;
        this.f122036c = z13;
        this.f122037d = rVar;
        this.f122038e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f122034a == mVar.f122034a && this.f122035b == mVar.f122035b && this.f122036c == mVar.f122036c && Intrinsics.d(this.f122037d, mVar.f122037d) && this.f122038e == mVar.f122038e;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f122036c, ep.b.e(this.f122035b, Integer.hashCode(this.f122034a) * 31, 31), 31);
        re1.r rVar = this.f122037d;
        return Boolean.hashCode(this.f122038e) + ((e13 + (rVar == null ? 0 : rVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExtraBubbleItemRepParams(previewImageCount=");
        sb3.append(this.f122034a);
        sb3.append(", useSmallestPreviewImages=");
        sb3.append(this.f122035b);
        sb3.append(", isCompact=");
        sb3.append(this.f122036c);
        sb3.append(", headerModel=");
        sb3.append(this.f122037d);
        sb3.append(", imagesHaveFlatBottomCorners=");
        return a.a.r(sb3, this.f122038e, ")");
    }
}
