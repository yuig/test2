package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57336a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57337b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57338c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57339d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f57340e;

    /* renamed from: f, reason: collision with root package name */
    public final String f57341f;

    /* renamed from: g, reason: collision with root package name */
    public final String f57342g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f57343h;

    /* renamed from: i, reason: collision with root package name */
    public final List f57344i;

    public f0(String __typename, List list, Integer num, String str, Integer num2, String str2, String str3, e0 e0Var, List list2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57336a = __typename;
        this.f57337b = list;
        this.f57338c = num;
        this.f57339d = str;
        this.f57340e = num2;
        this.f57341f = str2;
        this.f57342g = str3;
        this.f57343h = e0Var;
        this.f57344i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f57336a, f0Var.f57336a) && Intrinsics.d(this.f57337b, f0Var.f57337b) && Intrinsics.d(this.f57338c, f0Var.f57338c) && Intrinsics.d(this.f57339d, f0Var.f57339d) && Intrinsics.d(this.f57340e, f0Var.f57340e) && Intrinsics.d(this.f57341f, f0Var.f57341f) && Intrinsics.d(this.f57342g, f0Var.f57342g) && Intrinsics.d(this.f57343h, f0Var.f57343h) && Intrinsics.d(this.f57344i, f0Var.f57344i);
    }

    public final int hashCode() {
        int hashCode = this.f57336a.hashCode() * 31;
        List list = this.f57337b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f57338c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f57339d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f57340e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f57341f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57342g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e0 e0Var = this.f57343h;
        int hashCode8 = (hashCode7 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        List list2 = this.f57344i;
        return hashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OneBarFilter(__typename=");
        sb3.append(this.f57336a);
        sb3.append(", appliedFilterOptions=");
        sb3.append(this.f57337b);
        sb3.append(", filterComponentType=");
        sb3.append(this.f57338c);
        sb3.append(", label=");
        sb3.append(this.f57339d);
        sb3.append(", productFilterType=");
        sb3.append(this.f57340e);
        sb3.append(", title=");
        sb3.append(this.f57341f);
        sb3.append(", trackingParams=");
        sb3.append(this.f57342g);
        sb3.append(", requestParams=");
        sb3.append(this.f57343h);
        sb3.append(", filterOptions=");
        return a.c.j(sb3, this.f57344i, ")");
    }
}
