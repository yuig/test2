package pp1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class l extends c92.n {

    /* renamed from: b, reason: collision with root package name */
    public final int f100929b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f100930c;

    /* renamed from: d, reason: collision with root package name */
    public final a f100931d;

    /* renamed from: e, reason: collision with root package name */
    public final a f100932e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f100933f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i13, k0 title, a firstBenefit, a secondBenefit, k0 disclosure) {
        super(false);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(firstBenefit, "firstBenefit");
        Intrinsics.checkNotNullParameter(secondBenefit, "secondBenefit");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.f100929b = i13;
        this.f100930c = title;
        this.f100931d = firstBenefit;
        this.f100932e = secondBenefit;
        this.f100933f = disclosure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f100929b == lVar.f100929b && Intrinsics.d(this.f100930c, lVar.f100930c) && Intrinsics.d(this.f100931d, lVar.f100931d) && Intrinsics.d(this.f100932e, lVar.f100932e) && Intrinsics.d(this.f100933f, lVar.f100933f);
    }

    public final int hashCode() {
        return this.f100933f.hashCode() + ((this.f100932e.hashCode() + ((this.f100931d.hashCode() + ep.b.d(this.f100930c, Integer.hashCode(this.f100929b) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Variant1(layoutId=");
        sb3.append(this.f100929b);
        sb3.append(", title=");
        sb3.append(this.f100930c);
        sb3.append(", firstBenefit=");
        sb3.append(this.f100931d);
        sb3.append(", secondBenefit=");
        sb3.append(this.f100932e);
        sb3.append(", disclosure=");
        return jq.b.k(sb3, this.f100933f, ")");
    }
}
