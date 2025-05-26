package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jh {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f132619a;

    /* renamed from: b, reason: collision with root package name */
    public final ih f132620b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f132621c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132622d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f132623e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f132624f;

    public jh(Integer num, ih ihVar, Boolean bool, String __typename, Double d2, Integer num2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132619a = num;
        this.f132620b = ihVar;
        this.f132621c = bool;
        this.f132622d = __typename;
        this.f132623e = d2;
        this.f132624f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return Intrinsics.d(this.f132619a, jhVar.f132619a) && Intrinsics.d(this.f132620b, jhVar.f132620b) && Intrinsics.d(this.f132621c, jhVar.f132621c) && Intrinsics.d(this.f132622d, jhVar.f132622d) && Intrinsics.d(this.f132623e, jhVar.f132623e) && Intrinsics.d(this.f132624f, jhVar.f132624f);
    }

    public final int hashCode() {
        Integer num = this.f132619a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ih ihVar = this.f132620b;
        int hashCode2 = (hashCode + (ihVar == null ? 0 : ihVar.hashCode())) * 31;
        Boolean bool = this.f132621c;
        int d2 = a.cb.d(this.f132622d, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        Double d13 = this.f132623e;
        int hashCode3 = (d2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num2 = this.f132624f;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StoryPinData(pageCount=");
        sb3.append(this.f132619a);
        sb3.append(", metadata=");
        sb3.append(this.f132620b);
        sb3.append(", isDeleted=");
        sb3.append(this.f132621c);
        sb3.append(", __typename=");
        sb3.append(this.f132622d);
        sb3.append(", totalVideoDuration=");
        sb3.append(this.f132623e);
        sb3.append(", staticPageCount=");
        return a.c.i(sb3, this.f132624f, ")");
    }
}
