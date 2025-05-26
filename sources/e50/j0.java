package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57370a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57371b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f57372c;

    /* renamed from: d, reason: collision with root package name */
    public final List f57373d;

    /* renamed from: e, reason: collision with root package name */
    public final List f57374e;

    /* renamed from: f, reason: collision with root package name */
    public final String f57375f;

    /* renamed from: g, reason: collision with root package name */
    public final String f57376g;

    public j0(String str, List list, Integer num, List list2, List list3, String str2, String str3) {
        this.f57370a = str;
        this.f57371b = list;
        this.f57372c = num;
        this.f57373d = list2;
        this.f57374e = list3;
        this.f57375f = str2;
        this.f57376g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f57370a, j0Var.f57370a) && Intrinsics.d(this.f57371b, j0Var.f57371b) && Intrinsics.d(this.f57372c, j0Var.f57372c) && Intrinsics.d(this.f57373d, j0Var.f57373d) && Intrinsics.d(this.f57374e, j0Var.f57374e) && Intrinsics.d(this.f57375f, j0Var.f57375f) && Intrinsics.d(this.f57376g, j0Var.f57376g);
    }

    public final int hashCode() {
        String str = this.f57370a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f57371b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f57372c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.f57373d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f57374e;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.f57375f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57376g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Action(feedUrl=");
        sb3.append(this.f57370a);
        sb3.append(", oneBarFilters=");
        sb3.append(this.f57371b);
        sb3.append(", filterType=");
        sb3.append(this.f57372c);
        sb3.append(", filterKeys=");
        sb3.append(this.f57373d);
        sb3.append(", searchParameters=");
        sb3.append(this.f57374e);
        sb3.append(", searchQuery=");
        sb3.append(this.f57375f);
        sb3.append(", title=");
        return a.a.p(sb3, this.f57376g, ")");
    }
}
