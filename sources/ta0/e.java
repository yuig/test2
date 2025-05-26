package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f116860a;

    /* renamed from: b, reason: collision with root package name */
    public final r72.a f116861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116862c;

    public e(String str, r72.a aVar, String str2, int i13) {
        aVar = (i13 & 2) != 0 ? null : aVar;
        str2 = (i13 & 4) != 0 ? null : str2;
        this.f116860a = str;
        this.f116861b = aVar;
        this.f116862c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f116860a, eVar.f116860a) && Intrinsics.d(this.f116861b, eVar.f116861b) && Intrinsics.d(this.f116862c, eVar.f116862c);
    }

    public final int hashCode() {
        String str = this.f116860a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        r72.a aVar = this.f116861b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f116862c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AddToNewCollage(sourceId=");
        sb3.append(this.f116860a);
        sb3.append(", bitmapMask=");
        sb3.append(this.f116861b);
        sb3.append(", shuffleAssetId=");
        return a.a.p(sb3, this.f116862c, ")");
    }
}
