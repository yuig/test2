package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f116866a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116867b;

    /* renamed from: c, reason: collision with root package name */
    public final r72.a f116868c;

    /* renamed from: d, reason: collision with root package name */
    public final String f116869d;

    public f(String draftId, String str, r72.a aVar, String str2, int i13) {
        aVar = (i13 & 4) != 0 ? null : aVar;
        str2 = (i13 & 8) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f116866a = draftId;
        this.f116867b = str;
        this.f116868c = aVar;
        this.f116869d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f116866a, fVar.f116866a) && Intrinsics.d(this.f116867b, fVar.f116867b) && Intrinsics.d(this.f116868c, fVar.f116868c) && Intrinsics.d(this.f116869d, fVar.f116869d);
    }

    public final int hashCode() {
        int hashCode = this.f116866a.hashCode() * 31;
        String str = this.f116867b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r72.a aVar = this.f116868c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f116869d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddToSelectedCollage(draftId=");
        sb3.append(this.f116866a);
        sb3.append(", sourceId=");
        sb3.append(this.f116867b);
        sb3.append(", bitmapMask=");
        sb3.append(this.f116868c);
        sb3.append(", shuffleAssetId=");
        return a.a.p(sb3, this.f116869d, ")");
    }
}
