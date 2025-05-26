package c92;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes4.dex */
public final class l extends n {

    /* renamed from: b, reason: collision with root package name */
    public final int f27011b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f27012c;

    /* renamed from: d, reason: collision with root package name */
    public final a f27013d;

    /* renamed from: e, reason: collision with root package name */
    public final a f27014e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f27015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i13, k0 title, a firstBenefit, a secondBenefit, k0 disclosure) {
        super(false);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstBenefit, "firstBenefit");
        Intrinsics.checkNotNullParameter(secondBenefit, "secondBenefit");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.f27011b = i13;
        this.f27012c = title;
        this.f27013d = firstBenefit;
        this.f27014e = secondBenefit;
        this.f27015f = disclosure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f27011b == lVar.f27011b && Intrinsics.d(this.f27012c, lVar.f27012c) && Intrinsics.d(this.f27013d, lVar.f27013d) && Intrinsics.d(this.f27014e, lVar.f27014e) && Intrinsics.d(this.f27015f, lVar.f27015f);
    }

    public final int hashCode() {
        return this.f27015f.hashCode() + ((this.f27014e.hashCode() + ((this.f27013d.hashCode() + ep.b.d(this.f27012c, Integer.hashCode(this.f27011b) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Variant1(layoutId=");
        sb3.append(this.f27011b);
        sb3.append(", title=");
        sb3.append(this.f27012c);
        sb3.append(", firstBenefit=");
        sb3.append(this.f27013d);
        sb3.append(", secondBenefit=");
        sb3.append(this.f27014e);
        sb3.append(", disclosure=");
        return jq.b.k(sb3, this.f27015f, ")");
    }
}
